package com.company.exception;

import com.company.shopping.Product;
import com.company.shopping.ShoppingCartService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by karodes on 8/2/2017.
 */
public class ExceptionTests {
    ShoppingCartService cart = null;
    @Before
    public void init(){
        cart = new ShoppingCartService();
    }
    @After
    public void clean() {
        cart = null;
    }
    @Test(expected = ItemNotFoundException.class)
 public void testForItemNotFoundException() throws ItemNotFoundException {
     cart.addItem(new Product("Earphones",980.00,2));
     cart.addItem(new Product("HeadPhones",34.00,1));
     cart.addItem(new Product("Table",234.00,1));
     cart.removeItem(2);
 }
}
