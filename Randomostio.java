
package randomostio;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
//import java.io.IOException;

public class Randomostio {

    public static void main(String[] args) {   
     try{
         FileOutputStream fstr = new FileOutputStream("alma.dat");
         //olvassunk be szamot..                 
        Scanner sc = new Scanner(System.in); 
       
        for(int j=0;j<3;j++){
        int i=48;
        while(i<=57)
        {
         fstr.write(i);
         fstr.write(9);
            int a=sc.nextInt();
       int num1 =(int) (Math.random()*10);
          
        if (a==num1){
                    System.out.println("Nyertél"); i++;
         fstr.write(14);           
                                }
         else {
            System.out.println("Nem nyertél"); i++;
                            }
        }
        }
     fstr.close();
     }   
        
        
     catch (IOException ioe) {
             System.err.println(ioe.getMessage());
             }
    }    
}
