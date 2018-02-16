
package multiplicationtimestable;
import javax.swing.*;
public class MultiplicationTimesTable {

    
    public static void main(String[] args) {
       JTextArea outputArea = new JTextArea(20,40);
    JScrollPane scroller = new JScrollPane(outputArea); 
    String output ="";
    String fn=JOptionPane.showInputDialog("Enter first number");
    
    int q = Integer.parseInt(fn);
    
    for(int i=1;i<=12;i++)
        output = "Multiplication \t\t TimesTable \t\t Answer\n";
    {
    for(int i=1;i<=12;i++)
        output += i +"\t"+"x"+"\t"+q+"\t"+"="+"\t"+i*q+"\n";
    outputArea.setText(output);
    }
JOptionPane.showMessageDialog(null, scroller,"Truth Tables",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
    }}