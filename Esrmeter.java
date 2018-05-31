
package esrmeter;
import java.lang.Math;
import static java.lang.System.out;
public class Esrmeter {

    
    public static void main(String[] args) {
        
        Kondenzátor Elkó;
        
            Elkó = new Kondenzátor();
                Elkó.tipus = "Oscon";
                Elkó.kapacitás = 4700;
                Elkó.feszültség = 10;
                Elkó.esrérték =5;
                Elkó.számol(Elkó.kapacitás,Elkó.feszültség,Elkó.esrérték);
        
                    out.print(Elkó.kapacitás);
                    out.print("uF\n");
                    out.print(Elkó.feszültség);
                    out.print("V\n");
                    out.print(Elkó.esrérték);
                    out.print("Ohm\n");
                        
                        if(Elkó.esrérték < Math.abs(6))
                        {
                        out.print("Működik");
                        }
                        else
                        {
                        out.print("Nem űködik");
                        }
    }
    
}
