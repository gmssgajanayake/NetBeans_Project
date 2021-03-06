/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package customer.view;

import customer.module.Customer;
import customer.controller.CustomerController;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author G.M.Sakuja Shamal
 */
public class UpdateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form CustomerManager
     */
    public UpdateCustomer() {
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

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        bodyPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLable = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addCustomerBodyPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        salaryTextField = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bodyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        titleLable.setFont(new java.awt.Font("Segoe UI Black", 3, 80)); // NOI18N
        titleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLable.setText("Update Customer");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLable, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        bodyPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1140, 130));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(571, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(cancelButton)
                    .addComponent(updateButton))
                .addContainerGap())
        );

        bodyPanel.add(buttonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 1140, 70));

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        idLabel.setText("ID                :");

        salaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        salaryLabel.setText("Salary         :");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addressLabel.setText("Address      :");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameLabel.setText("Name          :");

        addressTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        addressTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        idTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        idTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        salaryTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        salaryTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout addCustomerBodyPanelLayout = new javax.swing.GroupLayout(addCustomerBodyPanel);
        addCustomerBodyPanel.setLayout(addCustomerBodyPanelLayout);
        addCustomerBodyPanelLayout.setHorizontalGroup(
            addCustomerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerBodyPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(addCustomerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerBodyPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(addCustomerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        addCustomerBodyPanelLayout.setVerticalGroup(
            addCustomerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerBodyPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addCustomerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addCustomerBodyPanelLayout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(addCustomerBodyPanelLayout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(addCustomerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        bodyPanel.add(addCustomerBodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 1140, 370));

        getContentPane().add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 1200, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        CustomerManager.customerManager();
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       try{
           if (
                   CustomerController.updateCustomer(new Customer(
                           idTextField.getText(),
                           nameTextField.getText(),
                           addressTextField.getText(),
                           Double.parseDouble(salaryTextField.getText())
                   ))
           ){
               JOptionPane.showMessageDialog(this,"Update success");
           }
       }catch (ClassNotFoundException ex){
           JOptionPane.showMessageDialog(this,"Driver not found ...");
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(this,ex.getMessage());
       }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void idTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        try{
            Customer customer = CustomerController.searchCustomer(idTextField.getText());
            if (customer!=null){
                nameTextField.setText(customer.getName());
                addressTextField.setText(customer.getAddress());
                salaryTextField.setText(customer.getSalary().toString());
            }else{
                JOptionPane.showMessageDialog(this,"This customer not found");
            }

        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this,"Driver not found ...");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        
    }//GEN-LAST:event_idTextFieldActionPerformed

    /**
     */
    public static void updateCustomer() {
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
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCustomerBodyPanel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JLabel titleLable;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
