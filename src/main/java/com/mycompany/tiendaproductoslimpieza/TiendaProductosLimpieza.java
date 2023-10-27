package com.mycompany.tiendaproductoslimpieza;

import Control.ControlMenu;
import Control.ControlUser;
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

//        User nodel = new User();
//        UserDAO dao = new UserDAO();
//        Login view = new Login();
//        ControlUser control = new ControlUser(nodel, dao, view);
//        control.show();
        Product model = new Product();
        ProductDAO dao = new ProductDAO();
        Menu view = new Menu();
        ControlMenu menuC = new ControlMenu(model, dao, view);
        menuC.start();

    }
}
