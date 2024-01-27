package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class practice extends JFrame {
	
	
	practice(){
		
		setBounds(200, 150, 1000, 500);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/hotel9.jpg"));
		Image i2=i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel i4=new JLabel(i3);
		i4.setBounds(500, 0, 500, 500);
		add(i4);
		
		JLabel jname=new JLabel("NAME");
		jname.setBounds(20, 10, 100, 30);
		jname.setFont(new Font("raleway",Font.BOLD,14));
		jname.setForeground(Color.black);
		add(jname);
		
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new practice();
		
		
	}

}
