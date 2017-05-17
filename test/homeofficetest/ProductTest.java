package homeofficetest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Imrana
 */
public class ProductTest {
    
    private Product product;
        
    /**
     * Setup Product
     */
    @Before
    public void setUp() {
        product = new Product("iPhone", 101, 599);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Product.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        String expResult = "iPhone";
        String result = product.getName();
        
        assertEquals("Failed - products names did not match", expResult, result);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
               
        double expResult = 599.0;
        double result = product.getPrice();
        
        assertEquals("Failed - product costs did not match", expResult, result, 0.0);        
    }

    /**
     * Test of getProductCode method, of class Product.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
      
        int expResult = 101;
        int result = product.getProductCode();
        
        assertEquals("Failed = product code did not match", expResult, result);        
    }
    
}