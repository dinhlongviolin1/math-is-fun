/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kid.s.educational.game;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Huong Ly
 */
public class Comparasion extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public Comparasion() {
        super("MATH IS FUN!!!!!");
        this.setIconImage(new ImageIcon("src/Database/Background/SmallIcon.png").getImage());
        initComponents();
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        NewDisplay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1138, 660));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 200, 200));
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 200));
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 200, 200));

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 200, 200));

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 200, 200));

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 200, 200));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/Background/HomeBtn.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 80, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/Background/NextQuestion.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 400, 100));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/Background/ChangeGame.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 400, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/Background/BlackBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Number a = null;
    private Number b = null;
    private VoiceThread correct = new VoiceThread(0, "Correct.mp3", 1000);
    private VoiceThread wrong = new VoiceThread(0, "Wrong.mp3", 1000);

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        JButton btn = (JButton) evt.getSource();
        if (a.getNumb() < b.getNumb()) {
            CorrectAns("LessThan.mp3","Smaller.png");
        } else {
            PicThread p1 = new PicThread(1000, "RedBackground.jpg", jLabel1);
            p1.start();
            if (Help.Sound) {
                wrong.run();
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        JButton btn = (JButton) evt.getSource();
        if (a.getNumb() == b.getNumb()) {
            CorrectAns("EqualTo.mp3","Equal.png");
        } else {
            PicThread p1 = new PicThread(1000, "RedBackground.jpg", jLabel1);
            p1.start();
            if (Help.Sound) {
                wrong.run();
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        JButton btn = (JButton) evt.getSource();
        if (a.getNumb() > b.getNumb()) {
            CorrectAns("GreaterThan.mp3","Bigger.png");
        } else {
            PicThread p1 = new PicThread(1000, "RedBackground.jpg", jLabel1);
            p1.start();
            if (Help.Sound) {
                wrong.run();
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Comparasion().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new GameChoosing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Comparasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comparasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comparasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comparasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comparasion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    // End of variables declaration//GEN-END:variables

    private void NewDisplay() {
        Random rand = new Random();
        a = Help.t1.get(rand.nextInt(20));
        b = Help.t1.get(rand.nextInt(20));
        //Sound
        if(Help.Sound)
        {
            VoiceThread t1 = new VoiceThread(0, "Comparing.mp3", 3000);
            VoiceThread t2 = new VoiceThread(1000, a.getNumbVoiceURL(), 1000);
            VoiceThread t3 = new VoiceThread(3000, b.getNumbVoiceURL(), 1000);
            t1.start();
            t2.start();
            t3.start();
        }
        //lbl1 input
        lbl1.setIcon(Help.imgicn("src/Database/Pictures/" + a.getNumbPicURL(), 200, 200));
        //lbl2 input
        lbl2.setIcon(Help.imgicn("src/Database/Pictures/" + b.getNumbPicURL(), 200, 200));
        //lbl3 input
        lbl3.setIcon(Help.imgicn("src/Database/Pictures/QuestionMark.png", 200, 200));
        //btn Input
        btn1.setIcon(Help.imgicn("src/Database/Pictures/Smaller.png", 190, 190));
        btn2.setIcon(Help.imgicn("src/Database/Pictures/Equal.png", 190, 190));
        btn3.setIcon(Help.imgicn("src/Database/Pictures/Bigger.png", 190, 190));
    }

    private void CorrectAns(String url,String url1) {
        jLabel1.setIcon(Help.imgicn("src/Database/Background/GreenBackground.jpg", 1138, 640));
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        lbl3.setIcon(Help.imgicn("src/Database/Pictures/"+url1, 190, 190));
        if (Help.Sound) {
            correct.run();
            VoiceThread t1 = new VoiceThread(1000, a.getNumbVoiceURL(), 1000);
            VoiceThread t2 = new VoiceThread(2000,url,1000);
            VoiceThread t3 = new VoiceThread(4000, b.getNumbVoiceURL(), 1000);
            t1.start();
            t2.start();
            t3.start();
        }
        jButton2.setVisible(true);
        jButton3.setVisible(true);
    }
}
