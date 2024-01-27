
package travelAndTourism;
import java.awt.*;

import javax.swing.*;

public class Splash extends JFrame implements Runnable{
	Splash(){
		
		setLocation(250,150);
		setSize(800,400);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
		Image i3=i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
		ImageIcon i4=new ImageIcon(i3);
		JLabel i2= new JLabel(i4);
		add(i2);
		setVisible(true);
		Thread thread=new Thread(this);
		thread.start();
	}
	public void run() {
		try {
			
			Thread.sleep(2000);
			setVisible(false);
			new Login("");
			
		} catch (Exception e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Splash();
	}
}