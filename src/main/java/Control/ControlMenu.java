package Control;

import Model.Product;
import Model.ProductDAO;
import View.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hecto
 */
public class ControlMenu implements ActionListener {
    
    Product product = new Product();
    ProductDAO dao = new ProductDAO();
    Menu view = new Menu();
    DefaultTableModel model = new DefaultTableModel();
    final String password = "abc123";
    
    public ControlMenu(Product product, ProductDAO dao, Menu view) {
        this.product = product;
        this.dao = dao;
        this.view = view;
        this.view.productsbtn.addActionListener(this);
        this.view.actualizarbtn.addActionListener(this);
        this.view.okbtn.addActionListener(this);
        this.view.productsStockbtn.addActionListener(this);
    }
    
    public void start() {
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Tienda de limpieza");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.productsbtn) {
            view.jTabbedPane1.setSelectedIndex(1);
            listarProductos(view.prodcttbl);
        }
        if (e.getSource() == view.actualizarbtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");
            
            if (pass.equals(password)) {
                printingInFields();
                
            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }
            
        }
        if (e.getSource() == view.okbtn) {
            actualizarStock();
            clearFields();
            clearTable();
            listarProductos(view.prodcttbl);
        }if(e.getSource() == view.productsStockbtn){
            clearFields();
            clearTable();
            listarFueraStock(view.prodcttbl);
        }
        
    }
    
    public void listarProductos(JTable tabla) {
        
        model = (DefaultTableModel) tabla.getModel();
        List<Product> list = dao.listProducts();
        Object[] raw = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            raw[0] = list.get(i).getId_product();
            raw[1] = list.get(i).getName_product();
            raw[2] = list.get(i).getPrice_product();
            raw[3] = list.get(i).getCategory_product();
            raw[4] = list.get(i).getStock_product();
            model.addRow(raw);
        }
        view.prodcttbl.setModel(model);
        
    }
    
    public void printingInFields() {
        int fila = view.prodcttbl.getSelectedRow();
        if (fila == -1) {
            System.out.println("choose");
        } else {
            Integer id = (Integer) view.prodcttbl.getValueAt(fila, 0);
            String name = (String) view.prodcttbl.getValueAt(fila, 1);
            Float price = (Float) view.prodcttbl.getValueAt(fila, 2);
            Integer category = (Integer) view.prodcttbl.getValueAt(fila, 3);
            boolean stock = (boolean) view.prodcttbl.getValueAt(fila, 4);
            
            view.idtxt.setText(String.valueOf(id));
            view.nametxt.setText(name);
            view.pricetxt.setText(String.valueOf(price));
            view.categorytxt.setText(String.valueOf(category));
            view.stocktxt.setText(String.valueOf(stock));
            
        }
    }
    
    public void actualizarStock() {
        
        product.setStock_product(Boolean.parseBoolean(view.stocktxt.getText()));
        product.setId_product(Integer.valueOf(view.idtxt.getText()));
        int result = dao.updateProduct(product);
        if (result > 0) {
            System.out.println("Datos actualizados");
        } else {
            System.out.println("No se realizo cambios");
        }
        
    }
    
    public void listarFueraStock(JTable tabla){
        model = (DefaultTableModel) tabla.getModel();
        List<Product> list = dao.productOutOfStock();
        Object[] raw = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            raw[0] = list.get(i).getId_product();
            raw[1] = list.get(i).getName_product();
            raw[2] = list.get(i).getPrice_product();
            raw[3] = list.get(i).getCategory_product();
            raw[4] = list.get(i).getStock_product();
            model.addRow(raw);
        }
        view.prodcttbl.setModel(model);
    }
    
    public void clearTable(){
        
        for(int i = 0 ; i < view.prodcttbl.getRowCount(); i++){
            model.removeRow(i);
            i--;
        }
        view.prodcttbl.setModel(model);
    }
    
    public void clearFields(){
        view.categorytxt.setText("");
        view.idtxt.setText("");
        view.nametxt.setText("");
        view.pricetxt.setText("");
        view.stocktxt.setText("");
    }
    
}
