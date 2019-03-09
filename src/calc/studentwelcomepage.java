package calc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
public class studentwelcomepage extends javax.swing.JFrame {
    
    String name;
         String branch;
         String college;
String userid;
    public studentwelcomepage(String str) {
        initComponents();
        userid=str;
        stunote.setText("WELCOME "+userid);
        
    }
     public studentwelcomepage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        GIVETEST = new javax.swing.JButton();
        stunote = new javax.swing.JLabel();
        MAINMENU = new javax.swing.JMenuBar();
        MYPROFILE = new javax.swing.JMenu();
        ABOUTYOU = new javax.swing.JMenuItem();
        EDITDETAILS = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        QUIZESGIVEN = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GIVETEST.setText("GIVETEST");
        GIVETEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GIVETESTActionPerformed(evt);
            }
        });

        MYPROFILE.setText("MYPROFILE       ");

        ABOUTYOU.setText("ABOUT YOU");
        ABOUTYOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABOUTYOUActionPerformed(evt);
            }
        });
        MYPROFILE.add(ABOUTYOU);

        EDITDETAILS.setText("EDIT DETAILS");
        EDITDETAILS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITDETAILSActionPerformed(evt);
            }
        });
        MYPROFILE.add(EDITDETAILS);

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        MYPROFILE.add(logout);

        QUIZESGIVEN.setText("QUIZES GIVEN");
        QUIZESGIVEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUIZESGIVENActionPerformed(evt);
            }
        });
        MYPROFILE.add(QUIZESGIVEN);

        MAINMENU.add(MYPROFILE);

        setJMenuBar(MAINMENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(GIVETEST, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stunote, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(stunote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(GIVETEST)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ABOUTYOUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUTYOUActionPerformed

        try {
            Socket socket = new Socket("localhost", 5402);
            recievemessage(socket);
        } catch (IOException e)
        {   e.printStackTrace();
        }
         dispose();
    }//GEN-LAST:event_ABOUTYOUActionPerformed
    public void recievemessage(Socket socket) throws IOException
    {
        int c=0;
             int i;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        //System.out.println(userid+" ghjkjg");
        objectOutputStream.writeUTF(userid);
             objectOutputStream.flush();
             ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            name=objectInputStream.readUTF();
         college=objectInputStream.readUTF();
         branch=objectInputStream.readUTF();
         String id=objectInputStream.readUTF();
         //System.out.println(userid+" "+name+" "+branch+" "+id);
          new uprof(userid,name,branch,college).setVisible(true);
         //new uprof().setVisible(true);
    }
   public void sendMessage1 (Socket socket) throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeUTF(userid);
            objectOutputStream.flush(); 
        }
    private void EDITDETAILSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITDETAILSActionPerformed
        dispose();
        new Changeuserpassword(userid).setVisible(true);
    }//GEN-LAST:event_EDITDETAILSActionPerformed

    private void QUIZESGIVENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUIZESGIVENActionPerformed
        // TODO add your handling code here:
        new studenttesthistory(userid).setVisible(true);
    }//GEN-LAST:event_QUIZESGIVENActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        new logink().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void GIVETESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GIVETESTActionPerformed
        dispose();
        
        new GIVETESTKEYENTER(userid).setVisible(true);
    }//GEN-LAST:event_GIVETESTActionPerformed

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
            java.util.logging.Logger.getLogger(studentwelcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentwelcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentwelcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentwelcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentwelcomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ABOUTYOU;
    private javax.swing.JMenuItem EDITDETAILS;
    private javax.swing.JButton GIVETEST;
    private javax.swing.JMenuBar MAINMENU;
    private javax.swing.JMenu MYPROFILE;
    private javax.swing.JMenuItem QUIZESGIVEN;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel stunote;
    // End of variables declaration//GEN-END:variables
}
