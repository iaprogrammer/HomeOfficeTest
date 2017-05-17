package homeofficetest;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author imran
 */
public class Basket {
    
    // holds all items
    private final ArrayList<Item> items = new ArrayList<>();
    
    /**
     * Adds item to basket. If item already exists it will increment the quantity.
     * @param product Product
     */
    public void addItem(Product product) {
        
        // check if item exists
        Optional<Item> item = getItem(product.getProductCode());
        
        if (item.isPresent()) { 
            // item exists, update quantity
          item.get().addQuantity(1);            
            
        } else {
            // item does not exist, add new item
            items.add( new Item(product, 1) );
        }
        
    }
    
    /**
     * Returns basket total
     * @return double
     */
    public double getTotal() {
        
        double total = 0.0;
        
        // loop through all items and get total cost of basket        
        for( Item item : items ) {            
            
            // append total cost
            total += item.getTotalCost(); //item.getQuantity() * item.getProduct().getPrice();
             
        }
        
        return total;
    }
    
    /**
     * Returns
     * @param productCode
     * @return Item
     */
    public Optional<Item> getItem(int productCode) {
        
         for( Item item : items ) {            
             if( item.getProduct().getProductCode() == productCode ) {                
                 return Optional.of(item);
             }            
        }
        return Optional.empty();
    }
    
    /**
     * Returns all items of shopping basket
     * @return ArrayList<Item>
     */
    public ArrayList<Item> getItems() {
        return items;
    }
    
}
