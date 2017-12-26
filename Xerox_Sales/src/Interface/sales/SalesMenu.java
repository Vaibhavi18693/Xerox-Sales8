/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.sales;
import Business.Business;
import Interface.admin.AdminInstJPanel;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author sreer
 */
public class SalesMenu extends javax.swing.JPanel {

    /**
     * Creates new form SalesMenu
     */
    JPanel cardSeqjPanel;
    Business business;
    public SalesMenu(JPanel cardSeqjPanel,Business business) throws IOException {
        initComponents();
        BufferedImage myPicture = ImageIO.read(new File("images/Xerox_2008_Logo.png"));
        xeroxIconjLabel.setIcon(new ImageIcon(myPicture));
        logedUserIdjLabel.setText(String.valueOf(business.getLoggedUser().getUserId()));
        loggedUsernamejLabel.setText(business.getLoggedUser().getUserName());
        this.cardSeqjPanel=cardSeqjPanel;
        this.business=business;
        SalesInstJPanel amf = new SalesInstJPanel();
        userProcessContainerjPanel.add("SalesInstJPanel",amf);
        CardLayout layout = (CardLayout) userProcessContainerjPanel.getLayout();
        layout.next(userProcessContainerjPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        saleOrderjButton = new javax.swing.JButton();
        viewMySalesjButton = new javax.swing.JButton();
        myCommissionsjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logedUserIdjLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loggedUsernamejLabel = new javax.swing.JLabel();
        logOutjButton = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        xeroxIconjLabel = new javax.swing.JLabel();
        userProcessContainerjPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        saleOrderjButton.setText("Sale/Order");
        saleOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleOrderjButtonActionPerformed(evt);
            }
        });

        viewMySalesjButton.setText("View My Sales");
        viewMySalesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMySalesjButtonActionPerformed(evt);
            }
        });

        myCommissionsjButton.setText("My Performance");
        myCommissionsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCommissionsjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Menu");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Logged User ID:");

        logedUserIdjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Logged User Name:");

        loggedUsernamejLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        logOutjButton.setText("Logout");
        logOutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saleOrderjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewMySalesjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myCommissionsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logedUserIdjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loggedUsernamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(saleOrderjButton)
                .addGap(18, 18, 18)
                .addComponent(viewMySalesjButton)
                .addGap(18, 18, 18)
                .addComponent(myCommissionsjButton)
                .addGap(18, 18, 18)
                .addComponent(logOutjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logedUserIdjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loggedUsernamejLabel)
                .addGap(10, 10, 10))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xeroxIconjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xeroxIconjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jSplitPane2.setTopComponent(jPanel2);

        userProcessContainerjPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(userProcessContainerjPanel);

        jSplitPane1.setRightComponent(jSplitPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saleOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleOrderjButtonActionPerformed
        SalesCusSelectJPanel amf = new SalesCusSelectJPanel(userProcessContainerjPanel,business);
        userProcessContainerjPanel.add("SalesCusSelectJPanel",amf);
        CardLayout layout = (CardLayout) userProcessContainerjPanel.getLayout();
        layout.next(userProcessContainerjPanel);
    }//GEN-LAST:event_saleOrderjButtonActionPerformed

    private void viewMySalesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMySalesjButtonActionPerformed
        viewAllSalesJPanel amf = new viewAllSalesJPanel(userProcessContainerjPanel,business);
        userProcessContainerjPanel.add("viewAllSalesJPanel",amf);
        CardLayout layout = (CardLayout) userProcessContainerjPanel.getLayout();
        layout.next(userProcessContainerjPanel);
    }//GEN-LAST:event_viewMySalesjButtonActionPerformed

    private void myCommissionsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCommissionsjButtonActionPerformed
        MySalesPerformance  amf = new MySalesPerformance(business);
        userProcessContainerjPanel.add("MySalesPerformance",amf);
        CardLayout layout = (CardLayout) userProcessContainerjPanel.getLayout();
        layout.next(userProcessContainerjPanel);
    }//GEN-LAST:event_myCommissionsjButtonActionPerformed

    private void logOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutjButtonActionPerformed
        cardSeqjPanel.remove(this);
        CardLayout layout = (CardLayout)cardSeqjPanel.getLayout();
        layout.previous(cardSeqjPanel);
    }//GEN-LAST:event_logOutjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton logOutjButton;
    private javax.swing.JLabel logedUserIdjLabel;
    private javax.swing.JLabel loggedUsernamejLabel;
    private javax.swing.JButton myCommissionsjButton;
    private javax.swing.JButton saleOrderjButton;
    private javax.swing.JPanel userProcessContainerjPanel;
    private javax.swing.JButton viewMySalesjButton;
    private javax.swing.JLabel xeroxIconjLabel;
    // End of variables declaration//GEN-END:variables
}
