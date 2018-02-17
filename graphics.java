
package graphic_info;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
//import javax.swing.*;
//import javax.swing.JOptionPane;
//import javax.swing.JTextArea;
public class graphics extends javax.swing.JFrame {

   
    public graphics() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 800));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Rectangle");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Oval");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jRadioButton1)
                .addGap(36, 36, 36)
                .addComponent(jRadioButton2)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Graphics2D g = (Graphics2D) getGraphics();
        g.fillRect(200, 200, 50, 50);
        for(int q=0;q<10;q++)
        {
        g.setColor(Color.RED);
        g.setFont(new Font ("Serif", Font.BOLD,48));
        g.drawString("My little Art Work",400,80);
        g.fillRect(50+q*10,50+q*10,50+q*10, 50+q*10);
        g.fillRect(100+q*10,100+q*10,100+q*10,100+q*10);
        g.fillRect(200+q*10,200+q*10,200+q*10,200+q*10);
        g.fillRect(400+q*10, 400+q*10, 400+q*10, 400+q*10);
        g.fillRect(600+q*10, 600+q*10, 600+q*10, 600+q*10);
        
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
        Graphics2D g = (Graphics2D) getGraphics();
        g.fillRect(200, 200, 50, 50);
        for(int q=0;q<10;q++)
        {
        g.setColor(Color.black);
        //g.setFont(new Font ("Serif", Font.BOLD,48));
        //g.drawString("My little Art Work",400,80);
        g.fillOval(800+q*10,50+q*10,50+q*10, 50+q*10);
        g.fillOval(700+q*10,100+q*10,10+q*10,10+q*10);
        g.fillOval(600+q*10,200+q*10,20+q*10,20+q*10);
        g.fillOval(500+q*10, 400+q*10, 40+q*10, 40+q*10);
        g.fillOval(400+q*10, 600+q*10, 60+q*10, 60+q*10);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graphics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
