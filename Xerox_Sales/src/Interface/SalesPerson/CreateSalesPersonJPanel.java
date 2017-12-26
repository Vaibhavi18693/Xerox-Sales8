/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerson;

import Interface.Customer.*;
import Business.*;
import Business.Market.Market;
import Business.Person.SalesPerson;
import Business.customer.Customer;
import Business.supplier.Supplier;
import Interface.Suppliers.ManageSuppliersJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Vaibhavi
 */
public class CreateSalesPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSalesPersonJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    
    public CreateSalesPersonJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        targetPriceTextField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        salesPersonNameTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create SalesPerson ");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Salary :");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText("Target Price :");

        salaryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryTextFieldKeyTyped(evt);
            }
        });

        targetPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetPriceTextFieldActionPerformed(evt);
            }
        });
        targetPriceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                targetPriceTextFieldKeyTyped(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(0, 102, 102));
        createBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(102, 0, 0));
        backBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("SalesPerson Name:");

        salesPersonNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salesPersonNameTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesPersonNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(salesPersonNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(targetPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        
        if(!salaryTextField.getText().isEmpty() || !targetPriceTextField.getText().isEmpty() || 
           !salesPersonNameTextField.getText().isEmpty())
        {
            SalesPerson salesPerson = business.getSalesPersonDirectory().addSalesPerson();
            salesPerson.getPerson().setFullName(salesPersonNameTextField.getText());
            salesPerson.setSalary(Double.parseDouble(salaryTextField.getText()));
            salesPerson.setTargetPrice(Double.parseDouble(targetPriceTextField.getText()));
            JOptionPane.showMessageDialog(null, "Sales Person created successfully","Information",JOptionPane.INFORMATION_MESSAGE);
            resetFields();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter all the fields.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageSalesPersonJPanel manageSalesPersonJPanel = (ManageSalesPersonJPanel)component;
        manageSalesPersonJPanel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void targetPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetPriceTextFieldActionPerformed

    private void targetPriceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targetPriceTextFieldKeyTyped
        
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_targetPriceTextFieldKeyTyped

    private void salesPersonNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salesPersonNameTextFieldKeyTyped
        
        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_salesPersonNameTextFieldKeyTyped

    private void salaryTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_salaryTextFieldKeyTyped

    public void resetFields()
    {
        salaryTextField.setText("");
        targetPriceTextField.setText("");
        salesPersonNameTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JTextField salesPersonNameTextField;
    private javax.swing.JTextField targetPriceTextField;
    // End of variables declaration//GEN-END:variables
}
