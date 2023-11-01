
package View;

/**
 *
 * @author hecto
 */
public class ProductView extends javax.swing.JFrame {

    public ProductView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productsStockbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodcttbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categorytxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stocktxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        eliminarProductobtn = new javax.swing.JButton();
        agregarProductobtn = new javax.swing.JButton();
        actualizarProductobtn = new javax.swing.JButton();
        okbtn = new javax.swing.JButton();
        listarProductbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        productsStockbtn.setBackground(new java.awt.Color(255, 255, 255));
        productsStockbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productsStockbtn.setForeground(new java.awt.Color(0, 0, 0));
        productsStockbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\listar30x30.png")); // NOI18N
        productsStockbtn.setText("Products out of stock");
        productsStockbtn.setBorder(null);
        productsStockbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productsStockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsStockbtnActionPerformed(evt);
            }
        });

        prodcttbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prodcttbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodcttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Category", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        prodcttbl.setShowGrid(true);
        jScrollPane1.setViewportView(prodcttbl);
        if (prodcttbl.getColumnModel().getColumnCount() > 0) {
            prodcttbl.getColumnModel().getColumn(0).setMinWidth(40);
            prodcttbl.getColumnModel().getColumn(0).setMaxWidth(40);
            prodcttbl.getColumnModel().getColumn(1).setMinWidth(350);
            prodcttbl.getColumnModel().getColumn(1).setMaxWidth(350);
            prodcttbl.getColumnModel().getColumn(2).setMinWidth(100);
            prodcttbl.getColumnModel().getColumn(2).setMaxWidth(100);
            prodcttbl.getColumnModel().getColumn(3).setMinWidth(170);
            prodcttbl.getColumnModel().getColumn(3).setMaxWidth(170);
            prodcttbl.getColumnModel().getColumn(4).setMinWidth(80);
            prodcttbl.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productsStockbtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(productsStockbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID");

        idtxt.setBackground(new java.awt.Color(51, 51, 51));
        idtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idtxt.setForeground(new java.awt.Color(255, 255, 255));
        idtxt.setBorder(null);
        idtxt.setEnabled(false);
        idtxt.setFocusable(false);
        idtxt.setOpaque(true);
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");

        nametxt.setBackground(new java.awt.Color(51, 51, 51));
        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.setBorder(null);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Price");

        pricetxt.setBackground(new java.awt.Color(51, 51, 51));
        pricetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pricetxt.setForeground(new java.awt.Color(255, 255, 255));
        pricetxt.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Category");

        categorytxt.setBackground(new java.awt.Color(51, 51, 51));
        categorytxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        categorytxt.setForeground(new java.awt.Color(255, 255, 255));
        categorytxt.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Stock ");

        stocktxt.setBackground(new java.awt.Color(51, 51, 51));
        stocktxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stocktxt.setForeground(new java.awt.Color(255, 255, 255));
        stocktxt.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        eliminarProductobtn.setBackground(new java.awt.Color(51, 51, 51));
        eliminarProductobtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminarProductobtn.setForeground(new java.awt.Color(0, 0, 0));
        eliminarProductobtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\trashcanicon30x30.png")); // NOI18N
        eliminarProductobtn.setBorder(null);
        eliminarProductobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProductobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductobtnActionPerformed(evt);
            }
        });

        agregarProductobtn.setBackground(new java.awt.Color(51, 51, 51));
        agregarProductobtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agregarProductobtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\saveicon30x30.png")); // NOI18N
        agregarProductobtn.setBorder(null);
        agregarProductobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        actualizarProductobtn.setBackground(new java.awt.Color(51, 51, 51));
        actualizarProductobtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        actualizarProductobtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\refreshcion30x30.png")); // NOI18N
        actualizarProductobtn.setBorder(null);
        actualizarProductobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarProductobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProductobtnActionPerformed(evt);
            }
        });

        okbtn.setBackground(new java.awt.Color(51, 51, 51));
        okbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Documents\\NetBeansProjects\\TiendaProductosLimpieza\\src\\main\\resources\\images\\checkicon30x30.png")); // NOI18N
        okbtn.setBorder(null);
        okbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        listarProductbtn.setBackground(new java.awt.Color(51, 51, 51));
        listarProductbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listarProductbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\listar30x30.png")); // NOI18N
        listarProductbtn.setBorder(null);
        listarProductbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarProductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProductbtnActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\idicon30x30.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\user_icon_30x30.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\resources\\images\\checkicon30x30.png"));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\pricetagicon30x30.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hecto\\Desktop\\imagesProject\\stockicon30x30.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3)
                            .addComponent(pricetxt)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(idtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(nametxt)
                            .addComponent(categorytxt)
                            .addComponent(stocktxt)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(agregarProductobtn)
                        .addGap(30, 30, 30)
                        .addComponent(actualizarProductobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(eliminarProductobtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarProductbtn)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarProductobtn)
                    .addComponent(actualizarProductobtn)
                    .addComponent(okbtn)
                    .addComponent(eliminarProductobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarProductbtn))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okbtnActionPerformed

    private void productsStockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsStockbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsStockbtnActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void eliminarProductobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarProductobtnActionPerformed

    private void actualizarProductobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProductobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarProductobtnActionPerformed

    private void listarProductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProductbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarProductbtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizarProductobtn;
    public javax.swing.JButton agregarProductobtn;
    public javax.swing.JTextField categorytxt;
    public javax.swing.JButton eliminarProductobtn;
    public javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JButton listarProductbtn;
    public javax.swing.JTextField nametxt;
    public javax.swing.JButton okbtn;
    public javax.swing.JTextField pricetxt;
    public javax.swing.JTable prodcttbl;
    public javax.swing.JButton productsStockbtn;
    public javax.swing.JTextField stocktxt;
    // End of variables declaration//GEN-END:variables
}
