/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;

import java.util.ArrayList;
import java.util.List;
import models.Product;

/**
 *
 * @author allan
 */
public class ProductsMock {
    private static List<Product> productList = new ArrayList<Product>();
    private static Integer totalProducts = 0;

    public ProductsMock() {
        seed();
    }
    
    private void seed()
    {
        try {
            Product product = new Product();
            product.setCode(123);
            product.setName("Jogo teste");
            product.setPrice(15.50);
            product.setProducer("Eu");
            product.setPlatform("Eu tbm");
            product.setAmount(10);
            this.insert(product);
        } catch (Exception e) {
        }
    }
    
    public static void insert(Product product) throws Exception {
        product.setId(totalProducts++);
        productList.add(product);
    }

    public static void update(Product product) throws Exception {
        if (isUpdatable(product)) {
            for (Product productList : productList) {
                if (isUpdatable(productList) && productList.getId() == product.getId()) {
                    productList.setCode(product.getCode());
                    productList.setName(product.getName());
                    productList.setPrice(product.getPrice());
                    productList.setProducer(product.getProducer());
                    productList.setPlatform(product.getPlatform());
                    productList.setAmount(product.getAmount());
                }
            }
        }
    }

    public static void delete(Integer id) throws Exception {
        if (isDeletable(id)) {
            for (int i = 0; i < productList.size(); i++) {
                Product product = productList.get(i);
                if (product != null && product.getId() == id) {
                    productList.remove(i);
                    break;
                }
            }
        }
    }

    public static List<Product> get() {
        try {
            
        } catch (Exception e) {
        }
        return productList;
    }

    public static Product find(Integer id) throws Exception {
        if (id != null && !productList.isEmpty()) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i) != null && productList.get(i).getId() == id) {
                    return productList.get(i);
                }
            }
        }
        return null;
    }

    public static List<Product> search(String value) throws Exception {
        List<Product> resultList = new ArrayList<Product>();

        if (value != null && !productList.isEmpty()) {
            for (Product productList : productList) {
                if (productList != null) {
                    if (productList.getName().toUpperCase().contains(value.toUpperCase())) {
                        resultList.add(productList);
                    }
                }
            }
        }

        return resultList;
    }

    private static boolean isUpdatable(Product product) {
        return product != null && product.getId() != null && !productList.isEmpty();
    }

    private static boolean isDeletable(Integer id) {
        return id != null && !productList.isEmpty();
    }
}
