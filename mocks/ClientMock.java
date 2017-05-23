/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;

import java.util.ArrayList;
import java.util.List;
import models.Client;

/**
 *
 * @author allan
 */
public class ClientMock {

    private static List<Client> clientsList = new ArrayList<Client>();
    private static Integer totalClients = 0;

    public static void insert(Client client) throws Exception {
        client.setId(totalClients++);
        clientsList.add(client);
    }

    public static void update(Client client) throws Exception {
        if (isUpdatable(client)) {
            for (Client clientList : clientsList) {
                if (isUpdatable(clientList) && clientList.getId() == client.getId()) {
                    clientList.setName(client.getName());
                    clientList.setEmail(client.getEmail());
                    clientList.setCpf(client.getCpf());
                    clientList.setRg(client.getRg());
                    clientList.setBirth_date(client.getBirth_date());
                    clientList.setAddress(client.getAddress());
                    clientList.setPhone(client.getPhone());
                    clientList.setSexual_gender(client.getSexual_gender());
                }
            }
        }
    }

    public static void delete(Integer id) throws Exception {
        if (isDeletable(id)) {
            for (int i = 0; i < clientsList.size(); i++) {
                Client clientList = clientsList.get(i);
                if (clientList != null && clientList.getId() == id) {
                    clientsList.remove(i);
                    break;
                }
            }
        }
    }

    public static List<Client> get() throws Exception {
        return clientsList;
    }

    public static Client find(Integer id) throws Exception {
        if (id != null && !clientsList.isEmpty()) {
            for (int i = 0; i < clientsList.size(); i++) {
                if (clientsList.get(i) != null && clientsList.get(i).getId() == id) {
                    return clientsList.get(i);
                }
            }
        }
        return null;
    }

    public static List<Client> search(String value) throws Exception {
        List<Client> resultList = new ArrayList<Client>();

        if (value != null && !clientsList.isEmpty()) {
            for (Client clientList : clientsList) {
                if (clientList != null && clientList.getBirth_date() != null
                        && clientList.getCpf() != null) {
                    if (clientList.getName().toUpperCase().contains(value.toUpperCase())) {
                        resultList.add(clientList);
                    }
                }
            }
        }

        return resultList;
    }

    private static boolean isUpdatable(Client client) {
        return client != null && client.getId() != null && !clientsList.isEmpty();
    }

    private static boolean isDeletable(Integer id) {
        return id != null && !clientsList.isEmpty();
    }
}
