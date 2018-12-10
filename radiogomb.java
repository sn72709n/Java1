package Guihome15;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


 class radiogomb extends JFrame {

	JButton GombElso;
	ButtonGroup csoport;
	JRadioButton radiogomb1;
	JRadioButton radiogomb2;
	JRadioButton radiogomb3;
	JRadioButton radiogomb4;
	
	
		radiogomb(){
		this.setSize(800,600);
		GombElso = new JButton();
		radiogomb1 = new JRadioButton();
		radiogomb2 = new JRadioButton();
		radiogomb3 = new JRadioButton();
		radiogomb4 = new JRadioButton();
		csoport = new ButtonGroup();
		this.setVisible(true);
		this.setLayout(null);
		
		
		GombElso.setText("valami*");
		radiogomb1.setText("valami");
		radiogomb2.setText("valami2");
		radiogomb3.setText("valami3");
		radiogomb4.setText("valami4");
		radiogomb1.setSelected(false);
		radiogomb2.setSelected(true);
		radiogomb3.setSelected(false);
		radiogomb1.setSelected(false);
		
		GombElso.setBounds(10, 10, 100, 30);
		
		radiogomb1.setBounds(120, 10, 100, 20);
		radiogomb2.setBounds(120, 30, 100, 20);
		radiogomb3.setBounds(120, 50, 100, 20);
		radiogomb4.setBounds(120, 70, 100, 20);
		
		csoport.add(radiogomb1);
		csoport.add(radiogomb2);
		csoport.add(radiogomb3);
		csoport.add(radiogomb4);
		
		this.add(GombElso);
		this.add(radiogomb1);
		this.add(radiogomb2);
		this.add(radiogomb3);
		this.add(radiogomb4);
		
		GombElso.addActionListener(new ButtonListener1());
		
		}
	
	
	
	public static void main(String[] args) {
		
		new radiogomb();	
	}
	
	class ButtonListener1 implements ActionListener 
	{
		public void actionPerformed (ActionEvent e )
		{
				if(radiogomb1.isSelected()) GombElso.setText("first");
				if(radiogomb2.isSelected()) GombElso.setText("second");
				if(radiogomb3.isSelected()) GombElso.setText("third");
				if(radiogomb4.isSelected()) GombElso.setText("fourth"); 	
				
		}
		
	}
	

}
