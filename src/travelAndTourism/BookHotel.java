package travelAndTourism;

import java.awt.Choice;
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

public class BookHotel extends JFrame implements ActionListener {
	String username;
	JButton cprice,bhotel,back;
	JLabel tusername,tcost,tid,tphone,tnumber;
	JTextField tpersons,tdays;
	Choice thotel,tac,tfood;
	BookHotel(String username){
		this.username=username;
		
		setBounds(300, 50, 800, 650);
		setLayout(null);
		
		JLabel jhead=new JLabel("BOOK Hotel");
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
		tusername.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tusername);
		
		JLabel jpackage=new JLabel("Select Hotel");
		jpackage.setBounds(10, 130	, 150,	30);
		jpackage.setFont(new Font("Raleway", Font.BOLD, 20));
		jpackage.setForeground(Color.gray);
		add(jpackage);
		
		
		thotel=new Choice();
		Conn c=new Conn();
		try {
		ResultSet rs =c.s.executeQuery("select * from hotel");
		while(rs.next()){
		thotel.add(rs.getString("name"));
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		thotel.setBackground(Color.white);
		thotel.setBounds(180, 130, 150, 30);
		add(thotel);
		
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
		
		JLabel jdays=new JLabel("No.of Days");
		jdays.setBounds(10, 230	, 150,	30);
		jdays.setFont(new Font("Raleway", Font.BOLD, 20));
		jdays.setForeground(Color.gray);
		add(jdays);
		
		tdays=new JTextField();
		tdays.setBounds(180, 230, 150, 30);
		//tpersons.setBackground(Color.black);
		tdays.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tdays);
		
		JLabel jac=new JLabel("Ac/Non Ac");
		jac.setBounds(10, 280	, 150,	30);
		jac.setFont(new Font("Raleway", Font.BOLD, 20));
		jac.setForeground(Color.gray);
		add(jac);
		
		
		tac=new Choice();
		tac.add("AC");
		tac.add("Non AC");
		tac.setBackground(Color.white);
		tac.setBounds(180, 280, 150, 30);
		add(tac);
		
		JLabel jfood=new JLabel("Food Included");
		jfood.setBounds(10, 330	, 150,	30);
		jfood.setFont(new Font("Raleway", Font.BOLD, 20));
		jfood.setForeground(Color.gray);
		add(jfood);
		
		
		tfood=new Choice();
		tfood.add("Yes");
		tfood.add("No");
		tfood.setBackground(Color.white);
		tfood.setBounds(180, 330, 150, 30);
		add(tfood);
		
		
		JLabel jid=new JLabel("ID");
		jid.setBounds(10, 380	, 150,	30);
		jid.setFont(new Font("Raleway", Font.BOLD, 20));
		jid.setForeground(Color.gray);
		add(jid);
		
		 tid=new JLabel();
		tid.setBounds(180, 380, 150, 30);
		//tpersons.setBackground(Color.black);
		tid.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tid);
		
		JLabel jnumber=new JLabel("Number");
		jnumber.setBounds(10, 430	, 150,	30);
		jnumber.setFont(new Font("Raleway", Font.BOLD, 20));
		jnumber.setForeground(Color.gray);
		add(jnumber);
		
		 tnumber=new JLabel();
		tnumber.setBounds(180, 430, 150, 30);
		tpersons.setForeground(Color.black);
		tnumber.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tnumber);
		
		JLabel jphone=new JLabel("Phone");
		jphone.setBounds(10, 480, 150,	30);
		jphone.setFont(new Font("Raleway", Font.BOLD, 20));
		jphone.setForeground(Color.gray);
		add(jphone);
		
		 tphone=new JLabel();
		tphone.setBounds(180, 480, 150, 30);
		//tpersons.setBackground(Color.black);
		tphone.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tphone);
		
		JLabel jprice=new JLabel("Total Cost");
		jprice.setBounds(10, 520, 150,	30);
		jprice.setFont(new Font("Raleway", Font.BOLD, 20));
		jprice.setForeground(Color.gray);
		add(jprice);
		
		 tcost=new JLabel();
		tcost.setBounds(180, 530, 150, 30);
		//tpersons.setBackground(Color.black);
		tcost.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(tcost);
		
		
		
		cprice=new JButton("Check Price");
		cprice.setBounds(100, 560, 150, 30);
		cprice.setBackground(Color.black);
		cprice.setForeground(Color.white);
		cprice.addActionListener(this);
		add(cprice);
		
		bhotel=new JButton("Book Hotel");
		bhotel.setBounds(270, 560, 150, 30);
		bhotel.setBackground(Color.black);
		bhotel.setForeground(Color.white);
		bhotel.addActionListener(this);
		add(bhotel);
		
		
		back=new JButton("Back");
		back.setBounds(440, 560, 150, 30);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
		Image img2=img1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2);
		JLabel img4=new JLabel(img3);
		img4.setBounds(340, 130, 400, 300);
		add(img4);
		
		
		try {
			 c=new Conn();
		ResultSet	rs=c.s.executeQuery("select * from customerdetail where username='"+username+"'");
			while(rs.next()) {
				tusername.setText(rs.getString("username"));
				tid.setText(rs.getString("id"));
				tphone.setText(rs.getString("phone"));
				tnumber.setText(rs.getString("number"));
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {

		
		new BookHotel("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==cprice){
				
				int cost=0,people,days,totalprice;
				Conn c=new Conn();
				String name=thotel.getSelectedItem();
				ResultSet rs=c.s.executeQuery("select * from hotel where name='"+name+"'");
			while(rs.next()) {
				
				cost=Integer.parseInt( rs.getString("price"));
				people=Integer.parseInt( tpersons.getText());
				days=Integer.parseInt( tdays.getText());
				if(tac.getSelectedItem()=="AC") {
					cost+=Integer.parseInt( rs.getString("ac"));
					
				}
				if(tfood.getSelectedItem()=="Yes") {
					cost+=Integer.parseInt(rs.getString("food"));
					
				}
				totalprice=cost*people*days;
				
				tcost.setText("Rs"+totalprice);
			}
				
				
				
				
				
				
			}else if(ae.getSource()==bhotel) {
				try {
				Conn c=new Conn();
				String query ="insert into bookhotel values('"+tusername.getText()+"','"+thotel.getSelectedItem()+"','"+tpersons.getText()+"','"+tdays.getText()+"','"+tac.getSelectedItem()+"','"+tfood.getSelectedItem()+"','"+tid.getText()+"','"+tnumber.getText()+"','"+tphone.getText()+"','"+tcost.getText()+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Your Hotel has been booked successfully");
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