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
import javax.swing.JOptionPane;

public class DeleteDetails extends JFrame implements ActionListener {

	String username;
	JButton back;
	
	DeleteDetails(String username)  {
		this.username=username;
		setBounds(300, 200, 700, 500);
		
		setLayout(null);
		
		JLabel lblusername=new JLabel("Username");
		lblusername.setBounds(10, 10, 100, 25);
		lblusername.setFont(new Font("Raleway", Font.BOLD, 18));
		lblusername.setForeground(Color.blue);
		add(lblusername);
		
		getContentPane().setBackground(Color.white); 
		
		JLabel txtusername=new JLabel();
		txtusername.setBounds(130, 10, 100, 25);
		add(txtusername);
		
		JLabel lblid=new JLabel("ID");
		lblid.setBounds(10, 55, 100, 25);
		lblid.setFont(new Font("Raleway", Font.BOLD, 18));
		lblid.setForeground(Color.blue);
		add(lblid);
		
		
		JLabel txtid=new JLabel();
		txtid.setBounds(130, 55, 100, 25);
		add(txtid);
		
		
		JLabel lblnumber=new JLabel("Number");
		lblnumber.setBounds(10, 100, 100, 25);
		lblnumber.setFont(new Font("Raleway", Font.BOLD, 18));
		lblnumber.setForeground(Color.blue);
		add(lblnumber);
		
		
		JLabel txtnumber=new JLabel();
		txtnumber.setBounds(130, 100, 100, 25);
		add(txtnumber);
		
		
		JLabel lblgender=new JLabel("Gender");
		lblgender.setBounds(10, 145, 100, 25);
		lblgender.setFont(new Font("Raleway", Font.BOLD, 18));
		lblgender.setForeground(Color.blue);
		add(lblgender);
		
		
		JLabel txtgender=new JLabel();
		txtgender.setBounds(130, 145, 100, 25);
		add(txtgender);
		
		
		JLabel lblcountry=new JLabel("Country");
		lblcountry.setBounds(10, 190, 100, 25);
		lblcountry.setFont(new Font("Raleway", Font.BOLD, 18));
		lblcountry.setForeground(Color.blue);
		add(lblcountry);
		
		
		JLabel txtcountry=new JLabel();
		txtcountry.setBounds(130, 190, 100, 25);
		add(txtcountry);
		
		JLabel lbladdress=new JLabel("Address");
		lbladdress.setBounds(10, 235, 100, 25);
		lbladdress.setFont(new Font("Raleway", Font.BOLD, 18));
		lbladdress.setForeground(Color.blue);
		add(lbladdress);
		
		
		JLabel txtaddress=new JLabel();
		txtaddress.setBounds(130, 235, 100, 25);
		add(txtaddress);
		
		JLabel lblphone=new JLabel("Phone");
		lblphone.setBounds(10, 275, 100, 25);
		lblphone.setFont(new Font("Raleway", Font.BOLD, 18));
		lblphone.setForeground(Color.blue);
		add(lblphone);
		
		
		JLabel txtphone=new JLabel();
		txtphone.setBounds(130,275, 100, 25);
		add(txtphone);
		
		JLabel lblemail=new JLabel("Email");
		lblemail.setBounds(10, 320, 100, 25);
		lblemail.setFont(new Font("Raleway", Font.BOLD, 18));
		lblemail.setForeground(Color.blue);
		add(lblemail);
		
		
		JLabel txtemail=new JLabel();
		txtemail.setBounds(130, 320, 100, 25);
		add(txtemail);
		
		back=new JButton("Delete");
		back.setBounds(100, 380, 120, 30);
		back.setBackground(Color.red);
		back.setForeground(Color.white);
		back.setFont(new Font("times roman", Font.BOLD, 20));
		back.addActionListener(this);
		add(back);
		
		
		try {
		Conn c=new Conn();
		String query="select * from customerdetail where username='"+username+"'";
		ResultSet rs=c.s.executeQuery(query);
		while(rs.next()) {
			txtusername.setText(rs.getString("username"));
			txtid.setText(rs.getString("id"));
			txtnumber.setText(rs.getString("number"));
			txtgender.setText(rs.getString("gender"));
			txtcountry.setText(rs.getString("country"));
			txtaddress.setText(rs.getString("address"));
			txtphone.setText(rs.getString("phone"));
			txtemail.setText(rs.getString("email"));
			
		
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
		Image i2=i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel i4=new JLabel(i3);
		i4.setBounds(340, 10, 300, 350);
		add(i4);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new DeleteDetails("poojashah");
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==back)
				
			{
				Conn c=new Conn();
				c.s.executeUpdate("delete from customerdetail where username='"+username+"'");
				c.s.executeUpdate("delete from account where username='"+username+"'");
				c.s.executeUpdate("delete from package where username='"+username+"'");
				c.s.executeUpdate("delete from bookhotel where username='"+username+"'");
				
				JOptionPane.showMessageDialog(null, "Data delete Successfully");
				setVisible(false);
				new Login("");
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
