package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class checkpackage extends JFrame implements ActionListener{

	String username;
	JLabel tusername,tpackage,tpersons,tid,tnumber,tphone,tprice;
	JButton back;
	
	checkpackage(String username){
		
			this.username=username;
			setBounds(300, 150, 800, 550);
			getContentPane().setBackground(Color.white); 		
			setLayout(null);
			
			JLabel head=new JLabel("View Package Details");
			head.setBounds(30, 10, 300, 30);
			head.setFont(new Font("Raleway", Font.BOLD, 25));
			head.setForeground(Color.black);
			add(head);
			
			JLabel lblusername=new JLabel("Username");
			lblusername.setBounds(10, 60, 100, 25);
			lblusername.setFont(new Font("Raleway", Font.BOLD, 18));
			lblusername.setForeground(Color.blue);
			add(lblusername);
			
			
			
			JLabel tusername=new JLabel();
			tusername.setBounds(130, 60, 100, 25);
			add(tusername);
			
			JLabel lblpackage=new JLabel("Package");
			lblpackage.setBounds(10, 105, 100, 25);
			lblpackage.setFont(new Font("Raleway", Font.BOLD, 18));
			lblpackage.setForeground(Color.blue);
			add(lblpackage);
			
			
			JLabel tpackage=new JLabel();
			tpackage.setBounds(130, 105, 100, 25);
			add(tpackage);
			
			
			JLabel lblpersons=new JLabel("Total Persons");
			lblpersons.setBounds(10, 150, 130, 25);
			lblpersons.setFont(new Font("Raleway", Font.BOLD, 18));
			lblpersons.setForeground(Color.blue);
			add(lblpersons);
			
			
			JLabel tpersons=new JLabel();
			tpersons.setBounds(130, 150, 100, 25);
			add(tpersons);
			
			
			JLabel lblid=new JLabel("ID");
			lblid.setBounds(10, 195, 100, 25);
			lblid.setFont(new Font("Raleway", Font.BOLD, 18));
			lblid.setForeground(Color.blue);
			add(lblid);
			
			
			JLabel tid=new JLabel();
			tid.setBounds(130, 195, 100, 25);
			add(tid);
			
			
			JLabel lblnumber=new JLabel("ID Number");
			lblnumber.setBounds(10, 240, 100, 25);
			lblnumber.setFont(new Font("Raleway", Font.BOLD, 18));
			lblnumber.setForeground(Color.blue);
			add(lblnumber);
			
			
			JLabel tnumber=new JLabel();
			tnumber.setBounds(130, 240, 100, 25);
			add(tnumber);
			
			JLabel lblphone=new JLabel("Phone");
			lblphone.setBounds(10, 285, 100, 25);
			lblphone.setFont(new Font("Raleway", Font.BOLD, 18));
			lblphone.setForeground(Color.blue);
			add(lblphone);
			
			
			JLabel tphone=new JLabel();
			tphone.setBounds(130, 285, 100, 25);
			add(tphone);
			
			JLabel lblprice=new JLabel("Price");
			lblprice.setBounds(10, 330, 100, 25);
			lblprice.setFont(new Font("Raleway", Font.BOLD, 18));
			lblprice.setForeground(Color.blue);
			add(lblprice);
			
			
			JLabel tprice=new JLabel();
			tprice.setBounds(130,330, 100, 25);
			add(tprice);
			
			
			back=new JButton("Back");
			back.setBounds(100, 375, 100, 25);
			back.setBackground(Color.black);
			back.setForeground(Color.white);
			back.addActionListener(this);
			add(back);
			
			try {
			Conn c=new Conn();
			String query="select * from package where username='"+username+"'";
			ResultSet rs=c.s.executeQuery(query);
			while(rs.next()) {
				tusername.setText(rs.getString("username"));
				tid.setText(rs.getString("id"));
				tnumber.setText(rs.getString("number"));
				tpackage.setText(rs.getString("package"));
				tphone.setText(rs.getString("phone"));
				tprice.setText(rs.getString("price"));
				tpersons.setText(rs.getString("persons"));
				
			
			}
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookeddetails.jpg"));
			Image i2=i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel i4=new JLabel(i3);
			i4.setBounds(340, 10, 300, 350);
			add(i4);
			setVisible(true);
			
		
	}
	public static void main(String[] args) {
		
		new checkpackage("poojashah");
		

	}

	public void actionPerformed(ActionEvent ae) {
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
