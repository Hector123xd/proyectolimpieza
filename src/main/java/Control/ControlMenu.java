package Control;

import Model.Product;
import Model.ProductDAO;
import Model.User;
import Model.UserDAO;
import View.Login;
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

    //ProductFrame
    Product productM = new Product();
    ProductDAO productDAO = new ProductDAO();
    Menu menuView = new Menu();
    DefaultTableModel model = new DefaultTableModel();
    final String password = "abc123";

    //UserFrame
    User userM = new User();
    UserDAO userDAO = new UserDAO();
    Login loginView = new Login();

    public ControlMenu(Product productM, ProductDAO productDAO, Menu Menuview, User userM, UserDAO userDAO, Login loginView) {
        this.productM = productM;
        this.productDAO = productDAO;
        this.menuView = Menuview;
        this.userM = userM;
        this.userDAO = userDAO;
        this.loginView = loginView;
        this.menuView.productsbtn.addActionListener(this);
        this.menuView.actualizarProductobtn.addActionListener(this);
        this.menuView.okbtn.addActionListener(this);
        this.menuView.productsStockbtn.addActionListener(this);
        this.menuView.agregarProductobtn.addActionListener(this);
        this.menuView.eliminarProductobtn.addActionListener(this);
        this.loginView.signinbtn.addActionListener(this);
    }

    public void showMenuProduct() {
        menuView.setVisible(true);
        menuView.setLocationRelativeTo(null);
        menuView.setTitle("Tienda de limpieza");
    }

    public void showLogin() {
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
        loginView.setTitle("Login Menu");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == loginView.signinbtn) {

            loginUsername();

            if (userDAO.validateUser(userM)) {

                loginView.setVisible(false);
                showMenuProduct();

            }

        }
        
        if (e.getSource() == menuView.productsbtn) {
            menuView.jTabbedPane1.setSelectedIndex(1);
            readProductos(menuView.prodcttbl);
            clearFields();
            clearTable();
            readProductos(menuView.prodcttbl);
        }
        if (e.getSource() == menuView.actualizarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                printingInFields();

            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }

        }
        if (e.getSource() == menuView.agregarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                createProducto();

            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }
        }
        if (e.getSource() == menuView.eliminarProductobtn) {
            String pass = JOptionPane.showInputDialog("Digite la password de administrador");

            if (pass.equals(password)) {
                deleteProduct();

            } else {
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }
        }
        if (e.getSource() == menuView.okbtn) {
            updateProduct();
            clearFields();
            clearTable();
            readProductos(menuView.prodcttbl);
        }
        if (e.getSource() == menuView.productsStockbtn) {
            clearFields();
            clearTable();
            listarFueraStock(menuView.prodcttbl);
        }

    }

    //CRUD methods Product
    public void createProducto() {
        productM.setName_product(menuView.nametxt.getText());
        productM.setPrice_product(Float.parseFloat(menuView.pricetxt.getText()));
        productM.setCategory_product(Integer.parseInt(menuView.categorytxt.getText()));
        productM.setStock_product(Boolean.parseBoolean(menuView.stocktxt.getText()));
        int result = productDAO.createProduct(productM);
        if (result > 0) {
            System.out.println("agregado con exito");
        } else {
            System.out.println("error");
        }
    }

    public void readProductos(JTable tabla) {

        model = (DefaultTableModel) tabla.getModel();
        List<Product> list = productDAO.readProducts();
        Object[] raw = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            raw[0] = list.get(i).getId_product();
            raw[1] = list.get(i).getName_product();
            raw[2] = list.get(i).getPrice_product();
            raw[3] = list.get(i).getCategory_product();
            raw[4] = list.get(i).getStock_product();
            model.addRow(raw);
        }
        menuView.prodcttbl.setModel(model);

    }

    public void updateProduct() {

        productM.setStock_product(Boolean.parseBoolean(menuView.stocktxt.getText()));
        productM.setId_product(Integer.valueOf(menuView.idtxt.getText()));
        int result = productDAO.updateProduct(productM);
        if (result > 0) {
            System.out.println("Datos actualizados");
        } else {
            System.out.println("No se realizo cambios");
        }

    }

    public void deleteProduct() {
        productM.setId_product(Integer.parseInt(menuView.idtxt.getText()));
        int result = productDAO.deleteProduct(productM);
        if (result > 0) {
            System.out.println("Delete with success");
        } else {
            System.out.println("Error");
        }
    }

    public void listarFueraStock(JTable tabla) {
        model = (DefaultTableModel) tabla.getModel();
        List<Product> list = productDAO.productOutOfStock();
        Object[] raw = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            raw[0] = list.get(i).getId_product();
            raw[1] = list.get(i).getName_product();
            raw[2] = list.get(i).getPrice_product();
            raw[3] = list.get(i).getCategory_product();
            raw[4] = list.get(i).getStock_product();
            model.addRow(raw);
        }
        menuView.prodcttbl.setModel(model);
    }

    //Clearing data from panel
    public void clearTable() {

        for (int i = 0; i < menuView.prodcttbl.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
        menuView.prodcttbl.setModel(model);
    }

    public void clearFields() {
        menuView.categorytxt.setText("");
        menuView.idtxt.setText("");
        menuView.nametxt.setText("");
        menuView.pricetxt.setText("");
        menuView.stocktxt.setText("");
    }

    //Printin values on JTable
    public void printingInFields() {
        int fila = menuView.prodcttbl.getSelectedRow();
        if (fila == -1) {
            System.out.println("choose");
        } else {
            Integer id = (Integer) menuView.prodcttbl.getValueAt(fila, 0);
            String name = (String) menuView.prodcttbl.getValueAt(fila, 1);
            Float price = (Float) menuView.prodcttbl.getValueAt(fila, 2);
            Integer category = (Integer) menuView.prodcttbl.getValueAt(fila, 3);
            boolean stock = (boolean) menuView.prodcttbl.getValueAt(fila, 4);

            menuView.idtxt.setText(String.valueOf(id));
            menuView.nametxt.setText(name);
            menuView.pricetxt.setText(String.valueOf(price));
            menuView.categorytxt.setText(String.valueOf(category));
            menuView.stocktxt.setText(String.valueOf(stock));

        }
    }

    //LoginMethods
    public void loginUsername() {

        String name = loginView.usertxt.getText();
        String password = loginView.passwordtxt.getText();
        userM.setName(name);
        userM.setPassword(password);

    }

}
