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
import java.util.Arrays;
/**
 *
 * @author gaurav
 */
public class QUIZ extends javax.swing.JFrame {
    int arr[]=new int[16];
     String []ans=new String[16];
     public int count1=0;
     public int count=0;
     int qno;
     String str,n;
     public String quizno;
     long time;
     String key;
     String userid;
     String[] correct= new String [16];
     int marks=0;
    public QUIZ(String str,String user) {
        initComponents();
        System.out.println(str+" "+user);
        key=str;
      this.userid=user;
        for(int i=0;i<16;i++)
        {
            ans[i]="w";
            arr[i]=0;
        }
    }
     public QUIZ() {
      
        initComponents();
        for(int i=0;i<16;i++)
        {
            ans[i]="w";
            arr[i]=0;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        ten = new javax.swing.JButton();
        eleven = new javax.swing.JButton();
        twelve = new javax.swing.JButton();
        thirteen = new javax.swing.JButton();
        fourteen = new javax.swing.JButton();
        fifteen = new javax.swing.JButton();
        D = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        A = new javax.swing.JRadioButton();
        ques = new javax.swing.JLabel();
        SUBMIT = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        end = new javax.swing.JButton();
        num = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calc/Q.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        two.setBackground(new java.awt.Color(102, 255, 102));
        two.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 60, 53));

        three.setBackground(new java.awt.Color(102, 255, 102));
        three.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 60, 53));

        one.setBackground(new java.awt.Color(51, 255, 51));
        one.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 60, 53));

        four.setBackground(new java.awt.Color(153, 255, 153));
        four.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        four.setForeground(new java.awt.Color(102, 102, 102));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 60, 53));

        five.setBackground(new java.awt.Color(102, 255, 102));
        five.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 60, 53));

        six.setBackground(new java.awt.Color(102, 255, 51));
        six.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 60, 53));

        seven.setBackground(new java.awt.Color(102, 255, 102));
        seven.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 60, 53));

        eight.setBackground(new java.awt.Color(102, 255, 102));
        eight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 60, 53));

        nine.setBackground(new java.awt.Color(51, 255, 51));
        nine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 60, 53));

        ten.setBackground(new java.awt.Color(102, 255, 102));
        ten.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ten.setText("10");
        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });
        getContentPane().add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 60, 53));

        eleven.setBackground(new java.awt.Color(153, 255, 153));
        eleven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eleven.setText("11");
        eleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevenActionPerformed(evt);
            }
        });
        getContentPane().add(eleven, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 60, 53));

        twelve.setBackground(new java.awt.Color(51, 255, 51));
        twelve.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        twelve.setText("12");
        twelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveActionPerformed(evt);
            }
        });
        getContentPane().add(twelve, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 60, 53));

        thirteen.setBackground(new java.awt.Color(102, 255, 102));
        thirteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        thirteen.setText("13");
        thirteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirteenActionPerformed(evt);
            }
        });
        getContentPane().add(thirteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 60, 53));

        fourteen.setBackground(new java.awt.Color(51, 255, 51));
        fourteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fourteen.setText("14");
        fourteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourteenActionPerformed(evt);
            }
        });
        getContentPane().add(fourteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 60, 53));

        fifteen.setBackground(new java.awt.Color(153, 255, 102));
        fifteen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fifteen.setText("15");
        fifteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifteenActionPerformed(evt);
            }
        });
        getContentPane().add(fifteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 60, 53));

        D.setBackground(new java.awt.Color(255, 204, 204));
        D.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 730, 61));

        B.setBackground(new java.awt.Color(255, 204, 204));
        B.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 730, 67));

        C.setBackground(new java.awt.Color(255, 204, 204));
        C.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 730, 59));

        A.setBackground(new java.awt.Color(255, 204, 204));
        A.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 730, 61));

        ques.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 830, 156));

        SUBMIT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SUBMIT.setText("SUBMIT");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });
        getContentPane().add(SUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 152, 56));

        CLEAR.setBackground(new java.awt.Color(102, 255, 102));
        CLEAR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 150, 60));

        end.setBackground(new java.awt.Color(255, 0, 0));
        end.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        end.setText("END");
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 127, 55));

        num.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        num.setText("    ");
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 82, 156));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getresponse(int idx)
    {
                A.setSelected(false);
                 B.setSelected(false);
                 C.setSelected(false);
                 D.setSelected(false);
        switch(arr[idx])
        {
            case 1:A.setSelected(true);
                  break;
            case 2:B.setSelected(true);
                  break;
            case 3:C.setSelected(true);
                  break;
            case 4:D.setSelected(true);
                  break;
            default:break;      
        }
    }
    public void setresponse(int idx)
    {
        if(A.isSelected())
        {
            ans[idx]="A";
            arr[idx]=1;
        }
        else if(B.isSelected())
        {
            ans[idx]="B";
            arr[idx]=2;
        }
        else if(C.isSelected())
        {
            ans[idx]="C";
            arr[idx]=3;
        }
        else if(D.isSelected())
        {
            ans[idx]="D";
            arr[idx]=4;
        }
        else
        {
            arr[idx]=0;
        }
    }
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
                n="4";
                str=null; 
             qno=4;
                num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             }
 
    }//GEN-LAST:event_fourActionPerformed

    private void fourteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourteenActionPerformed
 n="14";  str=null; qno=14;  
num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
            }    }//GEN-LAST:event_fourteenActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
               n="1";  str=null;  qno=1; 
               num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             }
            
    }//GEN-LAST:event_oneActionPerformed

    public void Message1 
            (Socket socket)
            throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
        int ch;
           objectOutputStream.writeUTF(key);
            objectOutputStream.writeUTF(n);
            objectOutputStream.flush();
           ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            ques.setText((String) objectInputStream.readUTF());
            A.setText((String) objectInputStream.readUTF());
            D.setText((String) objectInputStream.readUTF());
            B.setText((String) objectInputStream.readUTF());
            C.setText((String) objectInputStream.readUTF());
            }
    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
/*if(str==null)
    str="B";
    else
    str+="B";*/  
    }//GEN-LAST:event_DActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
 n="2";  str=null;  qno=2;   
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             }                    
        // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
 n="3";  str=null;   qno=3; 
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_threeActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
 n="5";  str=null;  qno=5;
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
               
            }    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
 n="6";  str=null; 
 qno=6;
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
 n="7";  str=null;   qno=7;
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
 n="8";  str=null;   qno=8;
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
 n="9";  str=null;  qno=9; 
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_nineActionPerformed

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
 n="10";  str=null;   qno=10;   
num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_tenActionPerformed

    private void elevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevenActionPerformed
 n="11";  str=null;   qno=11;    
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_elevenActionPerformed

    private void twelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelveActionPerformed
 n="12";  str=null;  qno=12; 
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_twelveActionPerformed

    private void thirteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirteenActionPerformed
 n="13";  str=null;   qno=13;  
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_thirteenActionPerformed

    private void fifteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifteenActionPerformed
 n="15";  str=null;  qno=15;   
 num.setText(n);
             try {
                 Socket socket = new Socket("localhost", 5406);
                 Message1(socket); 
                 getresponse(qno);
             } catch (IOException ex) {
                 Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
             
            }    }//GEN-LAST:event_fifteenActionPerformed

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
            int q=Integer.valueOf(n);
            setresponse(q);
    }//GEN-LAST:event_SUBMITActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

    }//GEN-LAST:event_AActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
     
    }//GEN-LAST:event_CActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        
    }//GEN-LAST:event_BActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
       A.setSelected(false);
       D.setSelected(false);
       B.setSelected(false);
       C.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_CLEARActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed

        try {
            Socket socket=new Socket("localhost",5412);
            Message(socket);
            dispose();
            for(int k=0;k<15;k++)
             System.out.println(ans[k]);
            new END(userid,marks,ans,correct).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(QUIZ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_endActionPerformed

     public void Message 
            (Socket socket)
            throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
        int ch;
           String a=this.key;
           System.out.println(a);
           
           objectOutputStream.writeUTF(a);
           System.out.println(a);
           objectOutputStream.writeUTF(this.userid);
            for(int i=1;i<=15;i++)
               objectOutputStream.writeUTF(this.ans[i]);
            objectOutputStream.flush();
           ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            String value=(String) objectInputStream.readUTF();
            marks=Integer.valueOf(value);
            System.out.println(marks);
            int g=0;
            for(g=1;g<=15;g++)
             correct[g]=(String) objectInputStream.readUTF();
            }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUIZ().setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JButton CLEAR;
    private javax.swing.JRadioButton D;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JButton eight;
    private javax.swing.JButton eleven;
    private javax.swing.JButton end;
    private javax.swing.JButton fifteen;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton fourteen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nine;
    private javax.swing.JLabel num;
    private javax.swing.JButton one;
    private javax.swing.JLabel ques;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton ten;
    private javax.swing.JButton thirteen;
    private javax.swing.JButton three;
    private javax.swing.JButton twelve;
    private javax.swing.JButton two;
    // End of variables declaration//GEN-END:variables

    
}