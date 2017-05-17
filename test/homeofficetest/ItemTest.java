package homeofficetest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Imrana
 */
public class ItemTest {
    
    private Item item;
    private Product iPhone;
    
    @Before
    public void setUp() {
        
        // create product
        iPhone = new Product( "iPhone 7", 101, 599.0); // name, product code, cost
        
        // create basket
        item = new Item(iPhone,1);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addQuantity method, of class Item.
     */
    @Test
    public void testAddQuantity() {
        System.out.println("addQuantity");
        
        // update item quantity
        item.addQuantity(1);
        
        int expResult = 2;
        int result = item.getQuantity();
        assertEquals("Failed - product quantity does not match", expResult, result);        
    }

    /**
     * Test of getQuantity method, of class Item.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
      
        int expResult = 1;
        int result = item.getQuantity();
        
        assertEquals("Failed - product quantity does not match", expResult, result);  
    }

    /**
     * Test of getProduct method, of class Item.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
       
        Product expResult = iPhone;         
        Product result = item.getProduct();
        
        assertSame("Products do not match", expResult, result);         
    }

    /**
     * Test of getUnitCost method, of class Item.
     */
    @Test
    public void testGetUnitCost() {
        System.out.println("getUnitCost");
       
        double expResult = 599.0;
        double result = item.getUnitCost();
        
        assertEquals("Failed - unit cost does nopt match", expResult, result, 0.0);        
    }

    /**
     * Test of getTotalCost method, of class Item.
     */
    @Test
    public void testGetTotalCost() {
        System.out.println("getTotalCost");
        
        item.addQuantity(1);
       
        double expResult = 1198.0;
        double result = item.getTotalCost();
        
        assertEquals("Failed - total cost does not match", expResult, result, 0.0);      
    }
    
}
