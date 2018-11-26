package Guihome5;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Program extends JFrame{

	JLabel felirat1;
	JLabel felirat2;
	Program()
	{
		felirat1 = new JLabel("First Label");
		felirat2 = new JLabel("Second Label");
		add(felirat1);
		add(felirat2);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(200,200);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Program();
	}

}
