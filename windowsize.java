package Guihome15;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class windowsize extends JFrame{
	   JButton gomb;
		JLabel cimke;
	        windowsize()
	        {
	                setLayout(null);
	                gomb = new JButton("Méret");
			cimke = new JLabel("Adatok");
	                gomb.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                                Dimension ablakMeret = getSize();
	                                int ablakMagassag = ablakMeret.height;
	                                int ablakSzelesseg = ablakMeret.width;
					cimke.setText(Integer.toString(ablakMagassag) + "x" + 
	                                                         Integer.toString(ablakSzelesseg));
	                        }
	                });
			gomb.setBounds(20, 20, 100, 30);
			cimke.setBounds(100,100, 100,30);
	                add(gomb);
			add(cimke);
			setSize(800,600);
			setVisible(true);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new windowsize();
	}

}
