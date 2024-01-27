package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookPcakage extends JFrame implements ActionListener {
	String username;
	JButton cprice,bpackage,back;
	JLabel tusername,tcost,tid,tphone,tnumber;
	JTextField tpersons;
	JComboBox tpackage;
	
	BookPcakage(String username){
		this.username=username;
		
		setBounds(300, 170, 800, 550);
		setLayout(null);
		
		JLabel jhead=new JLabel("BOOK PACKAGE");
		jhead.setBounds(100, 30, 400, 25);
		jhead.setForeground(Color.black);
		jhead.setFont(new Font("Tahoma", Font.BOLD, 30));
		add(jhead);
		
		 JLabel jusername=new JLabel("Username");
		jusername.setBounds(10, 80	, 150,	30);
		jusername.setFont(new Font("Raleway", Font.BOLD, 20));
		jusername.setForeground(Color.gray);
		add(jusername);
		
		 tusername=new JLabel(username);
		tusername.setBounds(180, 80, 150, 30);
		//tusername.setBackground(Color.black);
		tusername.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tusername);
		
		JLabel jpackage=new JLabel("Select Package");
		jpackage.setBounds(10, 130	, 150,	30);
		jpackage.setFont(new Font("Raleway", Font.BOLD, 20));
		jpackage.setForeground(Color.gray);
		add(jpackage);
		
		
		 tpackage=new JComboBox ( new String[] {"Gold Package","Silver Package"," Bronze Package"});		
		tpackage.setBackground(Color.white);
		tpackage.setBounds(180, 130, 150, 30);
		add(tpackage);
		
		JLabel jpersons=new JLabel("Total Persons");
		jpersons.setBounds(10, 180	, 150,	30);
		jpersons.setFont(new Font("Raleway", Font.BOLD, 20));
		jpersons.setForeground(Color.gray);
		add(jpersons);
		
		 tpersons=new JTextField();
		tpersons.setBounds(180, 180, 150, 30);
		//tpersons.setBackground(Color.black);
		tpersons.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tpersons);
		
		JLabel jid=new JLabel("ID");
		jid.setBounds(10, 230	, 150,	30);
		jid.setFont(new Font("Raleway", Font.BOLD, 20));
		jid.setForeground(Color.gray);
		add(jid);
		
		 tid=new JLabel();
		tid.setBounds(180, 230, 150, 30);
		//tpersons.setBackground(Color.black);
		tid.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tid);
		
		JLabel jnumber=new JLabel("Number");
		jnumber.setBounds(10, 280	, 150,	30);
		jnumber.setFont(new Font("Raleway", Font.BOLD, 20));
		jnumber.setForeground(Color.gray);
		add(jnumber);
		
		 tnumber=new JLabel();
		tnumber.setBounds(180, 280, 150, 30);
		//tpersons.setBackground(Color.black);
		tnumber.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tnumber);
		
		JLabel jphone=new JLabel("Phone");
		jphone.setBounds(10, 330, 150,	30);
		jphone.setFont(new Font("Raleway", Font.BOLD, 20));
		jphone.setForeground(Color.gray);
		add(jphone);
		
		 tphone=new JLabel();
		tphone.setBounds(180, 330, 150, 30);
		//tpersons.setBackground(Color.black);
		tphone.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tphone);
		
		JLabel jprice=new JLabel("Total Cost");
		jprice.setBounds(10, 380, 150,	30);
		jprice.setFont(new Font("Raleway", Font.BOLD, 20));
		jprice.setForeground(Color.gray);
		add(jprice);
		
		 tcost=new JLabel();
		tcost.setBounds(180, 380, 150, 30);
		//tpersons.setBackground(Color.black);
		tcost.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tcost);
		
		
		
		cprice=new JButton("Check Price");
		cprice.setBounds(100, 430, 150, 30);
		cprice.setBackground(Color.black);
		cprice.setForeground(Color.white);
		cprice.addActionListener(this);
		add(cprice);
		
		bpackage=new JButton("Book Package");
		bpackage.setBounds(270, 430, 150, 30);
		bpackage.setBackground(Color.black);
		bpackage.setForeground(Color.white);
		bpackage.addActionListener(this);
		add(bpackage);
		
		
		back=new JButton("Back");
		back.setBounds(440, 430, 150, 30);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
		Image img2=img1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2);
		JLabel img4=new JLabel(img3);
		img4.setBounds(370, 100, 370, 270);
		add(img4);
		
		
		try {
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from customerdetail where username='"+username+"'");
			while(rs.next()) {
				tusername.setText(rs.getString("username"));
				tid.setText(rs.getString("id"));
				tphone.setText(rs.getString("phone"));
				tnumber.setText(rs.getString("number"));
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {

		
		new BookPcakage("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==cprice){
				String pack=(String)tpackage.getSelectedItem();
				int cost=0;
				
				if(pack.equals("Gold Package")) {
					
					cost=25000;
				
				}else if(pack.equals("Silver Package")){
					cost=22000;
					
				}else {
					cost=18000;
					
				}
				int tprice =Integer.parseInt( tpersons.getText());
				int totalcost=cost*tprice;
				tcost.setText("Rs"+totalcost);
				
				
				
				
			}else if(ae.getSource()==bpackage) {
				try {
				Conn c=new Conn();
				String query ="insert into package values('"+tusername.getText()+"','"+tpackage.getSelectedItem()+"','"+tpersons.getText()+"','"+tid.getText()+"','"+tnumber.getText()+"','"+tphone.getText()+"','"+tcost.getText()+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Your Package has been booked successfully");
				setVisible(false);
				new Dashboard(username);					
				}catch(Exception e) {
					e.printStackTrace();
					
				}
			}else if(ae.getSource()==back) {
				
				setVisible(false);
				new Dashboard(username);
			}
			
		} catch (Exception e) {

		
		} 

	}
}