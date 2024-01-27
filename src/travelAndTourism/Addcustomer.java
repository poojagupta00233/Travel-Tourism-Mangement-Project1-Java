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

public class Addcustomer extends JFrame implements ActionListener{
	
	JButton add,back;
	JTextField tnumber,tcountry,taddress,tphone,temail;
	JRadioButton tmale,tfemale;
	JComboBox cid;
	JLabel tusername,text;
	String username;
	
	
	public Addcustomer(String username) {
		this.username=username;
		
			
				
			setLayout(null);
			
			
			setBounds(400, 200, 700, 400);
			getContentPane().setBackground(Color.white);
			
			 text=new JLabel(username);
			text.setBounds(140, 30, 100, 20);
			text.setForeground(Color.blue);
			add(text);
			
			JLabel jusername=new JLabel("Username");
			jusername.setBounds(20, 30, 100, 20);
			jusername.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jusername);
			
			tusername=new JLabel(username);
			tusername.setBounds(140, 50, 100, 20);
			tusername.setFont(new Font("Tahoma", Font.BOLD, 1));
		    tusername.setForeground(Color.blue);
			add(tusername);
//			
			JLabel jid=new JLabel("ID");
			jid.setBounds(20, 70, 100, 20);
			jid.setFont(new Font("Tahoma", Font.BOLD, 14));
			add(jid);
			
			 cid=new JComboBox(new String[]{"Aadhar","PAN","Passport","Ration card"});
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
			
			 tmale=new JRadioButton("Male");
			tmale.setBounds(160, 150, 70, 20);
			add(tmale);
			
			 tfemale=new JRadioButton("Female");
			tfemale.setBounds(240, 150, 70, 20);
			add(tfemale);
			
			ButtonGroup bg=new ButtonGroup();
			bg.add(tmale);
			bg.add(tfemale);

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
			
			
			add=new JButton("ADD");
			add.setBounds(100, 320, 100, 20);
			add.addActionListener(this);
			add(add);
			
			back=new JButton("BACK");
			back.setBounds(250, 320, 100, 20);
			back.addActionListener(this);
			add(back);
			
			ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
			Image i1=img.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
			ImageIcon i2=new ImageIcon(i1);
			JLabel i3=new JLabel(i2);
			i3.setBounds(350, 50, 400, 340);
			add(i3);
			
			setVisible(true);
			
			
			try {
				
				Conn c=new Conn();
			//	String query="select * from account where username=poojashah";
				String username1=text.getText();
				ResultSet rset=c.s.executeQuery("select * from account where username='"+username+"'");
				while(rset.next()) {
			    tusername.setText(rset.getString("username"));
			    //tusername="ppoja";
				//JOptionPane.showMessageDialog(null, tusername);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
			}

	public static void main(String[] args) {
			new Addcustomer("");
	}

	
	public void actionPerformed(ActionEvent ae) {
		
		
			
			if(ae.getSource()== add) {
				String username=text.getText();
				String id= (String)cid.getSelectedItem();
				String number=tnumber.getText();
				String gender=null;
				if(tmale.isSelected()==true) {
					
					gender="Male";
				}
				else {
					gender="Female";
				}
				
				String country=tcountry.getText();
				String address=taddress.getText();
				String phone=tphone.getText();
				String email=temail.getText();
				try {
				Conn c=new Conn();
				String query="insert into customerdetail values('"+username+"','"+id+"','"+number+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
				c.s.executeUpdate(query);
				
				
					JOptionPane.showMessageDialog(null, "Customer Details added Successfully");
					setVisible(false);

				new Dashboard(username);
				
				}catch(Exception e) {
					e.printStackTrace();
					
				}
				
			}
			else if(ae.getSource()==back) {
				
				setVisible(false);
	         		new	Dashboard(username);
				
			}
			
		
		
	}

}
