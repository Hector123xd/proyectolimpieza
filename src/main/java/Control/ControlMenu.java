package Control;

import ExcelP.Report;
import Model.Customer;
import Model.CustomerDAO;
import Model.Product;
import Model.ProductDAO;
import Model.Sale;
import Model.SaleDAO;
import Model.Seller;
import Model.SellerDAO;
import Model.SaleDetails;
import Model.SaleDetailsDAO;
import Model.User;
import Model.UserDAO;
import View.CustomerView;
import View.Login;
import View.Menu;
import View.ProductView;
import View.SellView;
import View.SellerView;
import View.SettingsView;
import View.Signup;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import static com.itextpdf.text.pdf.PdfDictionary.FONT;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import org.apache.poi.wp.usermodel.Paragraph;

/**
 *
 * @author hecto
 */
public class ControlMenu implements ActionListener {

    //MenuFrame
    Menu menuView = new Menu();
    final String password = "abc123";
    int item;
    int totalPagar;

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
    SellView sellView = new SellView();
    DefaultTableModel modelSale = new DefaultTableModel();

    //SaleDetails
    SaleDetails saleDetailsM = new SaleDetails();
    SaleDetailsDAO saleDetailsDAO = new SaleDetailsDAO();

    //Sale
    Sale saleM = new Sale();
    SaleDAO saleDAO = new SaleDAO();

    //UserFrame
    User userM = new User();
    UserDAO userDAO = new UserDAO();
    Login loginView = new Login();
    Signup signView = new Signup();

    //SettingFrame
    SettingsView settingsView = new SettingsView();

    //ExcelReport
    Report excel = new Report();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    Calendar calendar = Calendar.getInstance();
                    sellView.datetimetxt.setText(String.valueOf(calendar.getTime()));
                } catch (Exception s) {
                    System.out.println(s);
                }
            }
        }
    };

    public ControlMenu(Product productM, ProductDAO productDAO, Menu Menuview, User userM, UserDAO userDAO, Login loginView, Customer customerM, CustomerDAO customerDAO, Seller seller, SellerDAO sellerDAO, SaleDetails sells, SaleDetailsDAO sellsDAO) {
        this.productM = productM;
        this.productDAO = productDAO;
        this.menuView = Menuview;
        this.userM = userM;
        this.userDAO = userDAO;
        this.loginView = loginView;
        //LoginView
        this.loginView.signinbtn.addActionListener(this);
        this.loginView.signupbtn.addActionListener(this);
        //SignupView
        this.signView.signupbtn.addActionListener(this);
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
        this.productView.excelbtn.addActionListener(this);
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
        this.sellView.searchProductbtn.addActionListener(this);
        this.sellView.saveSellbtn.addActionListener(this);
        this.sellView.deleteSellbtn.addActionListener(this);
        this.sellView.searchcustomerbtn.addActionListener(this);
        this.sellView.printcheckbtn.addActionListener(this);
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
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public void showSignup() {
        signView.setVisible(true);
        signView.setLocationRelativeTo(null);
        signView.setTitle("Sign up");
    }

    ///////////////     LIST OF ALL EVENTS      /////////////////
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

        if (e.getSource() == loginView.signupbtn) {

            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                loginView.setVisible(false);
                showSignup();
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }

        }

        //Acciones de Sign up
        if (e.getSource() == signView.signupbtn) {
            registerNewUser();
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

        //////////////      Product events       /////////////
        if (e.getSource() == productView.actualizarProductobtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                printingInFieldsProduct();
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }

        }

        if (e.getSource() == productView.agregarProductobtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                createProducto();
                clearProductFields();
                clearProductTable();
                readProductos(productView.prodcttbl);
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }
        }

        if (e.getSource() == productView.eliminarProductobtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                deleteProduct();
                clearProductFields();
                clearProductTable();
                readProductos(productView.prodcttbl);
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }
        }

        if (e.getSource() == productView.okbtn) {
            updateProduct();
            clearProductFields();
            clearProductTable();
            readProductos(productView.prodcttbl);
        }

        if (e.getSource() == productView.productsStockbtn) {
            listarFueraStock(productView.prodcttbl);
            clearProductFields();
            clearProductTable();
            listarFueraStock(productView.prodcttbl);
        }

        if (e.getSource() == productView.listarProductbtn) {
            readProductos(productView.prodcttbl);
            clearProductFields();
            clearProductTable();
            readProductos(productView.prodcttbl);
        }

        if (e.getSource() == productView.excelbtn) {
            excel.report();
        }

        //////////////      Customer events       /////////////
        if (e.getSource() == customerView.deleteCustomerbtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                deleteCustomer();
                clearCustomerFields();
                clearCustomerTable();
                readCustomers(customerView.customertbl);
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }

        }

        if (e.getSource() == customerView.saveCustomerbtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                createCustomer();
                clearCustomerFields();
                clearCustomerTable();
                readCustomers(customerView.customertbl);
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }
        }

        if (e.getSource() == customerView.updateCustomerbtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                printingInFieldsCustomer();

            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }
        }

        if (e.getSource() == customerView.okCustomerbtn) {
            updateCustomer();
            clearCustomerFields();
            clearCustomerTable();
            readCustomers(customerView.customertbl);
        }

        if (e.getSource() == customerView.readCustomerbtn) {
            readCustomers(customerView.customertbl);
            clearCustomerTable();
            clearCustomerFields();
            readCustomers(customerView.customertbl);
        }

        //////////////      Seller events       /////////////
        if (e.getSource() == sellerView.sellerdeletebtn) {

            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                deleteSeller();
                clearSellerFields();
                clearSellerTable();
                readSeller(sellerView.sellertbl);

            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }

        }

        if (e.getSource() == sellerView.sellersavebtn) {
            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                createSeller();
                clearSellerFields();
                clearSellerTable();
                readSeller(sellerView.sellertbl);
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }
        }

        if (e.getSource() == sellerView.sellerlistbtn) {
            readSeller(sellerView.sellertbl);
            clearSellerFields();
            clearSellerTable();
            readSeller(sellerView.sellertbl);
        }

        if (e.getSource() == sellerView.sellerupdatebtn) {

            String pass = JOptionPane.showInputDialog("Type admin password: ");

            if (pass.equals(password)) {
                printingInFieldsSeller();

            } else {
                JOptionPane.showMessageDialog(null, "You have no permission");
            }
        }

        if (e.getSource() == sellerView.sellerokbtn) {
            updateSeller();
            clearSellerFields();
            clearSellerTable();
            readSeller(sellerView.sellertbl);
        }

        //////////////      Sell events       /////////////
        if (e.getSource() == sellView.searchProductbtn) {
            seachProduct();
        }

        if (e.getSource() == sellView.saveSellbtn) {
            addProductOnTable(sellView.sellViewtbl);
        }

        if (e.getSource() == sellView.deleteSellbtn) {
            deleteProductOnTable(sellView.sellViewtbl);
        }

        if (e.getSource() == sellView.searchcustomerbtn) {
            searchCustomer();
        }

        if (e.getSource() == sellView.printcheckbtn) {
            makePurchase();
            makeDetailsPurchase();
            savePDF();
        }

    }

    //////////////      LIST OF ALL METHODS         ///////////////
    //SaleDetailsMethods
    public void seachProduct() {

        if (sellView.productidtxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Type the ID product");
            sellView.productidtxt.requestFocus();
        } else {
            int value = Integer.parseInt(sellView.productidtxt.getText());
            productM = saleDetailsDAO.searchProduct(value);
            sellView.productNametxt.setText(productM.getName_product());
            sellView.productPricetxt.setText(String.valueOf(productM.getPrice_product()));
            sellView.productStocktxt.setText(String.valueOf(productM.getStock_product()));
            sellView.sellQuantitytxt.requestFocus();
        }

    }

    public void searchCustomer() {

        if (sellView.idcustomertxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Type the ID customer");
            sellView.idcustomertxt.requestFocus();
        } else {
            int value = Integer.parseInt(sellView.idcustomertxt.getText());
            customerM = saleDetailsDAO.searchCustomer(value);
            sellView.namecustomertxt.setText(customerM.getName_customer());
            sellView.selleridtxt.requestFocus();
        }

    }

    public void addProductOnTable(JTable table) {

        if (!sellView.sellQuantitytxt.getText().equals("") && sellView.productStocktxt.getText().equals("true")) {

            Integer id = Integer.parseInt(sellView.productidtxt.getText());
            String name = sellView.productNametxt.getText();
            Integer quantity = Integer.parseInt(sellView.sellQuantitytxt.getText());
            Integer price = Integer.parseInt(sellView.productPricetxt.getText());
            Integer total = price * quantity;
            item = item + 1;
            modelSale = (DefaultTableModel) table.getModel();
            for (int i = 0; i < sellView.sellViewtbl.getRowCount(); i++) {
                if (sellView.sellViewtbl.getValueAt(i, 0).equals(sellView.productidtxt.getText())) {
                    System.out.println("El producto ya esta registrado");
                    return;
                }
            }
            ArrayList list = new ArrayList();
            list.add(item);
            list.add(id);
            list.add(name);
            list.add(quantity);
            list.add(price);
            list.add(total);
            Object[] row = new Object[5];
            row[0] = list.get(1);
            row[1] = list.get(2);
            row[2] = list.get(3);
            row[3] = list.get(4);
            row[4] = list.get(5);
            modelSale.addRow(row);
            sellView.sellViewtbl.setModel(modelSale);
            totalAmount();
            clearSellView();
            sellView.productidtxt.requestFocus();
        } else {
            System.out.println("Verifique si la cantidad es mayor a 0 o si el producto tenga stock en almacen");
        }

    }

    public void totalAmount() {
        int numRow = sellView.sellViewtbl.getRowCount();
        totalPagar = 0;
        for (int i = 0; i < numRow; i++) {
            int cal = Integer.parseInt(String.valueOf(sellView.sellViewtbl.getValueAt(i, 4)));
            totalPagar = totalPagar + cal;
            sellView.totalamounttxt.setText("" + totalPagar);
        }
        if (sellView.sellViewtbl.getRowCount() == 0) {
            sellView.totalamounttxt.setText("");
        }
    }

    public void deleteProductOnTable(JTable table) {

        modelSale = (DefaultTableModel) table.getModel();
        modelSale.removeRow(sellView.sellViewtbl.getSelectedRow());
        sellView.sellViewtbl.setModel(modelSale);
        totalAmount();
        sellView.productidtxt.requestFocus();

    }

    public void makeDetailsPurchase() {
        for (int i = 0; i < sellView.sellViewtbl.getRowCount(); i++) {
            int id_sale = saleDAO.idSale();
            saleDetailsM.setId_sale(id_sale);
            int id_product = Integer.parseInt(sellView.sellViewtbl.getValueAt(i, 0).toString());
            saleDetailsM.setId_product(id_product);
            int quantity = Integer.parseInt(sellView.sellViewtbl.getValueAt(i, 2).toString());
            saleDetailsM.setQuantity(quantity);
            double total = Double.parseDouble(sellView.sellViewtbl.getValueAt(i, 4).toString());
            saleDetailsM.setTotal(total);
            int result = saleDetailsDAO.checkSaleDetailsPurchase(saleDetailsM);
            if (result > 0) {
                System.out.println("agregado con exito");
            } else {
                System.out.println("error");
            }
        }
    }

    //SaleMethods
    public void makePurchase() {

        if (sellView.salenumbertxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Type number sale");
            sellView.salenumbertxt.requestFocus();
        } else {
            saleM.setId_seller(Integer.valueOf(sellView.selleridtxt.getText()));
            saleM.setId_customer(Integer.valueOf(sellView.idcustomertxt.getText()));
            saleM.setSell_number(sellView.salenumbertxt.getText());
            saleM.setTotal(Double.valueOf(sellView.totalamounttxt.getText()));
            int result = saleDAO.checkSalePuchase(saleM);
            if (result > 0) {
                System.out.println("agregado con exito");
            } else {
                System.out.println("error");
            }

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

        productM.setName_product(productView.nametxt.getText());
        productM.setPrice_product(Integer.parseInt(productView.pricetxt.getText()));
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

    public void importProductsToExcel() {

    }

    //CRUD methods Customer
    public void createCustomer() {
        customerM.setDni_customer(customerView.dniCustomertxt.getText());
        customerM.setName_customer(customerView.nameCustomertxt.getText());
        customerM.setAddress_customer(customerView.addressCustomertxt.getText());
        customerM.setStatus_customer(Integer.valueOf(customerView.statusCustomertxt.getText()));
        int result = customerDAO.createCustomer(customerM);
        if (result > 0) {
            System.out.println("agregado con exito");
        } else {
            System.out.println("error");
        }
    }

    public void readCustomers(JTable tabla) {

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
            String dni = (String) customerView.customertbl.getValueAt(fila, 1);
            String name = (String) customerView.customertbl.getValueAt(fila, 2);
            String address = (String) customerView.customertbl.getValueAt(fila, 3);
            Integer status = (Integer) customerView.customertbl.getValueAt(fila, 4);
            customerView.statusCustomertxt.setText(String.valueOf(status));
            customerView.addressCustomertxt.setText(address);
            customerView.dniCustomertxt.setText(dni);
            customerView.nameCustomertxt.setText(name);
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

        sellerView.sellertbl.setModel(modelSeller);

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

    public void printingInFieldsSeller() {
        int row = sellerView.sellertbl.getSelectedRow();
        if (row == -1) {
            System.out.println("choose row");
        } else {
            Integer id = (Integer) sellerView.sellertbl.getValueAt(row, 0);
            String dni = (String) sellerView.sellertbl.getValueAt(row, 1);
            String name = (String) sellerView.sellertbl.getValueAt(row, 2);
            String phone = (String) sellerView.sellertbl.getValueAt(row, 3);
            Integer status = (Integer) sellerView.sellertbl.getValueAt(row, 4);
            sellerView.sellerdnitxt.setText(dni);
            sellerView.sellernametxt.setText(name);
            sellerView.selleridtxt.setText(String.valueOf(id));
            sellerView.sellerphonetxt.setText(phone);
            sellerView.sellerstatustxt.setText(String.valueOf(status));
        }
    }

    //Clearing data from productPanel
    public void clearProductTable() {

        for (int i = 0; i < productView.prodcttbl.getRowCount(); i++) {
            modelProduct.removeRow(i);
            i--;
        }
        productView.prodcttbl.setModel(modelProduct);
    }

    public void clearProductFields() {
        productView.categorytxt.setText("");
        productView.idtxt.setText("");
        productView.nametxt.setText("");
        productView.pricetxt.setText("");
        productView.stocktxt.setText("");
    }

    //Clearing data from customerPanel
    public void clearCustomerTable() {
        for (int i = 0; i < customerView.customertbl.getRowCount(); i++) {
            modelCustomer.removeRow(i);
            i--;
        }
        customerView.customertbl.setModel(modelCustomer);
    }

    public void clearCustomerFields() {
        customerView.addressCustomertxt.setText("");
        customerView.dniCustomertxt.setText("");
        customerView.nameCustomertxt.setText("");
        customerView.statusCustomertxt.setText("");
    }

    //Clearing data from sellerPanel
    public void clearSellerTable() {
        for (int i = 0; i < sellerView.sellertbl.getRowCount(); i++) {
            modelSeller.removeRow(i);
            i--;
        }
        sellerView.sellertbl.setModel(modelSeller);
    }

    public void clearSellerFields() {
        sellerView.sellerdnitxt.setText("");
        sellerView.selleridtxt.setText("");
        sellerView.sellernametxt.setText("");
        sellerView.sellerphonetxt.setText("");
        sellerView.sellerstatustxt.setText("");
    }

    public void clearSellView() {
        sellView.productNametxt.setText("");
        sellView.productPricetxt.setText("");
        sellView.productStocktxt.setText("");
        sellView.productidtxt.setText("");
        sellView.sellQuantitytxt.setText("");
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

    //SignupMethods
    public void registerNewUser() {

        String name = signView.usertxt.getText();
        String pass = signView.passwordtxt.getText();
        String pass1 = signView.passwordtxt1.getText();
        userM.setName(name);
        userM.setPassword(pass);

        if (!pass.equals(pass1)) {
            JOptionPane.showMessageDialog(null, "passwords are not alike");
            signView.passwordtxt.requestFocus();
        } else {
            int result = userDAO.createUser(userM);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "User created successfully");
                signView.setVisible(false);
                showLogin();
            } else {

            }

        }

    }

    //PDFMethods
    public void savePDF() {
        try {
            String idsell = sellView.salenumbertxt.getText();
            FileOutputStream fileO;
            File file = new File("src/main/java/pdf/venta.pdf");
            fileO = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, fileO);
            doc.open();
            Image img = Image.getInstance("src/main/resources/images/listar30x30.png");

            Paragraph dateP = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            dateP.add(Chunk.NEWLINE);
            Date date = new Date();
            dateP.add("Factura 1: " + idsell + "\nFecha: " + new SimpleDateFormat("dd-MM-yyyy").format(date) + "\n\n");

            PdfPTable header = new PdfPTable(4);
            header.setWidthPercentage(100);
            header.getDefaultCell().setBorder(0);
            float[] headerColumn = new float[]{20f, 30f, 70f, 40f};
            header.setWidths(headerColumn);
            header.setHorizontalAlignment(Element.ALIGN_LEFT);

            header.addCell(img);

            String ruc = "2342335534";
            String name = "Wipe it cleaner";
            String phone = "3321344335";
            String address = "Mexico Guadalajara Jal";
            String ra = "Wipe it cleaner";

            header.addCell("");
            header.addCell("Ruc: " + ruc + " \nName: " + name + "\nPhone number: " + phone + "\nAddress: " + address + "\nRa: " + ra);
            header.addCell(dateP);
            doc.add(header);

            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Customer Info: \n\n");
            doc.add(cli);

            PdfPTable tablecli = new PdfPTable(4);
            tablecli.setWidthPercentage(100);
            tablecli.getDefaultCell().setBorder(0);
            float[] columncli = new float[]{20f, 50f, 30f, 40f};
            tablecli.setWidths(columncli);
            tablecli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cli1 = new PdfPCell(new Phrase("DNI/RUC", negrita));
            PdfPCell cli2 = new PdfPCell(new Phrase("Name", negrita));
            PdfPCell cli3 = new PdfPCell(new Phrase("Phone number", negrita));
            PdfPCell cli4 = new PdfPCell(new Phrase("Address", negrita));
            cli1.setBorder(0);
            cli2.setBorder(0);
            cli3.setBorder(0);
            cli4.setBorder(0);
            tablecli.addCell(cli1);
            tablecli.addCell(cli2);
            tablecli.addCell(cli3);
            tablecli.addCell(cli4);
            tablecli.addCell(sellView.idcustomertxt.getText());
            tablecli.addCell(sellView.namecustomertxt.getText());
            tablecli.addCell("");
            tablecli.addCell(address);
            doc.add(tablecli);

            //Products
            PdfPTable tablepro = new PdfPTable(4);
            tablepro.setWidthPercentage(100);
            tablepro.getDefaultCell().setBorder(0);
            float[] columnpro = new float[]{10f, 50f, 15f, 20f};
            tablepro.setWidths(columnpro);
            tablepro.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell pro1 = new PdfPCell(new Phrase("Quantity", negrita));
            PdfPCell pro2 = new PdfPCell(new Phrase("Name", negrita));
            PdfPCell pro3 = new PdfPCell(new Phrase("Price", negrita));
            PdfPCell pro4 = new PdfPCell(new Phrase("Total", negrita));
            pro1.setBorder(0);
            pro2.setBorder(0);
            pro3.setBorder(0);
            pro4.setBorder(0);
            pro1.setBackgroundColor(BaseColor.DARK_GRAY);
            pro2.setBackgroundColor(BaseColor.DARK_GRAY);
            pro3.setBackgroundColor(BaseColor.DARK_GRAY);
            pro4.setBackgroundColor(BaseColor.DARK_GRAY);
            tablepro.addCell(pro1);
            tablepro.addCell(pro2);
            tablepro.addCell(pro3);
            tablepro.addCell(pro4);
            for (int i = 0; i < sellView.sellViewtbl.getRowCount(); i++) {

                String Name = sellView.sellViewtbl.getValueAt(i, 1).toString();
                String quantity = sellView.sellViewtbl.getValueAt(i, 2).toString();
                String price = sellView.sellViewtbl.getValueAt(i, 3).toString();
                String total = sellView.sellViewtbl.getValueAt(i, 4).toString();

                tablepro.addCell(quantity);
                tablepro.addCell(Name);
                tablepro.addCell(price);
                tablepro.addCell(total);

            }

            doc.add(tablepro);

            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Final amount: " + sellView.totalamounttxt.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);

            Paragraph sign = new Paragraph();
            sign.add(Chunk.NEWLINE);
            sign.add("Sign and agreement\n\n");
            sign.add("---------------------------");
            sign.setAlignment(Element.ALIGN_CENTER);
            doc.add(sign);

            Paragraph message = new Paragraph();
            message.add(Chunk.NEWLINE);
            message.add("Thanks for your purchase");
            message.setAlignment(Element.ALIGN_CENTER);
            doc.add(message);

            doc.close();
            fileO.close();

        } catch (Exception e) {

        }
    }

}
