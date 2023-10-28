package com.mycompany.tiendaproductoslimpieza;

import Control.ControlMenu;
import Model.Product;
import Model.ProductDAO;
import Model.User;
import Model.UserDAO;
import View.Login;
import View.Menu;

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
        ControlMenu control = new ControlMenu(productM, productDAO, menuView, userM, userDAO, loginView);
        
        control.showLogin();

    }
}
