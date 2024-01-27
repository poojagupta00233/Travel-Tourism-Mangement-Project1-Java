package travelAndTourism;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame implements ActionListener{
	JButton pay,back;

	Payment(){
		
		setBounds(300, 100, 800, 600);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
		Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel i4=new JLabel(i3);
		i4.setBounds(0,0,800,600);
		add(i4);
		
		pay=new JButton("PAY");
		pay.setBackground(Color.black);
		pay.setForeground(Color.white);
		pay.setBounds(430, 0, 100, 40);
		pay.addActionListener(this);
		
		i4.add(pay);
		
		back=new JButton("BACK");
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setBounds(550, 0, 100, 40);
		back.addActionListener(this);
		i4.add(back);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Payment();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			
			if(ae.getSource()==pay) {
				
				setVisible(false);
				new Paytm();
			}else {
				setVisible(false);
				new Dashboard("");
			}
		}catch(Exception e) {
			e.printStackTrace();			
		}

		
	}

}
