/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Sale;

/**
 *
 * @author allan
 */
public class SaleMock {

    public SaleMock(){
        try {
            seed();
        } catch (Exception e) {
        }
    }
    
    private void seed () throws Exception
    {
        Sale sale = new Sale();
        sale.setSold_at(new Date());
        sale.setPayment_type("Cartão");
        sale.setProduct_id(1);
        sale.setPrice(22.50);
        sale.setUser_id(1);
        this.insert(sale);
    }
    
    private static List<Sale> saleList = new ArrayList<Sale>();
    private static Integer totalSales = 0;

    public static void insert(Sale sale) throws Exception {
        sale.setId(totalSales++);
        saleList.add(sale);
    }

    public static void update(Sale sale) throws Exception {
        if (isUpdatable(sale)) {
            for (Sale saleList : saleList) {
                if (isUpdatable(saleList) && saleList.getId() == sale.getId()) {
                    saleList.setSold_at(sale.getSold_at());
                    saleList.setPayment_type(sale.getPayment_type());
                    saleList.setProduct_id(sale.getProduct_id());
                    saleList.setPrice(sale.getPrice());
                    saleList.setUser_id(sale.getUser_id());
                }
            }
        }
    }

    public static void delete(Integer id) throws Exception {
        if (isDeletable(id)) {
            for (int i = 0; i < saleList.size(); i++) {
                Sale sale = saleList.get(i);
                if (sale != null && sale.getId() == id) {
                    saleList.remove(i);
                    break;
                }
            }
        }
    }

    public static List<Sale> get() {
        try {
            
        } catch (Exception e) {
        }
        return saleList;
    }

    public static Sale find(Integer id) throws Exception {
        if (id != null && !saleList.isEmpty()) {
            for (int i = 0; i < saleList.size(); i++) {
                if (saleList.get(i) != null && saleList.get(i).getId() == id) {
                    return saleList.get(i);
                }
            }
        }
        return null;
    }

    private static boolean isUpdatable(Sale sale) {
        return sale != null && sale.getId() != null && !saleList.isEmpty();
    }

    private static boolean isDeletable(Integer id) {
        return id != null && !saleList.isEmpty();
    }
}
