package com.cdk.shopping;


import com.cdk.exception.ItemNotFoundException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by karodes on 8/2/2017.
 */
public class ShoppingCartServiceTest {
    ShoppingCartService cart = null;
    @Before
    public void init(){
        cart = new ShoppingCartService();
    }
    @After
    public void clean() {
        cart = null;
    }
    @Test
    public void testAddItem(){
        Product product = new Product("Earphones",800.00,1);
        cart.addItem(product);
        Assert.assertEquals(true,cart.cart.containsKey(product.getId()));

    }
    @Test
    public void testCountItems(){
        Product product1 = new Product("Earphones",800.00,1);
        Product product2 = new Product("Microphones",800.00,2);
        cart.addItem(product1);
        cart.addItem(product2);
        Assert.assertEquals(3,cart.countItems());
    }

    @Test
    public void testRemoveItems(){
        Product product1 = new Product(1,"Earphones",800.00,1);
        Product product2 = new Product(2,"Microphones",800.00,2);
        Product product3 = new Product(3,"Headphones",900.00,1);
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);
        try {
            cart.removeItem(2);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
    }

}
