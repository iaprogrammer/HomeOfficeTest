package homeofficetest;

/**
 *
 * @author imran
 */
public class Product {
    
    private final String name;
    private final int productCode;
    private final double price;
        
    public Product(String name, int productCode, double price) {
        this.name = name;
        this.productCode = productCode;
        this.price= price;
    }
    
    /**
     * Returns product name
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns product price
     * @return double
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns product code
     * @return  int
     */
    public int getProductCode() {
        return productCode;
    }
    
}
