package Control;

import Model.User;
import Model.UserDAO;
import View.Login;
import View.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hecto
 */
public class ControlUser implements ActionListener {

    User model = new User();
    UserDAO dao = new UserDAO();
    Login view = new Login();

    public ControlUser(User model, UserDAO dao, Login view) {
        this.model = model;
        this.dao = dao;
        this.view = view;
        this.view.signinbtn.addActionListener(this);
    }

    public void show() {
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Cleaning Products");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.signinbtn) {

            loginUsername();

            if (dao.validateUser(model)) {

                view.setVisible(false);
                System.out.println("Connection succesful");
                Menu menu = new Menu();
                menu.setVisible(true);

            }

        }

    }

    public void loginUsername() {

        String name = view.usertxt.getText();
        String password = view.passwordtxt.getText();
        model.setName(name);
        model.setPassword(password);

    }

}
