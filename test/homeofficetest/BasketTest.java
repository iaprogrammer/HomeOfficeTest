package homeofficetest;

import java.util.ArrayList;
import java.util.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Imrana
 */
public class BasketTest {
    
    private Basket basket;   
    private ArrayList<Item> items;
        
    @Before
    public void setUp() {
        
         // create basket
        basket = new Basket();
        /*
        // pick product 1
        Product iPhone = new Product( "iPhone 7", 101, 599.0); // name, product code, cost
        
        // add to basket
        basket.addItem(iPhone);
        
        // add again to basket
        basket.addItem(iPhone);        
        
        // pick product 2
        Product samsungS8 = new Product( "Samsung S8", 102, 689.0);
        
        // add to basket
        basket.addItem(samsungS8);
        */
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addItem method, of class Basket.
     */
    @Test
    public void testAddItem() {    
        // not sure how to test               
    }

    /**
     * Test of getTotal method, of class Basket.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
       
        Product iPhone = new Product( "iPhone 7", 101, 599.0); 
        basket.addItem(iPhone);
        
        double expResult = 599.0;
        double result = basket.getTotal();
        
        assertEquals("Failed - basket total did not match", expResult, result, 0.0);        
    }

    /**
     * Test of getItem method, of class Basket.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        
        Optional<Item> expResult = Optional.empty();
        Optional<Item> result = basket.getItem(500);
        assertEquals(expResult, result);        
        
        Product iPhone = new Product( "iPhone 7", 101, 599.0);   
        Item item = new Item(iPhone,1);        
        basket.addItem(iPhone);
              
        Optional<Item> expResult2 = Optional.of(item);
        Optional<Item> result2 = basket.getItem(iPhone.getProductCode());
        assertEquals("Failed - Items do not match", expResult2, result2);        
    }

    /**
     * Test of getItems method, of class Basket.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
       
        Product iPhone = new Product( "iPhone 7", 101, 599.0);   
        basket.addItem(iPhone);
        Product samsung = new Product( "Samsung S8", 102, 689.0);   
        basket.addItem(samsung);
        
        ArrayList<Item> items = new ArrayList<>();
        items.add( new Item(iPhone,1) );
        items.add( new Item(samsung,1) );
        
        //ArrayList<Item> expResult = items;
        ArrayList<Item> result = basket.getItems();
        assertEquals("Baskets Items do not match", items, result);        
    }
    
}
