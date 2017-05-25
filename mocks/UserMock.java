/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.User;

/**
 *
 * @author allan
 */
public class UserMock {

    private static List<User> usersList = new ArrayList<User>();
    private static Integer totalUsers = 0;

    public UserMock(){
        try {
            seedUser();
        } catch (Exception e) {
        }
    }
    
    public static void insert(User user) {
        user.setId(totalUsers++);
        usersList.add(user);
    }
    
    private void seedUser() throws NoSuchAlgorithmException, UnsupportedEncodingException, UnsupportedEncodingException, UnsupportedEncodingException, UnsupportedEncodingException, Exception {
        User user = new User();
        user.setName("Allan Santos");
        user.setEmail("allanzi@hotmail.com");
        user.setBirth_date(new Date(1996, 06, 17));
        user.setPhone("11 9 58026276");
        user.setCpf("424.768.828-60");
        user.setRg("38.142.498-4");
        user.setPassword("123456");
        this.insert(user);
    }

    public static void update(User user) throws Exception {
        if (isUpdatable(user)) {
            for (User userList : usersList) {
                if (isUpdatable(userList) && userList.getId() == user.getId()) {
                    userList.setName(user.getName());
                    userList.setEmail(user.getEmail());
                    userList.setCpf(user.getCpf());
                    userList.setRg(user.getRg());
                    userList.setBirth_date(user.getBirth_date());
                    userList.setPassword(user.getPassword());
                    userList.setPhone(user.getPhone());
                }
            }
        }
    }

    public static void delete(Integer id) throws Exception {
        if (isDeletable(id)) {
            for (int i = 0; i < usersList.size(); i++) {
                User userList = usersList.get(i);
                if (userList != null && userList.getId() == id) {
                    usersList.remove(i);
                    break;
                }
            }
        }
    }

    public static List<User> get() {
        try {
            
        } catch (Exception e) {
        }
        return usersList;
    }

    public static User find(Integer id) throws Exception {
        if (id != null && !usersList.isEmpty()) {
            for (int i = 0; i < usersList.size(); i++) {
                if (usersList.get(i) != null && usersList.get(i).getId() == id) {
                    return usersList.get(i);
                }
            }
        }
        return null;
    }

    public static List<User> search(String value) throws Exception {
        List<User> resultList = new ArrayList<>();

        if (value != null && !usersList.isEmpty()) {
            usersList.stream().filter((userList) -> (hasFound(userList, value))).forEachOrdered((userList) -> {
                resultList.add(userList);
            });
        }

        return resultList;
    }

    private static boolean hasFound(User userList, String value) {
        return userList != null && userList.getBirth_date() != null
                && userList.getCpf() != null 
                && (userList.getName() == null ? value == null : userList.getName().equals(value)) || (userList.getEmail() == null ? value == null : userList.getEmail().equals(value));
    }

    private static boolean isUpdatable(User user) {
        return user != null && user.getId() != null && !usersList.isEmpty();
    }

    private static boolean isDeletable(Integer id) {
        return id != null && !usersList.isEmpty();
    }
}
