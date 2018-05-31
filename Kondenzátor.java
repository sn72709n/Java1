
package esrmeter;
import static java.lang.System.out;
import java.lang.Math;

public class Kondenzátor {
      
    String tipus;
    double kapacitás;
    double feszültség;
    double esrérték;
    double százalékosjóság;
    boolean rendben;
    double eredmény;


    public double számol(double kapacitás,double feszültség,double esrérték){

                if(feszültség == 10)
                {
                 eredmény=0.24401+9.88177*Math.pow(0.97181,kapacitás);
                }
        
        
       // eredmény=(kapacitás+esrérték)/feszültség;
    out.print(eredmény);
    out.print("\n");
    return eredmény;
    }
}