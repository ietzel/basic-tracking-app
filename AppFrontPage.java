import java.awt.BorderLayout;
import java.awt.Color;  
import java.awt.event.*;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Exception;  
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AppFrontPage extends JFrame implements ActionListener {  
	JButton b1, b2;  
    	JPanel newPanel;  
    	JLabel nameLabel, passLabel;  
    	final JTextField  nameField, passField;  
    	public String adminLevel;
	private String demoUN = "Formget";
	private String demoPW = "formget#123";
	private long lineCount = 1;
	private int loginAttempts = 0;
	private final int maxLAs = 3;	
	public boolean loggedIn = false;

	public AppFrontPage() {     
	        
        	nameLabel = new JLabel();  
        	nameLabel.setText("Username");
		nameLabel.setOpaque(true);
		nameLabel.setBackground(new java.awt.Color(128, 0, 128));
		nameLabel.setForeground(new java.awt.Color(255, 255, 255));
       	 	nameField = new JTextField(15);
		nameField.setBackground(new java.awt.Color(128, 0, 128));  		
		nameField.setForeground(new java.awt.Color(255, 255, 255));
        	passLabel = new JLabel();  
        	passLabel.setText("Password");
		passLabel.setOpaque(true);
		passLabel.setBackground(new java.awt.Color(128, 0, 128)); 
		passLabel.setForeground(new java.awt.Color(255, 255, 255));
        	passField = new JPasswordField(15);
		passField.setBackground(new java.awt.Color(128, 0, 128)); 
		passField.setForeground(new java.awt.Color(255, 255, 255)); 	
	
        	b1 = new JButton("Login");
		b1.setBackground(new java.awt.Color(128, 0, 128));
		b1.setForeground(new java.awt.Color(255, 255, 255));

        	newPanel = new JPanel(new GridLayout(3, 2));  
        	   
		newPanel.add(nameLabel);
        	newPanel.add(nameField);  
		newPanel.add(passLabel);  
        	newPanel.add(passField);    	
        	newPanel.add(b1);
		
        	add(newPanel, BorderLayout.CENTER);  

        	b1.addActionListener(this);
        	setTitle("Basic ERP App");

		try {
   			Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("rpgawesome-webfont.ttf")).deriveFont(8f);
    			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    			ge.registerFont(customFont);
			newPanel.setFont(customFont);  
		} catch(IOException ioe) {
    			ioe.printStackTrace();
		} catch(FontFormatException ffe) {
    			ffe.printStackTrace();
		}
	}  
      
	public void actionPerformed(ActionEvent ae) {  
        	String userValue = nameField.getText();
        	String passValue = passField.getText();
		check(maxLAs);
       		if(loggedIn) {
			dispose();
			try {
	        		AppMainTabsPage appMainTabsPage = new AppMainTabsPage(); 
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
        	} else {  
      			System.out.println("Please enter valid username and password");  
        	}
	}    
		
	public Boolean searchAccounts(String account) throws IOException {
		Boolean found = false;
		try {
			Stream<String> stream = Files.lines(Paths.get("accounts.txt"));
			int lC = (int) stream.count();
			for(int i = 0; i < lC; i++) {
        			String line = Files.readAllLines(Paths.get("accounts.txt")).get(i);
        			if(line.equals(account+"0")) {
					adminLevel = "0";
					found = true;
				} else if(line.equals(account+"-")) {
					adminLevel = "-";
					found = true;
				} else if(line.equals(account+"+")) {
					adminLevel = "+";
					found = true;
				}
      			} 
      		} catch(IOException ioe) {
        		ioe.printStackTrace();
      		}
		return found;
	}

	public int check(int loginAttemptsRemaining, int maxLoginAttempts) {
		if(loginAttempts < maxLAs) {
			if(nameField.getText().equals(demoUN) && (passField.getText().equals(demoPW))) {
				loginAttempts++;
				loggedIn = true;
				return loginAttemptsRemaining;
			} 
			try {
				if(searchAccounts(nameField.getText() + ", " + passField.getText() + ", ")) {
					loginAttempts++;
					loggedIn = true;
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}	
			return loginAttemptsRemaining;			
		} else if(loginAttempts > maxLAs - 2) {
			loginAttempts++;
			return loginAttemptsRemaining;
		} else {
			loginAttempts++;
			loggedIn = false;
			return loginAttemptsRemaining - 1;
		}
	}

	int check(int loginAttemptsRemaining) {
		return check(loginAttemptsRemaining, maxLAs-1);
	}
} 
