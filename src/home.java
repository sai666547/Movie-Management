
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shreyas
 */
public class home extends javax.swing.JFrame {
   
    /**
     * Creates new form home
     */
    public home()  {
        initComponents();
        j3.setForeground(Color.WHITE);
        jb1.setBackground(Color.red);
        jb3.setBackground(Color.red);
        jb1.setForeground(Color.WHITE);
        jb3.setForeground(Color.WHITE);
        j4.setForeground(Color.red);
        j4.setBackground(Color.BLACK);
        j.setBackground(Color.BLACK);
        j.setForeground(Color.BLACK);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
       // this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
        //getContentPane().setBackground(Color.getHSBColor(0, 65, 85));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundSlide1 = new javax.swing.JLabel();
        backgroundSlide2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        j4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        j = new javax.swing.JLabel();

        backgroundSlide1.setForeground(new java.awt.Color(204, 51, 0));
       // backgroundSlide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeimage/abcd-2.jpg"))); // NOI18N

       // backgroundSlide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeimage/d53.jpg"))); // NOI18N

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setText("Theatre Details ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText("Movie Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jb2.setText("THEATRE DETAILS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Ticket Booking");
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jb1.setText("MOVIE DETAILS");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 250, 40));

        jb3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jb3.setText("THEATRE DETAILS");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        j3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        j3.setText("   CINEMA TICKET BOOKING");
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 610, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeimage/background8.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        j4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j4.setText("Admin Login");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeimage/background7.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, -1));

        j.setBackground(new java.awt.Color(0, 0, 0));
        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeimage/background8.png"))); // NOI18N
        getContentPane().add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        try {
            new moviedetails().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        new theatredetails().setVisible(true);
        this.dispose();
                                       

    }//GEN-LAST:event_jb3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        new employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_j4ActionPerformed

    /**
     * @param args the command line arguments
     */

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundSlide1;
    private javax.swing.JLabel backgroundSlide2;
    private javax.swing.JLabel j;
    private javax.swing.JLabel j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    // End of variables declaration//GEN-END:variables
}