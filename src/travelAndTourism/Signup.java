package travelAndTourism;

import java.awt.Choice;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener{
	
	JButton create,back;
	JTextField txtusername,txtpassword,txtname,txtquestion,txtanswer,security;
	Choice csecurity;
	
	//--------------constructor of class which will call automatically when object of class is created
	
	Signup(){
		
		setBounds(350, 200, 900, 360);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		//----------creating panel
		JPanel jp=new JPanel();
		jp.setBounds(0, 0, 500, 400);
		jp.setBackground(new Color(133,193,233));
		jp.setLayout(null);
		add(jp);
		
		JLabel lblusername=new JLabel("Username");
		lblusername.setBounds(50, 20, 125, 25);
		lblusername.setFont(new Font("Tahoma",Font.BOLD	, 14));
		jp.add(lblusername);
		
		 txtusername=new JTextField();
		txtusername.setBounds(190, 20, 200, 25);
		txtusername.setBorder(BorderFactory.createEmptyBorder());
		jp.add(txtusername);
		
		JLabel lblpassword=new JLabel("Password");
		lblpassword.setBounds(50, 100, 125, 25);
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		jp.add(lblpassword);
		
		 txtpassword=new JTextField();
		txtpassword.setBounds(190, 100, 200, 25);
		txtpassword.setBorder(BorderFactory.createEmptyBorder());
		jp.add(txtpassword);
		
		JLabel lblname=new JLabel("Name");
		lblname.setFont(new Font("Times Roman", Font.BOLD, 14));
		lblname.setBounds(50, 60, 125, 25);
		jp.add(lblname);
		
		 txtname=new JTextField();
		txtname.setBounds(190, 60, 200, 25);
		txtname.setBorder(BorderFactory.createEmptyBorder());
		jp.add(txtname);
		
		JLabel lblsecurity=new JLabel("Security Question");
		lblsecurity.setBounds(50, 140, 125, 25);
		lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
		jp.add(lblsecurity);
		
		 csecurity=new Choice();
		csecurity.add("Your Nick Name");
		csecurity.add("Your First Tour");
		csecurity.add("Your Favorite Destination");
		csecurity.add("your Last Tour Destination");
		csecurity.setBounds(190, 140, 200, 25);
		jp.add(csecurity);
		
		JLabel lblanswer=new JLabel("Answer");
		lblanswer.setBounds(50, 180, 125, 25);
		lblanswer.setFont(new Font("Times Roman", Font.BOLD, 14));
		jp.add(lblanswer);
		
	 txtanswer=new JTextField();
		txtanswer.setBounds(190, 180, 200, 25);
		txtanswer.setBorder(BorderFactory.createEmptyBorder());
		jp.add(txtanswer);
		
		 create =new JButton("Create");
		create.setForeground(new Color(133,193,233));
		create.setBackground( Color.white);
		create.setBounds(70, 240, 100, 25);
		create.addActionListener(this);
		jp.add(create);
		
		 back=new JButton("Back");
		back.setBackground(Color.white);
		back.setForeground(new Color(133,193,233));
		back.setBounds(200, 240, 100, 25);
		back.addActionListener(this);
		jp.add(back);
		
		ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
		Image i1=image.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel jimage=new JLabel(i2);
		jimage.setBounds(600, 50, 200, 200);
		add(jimage);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == create) {
			String username=txtusername.getText();
			String name=txtname.getText();
			String password=txtpassword.getText();
			String question=csecurity.getSelectedItem();
			String answer=txtanswer.getText();
			
			String query="insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
			
			Conn c=new Conn();
			try {
				if(username.equals(c.s.executeQuery("select * from account where username='"+username+"'"))){
					JOptionPane.showMessageDialog(null, "username already exists");
					
				}
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,	"Account Created Successfully");
				setVisible(false);
				new Login("");
			}catch(Exception e) {
			
				e.printStackTrace();
			}
			
			
			
		}else if(ae.getSource() == back) {
			setVisible(false);
			new Login("");
			
		}
		
	}

	public static void main(String[] args) {

		new Signup();
	}

}
