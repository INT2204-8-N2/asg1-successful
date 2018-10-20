/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewJframe;

import Successful.Dictionary;
import Successful.Word;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author Vũ Đức Dũng
 */
public class Edit extends javax.swing.JFrame {
    Dictionary dic = new Dictionary();
    Word w = new Word();
    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
        
    }

    public void setWord(Word a){
        w.word_target = a.word_target ;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ETextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ETextArea1 = new javax.swing.JTextArea();
        EButton1 = new javax.swing.JButton();
        EButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit");
        setLocation(new java.awt.Point(520, 220));

        jLabel1.setText("Edit English");

        ETextField1.setBackground(new java.awt.Color(153, 153, 153));
        ETextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ETextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Edit Vietnamese");

        ETextArea1.setBackground(new java.awt.Color(153, 153, 153));
        ETextArea1.setColumns(20);
        ETextArea1.setRows(5);
        jScrollPane1.setViewportView(ETextArea1);

        EButton1.setText("Edit");
        EButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EButton1ActionPerformed(evt);
            }
        });

        EButton2.setText("Exit");
        EButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ETextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(EButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addGap(0, 207, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EButton1, EButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ETextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EButton1, EButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ETextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ETextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ETextField1ActionPerformed

    private void EButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EButton1ActionPerformed
        // TODO add your handling code here:
        String editE = ETextField1.getText();
        String editV = ETextArea1.getText();
        if(editE.isEmpty() || editV.isEmpty()){
            JOptionPane.showMessageDialog(null,"You must fill in all the information !!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(int i = 0; i<dic.word.size(); i++){
            if(dic.word.get(i).GetWord_target().equals(w.word_target)){
                dic.word.get(i).word_target = editE;
                dic.word.get(i).word_explain = editV;
            }
        }
            try {
            
            File f = new File("E_V.txt");
            FileWriter fw = new FileWriter(f);
            
            fw.write("\r\n");
            for(int i=0;i<dic.word.size();i++)
            {
                fw.write(dic.word.get(i).word_target+"<html><i>"+dic.word.get(i).word_explain + "\r\n");
            }
           // chú ý khi sửa từ word_explain luôn phải có "<" đứng trước.
            fw.close();
        } catch (IOException ex) {
            System.out.println("Can't write to file " + ex);
        }

            JOptionPane.showMessageDialog(null, "Conglaturation! You have edit successfully  !!!", "Announcement",JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_EButton1ActionPerformed

    private void EButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_EButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EButton1;
    private javax.swing.JButton EButton2;
    private javax.swing.JTextArea ETextArea1;
    private javax.swing.JTextField ETextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
