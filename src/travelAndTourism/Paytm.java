package travelAndTourism;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Paytm extends JFrame implements ActionListener{
	JButton back;
	
	Paytm(){
		
		setBounds(200, 100, 800, 600);
		
		JEditorPane pane=new JEditorPane();
		pane.setEditable(false);
		try {
			
			pane.setPage("https://paytm.com/online-payments");
			
		} catch (Exception e) {
			pane.setContentType("text/html");
			pane.setText("<html>Site Could not Load !!Error 404</html>");

		
		}
		JScrollPane sb=new JScrollPane(pane);
		getContentPane().add(sb);
		
		
		back=new JButton("Back");
		back.setBounds(570, 30, 100, 30);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		pane.add(back);
		
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {

		
		new Paytm();
	}


	public void actionPerformed(ActionEvent ae) {

		try {
			if(ae.getSource()==back) {
				
				setVisible(false);
				new Payment();
			}
			
		} catch (Exception e) {

		
		}
	}

}
