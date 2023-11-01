package Control;

import Model.Customer;
import Model.CustomerDAO;
import Model.Product;
import Model.ProductDAO;
import Model.Seller;
import Model.SellerDAO;
import Model.Sells;
import Model.SellsDAO;
import Model.User;
import Model.UserDAO;
import View.CustomerView;
import View.Login;
import View.Menu;
import View.ProductView;
import View.SellView;
import View.SellerView;
import View.SettingsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hecto
 */
public class ControlMenu implements ActionListener, java.awt.event.KeyListener {

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

    //SealerFrame
    Seller sellerM = new Seller();
    SellerDAO sellerDAO = new SellerDAO();
    SellerView sellerView = new SellerView();
    DefaultTableModel modelSeller = new DefaultTableModel();

    //SellFrame
    Sells sellsM = new Sells();
    SellsDAO sellesDAO = new SellsDAO();
    SellView sellView = new SellView();

    //UserFrame
    User userM = new User();
    UserDAO userDAO = new UserDAO();
    Login loginView = new Login();

    //SettingFrame
    SettingsView settingsView = new SettingsView();

    public ControlMenu(Product productM, ProductDAO productDAO, Menu Menuview, User userM, UserDAO userDAO, Login loginView, Customer customerM, CustomerDAO customerDAO, Seller seller, SellerDAO sellerDAO, Sells sells, SellsDAO sellsDAO) {
        this.productM = productM;
        this.productDAO = productDAO;
        this.menuView = Menuview;
        this.userM = userM;
        this.userDAO = userDAO;
        this.loginView = loginView;
        //LoginView
        this.loginView.signinbtn.addActionListener(this);
        //MenuView
        this.menuView.sellerbtn.addActionListener(this);
        this.menuView.settingsbtn.addActionListener(this);
        this.menuView.logoutbtn.addActionListener(this);
        this.menuView.customerbtn.addActionListener(this);
        this.menuView.productbtn.addActionListener(this);
        this.menuView.sellbtn.addActionListener(this);
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
        //SellerView
        this.sellerView.sellerdeletebtn.addActionListener(this);
        this.sellerView.sellerlistbtn.addActionListener(this);
        this.sellerView.sellerokbtn.addActionListener(this);
        this.sellerView.sellerupdatebtn.addActionListener(this);
        this.sellerView.sellersavebtn.addActionListener(this);
        //SellsView

    }

    public void showMenu() {
        menuView.setVisible(true);
        menuView.setLocationRelativeTo(null);
        menuView.setTitle("Tienda de limpieza");
    }

    public void showProduct() {
        productView.setVisible(true);
        productView.setLocationRelativeTo(null);
        productView.setTitle("Product Section");
    }

    public void showLogin() {
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
        loginView.setTitle("Login Menu");
    }

    public void showSettings() {
        settingsView.setVisible(true);
        settingsView.setLocationRelativeTo(null);
        settingsView.setTitle("Settings Menu");
    }

    public void showCustomer() {
        customerView.setVisible(true);
        customerView.setLocationRelativeTo(null);
        customerView.setTitle("Customer Menu");
    }

    public void showSeller() {
        sellerView.setVisible(true);
        sellerView.setLocationRelativeTo(null);
        sellerView.setTitle("Seller Menu");
    }

    public void showSells() {
        sellView.setVisible(true);
        sellView.setLocationRelativeTo(null);
        sellView.setTitle("New Sell");
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
        if (e.getSource() == menuView.settingsbtn) {
            showSettings();
        }
        if (e.getSource() == menuView.customerbtn) {
            showCustomer();
        }
        if (e.getSource() == menuView.logoutbtn) {
            logout();
        }
        if (e.getSource() == menuView.sellerbtn) {
            showSeller();
        }
        if (e.getSource() == menuView.productbtn) {
            showProduct();
        }
        if (e.getSource() == menuView.sellbtn) {
            showSells();
        }

        //Acciones de Producto
        if (e.getSource() == productView.actualizarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                printingInFieldsProduct();

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
        if (e.getSource() == productView.listarProductbtn) {
            readProductos(productView.prodcttbl);
            clearFields();
            clearTable();
            readProductos(productView.prodcttbl);
        }

        //Acciones de Customer
        if (e.getSource() == customerView.deleteCustomerbtn) {
            deleteCustomer();
        }
        if (e.getSource() == customerView.saveCustomerbtn) {
            createCustomer();
        }
        if (e.getSource() == customerView.okCustomerbtn) {
            updateCustomer();
        }
        if (e.getSource() == customerView.updateCustomerbtn) {

        }
        if (e.getSource() == customerView.readCustomerbtn) {
            readCustomer(customerView.customertbl);
            clearFields();
            clearTable();
            readCustomer(customerView.customertbl);
        }
        //Acciones de Seller
        if (e.getSource() == sellerView.sellerdeletebtn) {

        }
        if (e.getSource() == sellerView.sellerlistbtn) {
            readSeller(sellerView.sellertbl);
            clearFields();
            clearTable();
            readSeller(sellerView.sellertbl);
        }
        if (e.getSource() == sellerView.sellerokbtn) {

        }
        if (e.getSource() == sellerView.sellerupdatebtn) {

        }
        if (e.getSource() == sellerView.sellersavebtn) {

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
    public void printingInFieldsProduct() {
        int fila = productView.prodcttbl.getSelectedRow();
        if (fila == -1) {
            System.out.println("choose");
        } else {
            Integer id = (Integer) productView.prodcttbl.getValueAt(fila, 0);
            String name = (String) productView.prodcttbl.getValueAt(fila, 1);
            Integer price = (Integer) productView.prodcttbl.getValueAt(fila, 2);
            String category = (String) productView.prodcttbl.getValueAt(fila, 3);
            boolean stock = (boolean) productView.prodcttbl.getValueAt(fila, 4);

            productView.idtxt.setText(String.valueOf(id));
            productView.nametxt.setText(name);
            productView.pricetxt.setText(String.valueOf(price));
            productView.categorytxt.setText(category);
            productView.stocktxt.setText(String.valueOf(stock));

        }
    }

    //CRUD methods Customer
    public void createCustomer() {
        customerM.setDni_customer(customerView.dniCustomertxt.getText());
        customerM.setName_customer(customerView.nameCustomertxt.getText());
        customerM.setAddress_customer(customerView.addressCustomertxt.getText());
        customerM.setStatus_customer(Integer.parseInt(customerView.statusCustomertxt.getText()));
        int result = customerDAO.createCustomer(customerM);
        if (result > 0) {
            System.out.println("agregado con exito");
        } else {
            System.out.println("error");
        }
    }

    public void readCustomer(JTable tabla) {

        modelCustomer = (DefaultTableModel) tabla.getModel();
        List<Customer> list = customerDAO.readCustomer();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId_customer();
            row[1] = list.get(i).getDni_customer();
            row[2] = list.get(i).getName_customer();
            row[3] = list.get(i).getAddress_customer();
            row[4] = list.get(i).getStatus_customer();
            modelCustomer.addRow(row);
        }
        customerView.customertbl.setModel(modelCustomer);

    }

    public void updateCustomer() {

        sellerM.setId_sealer(Integer.parseInt(sellerView.selleridtxt.getText()));
        sellerM.setDni_sealer(sellerView.sellerdnitxt.getText());
        sellerM.setName_sealer(sellerView.sellernametxt.getText());
        sellerM.setNumber_sealer(sellerView.sellerphonetxt.getText());
        sellerM.setStatus_sealer(Integer.parseInt(sellerView.sellerstatustxt.getText()));
        int result = sellerDAO.updateSealer(sellerM);
        if (result > 0) {
            System.out.println("cambio hecho");
        } else {
            System.out.println("error");
        }

    }

    public void deleteCustomer() {

        sellerM.setId_sealer(Integer.parseInt(sellerView.selleridtxt.getText()));
        int result = sellerDAO.deleteSealer(sellerM);
        if (result > 0) {
            System.out.println("eliminado con exito");
        } else {
            System.out.println("error");
        }

    }

    public void printingInFieldsCustomer() {
        int fila = customerView.customertbl.getSelectedRow();
        if (fila == -1) {
            System.out.println("choose");
        } else {

        }
    }

    //CRUD methods Seller
    public void createSeller() {
        sellerM.setDni_sealer(sellerView.sellerdnitxt.getText());
        sellerM.setName_sealer(sellerView.sellernametxt.getText());
        sellerM.setNumber_sealer(sellerView.sellerphonetxt.getText());
        sellerM.setStatus_sealer(Integer.parseInt(sellerView.sellerstatustxt.getText()));
        int result = sellerDAO.createSealer(sellerM);
        if (result > 0) {
            System.out.println("creado con exito");
        } else {
            System.out.println("error");
        }
    }

    public void readSeller(JTable table) {

        modelSeller = (DefaultTableModel) table.getModel();
        List<Seller> list = sellerDAO.readSealer();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId_sealer();
            row[1] = list.get(i).getDni_sealer();
            row[2] = list.get(i).getName_sealer();
            row[3] = list.get(i).getNumber_sealer();
            row[4] = list.get(i).getStatus_sealer();
            modelSeller.addRow(row);
        }

        sellerView.sellertbl.setModel(modelProduct);

    }

    public void updateSeller() {
        sellerM.setDni_sealer(sellerView.sellerdnitxt.getText());
        sellerM.setName_sealer(sellerView.sellernametxt.getText());
        sellerM.setNumber_sealer(sellerView.sellerphonetxt.getText());
        sellerM.setStatus_sealer(Integer.parseInt(sellerView.sellerstatustxt.getText()));
        sellerM.setId_sealer(Integer.parseInt(sellerView.selleridtxt.getText()));
        int result = sellerDAO.updateSealer(sellerM);
        if (result > 0) {
            System.out.println("cambiado con exito");
        } else {
            System.out.println("error");
        }
    }

    public void deleteSeller() {
        sellerM.setId_sealer(Integer.parseInt(sellerView.selleridtxt.getText()));
        int result = sellerDAO.deleteSealer(sellerM);
        if (result > 0) {
            System.out.println("eliminado con exito");
        } else {
            System.out.println("error");
        }
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

    public void logout() {
        System.exit(0);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(sellView.productidtxt.getText())) {
                Integer cod = Integer.parseInt(sellView.productidtxt.getText());
                productM = productDAO.searchProduct(cod);
                if (productM.getName_product() != null) {
                    sellView.productNametxt.setText(productM.getName_product());
                    sellView.productPricetxt.setText(String.valueOf(productM.getPrice_product()));
                    sellView.productStocktxt.setText(String.valueOf(productM.getStock_product()));
                    sellView.sellQuantitytxt.requestFocus();
                } else {
                    sellView.productNametxt.setText("");
                    sellView.productPricetxt.setText("");
                    sellView.productStocktxt.setText("");
                    sellView.sellQuantitytxt.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Type the product ID");
                sellView.productidtxt.requestFocus();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
