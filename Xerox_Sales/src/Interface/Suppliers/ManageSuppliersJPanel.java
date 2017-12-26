/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Suppliers;

import Business.*;
import Business.supplier.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Vaibhavi
 */
public class ManageSuppliersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliers
     */
    private Business business;
    private JPanel userProcessContainer;
    
    public ManageSuppliersJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateTable();
    }
    
    public void populateTable()
    {
        DefaultTableModel defaultTableModel = (DefaultTableModel)manageSuppliersTable.getModel();
        defaultTableModel.setRowCount(0);
        
        for(Supplier supplier : business.getSupplierDirectory().getSupplierDirectory())
        {
            Object row[] = new Object[3];
            row[0] = supplier;
            row[1] = supplier.getSupplierName();
            row[2] = supplier.isActive();
            defaultTableModel.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        manageSuppliersTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        addSupplierBtn = new javax.swing.JButton();
        viewUpdateSupplierBtn = new javax.swing.JButton();
        deleteSupplierBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        supplierIdTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Suppliers ");
        jLabel1.setOpaque(true);

        manageSuppliersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Supplier Name", "Is Active?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageSuppliersTable);

        searchBtn.setBackground(new java.awt.Color(0, 102, 102));
        searchBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search >>");
        searchBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addSupplierBtn.setBackground(new java.awt.Color(0, 102, 102));
        addSupplierBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addSupplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        addSupplierBtn.setText("Add Supplier >>");
        addSupplierBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        addSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierBtnActionPerformed(evt);
            }
        });

        viewUpdateSupplierBtn.setBackground(new java.awt.Color(0, 102, 102));
        viewUpdateSupplierBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        viewUpdateSupplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUpdateSupplierBtn.setText("View/Update Supplier >>");
        viewUpdateSupplierBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        viewUpdateSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUpdateSupplierBtnActionPerformed(evt);
            }
        });

        deleteSupplierBtn.setBackground(new java.awt.Color(0, 102, 102));
        deleteSupplierBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        deleteSupplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteSupplierBtn.setText("Delete Supplier >>");
        deleteSupplierBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        deleteSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(102, 0, 0));
        backBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Supplier ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(supplierIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteSupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewUpdateSupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addSupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(supplierIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(addSupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewUpdateSupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(deleteSupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        
        Supplier supplier;
        if(!supplierIdTextField.getText().isEmpty())
        {
            supplier = business.getSupplierDirectory().searchSupplier(Integer.parseInt(supplierIdTextField.getText()));
            
            if(supplier != null)
            {
                DisplaySupplierJPanel displaySupplierJPanel = new DisplaySupplierJPanel(userProcessContainer, supplier);
                userProcessContainer.add("DisplaySupplierJPanel",displaySupplierJPanel);
                CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Supplier doesn't exist.","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter the SupplierID.","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void addSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierBtnActionPerformed
        
        CreateSupplierJPanel createSupplierJPanel = new CreateSupplierJPanel(userProcessContainer,  business);
        userProcessContainer.add("CreateSupplierJPanel",createSupplierJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addSupplierBtnActionPerformed

    private void viewUpdateSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUpdateSupplierBtnActionPerformed
        
        int selectedRow = manageSuppliersTable.getSelectedRow();
        
        if(selectedRow >= 0)
        {
            Supplier supplier = (Supplier)manageSuppliersTable.getValueAt(selectedRow, 0);
            DisplaySupplierJPanel displaySupplierJPanel = new DisplaySupplierJPanel(userProcessContainer,supplier);
            userProcessContainer.add("DisplaySupplierJPanel",displaySupplierJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_viewUpdateSupplierBtnActionPerformed

    private void deleteSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierBtnActionPerformed
        
        int selectedRow = manageSuppliersTable.getSelectedRow();
        
        if(selectedRow >= 0)
        {
            Supplier supplier = (Supplier)manageSuppliersTable.getValueAt(selectedRow, 0);
            business.getSupplierDirectory().deleteSupplier(supplier);
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteSupplierBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSupplierBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteSupplierBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageSuppliersTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField supplierIdTextField;
    private javax.swing.JButton viewUpdateSupplierBtn;
    // End of variables declaration//GEN-END:variables
}
