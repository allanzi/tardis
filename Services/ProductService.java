/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.directory.AttributeModificationException;
import mocks.ProductsMock;
import models.Product;
import validators.ProductValidator;

/**
 *
 * @author allan
 */
public class ProductService {
    
    public ProductsMock mock = new ProductsMock();
    public Product product = new Product();
    public ProductValidator validator = new ProductValidator();
    
    public void create (Product product) throws AttributeModificationException
    {
        try {
            validator.validate(product);
            mock.insert(product);
        } catch (Exception ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Product product) throws AttributeModificationException
    {
        try {
            validator.validate(product);
            mock.update(product);
        } catch (Exception ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(int id)
    {
        try {
            mock.delete(id);
        } catch (Exception ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
