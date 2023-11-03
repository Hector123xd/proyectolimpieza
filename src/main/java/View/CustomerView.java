
package View;

/**
 *
 * @author hecto
 */
public class CustomerView extends javax.swing.JFrame {

    public CustomerView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dniCustomertxt = new javax.swing.JTextField();
        nameCustomertxt = new javax.swing.JTextField();
        statusCustomertxt = new javax.swing.JTextField();
        addressCustomertxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        saveCustomerbtn = new javax.swing.JButton();
        updateCustomerbtn = new javax.swing.JButton();
        deleteCustomerbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        readCustomerbtn = new javax.swing.JButton();
        okCustomerbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 600));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Status");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("DNI");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 40, 30));

        dniCustomertxt.setBackground(new java.awt.Color(51, 51, 51));
        dniCustomertxt.setBorder(null);
        jPanel2.add(dniCustomertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 30));

        nameCustomertxt.setBackground(new java.awt.Color(51, 51, 51));
        nameCustomertxt.setBorder(null);
        jPanel2.add(nameCustomertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, 30));

        statusCustomertxt.setBackground(new java.awt.Color(51, 51, 51));
        statusCustomertxt.setBorder(null);
        jPanel2.add(statusCustomertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 30));

        addressCustomertxt.setBackground(new java.awt.Color(51, 51, 51));
        addressCustomertxt.setBorder(null);
        jPanel2.add(addressCustomertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 180, 20));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 180, 20));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 20));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 180, 20));

        saveCustomerbtn.setBackground(new java.awt.Color(51, 51, 51));
        saveCustomerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveicon30x30.png"))); // NOI18N
        saveCustomerbtn.setBorder(null);
        saveCustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCustomerbtnActionPerformed(evt);
            }
        });
        jPanel2.add(saveCustomerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        updateCustomerbtn.setBackground(new java.awt.Color(51, 51, 51));
        updateCustomerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refreshcion30x30.png"))); // NOI18N
        updateCustomerbtn.setBorder(null);
        jPanel2.add(updateCustomerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        deleteCustomerbtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteCustomerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trashcanicon30x30.png"))); // NOI18N
        deleteCustomerbtn.setBorder(null);
        deleteCustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerbtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteCustomerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-id-icon_30x30.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_icon_30x30.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/direccionicon30x30.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadoproductoicon 30x30.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        readCustomerbtn.setBackground(new java.awt.Color(51, 51, 51));
        readCustomerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listar30x30.png"))); // NOI18N
        readCustomerbtn.setBorder(null);
        jPanel2.add(readCustomerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        okCustomerbtn.setBackground(new java.awt.Color(51, 51, 51));
        okCustomerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkicon30x30.png"))); // NOI18N
        okCustomerbtn.setBorder(null);
        jPanel2.add(okCustomerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        customertbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombre", "Direccion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customertbl);
        if (customertbl.getColumnModel().getColumnCount() > 0) {
            customertbl.getColumnModel().getColumn(0).setMinWidth(50);
            customertbl.getColumnModel().getColumn(0).setMaxWidth(50);
            customertbl.getColumnModel().getColumn(1).setMinWidth(120);
            customertbl.getColumnModel().getColumn(1).setMaxWidth(120);
            customertbl.getColumnModel().getColumn(2).setMinWidth(300);
            customertbl.getColumnModel().getColumn(2).setMaxWidth(300);
            customertbl.getColumnModel().getColumn(3).setMinWidth(170);
            customertbl.getColumnModel().getColumn(3).setMaxWidth(170);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 750, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveCustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCustomerbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveCustomerbtnActionPerformed

    private void deleteCustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCustomerbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addressCustomertxt;
    public javax.swing.JTable customertbl;
    public javax.swing.JButton deleteCustomerbtn;
    public javax.swing.JTextField dniCustomertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField nameCustomertxt;
    public javax.swing.JButton okCustomerbtn;
    public javax.swing.JButton readCustomerbtn;
    public javax.swing.JButton saveCustomerbtn;
    public javax.swing.JTextField statusCustomertxt;
    public javax.swing.JButton updateCustomerbtn;
    // End of variables declaration//GEN-END:variables
}
