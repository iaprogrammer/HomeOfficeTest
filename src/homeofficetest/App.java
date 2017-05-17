package homeofficetest;

import java.util.ArrayList;

/**
 *
 * @author imran
 */
public class App {
    
    public static void main(String[] args) {
        
        // create basket
        Basket basket = new Basket();
        
        // pick product 1
        Product iPhone = new Product( "iPhone 7", 101, 599.0); // name, product code, cost
        
        // add to basket
        basket.addItem(iPhone);
        
        // add again to basket
        basket.addItem(iPhone);        
        
        // pick product 2
        Product samsung = new Product( "Samsung S8", 102, 689.0);
        
        // add to basket
        basket.addItem(samsung);
        
        // get baskets items
        System.out.println("Items");
        ArrayList<Item> items = basket.getItems();
        for( Item item : items ) {
            System.out.println("Product: " + item.getProduct().getName() + ", Quantity: " + item.getQuantity() + ", Unit cost: " + item.getProduct().getPrice());
        }
        
        // get basket cost
         System.out.println("\nTotal: " + basket.getTotal() );
    }
    
}
