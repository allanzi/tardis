/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.naming.directory.AttributeModificationException;
import javax.swing.JOptionPane;
import mocks.UserMock;
import models.User;
import validators.UsersValidator;

/**
 *
 * @author allan
 */
public class UserService {

    public UserMock mock = new UserMock();
    public User user = new User();
    public UsersValidator validator = new UsersValidator();

    public boolean login(String email, String password) throws UnsupportedEncodingException, Exception {
        if (UserMock.search(email).size() > 0) {
            User user = extract(UserMock.search(email));
            if (user.getPassword() == null ? password == null : user.getPassword().equals(password)) {
                System.out.println("logado");
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Email não encontrado");
            return false;
        }
        
        return true;
    }

    private User extract(List<User> usersList) {
        for (User user1 : usersList) {
            return user1;
        }

        return new User();
    }
    
    public void create (User user) throws AttributeModificationException
    {
        validator.validate(user);
        mock.insert(user);
        List<User> users = mock.get();
        for (User user1 : users) {
            System.out.println(user1.getName());
        }
    }
}
