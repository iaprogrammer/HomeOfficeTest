package homeofficetest;

/**
 *
 * @author imran
 */
public class Item {
    
    private final Product product;
    private int quantity; 

    Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    /**
     * Increments product quantity by 1
     * @param quantity
     */
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
    
    /**
     * Returns quantity of product
     * @return int
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Returns item product
     * @return Product
     */
    public Product getProduct() {
        return product;
    }
    
    /**
     * Returns unit cost of item
     * @return double
     */
    public double getUnitCost() {
        return product.getPrice();
    }
    
    /**
     * Returns total cost of item
     * @return 
     */
    public double getTotalCost() {
        return quantity * product.getPrice();
    }
}
