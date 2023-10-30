
package View;

/**
 *
 * @author hecto
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        optionPanel = new javax.swing.JPanel();
        sellbtn = new javax.swing.JButton();
        productsbtn = new javax.swing.JButton();
        listofsellsbtn = new javax.swing.JButton();
        settingsbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        customerbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(170, 35, 255));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        optionPanel.setBackground(new java.awt.Color(51, 51, 51));

        sellbtn.setBackground(new java.awt.Color(51, 51, 51));
        sellbtn.setForeground(new java.awt.Color(153, 153, 153));
        sellbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\tagsale30x30.png")); // NOI18N
        sellbtn.setText("   New Sale");
        sellbtn.setBorder(null);
        sellbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtnActionPerformed(evt);
            }
        });

        productsbtn.setBackground(new java.awt.Color(51, 51, 51));
        productsbtn.setForeground(new java.awt.Color(153, 153, 153));
        productsbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\iconProduct30x30.png")); // NOI18N
        productsbtn.setText("    Products");
        productsbtn.setBorder(null);
        productsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsbtnActionPerformed(evt);
            }
        });

        listofsellsbtn.setBackground(new java.awt.Color(51, 51, 51));
        listofsellsbtn.setForeground(new java.awt.Color(153, 153, 153));
        listofsellsbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\carritoicon30x30.png")); // NOI18N
        listofsellsbtn.setText("   Sales ");
        listofsellsbtn.setAlignmentX(0.5F);
        listofsellsbtn.setBorder(null);
        listofsellsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listofsellsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listofsellsbtnActionPerformed(evt);
            }
        });

        settingsbtn.setBackground(new java.awt.Color(51, 51, 51));
        settingsbtn.setForeground(new java.awt.Color(153, 153, 153));
        settingsbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\gearsettingsicon30x30.png")); // NOI18N
        settingsbtn.setText("  Settings");
        settingsbtn.setBorder(null);
        settingsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logoutbtn.setBackground(new java.awt.Color(51, 51, 51));
        logoutbtn.setForeground(new java.awt.Color(153, 153, 153));
        logoutbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\log-out-icon-30x30.png")); // NOI18N
        logoutbtn.setText("   Log out");
        logoutbtn.setBorder(null);
        logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Features");

        customerbtn.setBackground(new java.awt.Color(51, 51, 51));
        customerbtn.setForeground(new java.awt.Color(153, 153, 153));
        customerbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\customericon30x30.png")); // NOI18N
        customerbtn.setText("Customer");
        customerbtn.setBorder(null);
        customerbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\houseicon30x30.png")); // NOI18N

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Home");

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listofsellsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(optionPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(customerbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(optionPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sellbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listofsellsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(optionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 150, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 46, 760, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbtnActionPerformed

    private void productsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsbtnActionPerformed
        
        
    }//GEN-LAST:event_productsbtnActionPerformed

    private void listofsellsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listofsellsbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listofsellsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton customerbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton listofsellsbtn;
    public javax.swing.JButton logoutbtn;
    public javax.swing.JPanel optionPanel;
    public javax.swing.JButton productsbtn;
    public javax.swing.JButton sellbtn;
    public javax.swing.JButton settingsbtn;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
