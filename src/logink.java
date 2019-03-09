package calc;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class logink extends javax.swing.JFrame {
    public logink() {
        initComponents();
        userid.setText("");
        adminuser.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminlogin = new javax.swing.JButton();
        userlogin = new javax.swing.JButton();
        signupuser = new javax.swing.JButton();
        userforgot = new javax.swing.JButton();
        adminforgotpassword = new javax.swing.JButton();
        adminuser = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        warnuser = new javax.swing.JLabel();
        warningadmin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminlogin.setBackground(new java.awt.Color(51, 0, 255));
        adminlogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminlogin.setForeground(new java.awt.Color(153, 255, 255));
        adminlogin.setText("LOGIN");
        adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminloginActionPerformed(evt);
            }
        });
        getContentPane().add(adminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 472, 77, 35));

        userlogin.setBackground(new java.awt.Color(51, 0, 255));
        userlogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userlogin.setForeground(new java.awt.Color(153, 255, 255));
        userlogin.setText("LOGIN");
        userlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userloginActionPerformed(evt);
            }
        });
        getContentPane().add(userlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 472, 73, 35));

        signupuser.setBackground(new java.awt.Color(51, 0, 255));
        signupuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupuser.setForeground(new java.awt.Color(153, 255, 255));
        signupuser.setText("SIGN UP");
        signupuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupuserActionPerformed(evt);
            }
        });
        getContentPane().add(signupuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 472, -1, 35));

        userforgot.setBackground(new java.awt.Color(51, 0, 255));
        userforgot.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userforgot.setForeground(new java.awt.Color(153, 255, 255));
        userforgot.setText("FORGOT PASSWORD");
        userforgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userforgotActionPerformed(evt);
            }
        });
        getContentPane().add(userforgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 514, 160, 35));

        adminforgotpassword.setBackground(new java.awt.Color(51, 0, 255));
        adminforgotpassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminforgotpassword.setForeground(new java.awt.Color(153, 255, 255));
        adminforgotpassword.setText("FORGOT PASSWORD");
        adminforgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminforgotpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(adminforgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 514, -1, 35));

        adminuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminuserActionPerformed(evt);
            }
        });
        getContentPane().add(adminuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 330, 176, 33));

        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 327, 176, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText(" USERNAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 327, -1, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 130, 39));

        adminpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminpassActionPerformed(evt);
            }
        });
        getContentPane().add(adminpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 381, 176, 39));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("                  ADMIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 272, 276, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("USERNAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, 39));

        userpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpassActionPerformed(evt);
            }
        });
        getContentPane().add(userpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 381, 176, 39));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("                     USER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 272, 316, 37));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setText("         SECURE QUIZ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 94, -1, 65));

        warnuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        warnuser.setText("CASE SENSITIVE HIGHER CASE ONLY");
        getContentPane().add(warnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 439, 380, 26));

        warningadmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        warningadmin.setText("CASE SENSITIVE HIGHER CASE ONLY");
        getContentPane().add(warningadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 439, 380, 26));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calc/Q.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminuserActionPerformed

    private void adminpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpassActionPerformed
     }//GEN-LAST:event_adminpassActionPerformed

    private void adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminloginActionPerformed
       try {
            Socket socket = new Socket("localhost", 5400);
            sendMessage1(socket);
        } catch (IOException e)
        {   e.printStackTrace();
        }
        
    }//GEN-LAST:event_adminloginActionPerformed

     public void sendMessage1 
            (Socket socket)
            throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
        int ch;
         Scanner sc=new Scanner(System.in);
           ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            String s12 = adminuser.getText();
            String s21 = adminpass.getText();
            objectOutputStream.writeUTF(s12);
            objectOutputStream.writeUTF(s21);
            objectOutputStream.flush();
            String s= (String) objectInputStream.readUTF();
            System.out.println(s);
           if(s.equals("allow Login"))
           {dispose();
               new teacherwelcomepage(s12).setVisible(true);
           }
           else
               warningadmin.setText("INVALID CREDENTIALS");
            
        }
    private void signupuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupuserActionPerformed
        // TODO add your handling code here:
dispose();
        new Signupform().setVisible(true);
    }//GEN-LAST:event_signupuserActionPerformed

    private void userloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userloginActionPerformed

         // TODO add your handling code here:
        try {
            Socket socket = new Socket("localhost", 5401);
            sendMessage(socket);
        } catch (IOException e)
        {   e.printStackTrace();
        }
    }//GEN-LAST:event_userloginActionPerformed
 public void sendMessage 
            (Socket socket)
            throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
        int ch;
         //Scanner sc=new Scanner(System.in);
           ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            String s1 = userid.getText();
            String s2 = userpass.getText();
            objectOutputStream.writeUTF(s1);
            objectOutputStream.writeUTF(s2);
            objectOutputStream.flush();
            String s= (String) objectInputStream.readUTF();
            System.out.println(s);
           if(s.equals("allow Login"))
           {
               dispose();
               new studentwelcomepage(s1).setVisible(true);
           
           }
           else
               warnuser.setText("INVALID CREDENTIALS");
            
        }
    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void userpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpassActionPerformed

    private void adminforgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminforgotpasswordActionPerformed
        // TODO add your handling code here:
        String str;
        str=adminuser.getText();
        if(str.equals(""))
        {    
            warningadmin.setText("PLEASE ENTER THE LOGIN ID");
        }    
        else
        {
            dispose();
            new Changepswd(adminuser.getText()).setVisible(true);
        }      
    }//GEN-LAST:event_adminforgotpasswordActionPerformed

    private void userforgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userforgotActionPerformed
        // TODO add your handling code here:
        String str;
        str=userid.getText();
        if(str==null)
        {
            System.out.println("ok here");
            warnuser.setText("PLEASE ENTER THE LOGIN ID");
        }
        else
        {
            dispose();
            new Changepswd(str).setVisible(true);
        }     
    }//GEN-LAST:event_userforgotActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminforgotpassword;
    private javax.swing.JButton adminlogin;
    private javax.swing.JPasswordField adminpass;
    private javax.swing.JTextField adminuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton signupuser;
    private javax.swing.JButton userforgot;
    private javax.swing.JTextField userid;
    private javax.swing.JButton userlogin;
    private javax.swing.JPasswordField userpass;
    private javax.swing.JLabel warningadmin;
    private javax.swing.JLabel warnuser;
    // End of variables declaration//GEN-END:variables

}
