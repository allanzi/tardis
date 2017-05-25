/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.directory.AttributeModificationException;
import models.User;

/**
 *
 * @author allan
 */
public class UsersValidator {

    public void validate(User user) throws AttributeModificationException {
        if (user.getName().length() <= 0) {
            throw new AttributeModificationException("Usuário deverá conter no minimo um caracter");
        }

        if (!isValidEmail(user.getEmail())) {
            throw new AttributeModificationException("Email inválido");
        }

        if (user.getCpf().length() == 11) {
            throw new AttributeModificationException("CPF inválido");
        }
    }

    public static boolean isValidEmail(String email) {
        try {

            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            Pattern p = Pattern.compile(ePattern);
            Matcher m = p.matcher(email);
            return m.matches();
        } catch (NullPointerException e) {
            return false;
        }
    }
}
