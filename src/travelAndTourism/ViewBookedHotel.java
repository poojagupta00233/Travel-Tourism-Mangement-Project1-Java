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

public class ViewBookedHotel extends JFrame implements ActionListener{

	String username;
	JLabel tusername,thotel,tpersons,tid,tnumber,tphone,tprice,tdays,tac,tfood;
	JButton back;
	
	ViewBookedHotel(String username){
		
			this.username=username;
			setBounds(300, 100, 800, 600);
			getContentPane().setBackground(Color.white); 		
			setLayout(null);
			
			JLabel head=new JLabel("View BookHotel Details");
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
			tusername.setBounds(150, 60, 100, 25);
			tusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tusername);
			
			JLabel lblpackage=new JLabel("Hotel Name");
			lblpackage.setBounds(10, 105, 130, 25);
			lblpackage.setFont(new Font("Raleway", Font.BOLD, 18));
			lblpackage.setForeground(Color.blue);
			add(lblpackage);
			
			
			 thotel=new JLabel();
			thotel.setBounds(150, 105, 100, 25);
			
			thotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(thotel);
			
			
			JLabel lblpersons=new JLabel("Total Persons");
			lblpersons.setBounds(10, 150, 130, 25);
			lblpersons.setFont(new Font("Raleway", Font.BOLD, 18));
			lblpersons.setForeground(Color.blue);
			add(lblpersons);
			
			
			 tpersons=new JLabel();
			tpersons.setBounds(150, 150, 100, 25);
			tpersons.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tpersons);
			
			JLabel lbldays=new JLabel("Total Days");
			lbldays.setBounds(10, 195, 130, 25);
			lbldays.setFont(new Font("Raleway", Font.BOLD, 18));
			lbldays.setForeground(Color.blue);
			add(lbldays);
			
			
			 tdays=new JLabel();
			tdays.setBounds(150, 195, 100, 25);
			tdays.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tdays);
			
			JLabel lblac=new JLabel("Ac/Non-AC");
			lblac.setBounds(10, 240, 130, 25);
			lblac.setFont(new Font("Raleway", Font.BOLD, 18));
			lblac.setForeground(Color.blue);
			add(lblac);
			
			
			 tac=new JLabel();
			tac.setBounds(150, 240, 100, 25);
			tac.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tac);
			
			JLabel lblfood=new JLabel("Food Included?");
			lblfood.setBounds(10, 285, 130, 25);
			lblfood.setFont(new Font("Raleway", Font.BOLD, 16));
			lblfood.setForeground(Color.blue);
			add(lblfood);
			
			
			 tfood=new JLabel();
			tfood.setBounds(150, 285, 100, 25);
			tfood.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tfood);
			
			
			JLabel lblid=new JLabel("ID");
			lblid.setBounds(10, 330, 100, 25);
			lblid.setFont(new Font("Raleway", Font.BOLD, 18));
			lblid.setForeground(Color.blue);
			add(lblid);
			
			
			JLabel tid=new JLabel();
			tid.setBounds(150, 330, 100, 25);
			tid.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tid);
			
			
			JLabel lblnumber=new JLabel("ID Number");
			lblnumber.setBounds(10, 375, 100, 25);
			lblnumber.setFont(new Font("Raleway", Font.BOLD, 18));
			lblnumber.setForeground(Color.blue);
			add(lblnumber);
			
			
			JLabel tnumber=new JLabel();
			tnumber.setBounds(150, 375, 100, 25);
			tnumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tnumber);
			
			JLabel lblphone=new JLabel("Phone");
			lblphone.setBounds(10, 420, 100, 25);
			lblphone.setFont(new Font("Raleway", Font.BOLD, 18));
			lblphone.setForeground(Color.blue);
			add(lblphone);
			
			
			JLabel tphone=new JLabel();
			tphone.setBounds(150, 420, 100, 25);
			tphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tphone);
			
			JLabel lblprice=new JLabel("Price");
			lblprice.setBounds(10, 465, 100, 25);
			lblprice.setFont(new Font("Raleway", Font.BOLD, 18));
			lblprice.setForeground(Color.blue);
			add(lblprice);
			
			
			JLabel tprice=new JLabel();
			tprice.setBounds(150,465, 100, 25);
			tprice.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(tprice);
			
			 back=new JButton("Back");
			back.setBounds(100, 510, 100, 25);
			back.setBackground(Color.black);
			back.setForeground(Color.white);
			back.addActionListener(this);
			add(back);
			
			try {
			Conn c=new Conn();
			String query="select * from bookhotel where username='"+username+"'";
			ResultSet rs=c.s.executeQuery(query);
			while(rs.next()) {
				tusername.setText(rs.getString("username"));
				tid.setText(rs.getString("id"));
				tnumber.setText(rs.getString("number"));
				thotel.setText(rs.getString("name"));
				tphone.setText(rs.getString("phone"));
				tprice.setText(rs.getString("totalcost"));
				tpersons.setText(rs.getString("persons"));
				tdays.setText(rs.getString("days"));
				tac.setText(rs.getString("ac"));
				tfood.setText(rs.getString("food"));
			
			}
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookeddetails.jpg"));
			Image i2=i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel i4=new JLabel(i3);
			i4.setBounds(300, 80, 450, 450);
			add(i4);
			setVisible(true);
			
		
	}
	public static void main(String[] args) {
		
		new ViewBookedHotel("poojashah");
		

	}
	@Override
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
