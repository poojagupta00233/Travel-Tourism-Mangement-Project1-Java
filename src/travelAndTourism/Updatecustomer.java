package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Updatecustomer extends JFrame implements ActionListener{
	JButton update;
	JTextField cid,tnumber, txtgender,tcountry,tphone,taddress,temail;
	JLabel tusername;
	String username;
	 Updatecustomer(String username) {
		this.username=username;
		 setBounds(300, 200, 700, 400);
		 setLayout(null);
		 getContentPane().setBackground(Color.white);
		 
		    JLabel jusername=new JLabel("Username");
			jusername.setBounds(20, 30, 100, 20);
			jusername.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jusername);
			
			 tusername=new JLabel();
			tusername.setBounds(140, 30, 100, 20);
			tusername.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(tusername);
			
			JLabel jid=new JLabel("ID");
			jid.setBounds(20, 70, 100, 20);
			jid.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jid);
			
			cid=new JTextField();
			cid.setBounds(160, 70, 100, 20);
			cid.setBackground(Color.white);
			add(cid);

			JLabel jnumber=new JLabel("ID Number");
			jnumber.setBounds(20, 110, 100, 20);
			jnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jnumber);
			
			tnumber=new JTextField();
			tnumber.setBounds(160, 110, 100, 20);
			add(tnumber);

			JLabel jgender=new JLabel("Gender");
			jgender.setBounds(20, 150, 100, 20);
			jgender.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jgender);
			
			 txtgender=new JTextField();
			 txtgender.setBounds(160, 150, 100, 20);
			 add(txtgender);
			 

			JLabel jcountry=new JLabel("Country");
			jcountry.setBounds(20, 190, 100, 20);
			jcountry.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jcountry);

			 tcountry=new JTextField();
			tcountry.setBounds(160, 190, 100, 20);
			add(tcountry);
			
			JLabel jaddress=new JLabel("Address");
			jaddress.setBounds(20, 220, 100, 20);
			jaddress.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jaddress);
			
			 taddress=new JTextField();
			taddress.setBounds(160, 220, 100, 20);
			add(taddress);

			JLabel jphone=new JLabel("Phone");
			jphone.setBounds(20, 250, 100, 20);
			jphone.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jphone);
			
			 tphone=new JTextField();
			tphone.setBounds(160, 250, 100, 20);
			add(tphone);

			JLabel jemail=new JLabel("Email");
			jemail.setBounds(20, 280, 100, 20);
			jemail.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jemail);
			
			temail=new JTextField();
			temail.setBounds(160, 280, 100, 20);
			add(temail);
			
			
			
			update=new JButton("Update");
			update.setBounds(150, 320, 100, 20);
			update.addActionListener(this);
			add(update);
			
			ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
			Image i1=img.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
			ImageIcon i2=new ImageIcon(i1);
			JLabel i3=new JLabel(i2);
			i3.setBounds(350, 50, 400, 340);
			add(i3);
			
		 
		 
		 setVisible(true);
		 
		 try {
		 Conn c=new Conn();
		 String query="select * from customerdetail where username='"+username+"'";
		 ResultSet rs=c.s.executeQuery(query);
		 while(rs.next()) {
			 tusername.setText(rs.getString("username"));
			 cid.setText(rs.getString("id"));
			 tnumber.setText(rs.getString("number"));
			 txtgender.setText(rs.getString("gender"));
			 tcountry.setText(rs.getString("country"));
			 taddress.setText(rs.getString("address"));
			 tphone.setText(rs.getString("phone"));
			 temail.setText(rs.getString("email"));
			 
		 }
		 
		 }catch(Exception e) {
			 e.printStackTrace();
			 
		 }
//	
		 
	}

	public static void main(String[] args) {

		
		new Updatecustomer("");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==update) {
			String username=tusername.getText();
			String id=cid.getText();
			String number=tnumber.getText();
			String gender=txtgender.getText();
			String country=tcountry.getText();
			String address=taddress.getText();
			String phone=tphone.getText();
			String email=temail.getText();
			try
			{
				Conn c=new Conn();
				//String query="update customerdetail set username= '"+username+"',id='"+id+"',number='"+number+"',gender='"+gender+",country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
				c.s.executeUpdate("update customerdetail set username= '"+username+"',id='"+id+"',number='"+number+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'where username='"+username+"'");
			
				JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
				setVisible(false);
				new Dashboard(username);
			}catch (Exception e) {

			e.printStackTrace();
			}
			
			
		}
	
	}
	

	

}
