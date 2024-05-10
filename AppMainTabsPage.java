import java.awt.Color;  
import java.awt.event.*;
import java.awt.FontFormatException;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AppMainTabsPage {  
	public AppMainTabsPage() throws IOException {

		BufferedImage wPic = ImageIO.read(this.getClass().getResource("logo.png"));
		JLabel wIcon = new JLabel(new ImageIcon(wPic));

		BufferedImage wPicA = ImageIO.read(this.getClass().getResource("logoA.png"));
		JLabel wIconAA = new JLabel(new ImageIcon(wPicA));
		BufferedImage wPicB = ImageIO.read(this.getClass().getResource("logoB.png"));
		JLabel wIconAB = new JLabel(new ImageIcon(wPicB));

		BufferedImage wPicE = ImageIO.read(this.getClass().getResource("logoA.png"));
		JLabel wIconCA = new JLabel(new ImageIcon(wPicE));
		BufferedImage wPicF = ImageIO.read(this.getClass().getResource("logoB.png"));
		JLabel wIconCB = new JLabel(new ImageIcon(wPicF));

        	//setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  		
		JFrame window = new JFrame("Basic ERP App"); 
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setSize(640, 1024);		

		try {
   			Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("rpgawesome-webfont.ttf")).deriveFont(8f);
    			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    			ge.registerFont(customFont);
			window.setFont(customFont); 
		} catch(IOException ioe) {
    			ioe.printStackTrace();
		} catch(FontFormatException ffe) {
    			ffe.printStackTrace();
		}
		
 	       	JTabbedPane tabPanel = new JTabbedPane(); 
	    

		JPanel page1 = new JPanel();  

		page1.add(wIconAA);

		page1.add(wIconAB);

		String[][] data = new String[][]{
            		{ 
				"1", "", "Vest", "", "", "", "", "", "", "", "1", "", "", "", "", "", "L.L Beans"
			},
            		{ 
				"2", "", "Jacket", "", "", "", "1", "2", "", "", "", "", "", "", "", "", "Port Authority"
			},
			{ 
				"3", "", "Buttons up long sleeve", "", "", "", "", "1", "", "", "", "", "", "", "", "", "Red House"
			},
            		{ 
				"4", "", "Zip up hoodie", "", "", "4", "13", "10", "", "", "6", "2", "", "", "", "", "Port & company"
			},
			{ 
				"5", "", "Winter jacket", "", "", "1", "", "", "", "", "1", "", "", "", "", "", "L.L Beans"
			},
            		{ 
				"6", "", "Button up T-shirt", "", "", "", "", "1", "", "", "1", "", "", "", "", "", "Joesusa.com"
			},
			{ 
				"7", "", "Bowling shirts", "", "", "", "", "", "", "", "", "1", "", "", "", "", ""
			},
            		{ 
				"8", "", "Patches", "", "", "", "", "", "", "", "", "", "100 pcs", "", "", "", ""
			},
			{ 
				"9", "", "Blankets", "", "", "", "", "", "", "", "", "", "17", "", "", "", ""
			},
			{ 
				"10", "", "Coolers", "", "", "", "", "", "", "", "", "", "9", "", "", "", ""
			},
            		{ 
				"11", "", "T-shirts", "", "5", "14", "16", "22", "", "", "17", "10", "", "", "", "", ""
			},
			{ 
				"12", "", "Gloves", "", "15", "18", "8", "10", "", "", "", "", "", "", "", "", ""
			},
            		{ 
				"13", "", "Long sleeve shirt", "", "", "6", "13", "13", "", "", "7", "", "", "", "", "", "Port & company"
			},
			{ 
				"14", "", "Lanyards", "", "", "", "", "", "", "", "", "", "238pcs", "", "", "", ""
			},
            		{ 
				"15", "", "Tie backpacks", "", "", "", "", "", "", "", "", "", "33", "", "", "", ""
			},
			{ 
				"16", "", "Polo shirt", "", "", "", "", "1", "", "", "", "", "", "", "", "", "core365"
			},
            		{ 
				"17", "", "V neck shirt", "", "", "", "1", "", "", "", "", "", "", "", "", "", "bella.canvas"
			},
			{ 
				"18", "", "Purple client shirts", "", "17", "14", "6", "14", "", "", "11", "6", "", "", "", "", "Port & company"
			},
			{ 
				"19", "", "Name tags", "", "", "", "", "", "", "", "", "", "215pcs", "", "", "", ""
			},
            		{ 
				"20", "", "hands santizer ", "", "", "", "", "", "", "", "", "", "135pcs", "", "", "", ""
			},
			{ 
				"21", "", "Baseball caps", "", "", "", "", "", "", "", "", "", "17", "", "", "", ""
			},
            		{ 
				"22", "", "Beanies", "", "", "", "", "", "", "", "", "", "8", "", "", "", ""
			},
			{ 
				"23", "", "Computer bags", "", "", "", "", "", "", "", "", "", "2", "", "", "", ""
			},
            		{ 
				"24", "", "backpacks", "", "", "", "", "", "", "", "", "", "23", "", "", "", ""
			},
			{ 
				"25", "", "Puffle bags", "", "", "", "", "", "", "", "", "", "28", "", "", "", ""
			},
            		{ 
				"26", "", "Vehicle joggers", "", "", "1", "1", "4", "1", "", "", "1", "", "", "", "", ""
			},
			{ 
				"27", "", "Vehicle t-shirts", "", "", "4", "6", "3", "", "", "", "2", "", "", "", "", ""
			},
			{ 
				"28", "", "Straws", "", "", "", "", "", "", "", "", "", "61", "", "", "", ""
			},
            		{ 
				"29", "", "Mugs", "", "", "", "", "", "", "", "", "", "11", "", "", "", ""
			},
			{ 
				"30", "", "Water bottles", "", "", "", "", "", "", "", "", "", "3", "", "", "", ""
			},
            		{ 
				"31", "", "Sunglasses", "", "", "", "", "", "", "", "", "", "20", "", "", "", ""
			},
			{ 
				"32", "", "Golf markers", "", "", "", "", "", "", "", "", "", "22", "", "", "", ""
			},
            		{ 
				"33", "", "Grey sweatershirt", "", "2", "", "6", "3", "", "", "3", "1", "", "", "", "", ""
			},
			{ 
				"34", "", "Socks", "", "", "", "", "", "", "", "", "", "90", "", "", "", ""
			},
            		{ 
				"35", "", "Clear zipper bags", "", "", "", "", "", "", "", "", "", "152", "", "", "", ""
			},
			{ 
				"36", "", "Sanitizer pens", "", "", "", "", "", "", "", "", "", "375", "", "", "", ""
			}
        	};
 
		for(int i = 0; i < data.length; i++) {
			int sum = 0;
			for(int j = 4; j < 12; j++) {
				sum += data[i][j].toInt();
			}	
			data[i][16] = sum.toString();	
		}

        	String[] columnNames = { 
			"#", "Client", "Item", "Style", "S", "M", "L", "XL", "XXL", "1X", "2X", "3X", "No Size", "Date", "Staff Init.", "Paid", "Notes", "Sum"
		};
 
        	JTable j = new JTable(data, columnNames);
        	j.setBounds(0, 0, 640, 1024);
 
        	JScrollPane sp = new JScrollPane(j);
        	page1.add(sp);

        	JPanel page2 = new JPanel(new GridLayout(24, 3));  

		JButton HRsaveAsButton = new JButton("save as");
		HRsaveAsButton.setBackground(new java.awt.Color(128, 0, 128));
		HRsaveAsButton.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRsaveAsButton);
	
		/*JTextField HRsaveAsTF = new JTextField("");
		HRsaveAsTF.setBackground(new java.awt.Color(128, 0, 128));
		HRsaveAsTF.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRsaveAsTF);*/

		JLabel HRLA = new JLabel("Staff Name, Extension, Mobile");
		HRLA.setOpaque(true);
		HRLA.setBackground(new java.awt.Color(128, 0, 128));
		HRLA.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRLA); 

		page2.add(wIcon);

		JTextField HRTF11 = new JTextField("Polly Maxwell");
		HRTF11.setBackground(new java.awt.Color(128, 0, 128));
		HRTF11.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF11); 
		JTextField HRTF12 = new JTextField("Ext. 102");
		HRTF12.setBackground(new java.awt.Color(128, 0, 128));		
		HRTF12.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF12);
		JTextField HRTF13 = new JTextField("509-939-8917");
		HRTF13.setBackground(new java.awt.Color(128, 0, 128));
		HRTF13.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF13);
		JTextField HRTF21 = new JTextField("Mary Ravenna");
		HRTF21.setBackground(new java.awt.Color(128, 0, 128));
		HRTF21.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF21);
		JTextField HRTF22 = new JTextField("Ext. 103");
		HRTF22.setBackground(new java.awt.Color(128, 0, 128));
		HRTF22.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF22);
		JTextField HRTF23 = new JTextField("208-280-0877");
		HRTF23.setBackground(new java.awt.Color(128, 0, 128));
		HRTF23.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF23);
		JTextField HRTF31 = new JTextField("Joyce Bohlman");
		HRTF31.setBackground(new java.awt.Color(128, 0, 128));
		HRTF31.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF31); 
		JTextField HRTF32 = new JTextField("Ext. 119");
		HRTF32.setBackground(new java.awt.Color(128, 0, 128));		
		HRTF32.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF32);
		JTextField HRTF33 = new JTextField("509-280-5312");
		HRTF33.setBackground(new java.awt.Color(128, 0, 128));
		HRTF33.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF33);
		JTextField HRTF41 = new JTextField("Brian Burke");
		HRTF41.setBackground(new java.awt.Color(128, 0, 128));
		HRTF41.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF41);
		JTextField HRTF42 = new JTextField("Ext. 121");
		HRTF42.setBackground(new java.awt.Color(128, 0, 128));
		HRTF42.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF42);
		JTextField HRTF43 = new JTextField("208-818-8093");
		HRTF43.setBackground(new java.awt.Color(128, 0, 128));
		HRTF43.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF43);
		JTextField HRTF51 = new JTextField("Darlene Butler");
		HRTF51.setBackground(new java.awt.Color(128, 0, 128));
		HRTF51.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF51);
		JTextField HRTF52 = new JTextField("Ext. 104");
		HRTF52.setBackground(new java.awt.Color(128, 0, 128));
		HRTF52.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF52);
		JTextField HRTF53 = new JTextField("509-953-1619");
		HRTF53.setBackground(new java.awt.Color(128, 0, 128));
		HRTF53.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF53);
		JTextField HRTF61 = new JTextField("Stan Cone");
		HRTF61.setBackground(new java.awt.Color(128, 0, 128));
		HRTF61.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF61);
		JTextField HRTF62 = new JTextField("Ext. 117");
		HRTF62.setBackground(new java.awt.Color(128, 0, 128));
		HRTF62.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF62);
		JTextField HRTF63 = new JTextField("509-608-2737");
		HRTF63.setBackground(new java.awt.Color(128, 0, 128));
		HRTF63.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF63);
		JTextField HRTF71 = new JTextField("Michael Davaz");
		HRTF71.setBackground(new java.awt.Color(128, 0, 128));
		HRTF71.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF71);
		JTextField HRTF72 = new JTextField("Ext. 125");
		HRTF72.setBackground(new java.awt.Color(128, 0, 128));
		HRTF72.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF72);
		JTextField HRTF73 = new JTextField("208-651-9344");
		HRTF73.setBackground(new java.awt.Color(128, 0, 128));
		HRTF73.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF73);
		JTextField HRTF81 = new JTextField("Ethan Decker");
		HRTF81.setBackground(new java.awt.Color(128, 0, 128));
		HRTF81.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF81);
		JTextField HRTF82 = new JTextField("Ext. 126");
		HRTF82.setBackground(new java.awt.Color(128, 0, 128));
		HRTF82.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF82);
		JTextField HRTF83 = new JTextField("509-992-7342");
		HRTF83.setBackground(new java.awt.Color(128, 0, 128));
		HRTF83.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF83);
		JTextField HRTF91 = new JTextField("Steve Degenhardt");
		HRTF91.setBackground(new java.awt.Color(128, 0, 128));
		HRTF91.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF91);
		JTextField HRTF92 = new JTextField("Ext. 111");
		HRTF92.setBackground(new java.awt.Color(128, 0, 128));
		HRTF92.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF92);
		JTextField HRTF93 = new JTextField("509-954-8765");
		HRTF93.setBackground(new java.awt.Color(128, 0, 128));
		HRTF93.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF93);
		JTextField HRTF101 = new JTextField("Deirdre Farnsworth");
		HRTF101.setBackground(new java.awt.Color(128, 0, 128));
		HRTF101.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF101); 
		JTextField HRTF102 = new JTextField("Ext. 116");
		HRTF102.setBackground(new java.awt.Color(128, 0, 128));		
		HRTF102.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF102);
		JTextField HRTF103 = new JTextField("509-842-7139");
		HRTF103.setBackground(new java.awt.Color(128, 0, 128));
		HRTF103.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF103);
		JTextField HRTF111 = new JTextField("Angie Griffith");
		HRTF111.setBackground(new java.awt.Color(128, 0, 128));
		HRTF111.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF111);
		JTextField HRTF112 = new JTextField("Ext. 128");
		HRTF112.setBackground(new java.awt.Color(128, 0, 128));
		HRTF112.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF112);
		JTextField HRTF113 = new JTextField("509-750-6322");
		HRTF113.setBackground(new java.awt.Color(128, 0, 128));
		HRTF113.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF113);
		JTextField HRTF121 = new JTextField("Andrew Hauan");
		HRTF121.setBackground(new java.awt.Color(128, 0, 128));
		HRTF121.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF121); 
		JTextField HRTF122 = new JTextField("Ext. 124");
		HRTF122.setBackground(new java.awt.Color(128, 0, 128));		
		HRTF122.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF122);
		JTextField HRTF123 = new JTextField("509-475-2107");
		HRTF123.setBackground(new java.awt.Color(128, 0, 128));
		HRTF123.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF123);
		JTextField HRTF131 = new JTextField("Madelyn Maxwell");
		HRTF131.setBackground(new java.awt.Color(128, 0, 128));
		HRTF131.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF131);
		JTextField HRTF132 = new JTextField("Ext. 108");
		HRTF132.setBackground(new java.awt.Color(128, 0, 128));
		HRTF132.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF132);
		JTextField HRTF133 = new JTextField("509-939-1122");
		HRTF133.setBackground(new java.awt.Color(128, 0, 128));
		HRTF133.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF133);
		JTextField HRTF141 = new JTextField("Peyton Maxwell");
		HRTF141.setBackground(new java.awt.Color(128, 0, 128));
		HRTF141.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF141);
		JTextField HRTF142 = new JTextField("Ext. 113");
		HRTF142.setBackground(new java.awt.Color(128, 0, 128));
		HRTF142.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF142);
		JTextField HRTF143 = new JTextField("509-939-1414");
		HRTF143.setBackground(new java.awt.Color(128, 0, 128));
		HRTF143.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF143);
		JTextField HRTF151 = new JTextField("Colin Morin");
		HRTF151.setBackground(new java.awt.Color(128, 0, 128));
		HRTF151.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF151);
		JTextField HRTF152 = new JTextField("Ext. 105");
		HRTF152.setBackground(new java.awt.Color(128, 0, 128));
		HRTF152.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF152);
		JTextField HRTF153 = new JTextField("509-385-1885");
		HRTF153.setBackground(new java.awt.Color(128, 0, 128));
		HRTF153.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF153);
		JTextField HRTF161 = new JTextField("Mike Mullenix");
		HRTF161.setBackground(new java.awt.Color(128, 0, 128));
		HRTF161.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF161);
		JTextField HRTF162 = new JTextField("Ext. 122");
		HRTF162.setBackground(new java.awt.Color(128, 0, 128));
		HRTF162.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF162);
		JTextField HRTF163 = new JTextField("509-599-2803");
		HRTF163.setBackground(new java.awt.Color(128, 0, 128));
		HRTF163.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF163);
		JTextField HRTF171 = new JTextField("Debbie Niehenke");
		HRTF171.setBackground(new java.awt.Color(128, 0, 128));
		HRTF171.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF171);
		JTextField HRTF172 = new JTextField("Ext. 120");
		HRTF172.setBackground(new java.awt.Color(128, 0, 128));
		HRTF172.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF172);
		JTextField HRTF173 = new JTextField("509-768-3684");
		HRTF173.setBackground(new java.awt.Color(128, 0, 128));
		HRTF173.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF173);
		JTextField HRTF181 = new JTextField("Alona Petru");
		HRTF181.setBackground(new java.awt.Color(128, 0, 128));
		HRTF181.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF181);
		JTextField HRTF182 = new JTextField("Ext. 115");
		HRTF182.setBackground(new java.awt.Color(128, 0, 128));
		HRTF182.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF182);
		JTextField HRTF183 = new JTextField("952-270-5811");
		HRTF183.setBackground(new java.awt.Color(128, 0, 128));
		HRTF183.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF183);
		JTextField HRTF191 = new JTextField("Michelle Sari");
		HRTF191.setBackground(new java.awt.Color(128, 0, 128));
		HRTF191.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF191);
		JTextField HRTF192 = new JTextField("Ext. 107");
		HRTF192.setBackground(new java.awt.Color(128, 0, 128));
		HRTF192.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF192);
		JTextField HRTF193 = new JTextField("509-992-7108");
		HRTF193.setBackground(new java.awt.Color(128, 0, 128));
		HRTF193.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF193);
		JTextField HRTF201 = new JTextField("Meghan Sullivan");
		HRTF201.setBackground(new java.awt.Color(128, 0, 128));
		HRTF201.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF201); 
		JTextField HRTF202 = new JTextField("Ext. 114");
		HRTF202.setBackground(new java.awt.Color(128, 0, 128));		
		HRTF202.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF202);
		JTextField HRTF203 = new JTextField("601-520-0496");
		HRTF203.setBackground(new java.awt.Color(128, 0, 128));
		HRTF203.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF203);
		JTextField HRTF211 = new JTextField("North Reception");
		HRTF211.setBackground(new java.awt.Color(128, 0, 128));
		HRTF211.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF211);
		JTextField HRTF212 = new JTextField("Ext. 119 or 118  (Front Desk Floater)");
		HRTF212.setBackground(new java.awt.Color(128, 0, 128));
		HRTF212.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF212);
		JTextField HRTF213 = new JTextField("n/a");
		HRTF213.setBackground(new java.awt.Color(128, 0, 128));
		HRTF213.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF213);
		JTextField HRTF221 = new JTextField("STA");
		HRTF221.setBackground(new java.awt.Color(128, 0, 128));
		HRTF221.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF221); 
		JTextField HRTF222 = new JTextField("n/a");
		HRTF222.setBackground(new java.awt.Color(128, 0, 128));		
		HRTF222.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF222);
		JTextField HRTF223 = new JTextField("509-328-1552");
		HRTF223.setBackground(new java.awt.Color(128, 0, 128));
		HRTF223.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF223);
		JTextField HRTF231 = new JTextField("Brian Smith");
		HRTF231.setBackground(new java.awt.Color(128, 0, 128));
		HRTF231.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF231);
		JTextField HRTF232 = new JTextField("Office Cleaning");
		HRTF232.setBackground(new java.awt.Color(128, 0, 128));
		HRTF232.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF232);
		JTextField HRTF233 = new JTextField("509-413-6425");
		HRTF233.setBackground(new java.awt.Color(128, 0, 128));
		HRTF233.setForeground(new java.awt.Color(255, 255, 255));
		page2.add(HRTF233);
		
		JPanel page3 = new JPanel(new GridLayout(10, 6));  

		JButton PayrollsaveAsButton = new JButton("save as");
		PayrollsaveAsButton.setBackground(new java.awt.Color(128, 0, 128));
		PayrollsaveAsButton.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollsaveAsButton);
	
		JTextField PayrollsaveAsTF = new JTextField("");
		PayrollsaveAsTF.setBackground(new java.awt.Color(128, 0, 128));
		PayrollsaveAsTF.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollsaveAsTF);

		JLabel PayrollLa = new JLabel("(T-Shirt Log, &");
		PayrollLa.setOpaque(true);
		PayrollLa.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLa.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLa); 

		JLabel PayrollLb = new JLabel("Work Glove Checkout)");
		PayrollLb.setOpaque(true);
		PayrollLb.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLb.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLb); 

		page3.add(wIconCA);

		page3.add(wIconCB);

		JLabel PayrollLA = new JLabel("Client");
		PayrollLA.setOpaque(true);
		PayrollLA.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLA.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLA); 
		JLabel PayrollLB = new JLabel("Style");
		PayrollLB.setOpaque(true);
		PayrollLB.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLB.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLB); 
		JLabel PayrollLC = new JLabel("Size");
		PayrollLC.setOpaque(true);
		PayrollLC.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLC.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLC); 
		JLabel PayrollLD = new JLabel("Date");
		PayrollLD.setOpaque(true);
		PayrollLD.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLD.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLD); 
		JLabel PayrollLE = new JLabel("Staff Initials");
		PayrollLE.setOpaque(true);
		PayrollLE.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLE.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLE); 
		JLabel PayrollLF = new JLabel("Paid");
		PayrollLF.setOpaque(true);
		PayrollLF.setBackground(new java.awt.Color(128, 0, 128));
		PayrollLF.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollLF); 

		JTextField PayrollTF11 = new JTextField("");
		PayrollTF11.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF11.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF11); 
		JTextField PayrollTF12 = new JTextField("");
		PayrollTF12.setBackground(new java.awt.Color(128, 0, 128));		
		PayrollTF12.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF12);
		JTextField PayrollTF13 = new JTextField("");
		PayrollTF13.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF13.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF13);
		JTextField PayrollTF14 = new JTextField("");
		PayrollTF14.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF14.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF14);
		JTextField PayrollTF15 = new JTextField("");
		PayrollTF15.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF15.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF15);
		JTextField PayrollTF16 = new JTextField("");
		PayrollTF16.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF16.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF16);
		JTextField PayrollTF21 = new JTextField("");
		PayrollTF21.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF21.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF21);
		JTextField PayrollTF22 = new JTextField("");
		PayrollTF22.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF22.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF22);
		JTextField PayrollTF23 = new JTextField("");
		PayrollTF23.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF23.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF23);
		JTextField PayrollTF24 = new JTextField("");
		PayrollTF24.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF24.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF24);
		JTextField PayrollTF25 = new JTextField("");
		PayrollTF25.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF25.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF25);
		JTextField PayrollTF26 = new JTextField("");
		PayrollTF26.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF26.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF26);
		JTextField PayrollTF31 = new JTextField("");
		PayrollTF31.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF31.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF31); 
		JTextField PayrollTF32 = new JTextField("");
		PayrollTF32.setBackground(new java.awt.Color(128, 0, 128));		
		PayrollTF32.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF32);
		JTextField PayrollTF33 = new JTextField("");
		PayrollTF33.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF33.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF33);
		JTextField PayrollTF34 = new JTextField("");
		PayrollTF34.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF34.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF34);
		JTextField PayrollTF35 = new JTextField("");
		PayrollTF35.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF35.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF35);
		JTextField PayrollTF36 = new JTextField("");
		PayrollTF36.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF36.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF36);
		JTextField PayrollTF41 = new JTextField("");
		PayrollTF41.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF41.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF41);
		JTextField PayrollTF42 = new JTextField("");
		PayrollTF42.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF42.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF42);
		JTextField PayrollTF43 = new JTextField("");
		PayrollTF43.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF43.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF43);
		JTextField PayrollTF44 = new JTextField("");
		PayrollTF44.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF44.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF44);
		JTextField PayrollTF45 = new JTextField("");
		PayrollTF45.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF45.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF45);
		JTextField PayrollTF46 = new JTextField("");
		PayrollTF46.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF46.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF46);
		JTextField PayrollTF51 = new JTextField("");
		PayrollTF51.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF51.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF51);
		JTextField PayrollTF52 = new JTextField("");
		PayrollTF52.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF52.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF52);
		JTextField PayrollTF53 = new JTextField("");
		PayrollTF53.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF53.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF53);
		JTextField PayrollTF54 = new JTextField("");
		PayrollTF54.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF54.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF54);
		JTextField PayrollTF55 = new JTextField("");
		PayrollTF55.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF55.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF55);
		JTextField PayrollTF56 = new JTextField("");
		PayrollTF56.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF56.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF56);
		JTextField PayrollTF61 = new JTextField("");
		PayrollTF61.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF61.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF61);
		JTextField PayrollTF62 = new JTextField("");
		PayrollTF62.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF62.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF62);
		JTextField PayrollTF63 = new JTextField("");
		PayrollTF63.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF63.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF63);
		JTextField PayrollTF64 = new JTextField("");
		PayrollTF64.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF64.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF64);
		JTextField PayrollTF65 = new JTextField("");
		PayrollTF65.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF65.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF65);
		JTextField PayrollTF66 = new JTextField("");
		PayrollTF66.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF66.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF66);
		JTextField PayrollTF71 = new JTextField("");
		PayrollTF71.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF71.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF71);
		JTextField PayrollTF72 = new JTextField("");
		PayrollTF72.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF72.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF72);
		JTextField PayrollTF73 = new JTextField("");
		PayrollTF73.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF73.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF73);
		JTextField PayrollTF74 = new JTextField("");
		PayrollTF74.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF74.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF74);
		JTextField PayrollTF75 = new JTextField("");
		PayrollTF75.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF75.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF75);
		JTextField PayrollTF76 = new JTextField("");
		PayrollTF76.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF76.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF76);
		JTextField PayrollTF81 = new JTextField("");
		PayrollTF81.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF81.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF81);
		JTextField PayrollTF82 = new JTextField("");
		PayrollTF82.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF82.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF82);
		JTextField PayrollTF83 = new JTextField("");
		PayrollTF83.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF83.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF83);
		JTextField PayrollTF84 = new JTextField("");
		PayrollTF84.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF84.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF84);
		JTextField PayrollTF85 = new JTextField("");
		PayrollTF85.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF85.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF85);
		JTextField PayrollTF86 = new JTextField("");
		PayrollTF86.setBackground(new java.awt.Color(128, 0, 128));
		PayrollTF86.setForeground(new java.awt.Color(255, 255, 255));
		page3.add(PayrollTF86);
        	

		JPanel page4 = new JPanel(); 


        	JPanel page5 = new JPanel(); 


		JPanel page6 = new JPanel();


        	tabPanel.addTab("Inventory", page1); 
	        tabPanel.addTab("HR", page2); 
        	tabPanel.addTab("Payroll", page3); 
		tabPanel.addTab("four", page4); 
        	tabPanel.addTab("five", page5); 
	        tabPanel.addTab("six", page6); 


	        window.add(tabPanel); 

  		window.setBackground(new java.awt.Color(128, 0, 128));
        	window.setVisible(true);
	} 
}  
