/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mocks.UserMock;
import models.User;

/**
 *
 * @author allan
 */
public class UserService {

    public UserMock userMock = new UserMock();
    public User user = new User();

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
}