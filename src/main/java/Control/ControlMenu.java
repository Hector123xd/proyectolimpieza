package Control;

import Model.Customer;
import Model.CustomerDAO;
import Model.Product;
import Model.ProductDAO;
import Model.User;
import Model.UserDAO;
import View.CustomerView;
import View.Login;
import View.Menu;
import View.ProductView;
import View.SettingsView;
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

    //MenuFrame
    Menu menuView = new Menu();
    final String password = "abc123";
    
    //ProductFrame
    Product productM = new Product();
    ProductDAO productDAO = new ProductDAO();
    ProductView productView = new ProductView();
    DefaultTableModel modelProduct = new DefaultTableModel();
    
    //CustomerFrame
    Customer customerM = new Customer();
    CustomerDAO customerDAO = new CustomerDAO();
    CustomerView customerView = new CustomerView();
    DefaultTableModel modelCustomer = new DefaultTableModel();

    //UserFrame
    User userM = new User();
    UserDAO userDAO = new UserDAO();
    Login loginView = new Login();
    
    //SettingFrame
    SettingsView settingsView = new SettingsView();

    public ControlMenu(Product productM, ProductDAO productDAO, Menu Menuview, User userM, UserDAO userDAO, Login loginView,Customer customerM ,CustomerDAO customerDAO) {
        this.productM = productM;
        this.productDAO = productDAO;
        this.menuView = Menuview;
        this.userM = userM;
        this.userDAO = userDAO;
        this.loginView = loginView;
        //LoginView
        this.loginView.signinbtn.addActionListener(this);
        //MenuView
        this.menuView.productsbtn.addActionListener(this);
        this.menuView.settingsbtn.addActionListener(this);
        this.menuView.logoutbtn.addActionListener(this);
        this.menuView.customerbtn.addActionListener(this);
        //ProductsView
        this.productView.actualizarProductobtn.addActionListener(this);
        this.productView.okbtn.addActionListener(this);
        this.productView.productsStockbtn.addActionListener(this);
        this.productView.agregarProductobtn.addActionListener(this);
        this.productView.eliminarProductobtn.addActionListener(this);
        this.productView.listarProductbtn.addActionListener(this);
        //CustomerView
        this.customerView.deleteCustomerbtn.addActionListener(this);
        this.customerView.updateCustomerbtn.addActionListener(this);
        this.customerView.readCustomerbtn.addActionListener(this);
        this.customerView.okCustomerbtn.addActionListener(this);
        this.customerView.saveCustomerbtn.addActionListener(this);
        
    }
    
    public void showProduct(){
        productView.setVisible(true);
        productView.setLocationRelativeTo(null);
        productView.setTitle("Product Section");
    }

    public void showMenu() {
        menuView.setVisible(true);
        menuView.setLocationRelativeTo(null);
        menuView.setTitle("Tienda de limpieza");
    }

    public void showLogin() {
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
        loginView.setTitle("Login Menu");
    }
    
    public void showSettings(){
        settingsView.setVisible(true);
        settingsView.setLocationRelativeTo(null);
        settingsView.setTitle("Settings Menu");
    }
    
    public void showCustomer(){
        customerView.setVisible(true);
        customerView.setLocationRelativeTo(null);
        customerView.setTitle("Customer Menu");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Acciones de Login
        if (e.getSource() == loginView.signinbtn) {

            loginUsername();

            if (userDAO.validateUser(userM)) {
                loginView.setVisible(false);
                showMenu();

            }

        }
        
        //Acciones de Menu
        if (e.getSource() == menuView.productsbtn) {
            showProduct();
        }
        if(e.getSource() == menuView.settingsbtn){
            showSettings();
        }
        if(e.getSource() == menuView.customerbtn){
            showCustomer();
        }
        if(e.getSource() == menuView.logoutbtn){
            logout();
        }

        //Acciones de Producto
        if (e.getSource() == productView.actualizarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                printingInFields();

            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }

        }
        if (e.getSource() == productView.agregarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                createProducto();

            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }
        }
        if (e.getSource() == productView.eliminarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                deleteProduct();

            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }
        }
        if (e.getSource() == productView.okbtn) {
            updateProduct();
            clearFields();
            clearTable();
            readProductos(productView.prodcttbl);
        }
        if (e.getSource() == productView.productsStockbtn) {
            listarFueraStock(productView.prodcttbl);
            clearFields();
            clearTable();
            listarFueraStock(productView.prodcttbl);
        }
        if(e.getSource() == productView.listarProductbtn){
            readProductos(productView.prodcttbl);
            clearFields();
            clearTable();
            readProductos(productView.prodcttbl);
        }
        
        //Acciones de Customer
        if(e.getSource() == customerView.deleteCustomerbtn){
            
        }
        if(e.getSource() == customerView.saveCustomerbtn){
            createCustomer();
        }
        if(e.getSource() == customerView.updateCustomerbtn){
            
        }
        if(e.getSource() == customerView.readCustomerbtn){
            readCustomer(customerView.customertbl);
        }
        

    }

    //CRUD methods Product
    public void createProducto() {
        productM.setName_product(productView.nametxt.getText());
        productM.setPrice_product(Integer.parseInt(productView.pricetxt.getText()));
        productM.setCategory_product((productView.categorytxt.getText()));
        productM.setStock_product(Boolean.parseBoolean(productView.stocktxt.getText()));
        int result = productDAO.createProduct(productM);
        if (result > 0) {
            System.out.println("agregado con exito");
        } else {
            System.out.println("error");
        }
    }

    public void readProductos(JTable tabla) {

        modelProduct = (DefaultTableModel) tabla.getModel();
        List<Product> list = productDAO.readProducts();
        Object[] raw = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            raw[0] = list.get(i).getId_product();
            raw[1] = list.get(i).getName_product();
            raw[2] = list.get(i).getPrice_product();
            raw[3] = list.get(i).getCategory_product();
            raw[4] = list.get(i).getStock_product();
            modelProduct.addRow(raw);
        }
        productView.prodcttbl.setModel(modelProduct);

    }

    public void updateProduct() {

        productM.setStock_product(Boolean.parseBoolean(productView.stocktxt.getText()));
        productM.setId_product(Integer.valueOf(productView.idtxt.getText()));
        int result = productDAO.updateProduct(productM);
        if (result > 0) {
            System.out.println("Datos actualizados");
        } else {
            System.out.println("No se realizo cambios");
        }

    }

    public void deleteProduct() {
        productM.setId_product(Integer.parseInt(productView.idtxt.getText()));
        int result = productDAO.deleteProduct(productM);
        if (result > 0) {
            System.out.println("Delete with success");
        } else {
            System.out.println("Error");
        }
    }

    public void listarFueraStock(JTable tabla) {
        modelProduct = (DefaultTableModel) tabla.getModel();
        List<Product> list = productDAO.productOutOfStock();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId_product();
            row[1] = list.get(i).getName_product();
            row[2] = list.get(i).getPrice_product();
            row[3] = list.get(i).getCategory_product();
            row[4] = list.get(i).getStock_product();
            modelProduct.addRow(row);
        }
        productView.prodcttbl.setModel(modelProduct);
    }
    
    //Printin values on productJTable
    public void printingInFields() {
        int fila = productView.prodcttbl.getSelectedRow();
        if (fila == -1) {
            System.out.println("choose");
        } else {
            Integer id = (Integer) productView.prodcttbl.getValueAt(fila, 0);
            String name = (String) productView.prodcttbl.getValueAt(fila, 1);
            Float price = (Float) productView.prodcttbl.getValueAt(fila, 2);
            Integer category = (Integer) productView.prodcttbl.getValueAt(fila, 3);
            boolean stock = (boolean) productView.prodcttbl.getValueAt(fila, 4);

            productView.idtxt.setText(String.valueOf(id));
            productView.nametxt.setText(name);
            productView.pricetxt.setText(String.valueOf(price));
            productView.categorytxt.setText(String.valueOf(category));
            productView.stocktxt.setText(String.valueOf(stock));

        }
    }
    
    //CRUD methods Customer
    public void createCustomer(){
        customerM.setDni_customer(Integer.parseInt(customerView.dniCustomertxt.getText()));
        customerM.setName_customer(customerView.nameCustomertxt.getText());
        customerM.setAddress_customer(customerView.addressCustomertxt.getText());
        customerM.setStatus_customer(Integer.parseInt(customerView.statusCustomertxt.getText()));
        int result = customerDAO.createCustomer(customerM);
        if(result > 0){
            System.out.println("agregado con exito");
        }else{
            System.out.println("error");
        }
    }
    
    public void readCustomer(JTable tabla){
        
        modelCustomer = (DefaultTableModel) tabla.getModel();
        List<Customer> list = customerDAO.readCustomer();
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
             row[0] = list.get(i).getId_customer();
             row[1] = list.get(i).getDni_customer();
             row[2] = list.get(i).getName_customer();
             row[3] = list.get(i).getAddress_customer();
             row[4] = list.get(i).getStatus_customer();
             modelCustomer.addRow(row);
        }
        customerView.customertbl.setModel(modelCustomer);
        
    }
    
    public void updateCustomer(){
        
        
        
    }
    
    public void deleteCustomer(){
        
    }

    //Clearing data from panel
    public void clearTable() {

        for (int i = 0; i < productView.prodcttbl.getRowCount(); i++) {
            modelProduct.removeRow(i);
            i--;
        }
        productView.prodcttbl.setModel(modelProduct);
    }

    public void clearFields() {
        productView.categorytxt.setText("");
        productView.idtxt.setText("");
        productView.nametxt.setText("");
        productView.pricetxt.setText("");
        productView.stocktxt.setText("");
    }

    //LoginMethods
    public void loginUsername() {

        String name = loginView.usertxt.getText();
        String password = loginView.passwordtxt.getText();
        userM.setName(name);
        userM.setPassword(password);

    }
    
    public void logout(){
        System.exit(0);
    }

}
