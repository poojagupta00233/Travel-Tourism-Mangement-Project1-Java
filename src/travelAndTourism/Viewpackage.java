package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Viewpackage extends JFrame implements ActionListener{
	String[] package1= {"GOLD PACKAGE","6 Days And 7 Nights","Airport Assistant","Half Day City Tour","Cruise","Full Day Guide","Unlimited Games","Luxury Rooms","Pickup And Drop","Spa","Summer Discount","25000","icons/package1.jpg"};
	String [] package2= {"SILVER PACKAGE","5 Days 6 Nights","Horse Riding","Guide","Safari","Two Meals","4G WIfi","Luxury Car","Room Service","Boat Ride","Summer Discount","22000","icons/package2.jpg"};
	String[] package3= {"BRONZE PACKAGE","4 Days 3 Nights","Room Assistant","Jeep Safari","One Meal","Unlimited Beverages","Wifi","Car Facility","Tv","Boat Ride","Summer Discount","18000","icons/package3.jpg"};
	String username;
	JButton back;
	Viewpackage(String username){
		this.username=username;
		setBounds(400, 50, 800, 700);
		
		JTabbedPane tab=new JTabbedPane();
		
		JPanel p1 =createpanel(package1);
		tab.addTab("Package 1", null, p1);
		
		JPanel p2=createpanel(package2);
		tab.addTab("Package 2", null, p2);
		
		JPanel p3=createpanel(package3);
		tab.addTab("Package 3", null, p3);
	
		
		
		add(tab);
		
		setVisible(true);
		
	}

	public JPanel createpanel(String[] pack) {
		
		JPanel p1=new JPanel();
		p1.setLayout(null);	
		p1.setBackground(Color.white);			
		
		
		JLabel j1=new JLabel(pack[0]);
		j1.setBounds(200, 20, 300,30	);
		j1.setForeground(Color.orange);
		j1.setFont(new Font("Tahoma", Font.BOLD, 30));
		p1.add(j1);
		
		JLabel j2=new JLabel(pack[1]);
		j2.setBounds(30, 70, 300,30	);
		j2.setForeground(Color.gray);
		j2.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j2);
		
		JLabel j3=new JLabel(pack[2]);
		j3.setBounds(30, 120, 300,30	);
		j3.setForeground(Color.pink);
		j3.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j3);
		
		JLabel j4=new JLabel(pack[3]);
		j4.setBounds(30, 170, 300,30	);
		j4.setForeground(Color.gray);
		j4.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j4);
		
		
		JLabel j5=new JLabel(pack[4]);
		j5.setBounds(30,220, 300,30	);
		j5.setForeground(Color.pink);
		j5.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j5);
		
		
		JLabel j6=new JLabel(pack[5]);
		j6.setBounds(30, 270, 300,30	);
		j6.setForeground(Color.gray);
		j6.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j6);
		
		JLabel j8=new JLabel(pack[6]);
		j8.setBounds(30, 320, 300,30	);
		j8.setForeground(Color.pink);
		j8.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j8);
		
		JLabel j7=new JLabel(pack[7]);
		j7.setBounds(30, 370, 300,30	);
		j7.setForeground(Color.gray);
		j7.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j7);
		
		JLabel j9=new JLabel(pack[8]);
		j9.setBounds(30, 420, 300,30	);
		j9.setForeground(Color.pink);
		j9.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j9);
		
		JLabel j10=new JLabel(pack[9]);
		j10.setBounds(30, 470, 300,30	);
		j10.setForeground(Color.gray);
		j10.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(j10);
		
		JLabel j11=new JLabel(pack[10]);
		j11.setBounds(30, 520, 300,30	);
		j11.setForeground(Color.cyan);
		j11.setFont(new Font("Tahoma", Font.BOLD, 25));
		p1.add(j11);
		
		JLabel j12=new JLabel(pack[11]);
		j12.setBounds(420, 520, 300,30	);
		j12.setForeground(Color.cyan);
		j12.setFont(new Font("Tahoma", Font.BOLD, 25));
		p1.add(j12);
		
		back=new JButton("Back");
		back.setBounds(330,570	, 100	,30);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		p1.add(back);
		
		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource(pack[12]));
		Image img2=img1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2);
		JLabel img4=new JLabel(img3);
		img4.setBounds(270, 100,500, 400);
		p1.add(img4);
		
		return p1;
	}
	public static void main(String[] args) {

		new Viewpackage("");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try {
			
			if(ae.getSource()==back) {
				setVisible(false);
				new Dashboard(username);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}

	
		
		
		
	}


