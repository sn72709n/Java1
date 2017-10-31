
package fuggveny;

//Függvényrajzoló
import java.awt.*;
import java.awt.event.*;


public class Fuggv_rajz extends Frame 
{
int akt_fuggveny=0;//ez a valtozo a kirjzolando fuggvenyt jeloli ki
//kezdeti ertek =0 -> nincs fuggveny

Sajat_Canvas Festovaszon;

    public static void main(String[] args) {
    Fuggv_rajz Ablak = new Fuggv_rajz("Fuggvenyrajzolo");
    Ablak.pack();
    //Az ablak merete legyen megvaltoztathatatlan
    Ablak.setSize(400,350);
    Ablak.setResizable(false);
    Ablak.show();
}
    
//A konstruktorban elhelyezzük a Canvas_festővásznat és 
//a függvény kiválasztására szolgáló kapcsolót
    Fuggv_rajz(String nev)
    {
    super(nev);
    
    //}
      //Kapcsolok elhelyezése a függvények kiválasztásához
    Button f1 =new Button("tan(x)");
    Button f2 = new Button("x^3");
     //A festovászon elhelyezése
    Festovaszon = new Sajat_Canvas();
    {
     //Egy elrendezéskezelő létrehozása
    setLayout(new FlowLayout());
       add(Festovaszon);
     add(f1);
    add(f2);
   
    
 
     class Sajat_WindowAdapter extends WindowAdapter
    {
    public void windowClosing(WindowEvent e)
        {
        System.exit(0);    
        }
    }
  
   
    
   
    //a kapcsolók eseménykezelése
 class Sajat_Esemenykezelo implements ActionListener
                {                 
                
                public void actionPerformed(ActionEvent e)
                    {
                    String label;                 
                    label=e.getActionCommand();                
                    if(label.equals("tan(x)"))
                    {
                        akt_fuggveny=1;
                    }       
                    else
                        akt_fuggveny=2;                   
                    //újrarajzolás
                    Festovaszon.repaint();
                    }   
 }
  //A figyelőobjektum létrehozása
    f1.addActionListener(new Sajat_Esemenykezelo());
    f2.addActionListener(new Sajat_Esemenykezelo());
    addWindowListener(new Sajat_WindowAdapter());
 }}

    class Sajat_Canvas extends Canvas
    {
        //konstruktor
        Sajat_Canvas(){
            //fekete háttérszín beállítása
            super.setBackground(Color.black);
                    
                    //az előtér (=kirajzolás színe) zöld színének beállítása
            super.setForeground(Color.green);
        }
        //A legfontosabb metódus: itt rajzolunk!
      
        @Override
        public void paint(Graphics g){
            double x,y;
            int xpoz,ypoz;
            //lépték változtatás
            g.translate(150,150);
            
            //a koord rsz tengelyeinek elhelyezése
            g.setColor(Color.red);
            g.drawLine(0, -150, 0, 150);
            g.drawLine(-150, 0, 150, 0);
            g.drawString("-3", -150, 12);
            g.drawString("-3", 4, 147);
            g.drawString("+3", 135, 12);
            g.drawString("+3", 4, -140);
            
            //a függvények kirajzolási színe
            g.setColor(new Color(255,255,0));
           //nt akt_fuggveny = 0;
            //ha nem választunk ki egyetlen függvényt sem, nincs mit tenni
            if(akt_fuggveny == 0)
                return;
            for(x=-3.0;x<3;x+=0.05)
            {
            if(akt_fuggveny == 1)
                y=Math.tan(x);
            else
                y=Math.pow(x,3);
            xpoz= (int) (x*50);
            ypoz= (int) (-y*50);
            g.fillOval(xpoz,ypoz,2,2);
             // System.out.println(+akt_fuggveny);
            }
            
        }
        //A Canvas minimális méretét adja vissza
     
        public Dimension getMinimumSize(){
            return new Dimension(300,300);
        }
        //a megkívánt méretet minimlis méretűre állítjuk
      
        @Override
        public Dimension getPreferredSize(){
        return getMinimumSize();
        
    }
    }

}
