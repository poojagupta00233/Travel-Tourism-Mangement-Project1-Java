package travelAndTourism;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.JTextField;

public class Forgetpassword extends JFrame implements ActionListener{
	JTextField txtusername,txtname,txtquestion,txtanswer,txtpassword;
	JButton search,retrieve,back;
	Conn c=new Conn();
	ResultSet rset;
	
	 Forgetpassword(String username) {
		 
		 setBounds(400,150,800,400);
		 setLayout(null);
		
		 getContentPane().setBackground(Color.white);
		 
		 
		 
		 JPanel jp=new JPanel();
		 jp.setBounds(	0, 0, 500, 350);
		 jp.setLayout(null);
		 add(jp);
		 
		 
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
		 Image i2=i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		 ImageIcon i3=new ImageIcon(i2);
		 JLabel j1=new JLabel(i3);
		 j1.setBounds(550, 100, 200, 200);
		  add(j1);
		  
		  JLabel lblusername=new JLabel("UserName");
		  lblusername.setBounds(30, 20, 130, 25);
		  lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
		  jp.add(lblusername);
		  
		   txtusername=new JTextField();
		   txtusername.setBounds(170, 20, 200, 25);
		   txtusername.setBorder(BorderFactory.createEmptyBorder());
		   jp.add(txtusername);
		   
		    search=new JButton("Search");
		    search.setBounds(390, 20, 100, 25);
		    search.setBackground(Color.gray);
		    search.setForeground(Color.white);
		    search.addActionListener(this);
		    jp.add(search);
		   
		   JLabel lblname=new JLabel("Name");
		   lblname.setBounds(30, 65, 130, 25);
		   lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
		   jp.add(lblname);
		   
		   txtname=new JTextField();
		   txtname.setBounds(170, 65, 200, 25);
		   txtname.setBorder(BorderFactory.createEmptyBorder());
		   jp.add(txtname);
		   
		   JLabel lblquestion=new JLabel("Security Question");
		   lblquestion.setBounds(30, 110, 130, 25);
		   lblquestion.setFont(new Font("tahoma", Font.BOLD, 14));
		  jp.add(lblquestion);
		   
		   txtquestion=new JTextField();
		   txtquestion.setBounds(170, 110, 200, 25);
		   txtquestion.setBorder(BorderFactory.createEmptyBorder());
		   jp.add(txtquestion);
		   
		   JLabel lblanswer=new JLabel("Answer");
		   lblanswer.setBounds(30, 155, 130, 25);
		   lblanswer.setFont(new Font("Times Roman", Font.BOLD, 14));
		   jp.add(lblanswer);
		   
		   txtanswer=new JTextField();
		   txtanswer.setBounds(170, 155, 200, 25);
		   txtanswer.setBorder(BorderFactory.createEmptyBorder());
		   jp.add(txtanswer);
		   
		   retrieve=new JButton("Retrieve");
		   retrieve.setBounds(390, 155, 100, 25);
		   retrieve.setBackground(Color.gray);
		   retrieve.setForeground(Color.white);
		   retrieve.addActionListener(this);
		   jp.add(retrieve);
		   
		   
		   JLabel lblpassword=new JLabel("Password");
		   lblpassword.setBounds(30	, 200 ,130,25);
		   lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		   jp.add(lblpassword);
		   
		   txtpassword=new JTextField();
		   txtpassword.setBounds(170, 200, 200, 25);
		   txtpassword.setBorder(BorderFactory.createEmptyBorder());
		   jp.add(txtpassword);
		   
		   back=new JButton("Back");
		   back.setBounds(120,270,100,25);
		   back.setBackground(Color.gray);
		   back.setForeground(Color.white);
		   back.addActionListener(this);
		   jp.add(back);
		  
		 
		 setVisible(true);
	}

	public static void main(String[] args) {
		
	new Forgetpassword("");
		

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		try {
			if(ae.getSource()==search) {
				String query="select * from account where username='"+txtusername.getText()+"'";
				
				 rset=c.s.executeQuery(query);
				while(rset.next()) {
					
					txtname.setText(rset.getString("name"));
					txtquestion.setText(rset.getString("question"));
				}
				
				
				
			}else if (ae.getSource()==retrieve) {
				String retrievequery="select * from account where username='"+ txtusername.getText()+"' and answer='"+txtanswer.getText()+"'";
				rset=c.s.executeQuery(retrievequery);
				while(rset.next()) {
					
				txtpassword.setText(rset.getString("password"));
//				if(rset.getString("answer")==txtanswer.getText()) {
//					JOptionPane.showMessageDialog(null,"answer not correct");
//				}
				
				}
				
				
			}else if(ae.getSource()==back){
				setVisible(false);
				new Login("");
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
