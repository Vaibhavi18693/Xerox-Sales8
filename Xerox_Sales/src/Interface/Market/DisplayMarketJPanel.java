/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Market;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Business.*;
import Business.Market.Market;
import Business.Market.MarketOffer;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Vaibhavi
 */
public class DisplayMarketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayMarketJPanel
     */
    private JPanel userProcessContainer;
    private Market market;
    private Business business;
    
    public DisplayMarketJPanel(JPanel userProcessContainer,Business business, Market market) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.market = market;
        this.business = business;
        
        disableFields();
        displayData();
    }

    public void disableFields()
    {
        saveBtn.setEnabled(false);
        marketIDTextField.setEnabled(false);
        marketNameTextField.setEnabled(false);
        floorPriceTextField.setEnabled(false);
        ceilingPriceTextField.setEnabled(false);
        targetPriceTextField.setEnabled(false);
        commissionAboveTargetTextField.setEnabled(false);
        commissionBelowTargetTextField.setEnabled(false);
    }
    
    public void displayData()
    {
        marketIDTextField.setText(String.valueOf(market.getMarketId()));
        marketNameTextField.setText(market.getMarketType());
        for(MarketOffer marketOffer : business.getMarketOfferCatalog().getMarketOfferCatalog())
        {
            if(marketOffer.getMarket().equals(market))
            {
                floorPriceTextField.setText(String.valueOf(marketOffer.getFloorPrice()));
                targetPriceTextField.setText(String.valueOf(marketOffer.getTargetPrice()));
                ceilingPriceTextField.setText(String.valueOf(marketOffer.getCeilingPrice()));
                commissionAboveTargetTextField.setText(String.valueOf(marketOffer.getCommissionAboveTarget()));
                commissionBelowTargetTextField.setText(String.valueOf(marketOffer.getCommissionBelowTarget()));
            }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        marketIDTextField = new javax.swing.JTextField();
        marketNameTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        commissionBelowTargetTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        commissionAboveTargetTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        floorPriceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        targetPriceTextField = new javax.swing.JTextField();
        ceilingPriceTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Display Market ");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Market ID :");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText("Market Name :");

        updateBtn.setBackground(new java.awt.Color(0, 102, 102));
        updateBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        marketNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marketNameTextFieldKeyTyped(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 102, 102));
        saveBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(102, 0, 0));
        backBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setText("Commission Below Target % :");

        commissionBelowTargetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionBelowTargetTextFieldActionPerformed(evt);
            }
        });
        commissionBelowTargetTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                commissionBelowTargetTextFieldKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setText("Commission Above Target % :");

        commissionAboveTargetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionAboveTargetTextFieldActionPerformed(evt);
            }
        });
        commissionAboveTargetTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                commissionAboveTargetTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setText("Floor Price % :");

        floorPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorPriceTextFieldActionPerformed(evt);
            }
        });
        floorPriceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                floorPriceTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("Target Price % :");

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

        ceilingPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceilingPriceTextFieldActionPerformed(evt);
            }
        });
        ceilingPriceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ceilingPriceTextFieldKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setText("Ceiling Price % :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(commissionBelowTargetTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(commissionAboveTargetTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(targetPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(ceilingPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(floorPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(marketNameTextField)
                            .addComponent(marketIDTextField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marketIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(marketNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floorPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ceilingPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(commissionBelowTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(commissionAboveTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        if(!marketNameTextField.getText().isEmpty() || floorPriceTextField.getText().isEmpty() 
           || ceilingPriceTextField.getText().isEmpty() || targetPriceTextField.getText().isEmpty()
           || commissionBelowTargetTextField.getText().isEmpty() || commissionAboveTargetTextField.getText().isEmpty())
        {
            market.setMarketType(marketNameTextField.getText());
            JOptionPane.showMessageDialog(null, "Market updated successfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            marketNameTextField.setText("");
            updateBtn.setEnabled(true);
            saveBtn.setEnabled(false);
            marketNameTextField.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter market name field.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageMarketJPanel manageMarketJPanel = (ManageMarketJPanel)component;
        manageMarketJPanel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void marketNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marketNameTextFieldKeyTyped
        
        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_marketNameTextFieldKeyTyped

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
        marketNameTextField.setEnabled(true);
        floorPriceTextField.setEnabled(true);
        ceilingPriceTextField.setEnabled(true);
        targetPriceTextField.setEnabled(true);
        commissionAboveTargetTextField.setEnabled(true);
        commissionBelowTargetTextField.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void commissionBelowTargetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionBelowTargetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commissionBelowTargetTextFieldActionPerformed

    private void commissionBelowTargetTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commissionBelowTargetTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_commissionBelowTargetTextFieldKeyTyped

    private void commissionAboveTargetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionAboveTargetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commissionAboveTargetTextFieldActionPerformed

    private void commissionAboveTargetTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commissionAboveTargetTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_commissionAboveTargetTextFieldKeyTyped

    private void floorPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorPriceTextFieldActionPerformed

    private void floorPriceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_floorPriceTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_floorPriceTextFieldKeyTyped

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

    private void ceilingPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceilingPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceilingPriceTextFieldActionPerformed

    private void ceilingPriceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ceilingPriceTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_ceilingPriceTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField ceilingPriceTextField;
    private javax.swing.JTextField commissionAboveTargetTextField;
    private javax.swing.JTextField commissionBelowTargetTextField;
    private javax.swing.JTextField floorPriceTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField marketIDTextField;
    private javax.swing.JTextField marketNameTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField targetPriceTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}