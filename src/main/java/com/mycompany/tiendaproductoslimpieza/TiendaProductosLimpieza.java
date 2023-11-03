package com.mycompany.tiendaproductoslimpieza;

import Control.ControlMenu;
import Model.Customer;
import Model.CustomerDAO;
import Model.Product;
import Model.ProductDAO;
import Model.Seller;
import Model.SellerDAO;
import Model.SaleDetails;
import Model.SaleDetailsDAO;
import Model.User;
import Model.UserDAO;
import View.CustomerView;
import View.Login;
import View.Menu;
import View.SettingsView;

/**
 *
 * @author hecto
 */
public class TiendaProductosLimpieza {

    public static void main(String[] args) {
        
        Product productM = new Product();
        ProductDAO productDAO = new ProductDAO();
        Menu menuView = new Menu();
        User userM = new User();
        UserDAO userDAO = new UserDAO();
        Login loginView = new Login();
        Customer customerM = new Customer();
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerView customerView = new CustomerView();
        Seller sellerM = new Seller();
        SellerDAO sellerDAO =new SellerDAO();
        SettingsView settingsView = new SettingsView();
        SaleDetails sellsM = new SaleDetails();
        SaleDetailsDAO sellsDAO = new SaleDetailsDAO();
        ControlMenu control = new ControlMenu(productM, productDAO, menuView, userM, userDAO, loginView, customerM,customerDAO,sellerM,sellerDAO,sellsM,sellsDAO);
        
        control.showLogin();

    }
}
