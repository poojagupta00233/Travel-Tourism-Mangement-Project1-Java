package travelAndTourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Destination extends JFrame implements Runnable{

	
		Thread t;
		JLabel l1=null,l2=null,l3=null,l4=null,l5=null,l6=null,l7=null,l8=null,l9=null,l10=null;
		JLabel[] label=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
		Destination(){
			
			setBounds(400, 100, 700, 600);
			
			ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
			ImageIcon[] imageicon=new ImageIcon[] {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
			
			Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
			Image[] image=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
			
			ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
			ImageIcon[] icon=new ImageIcon[] {k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
			
			JLabel ln1=null,ln2=null,ln3=null,l4=null,l5=null,l6=null,l7=null,l8=null,l9=null,l10=null;
			JLabel[] lname=new JLabel[] {ln1,ln2,ln3,l4,l5,l6,l7,l8,l9,l10};
			
			String[] imageext=new String[] {".jpeg",".png",".jpg",".jpg",".jpg",".jpg",".jpeg",".jpg",".jpg"};
			
			for(int i=0;i<9;i++) {
			imageicon[i] =new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+ ""+imageext[i]+""));
			image[i]=imageicon[i].getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT);
			icon[i]=new ImageIcon(image[i]);
			label[i]=new JLabel(icon[i]);
			label[i].setBounds(0, 0, 700, 600);
			add(label[i]);
			

			}
			
			t=new Thread(this);
			t.start();
			setVisible(true);
			
		}

		public static void main(String[] args) {
			
			new Destination();
			
			

		}

		@Override
		public void run() {
	try {
			
			for(int i=0;i<9;i++) {
			t.sleep(1000);
			label[i].setVisible(false);
			}
			setVisible(false);
			new Dashboard("");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	

	}

	
}
