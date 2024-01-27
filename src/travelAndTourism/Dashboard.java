package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JFrame implements ActionListener{
	JButton jadddetail,jviewdetail,jupdatedetail,jdeleteetail,jviewpackage,jbookpackage,jckeckpackage,jviewbookhotel,jviewhotel,jdestination,jbookhotel,jpayments,jcalculator,jnotepad,jabout;
	String username;
	
	
	public Dashboard(String username) {
		this.username=username;
		
		setBounds(0, 0, 1600, 1000);
		setLayout(null);
		
		JPanel j1=new JPanel();
		j1.setBounds(0, 0, 1600, 60);
		j1.setBackground(new Color(0,0,102));
		j1.setLayout(null);
		add(j1);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel lblimage=new JLabel(i3);
		lblimage.setBounds(0, 0, 100, 100);
		j1.add(lblimage);
		
		
		JLabel dashboard=new JLabel("Dashboard");
		dashboard.setBounds(100	,30, 300, 30);
		dashboard.setBackground(new Color(0,0,102));
		dashboard.setFont(new Font("raleway", Font.BOLD, 35));
		dashboard.setForeground(Color.white);
		j1.add(dashboard);
		
		JPanel j2=new JPanel();
		j2.setLayout(null);
		j2.setBounds(0, 0, 300, 1000);
		j2.setBackground(new Color(0,0,102));
		add(j2);
		
		 jadddetail=new JButton("Add Personal Details");
		jadddetail.setBounds(30,90, 250, 30);
		jadddetail.setForeground(Color.white);
		jadddetail.setFont(new Font("tahoma", Font.PLAIN, 18));
		jadddetail.setBackground(new Color(0,0,102));
		jadddetail.addActionListener(this);
		j2.add(jadddetail);
		
		 jupdatedetail=new JButton("Update Personal Details");
		jupdatedetail.setBounds(30,130, 250, 30);
		jupdatedetail.setForeground(Color.white);
		jupdatedetail.setFont(new Font("tahoma", Font.PLAIN, 18));
		jupdatedetail.setBackground(new Color(0,0,102));
		jupdatedetail.addActionListener(this);
		j2.add(jupdatedetail);
		
		
	    jviewdetail=new JButton("View Personal Details");
	    jviewdetail.setBounds(30,170, 250, 30);
	    jviewdetail.setForeground(Color.white);
	    jviewdetail.setFont(new Font("tahoma", Font.PLAIN, 18));
	    jviewdetail.setBackground(new Color(0,0,102));
	    jviewdetail.addActionListener(this);
		j2.add(jviewdetail);
		
		 jdeleteetail=new JButton("Delete Personal Details");
		jdeleteetail.setBounds(30,210, 250, 30);
		jdeleteetail.setForeground(Color.white);
		jdeleteetail.setFont(new Font("tahoma", Font.PLAIN, 18));
		jdeleteetail.setBackground(new Color(0,0,102));
		jdeleteetail.addActionListener(this);
		j2.add(jdeleteetail);
		
		 jckeckpackage=new JButton("Check Package");
		jckeckpackage.setBounds(30,250, 250, 30);
		jckeckpackage.setForeground(Color.white);
		jckeckpackage.setFont(new Font("tahoma", Font.PLAIN, 18));
		jckeckpackage.setBackground(new Color(0,0,102));
		jckeckpackage.addActionListener(this);
		j2.add(jckeckpackage);
		
		jbookpackage=new JButton("Book Package");
		jbookpackage.setBounds(30,290, 250, 30);
		jbookpackage.setForeground(Color.white);
		jbookpackage.setFont(new Font("tahoma", Font.PLAIN, 18));
		jbookpackage.setBackground(new Color(0,0,102));
		jbookpackage.addActionListener(this);
		j2.add(jbookpackage);
		
		jviewpackage	=new JButton("View Package");
		jviewpackage.setBounds(30,330, 250, 30);
		jviewpackage.setForeground(Color.white);
		jviewpackage.setFont(new Font("tahoma", Font.PLAIN, 18));
		jviewpackage.setBackground(new Color(0,0,102));
		jviewpackage.addActionListener(this);
		j2.add(jviewpackage);
		
		jviewhotel=new JButton("View Hotels");
		jviewhotel.setBounds(30,370, 250, 30);
		jviewhotel.setForeground(Color.white);
		jviewhotel.setFont(new Font("tahoma", Font.PLAIN, 18));
		jviewhotel.addActionListener(this);
		jviewhotel.setBackground(new Color(0,0,102));
		j2.add(jviewhotel);
		
		 jbookhotel=new JButton(" Book Hotels");
		jbookhotel.setBounds(30,410, 250, 30);
		jbookhotel.setForeground(Color.white);
		jbookhotel.setFont(new Font("tahoma", Font.PLAIN, 18));
		jbookhotel.setBackground(new Color(0,0,102));
		jbookhotel.addActionListener(this);
		j2.add(jbookhotel);
		
		
		 jviewbookhotel=new JButton("View Book Hotel");
		jviewbookhotel.setBounds(30,450, 250, 30);
		jviewbookhotel.setForeground(Color.white);
		jviewbookhotel.setFont(new Font("tahoma", Font.PLAIN, 18));
		jviewbookhotel.setBackground(new Color(0,0,102));
		jviewbookhotel.addActionListener(this);
		j2.add(jviewbookhotel);
		
		 jdestination=new JButton("Destinations");
		jdestination.setBounds(30,490, 250, 30);
		jdestination.setForeground(Color.white);
		jdestination.setFont(new Font("tahoma", Font.PLAIN, 18));
		jdestination.setBackground(new Color(0,0,102));
		jdestination.addActionListener(this);
		j2.add(jdestination);
		
		
		 jpayments=new JButton("Payments");
		jpayments.setBounds(30,530, 250, 30);
		jpayments.setForeground(Color.white);
		jpayments.setFont(new Font("tahoma", Font.PLAIN, 18));
		jpayments.setBackground(new Color(0,0,102));
		jpayments.addActionListener(this);
		j2.add(jpayments);
		
		
		jcalculator=new JButton("Calculator");
		jcalculator.setBounds(30,570, 250, 30);
		jcalculator.setForeground(Color.white);
		jcalculator.setFont(new Font("tahoma", Font.PLAIN, 18));
		jcalculator.setBackground(new Color(0,0,102));
		jcalculator.addActionListener(this);
		j2.add(jcalculator);
		
		
		 jnotepad=new JButton("Notepad");
		jnotepad.setBounds(30,610, 250, 30);
		jnotepad.setForeground(Color.white);
		jnotepad.setFont(new Font("tahoma", Font.PLAIN, 18));
		jnotepad.setBackground(new Color(0,0,102));
		jnotepad.addActionListener(this);
		j2.add(jnotepad);
		
		
		 jabout=new JButton("About");
		jabout.setBounds(30,650, 250, 30);
		jabout.setForeground(Color.white);
		jabout.setFont(new Font("tahoma", Font.PLAIN, 18));
		jabout.addActionListener(this);
		jabout.setBackground(new Color(0,0,102));
		
		j2.add(jabout);
		
		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image img2=img1.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
		
		ImageIcon img3=new ImageIcon(img2);
		JLabel img4=new JLabel(img3);
		img4.setBounds(0, 0, 1600, 1000);
		add(img4);
		
		JLabel text=new JLabel("TRAVEL AND TOURISM MANAGEMENT SYSTEM");
		text.setLayout(null);
		text.setBounds(400, 70, 1200, 90);
		text.setForeground(new Color(0,0,102));
		text.setForeground(Color.white);
		text.setFont(new Font("raleway", Font.BOLD, 40));
		img4.add(text);
				
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jadddetail) {
			
			setVisible(false);
			 new Addcustomer(username);
		}else if(ae.getSource()==jviewdetail){
			
			setVisible(false);
			new Viewcustomer(username);
			
			
		}
		else if(ae.getSource()==jupdatedetail) {
			
			setVisible(false);
			new Updatecustomer(username);
			
		}else if(ae.getSource()==jviewpackage) {
			setVisible(false);
			new Viewpackage(username);
			
		}else if(ae.getSource()==jbookpackage){
			setVisible(false);
			new BookPcakage(username);
			
		}else if(ae.getSource()==jckeckpackage) {
			setVisible(false);
			new checkpackage(username);
			
		}else if(ae.getSource()==jviewbookhotel) {
			setVisible(false);
			new ViewBookedHotel(username);
			
		}else if(ae.getSource()==jdestination) {
			setVisible(false);
			new Destination();
			
		}else if(ae.getSource()==jbookhotel) {
			setVisible(false);
			new BookHotel(username);
			
		}else if(ae.getSource()==jpayments) {
			setVisible(false);
			new Payment();
		}else if(ae.getSource()==jnotepad) {
			try {
				
				Runtime.getRuntime().exec("notepad.exe");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}else if(ae.getSource()==jcalculator) {
			try {
				
				Runtime.getRuntime().exec("calc.exe");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}else if(ae.getSource()==jabout) {
			new About();
			
		}else if(ae.getSource()==jviewhotel) {
			setVisible(false);
			new ViewHotels();
		}else if(ae.getSource()==jdeleteetail) {
			setVisible(false);
			new DeleteDetails(username);
		}
		
	}
	

	public static void main(String[] args) {

		
		new Dashboard("");
	}

}
