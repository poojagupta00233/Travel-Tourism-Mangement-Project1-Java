package travelAndTourism;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JButton login,signup,fpassword;
	JTextField textfield,tpassword;
	Conn c=new Conn();
	String username;
	 Login(String username) {
		this.username=username;
		setLocation(200,120);
		setSize(800,500);
		setLayout(null);
		JPanel j1=new JPanel();
		j1.setLayout(null);
		add(j1);
		j1.setBackground(Color.white);
		j1.setBounds(0, 0, 300, 500);
		ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
		Image i1=image.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
		ImageIcon image2=new ImageIcon(i1);
		JLabel jl=new JLabel(image2);
		jl.setBounds(50,150, 200, 200);
		
		j1.add(jl);
		//------------------------creating second label--------------like username
		JPanel j2=new JPanel();
		j2.setLayout(null);
		add(j2);
		j2.setBounds(300, 0, 490, 500);
		j2.setBackground(Color.lightGray);
		//---------------creating textfields and all
		JLabel uname=new JLabel("USERNAME");
		uname.setForeground(Color.white);
     	uname.setFont(new Font("times roman", Font.BOLD	,16) );
		uname.setBounds(20, 100, 120, 40);
		j2.add(uname);
		 textfield=new JTextField();
		textfield.setBounds(140, 110, 250, 30);
		textfield.setBorder(BorderFactory.createEmptyBorder());
		
		j2.add(textfield);
		
		//---------------creating textfields password 
				JLabel password=new JLabel("PASSWORD");
				password.setForeground(Color.white);
				password.setFont(new Font("times roman",Font.BOLD	,16) );
				password.setBounds(20, 180, 120, 40);
				j2.add(password);
		
				 tpassword=new JTextField();
				tpassword.setBounds(140,190, 250, 30);
				tpassword.setBorder(BorderFactory.createEmptyBorder());
				j2.add(tpassword);
				
				
				//-----------button
			login=new JButton("LOGIN");
			login.setBounds(20, 280, 140, 30);
			login.setForeground(Color.pink);
			login.setBackground(Color.white);
			login.addActionListener(this);
			j2.add(login);
			
			 signup=new JButton("SIGNUP");
			signup.setBounds(220, 280, 140, 30);
			signup.setForeground(Color.pink);
			signup.setBackground(Color.white);
			signup.addActionListener(this);
			j2.add(signup);
			
			 fpassword=new JButton("Forget Password");
			fpassword.setBounds(130, 340, 140, 30);
			fpassword.setForeground(Color.pink);
			fpassword.setBackground(Color.white);
			fpassword.addActionListener(this);
			j2.add(fpassword);
//			
			
				
				
		setVisible(true);
		 
	}
	 public static void main(String[] args) {
		 new Login("");
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		try {
			if(ae.getSource()==login){
				String username1=textfield.getText();
				String query="select * from account where username='"+username1+"'and password='"+tpassword.getText()+"'";
				ResultSet rset=c.s.executeQuery(query);
				if(rset.next()) {
					
					//pooapsetVisible(false);
					//new Loading(textfield.getText());
					setVisible(false);
					new Loading(username1);
					
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "incorrect  username or password ");
				}

				
			}
			else if (ae.getSource()==signup) {
			setVisible(false);
			new Signup();
				
			}else if (ae.getSource()==fpassword) {
				setVisible(false);
				new Forgetpassword("");
				
			}
			
				
			
			
		} catch(Exception e) {

		e.printStackTrace();
		}
		
	}
	
	
}