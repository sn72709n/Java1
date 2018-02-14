
package rajzoloprogram;
import java.awt.*;
import java.awt.event.*;

public class Rajzoloprogram extends Frame{

   Sajat_Canvas Festovaszon;
   CheckboxGroup Sikidomok;
   int x_poz,y_poz;
    
    
    public static void main(String[] args) {
        
        Rajzoloprogram Ablak = new Rajzoloprogram("rajzolo");
    Ablak.pack();
    //Az ablak merete legyen megvaltoztathatatlan
    Ablak.setSize(450,400);
    Ablak.setResizable(false);
    Ablak.show();    
    }
    
     
    
    Rajzoloprogram(String nev)
    {
    super(nev);
     //kapcsolók,panel-tárolóelemek létrehozása
        Panel panel = new Panel();
            //rács 3 sorral és 1 oszloppal
         //festovaszon elhelyezese
         Festovaszon=new Sajat_Canvas();
         panel.setLayout(new GridLayout(4,1,20,20));
         add(Festovaszon);
      //  panel.setLayout(new GridLayout(3,1,20,20));
            //legyenek opcióválaszó mezők
            Sikidomok = new CheckboxGroup();
            //Sikidom = new CheckboxGroup();
            Checkbox opc1=new Checkbox("Kor",Sikidomok,false);
            Checkbox opc2=new Checkbox("Korong",Sikidomok,false);
            Checkbox opc3=new Checkbox("Teglalap",Sikidomok,false);
            Checkbox opc4=new Checkbox("Szabadkezi vonal",Sikidomok,false);
            
            
       
            
             
             //Egy elrendezéskezelő létrehozása
               setLayout(new FlowLayout());
                
                panel.add(opc1);
            panel.add(opc2);
            panel.add(opc3);
            panel.add(opc4);
               add(panel);
           
          
   
           
           
            
    }
    
     class Sajat_Canvas extends Canvas
    {
              
             class Sajat_EgerAdapter extends MouseAdapter
                    {
                    public void mousePressed(MouseEvent e)
                            {
                            //az eger aktualis poziciojanak rogzitese
                                x_poz=e.getX();
                                y_poz=e.getY();
                                //a festovaszon aktualizalasa
                                repaint();
                            }
                    }
             
             Sajat_Canvas()
             {
             addMouseListener(new Sajat_EgerAdapter());
             addMouseMotionListener(new Sajat_EgerMotionAdapter());
             super.setBackground(Color.black);
             super.setForeground(Color.orange);
             
             }
             
              public void paint(Graphics g)
    {
    String Label;
    Checkbox aktualis = null;
    //melyik sikidomot valasztottuk?
    aktualis=Sikidomok.getSelectedCheckbox();
    if(aktualis==null)
        return;
    int w = (int) (Math.random()*300);
    int h = (int) (Math.random()*300);
   Label = aktualis.getLabel();
        if(Label.equals("Kor"))
            g.drawOval(x_poz,y_poz,w,h);
        if(Label.equals("Korong"))
            g.fillOval(x_poz,y_poz,w,h);
        if(Label.equals("Teglalap"))
            g.drawRect(x_poz,y_poz,w,h);
       
             
      
            
            //a koord rsz tengelyeinek elhelyezése
            //g.setColor(Color.red);
           
            
            //a függvények kirajzolási színe
           // g.setColor(new Color(255,255,0));
           //nt akt_fuggveny = 0;
            //ha nem választunk ki egyetlen függvényt sem, nincs mit tenni
            
           
             // System.out.println(+akt_fuggveny);
            }
  
             class Sajat_EgerMotionAdapter extends MouseMotionAdapter
              {
                 
                public void mouseDragged(MouseEvent e)
                    {
                    Checkbox aktualis;
                    String Label;
                    aktualis= Sikidomok.getSelectedCheckbox();
                    Label=aktualis.getLabel();
                    //Label = null;
                    if(Label == null)
                        return;
                     if(Label.equals("Szabadkezi vonal"))
        {
        Graphics tmp = Festovaszon.getGraphics();
        x_poz=e.getX();
        y_poz=e.getY();
        tmp.drawOval(x_poz, y_poz, 2, 2);
        }
                    }
                }
              
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
        //A Canvas minimális méretét adja vissza
     
        
    
    

