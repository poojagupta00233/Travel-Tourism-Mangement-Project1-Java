package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class About extends  JFrame implements ActionListener{
	String s="Hello Customer ";
	JButton back;
	
	About(){
		
		setBounds(400, 100	,700, 550);
		setLayout(null);
	    getContentPane().setBackground(Color.white);
		
		JLabel l1=new JLabel("ABOUT");
		l1.setBounds(290	, 5, 180,40);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Tahoma", Font.BOLD, 30));
		add(l1);
		
		TextArea about=new TextArea(s,30,50,Scrollbar.VERTICAL);
		about.setEditable(false);
		about.setBounds(150, 90, 450, 300);
		add(about);
		
		back=new JButton("Back");
		back.setBounds(300, 450, 100, 35);
		back.setFont(new Font("raleway", Font.BOLD, 20));
		back.setBackground(Color.white);
		back.setForeground(Color.blue);
		back.addActionListener(this);	
		add(back);
		 
		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
		Image img2=img1.getImage().getScaledInstance(700, 550, Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2);
		JLabel img4=new JLabel(img3);
		img4.setBounds(0, 0, 700, 550);
		add(img4);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new About();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==back) {
				setVisible(false);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}

}
