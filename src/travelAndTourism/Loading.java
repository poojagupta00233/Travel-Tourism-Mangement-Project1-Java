package travelAndTourism;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class Loading extends JFrame implements Runnable{
	Thread t;
	String username;
	
	Loading(String username){
	this.username=username;
		
		setBounds(250, 150, 800, 400);
		setLayout(null);
		//Login lg=new Login();
		JLabel jtext=new JLabel("Travel And Tourism Application");
		jtext.setBounds(140, 20, 800,35);
		jtext.setFont(new Font("raleway", Font.BOLD, 35));
		jtext.setForeground(Color.blue);
		add(jtext);
		
		
		JProgressBar bar=new JProgressBar();
		bar.setBounds(180, 95, 400, 25);
		bar.setStringPainted(true);
		add(bar);
		
		
		JLabel loading=new JLabel("Loading Please wait.....");
		loading.setBounds(250, 125, 300, 25);
		loading.setFont(new Font("tahoma", Font.BOLD, 16));
		loading.setForeground(Color.red);
		add(loading);
		
		JLabel lblusername=new JLabel("Welcome"+" "+username);
		lblusername.setBounds(40, 300, 800, 25);
		lblusername.setForeground(Color.blue);
		lblusername.setFont(new Font("raleway", Font.BOLD, 25));
		add(lblusername);
		t=new Thread(this);
		t.start();
		
		setVisible(true);
		
		//new Dashboard(username);
		
		
	}

	public static void main(String[] args) {
		new Loading("");
		 

		
	}

	@Override
	public void run() {
		try {
			t.sleep(1000);
			setVisible(false);
			new Dashboard(username);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		
	}

}
