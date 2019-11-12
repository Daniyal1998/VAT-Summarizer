/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videosum;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author dell
 */
public class videoSumMain extends javax.swing.JFrame {

    /**
     * Creates new form videoSumMain
     */
    
    int xMouse,yMouse;
    
    JFileChooser chooser;
    
    String destinationFileName;
    
    String cmdDirectory, pythonFile;
    
    public videoSumMain() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        quitBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        videoBtn = new javax.swing.JLabel();
        audioBtn = new javax.swing.JLabel();
        textBtn = new javax.swing.JLabel();
        imageBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(7, 63, 88));

        jPanel2.setBackground(new java.awt.Color(36, 93, 116));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 85));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        quitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videosum/images/quit.png"))); // NOI18N
        quitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitBtnMouseClicked(evt);
            }
        });

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videosum/images/minimize.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });

        titleText.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        titleText.setForeground(new java.awt.Color(34, 202, 234));
        titleText.setText("VAT SUMMARIZER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitBtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleText)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(quitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        videoBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        videoBtn.setForeground(new java.awt.Color(34, 202, 234));
        videoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        videoBtn.setText(" VIDEO ");
        videoBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(34, 202, 234), null));
        videoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoBtnMouseClicked(evt);
            }
        });

        audioBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        audioBtn.setForeground(new java.awt.Color(34, 202, 234));
        audioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        audioBtn.setText(" AUDIO ");
        audioBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(34, 202, 234), null));
        audioBtn.setPreferredSize(new java.awt.Dimension(90, 90));
        audioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                audioBtnMouseClicked(evt);
            }
        });

        textBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textBtn.setForeground(new java.awt.Color(34, 202, 234));
        textBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtn.setText(" TEXT ");
        textBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(34, 202, 234), null));
        textBtn.setPreferredSize(new java.awt.Dimension(90, 90));
        textBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtnMouseClicked(evt);
            }
        });

        imageBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        imageBtn.setForeground(new java.awt.Color(34, 202, 234));
        imageBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageBtn.setText(" IMAGE ");
        imageBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(34, 202, 234), null));
        imageBtn.setPreferredSize(new java.awt.Dimension(90, 90));
        imageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 202, 234));
        jLabel1.setText("INPUT FILE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(videoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(audioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(textBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(imageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(videoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(audioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x  = evt.getXOnScreen();
        int y  = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void videoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoBtnMouseClicked
        // TODO add your handling code here:
        destinationFileName = "C:\\Users\\dell\\video summariser\\videoJava";
        for(File files: new File(destinationFileName).listFiles())
        {
            if(!files.isDirectory())
                files.delete();
        }
        destinationFileName = destinationFileName + "\\video.mp4";
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File sourceFile = chooser.getSelectedFile();
        String sourceFileName = sourceFile.getAbsolutePath();
        File destinationFile = new File(destinationFileName);
        try {
            Files.copy(sourceFile.toPath(),destinationFile.toPath(),REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProcessBuilder pb;
        Process p;
        
        pythonFile = "videoAudioConversion";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pythonFile = "audioJavaPython";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        pythonFile = "textSummary";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        outputFrame nextFrame;
        try {
            nextFrame = new outputFrame();
            nextFrame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_videoBtnMouseClicked

    private void audioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_audioBtnMouseClicked
        // TODO add your handling code here:
        destinationFileName = "C:\\Users\\dell\\video summariser\\songJava";
        for(File files: new File("C:\\Users\\dell\\video summariser\\songJava").listFiles())
        {
            if(!files.isDirectory())
                files.delete();
        }
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File sourceFile = chooser.getSelectedFile();
        //System.out.println(sourceFile.getAbsolutePath());
        String sourceFileName = sourceFile.getAbsolutePath();
        if(sourceFileName.charAt(sourceFileName.length()-1) == '3')
        {
            destinationFileName = destinationFileName + "\\song.mp3";
        }
        else
        {
            destinationFileName = destinationFileName + "\\song.wav";
        }
        File destinationFile = new File(destinationFileName);
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProcessBuilder pb;
        Process p;
        
        pythonFile = "audioJavaPython";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        pythonFile = "textSummary";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        outputFrame nextFrame;
        try {
            nextFrame = new outputFrame();
            nextFrame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_audioBtnMouseClicked

    private void imageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageBtnMouseClicked
        // TODO add your handling code here:
        destinationFileName = "C:\\Users\\dell\\video summariser\\imageJava";
        for(File files: new File("C:\\Users\\dell\\video summariser\\imageJava").listFiles())
        {
            if(!files.isDirectory())
                files.delete();
        }
        destinationFileName = destinationFileName + "\\image.png";
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File sourceFile = chooser.getSelectedFile();
        File destinationFile = new File(destinationFileName);
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProcessBuilder pb;
        Process p;
        
        pythonFile = "imageText";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        pythonFile = "textSummary";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        outputFrame nextFrame;
        try {
            nextFrame = new outputFrame();
            nextFrame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_imageBtnMouseClicked

    private void textBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtnMouseClicked
        // TODO add your handling code here:
        /*TextInput nextFrame = new TextInput();
        nextFrame.setVisible(true);
        this.dispose();*/
        
        destinationFileName = "C:\\Users\\dell\\video summariser\\generated_text";
        for(File files: new File(destinationFileName).listFiles())
        {
            if(!files.isDirectory())
                files.delete();
        }
        destinationFileName = destinationFileName + "\\generated_text.txt";
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File sourceFile = chooser.getSelectedFile();
        String sourceFileName = sourceFile.getAbsolutePath();
        File destinationFile = new File(destinationFileName);
        try {
            Files.copy(sourceFile.toPath(),destinationFile.toPath(),REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProcessBuilder pb;
        Process p;
        
        pythonFile = "textSummary";
        cmdDirectory = "C:\\Users\\dell\\video summariser\\code\\";
        pb = new ProcessBuilder("python", pythonFile + ".py");
        pb.directory(new File(cmdDirectory));
        pb.redirectError();
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        outputFrame nextFrame;
        try {
            nextFrame = new outputFrame();
            nextFrame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(videoSumMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_textBtnMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(videoSumMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new videoSumMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel audioBtn;
    private javax.swing.JLabel imageBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JLabel quitBtn;
    private javax.swing.JLabel textBtn;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel videoBtn;
    // End of variables declaration//GEN-END:variables
}