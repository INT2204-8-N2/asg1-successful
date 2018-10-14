/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewJframe;

 
import Successful.Word;
import Successful.Dictionary;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Successful.DictionaryManagement;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
/**
 *
 * @author dell
 */
public class DictionaryJframe extends javax.swing.JFrame {
    
    private DefaultListModel model = new DefaultListModel();
    Dictionary dic = new Dictionary();
    Word w = new Word();
    VoiceManager VM;
    Voice V;
    
    public DictionaryJframe() {
        initComponents();
        initData();
        
    }
    void insertFromFile(){
        
        File file = new File("dictionaries.txt");
       
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            int i = 0;
            String line = "";
            for (i = 0; (line = br.readLine()) != null; i++) {
                Word w = new Word();
                String[] a = line.split("\\s", 2);
                w.word_explain = a[1];
                w.word_target = a[0];
                dic.word.add(w);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
   private void initData(){
         insertFromFile();
         model = new DefaultListModel();
         for(int i=0;i<dic.word.size();i++){
         model.addElement(dic.word.get(i).word_target);
         }
        dList.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dTextField = new javax.swing.JTextField();
        dButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        dList = new javax.swing.JList<>();
        dLabel = new javax.swing.JLabel();
        dButton2 = new javax.swing.JButton();
        dButton3 = new javax.swing.JButton();
        dButton4 = new javax.swing.JButton();
        dButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(51, 255, 51));
        setLocation(new java.awt.Point(400, 120));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dTextField.setBackground(new java.awt.Color(204, 204, 255));
        dTextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dTextFieldCaretUpdate(evt);
            }
        });
        dTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dTextFieldMouseClicked(evt);
            }
        });
        dTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dTextFieldKeyPressed(evt);
            }
        });
        getContentPane().add(dTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 57, 154, 43));

        dButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search.png"))); // NOI18N
        dButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(dButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 57, -1, 43));

        dTextArea.setEditable(false);
        dTextArea.setBackground(new java.awt.Color(204, 204, 204));
        dTextArea.setColumns(20);
        dTextArea.setRows(5);
        jScrollPane1.setViewportView(dTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 118, 380, 352));

        dList.setBackground(new java.awt.Color(204, 204, 204));
        dList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        dList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(dList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 118, 154, 352));

        dLabel.setBackground(new java.awt.Color(255, 255, 255));
        dLabel.setFont(new java.awt.Font("Arial Black", 3, 20)); // NOI18N
        dLabel.setForeground(new java.awt.Color(51, 255, 51));
        dLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dLabel.setText("ENGLISH - VIETNAMESE");
        getContentPane().add(dLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 300, 56));

        dButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sound.png"))); // NOI18N
        dButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dButton2MouseReleased(evt);
            }
        });
        getContentPane().add(dButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 40, 35));

        dButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Insert.png"))); // NOI18N
        dButton3.setActionCommand("add");
        dButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(dButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 40, 35));

        dButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit.png"))); // NOI18N
        dButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(dButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 35));

        dButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Delete.png"))); // NOI18N
        dButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(dButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 40, 35));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hello1.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButton1ActionPerformed
        // TODO add your handling code here:

         String value = dTextField.getText();
        DictionaryManagement dm = new DictionaryManagement();
        
        dTextArea.setText(dm.dictionaryLookup(value));
        
        
    }//GEN-LAST:event_dButton1ActionPerformed

    private void dTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dTextFieldMouseClicked
        // TODO add your handling code here:
       // dTextField.setText("");
    }//GEN-LAST:event_dTextFieldMouseClicked

    private void dListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dListValueChanged
        // TODO add your handling code here:
        DictionaryManagement dm = new DictionaryManagement();
        w.word_target = dList.getSelectedValue();
        dTextArea.setText(dm.dictionaryLookup(dList.getSelectedValue()));
    }//GEN-LAST:event_dListValueChanged

    private void dTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dTextFieldKeyPressed

    private void dTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_dTextFieldCaretUpdate
       String s = dTextField.getText();
       model = new DefaultListModel();
       
       if(s.isEmpty()){
         model = new DefaultListModel();
         for(int i=0;i<dic.word.size();i++){
         model.addElement(dic.word.get(i).word_target);
         }
        dList.setModel(model);
        }
       
        else
        {
         model.clear();
         for(int i=0;i<dic.word.size();i++){
            if(dic.word.get(i).GetWord_target().startsWith(s))
             model.addElement(dic.word.get(i).GetWord_target());
         }
        dList.setModel(model);
        
    }   
        
    }//GEN-LAST:event_dTextFieldCaretUpdate

    private void dButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButton3ActionPerformed
        // TODO add your handling code here:
        Insert insert = new Insert();
        insert.setVisible(true);
    }//GEN-LAST:event_dButton3ActionPerformed

    private void dButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButton4ActionPerformed
        // TODO add your handling code here:
        
        Edit edit = new Edit();
        edit.setWord(w);
        edit.setVisible(true);
    }//GEN-LAST:event_dButton4ActionPerformed

    private void dButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButton5ActionPerformed
        // TODO add your handling code here:
//        String value = dTextField.getText();
       if(dList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"You must fill in all the information !!!", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
        for(int i = 0; i<dic.word.size(); i++){
            if(dic.word.get(i).GetWord_target().equals(w.word_target)){
                dic.word.remove(dic.word.get(i));
        JOptionPane.showMessageDialog(null,"You have delete successfully", "Announcement", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }
            
    }//GEN-LAST:event_dButton5ActionPerformed

    private void dButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dButton2MouseReleased
        // TODO add your handling code here:      
       
       System.setProperty("mbrola.base", "mbrola");
       
       VM = VoiceManager.getInstance();
       
       V = VM.getVoice("mbrola_us1");
       
       V.allocate();
       
       V.speak(w.word_target);
    }//GEN-LAST:event_dButton2MouseReleased
     
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
            java.util.logging.Logger.getLogger(DictionaryJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dButton1;
    private javax.swing.JButton dButton2;
    private javax.swing.JButton dButton3;
    private javax.swing.JButton dButton4;
    private javax.swing.JButton dButton5;
    private javax.swing.JLabel dLabel;
    private javax.swing.JList<String> dList;
    private javax.swing.JTextArea dTextArea;
    private javax.swing.JTextField dTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
