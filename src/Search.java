/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
import java.awt.*;
import java.util.Collections;
import javax.swing.*;
/*import package desktop.TIG058.initdatabas;*/
/**
 *
 * @author Zakia
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchFamilyNameTextField = new javax.swing.JTextField();
        searchTeamNameTextfield = new javax.swing.JTextField();
        listByFamilyNameButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        ListByOrderButton = new javax.swing.JLabel();
        searchTeamLabel = new javax.swing.JLabel();
        searchLabel1 = new javax.swing.JLabel();
        searchFamilyNameLabel = new javax.swing.JLabel();
        searchTeamleaderLabel = new javax.swing.JLabel();
        searchTeamleaderTextfield = new javax.swing.JTextField();
        searchIDLabel = new javax.swing.JLabel();
        searchIDTextField = new javax.swing.JTextField();
        searchFamilyNameButton = new javax.swing.JButton();
        searchIDButton = new javax.swing.JButton();
        searchTeamButton = new javax.swing.JButton();
        searchTeamLeaderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchFamilyNameTextField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchFamilyNameTextField.setText("Efternamn");
        searchFamilyNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFamilyNameTextFieldMouseClicked(evt);
            }
        });
        searchFamilyNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFamilyNameTextFieldActionPerformed(evt);
            }
        });

        searchTeamNameTextfield.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchTeamNameTextfield.setText("Sök efter lag");
        searchTeamNameTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTeamNameTextfieldMouseClicked(evt);
            }
        });
        searchTeamNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTeamNameTextfieldActionPerformed(evt);
            }
        });

        listByFamilyNameButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        listByFamilyNameButton.setText("Efternamn");
        listByFamilyNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listByFamilyNameButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Tillbaka");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        ListByOrderButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ListByOrderButton.setText("Lista ordning via:");

        searchTeamLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchTeamLabel.setText("Lag (Coach/Spelare):");

        searchLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchLabel1.setText("Sök efter medlem");

        searchFamilyNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchFamilyNameLabel.setText("Efternamn:");

        searchTeamleaderLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchTeamleaderLabel.setText("Lagledare/i lag:");

        searchTeamleaderTextfield.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchTeamleaderTextfield.setText("Sök efter Lagledare");
        searchTeamleaderTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTeamleaderTextfieldMouseClicked(evt);
            }
        });

        searchIDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchIDLabel.setText("ID:");

        searchIDTextField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchIDTextField.setText("ID");
        searchIDTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIDTextFieldMouseClicked(evt);
            }
        });
        searchIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDTextFieldActionPerformed(evt);
            }
        });

        searchFamilyNameButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchFamilyNameButton.setText("Sök");
        searchFamilyNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFamilyNameButtonActionPerformed(evt);
            }
        });

        searchIDButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchIDButton.setText("Sök");
        searchIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDButtonActionPerformed(evt);
            }
        });

        searchTeamButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchTeamButton.setText("Sök");
        searchTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTeamButtonActionPerformed(evt);
            }
        });

        searchTeamLeaderButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchTeamLeaderButton.setText("Sök");
        searchTeamLeaderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTeamLeaderButtonActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListByOrderButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchFamilyNameLabel)
                                    .addComponent(searchIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTeamLabel)
                                    .addComponent(searchTeamleaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(searchTeamNameTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchFamilyNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchTeamleaderTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchTeamButton)
                                    .addComponent(searchTeamLeaderButton)
                                    .addComponent(searchIDButton)
                                    .addComponent(searchFamilyNameButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listByFamilyNameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnButton)
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(searchLabel1)
                    .addContainerGap(513, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchFamilyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchFamilyNameButton))
                                    .addComponent(searchFamilyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchIDButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchTeamNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTeamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTeamButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchTeamleaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTeamleaderTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(searchTeamLeaderButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(ListByOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listByFamilyNameButton)
                            .addComponent(returnButton)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
         
              setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_returnButtonActionPerformed

    private void listByFamilyNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listByFamilyNameButtonActionPerformed
              	
		
		Collections.sort(init_databas, new MemberAlphaComparator());

		System.out.println("Members:");
		       // TODO add your handling code here:
    }//GEN-LAST:event_listByFamilyNameButtonActionPerformed

    private void searchFamilyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFamilyNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFamilyNameTextFieldActionPerformed

    private void searchIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIDTextFieldActionPerformed

    private void searchFamilyNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFamilyNameButtonActionPerformed
        // TODO add your handling code here:
        
        String n1 = searchFamilyNameTextField.getText();
        
        if (n1.equals("Efternamn") || n1.equals("")) {
        JOptionPane.showMessageDialog(null,"OBS! Ange efternamn som du vill söka på!");
        
        } else if (!n1.equals("")){
        String query = "SELECT * FROM medlem where familyName = '" + n1 + "'";
       // System.out.println("sql:   " + query);
        String svar = test.infoExists(query);
        System.out.println(svar);
        setVisible(false);
        
        /*String n1 = searchFamilyNameTextField.getText();
        String query = "SELECT familyName FROM medlem where familyName = '" + n1 + "'";
        String svar = test.infoExists(query);
        System.out.println(svar); */

        
         
       // DEN E FEL, FIXA familyName=searchFamilyNameTextField.getText("");  
         
        
        
    }//GEN-LAST:event_searchFamilyNameButtonActionPerformed
    }
    private void searchIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDButtonActionPerformed
        // TODO add your handling code here:
        int id;
        
        //// DEN E FEL, FIXA id=searchIDTextField.getText ("");
    }//GEN-LAST:event_searchIDButtonActionPerformed

    private void searchTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTeamButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTeamButtonActionPerformed

    private void searchTeamLeaderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTeamLeaderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTeamLeaderButtonActionPerformed

    private void searchTeamNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTeamNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTeamNameTextfieldActionPerformed

    private void searchFamilyNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFamilyNameTextFieldMouseClicked
            searchFamilyNameTextField.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_searchFamilyNameTextFieldMouseClicked

    private void searchIDTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIDTextFieldMouseClicked
            searchIDTextField.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_searchIDTextFieldMouseClicked

    private void searchTeamNameTextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTeamNameTextfieldMouseClicked
            searchTeamNameTextfield.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_searchTeamNameTextfieldMouseClicked

    private void searchTeamleaderTextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTeamleaderTextfieldMouseClicked
            searchTeamleaderTextfield.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_searchTeamleaderTextfieldMouseClicked

  
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListByOrderButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton listByFamilyNameButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchFamilyNameButton;
    private javax.swing.JLabel searchFamilyNameLabel;
    private javax.swing.JTextField searchFamilyNameTextField;
    private javax.swing.JButton searchIDButton;
    private javax.swing.JLabel searchIDLabel;
    private javax.swing.JTextField searchIDTextField;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JButton searchTeamButton;
    private javax.swing.JLabel searchTeamLabel;
    private javax.swing.JButton searchTeamLeaderButton;
    private javax.swing.JTextField searchTeamNameTextfield;
    private javax.swing.JLabel searchTeamleaderLabel;
    private javax.swing.JTextField searchTeamleaderTextfield;
    // End of variables declaration//GEN-END:variables
}
