
package messagebox;

import javax.swing.JOptionPane;
public class MessageBox {

    
    public static void main(String[] args) {
       
        String output;
        
        output   =   "Welcome to SKU";
        
        JOptionPane.showMessageDialog(null,output, "What's up Tube",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
    }
    
}
