/**
 * @author Dave
 */
public class ItemStock extends Item {
    
    private int stock;
    
    public ItemStock(int index, String name, double price, Supplier theSupplier,
            String expirationDate, String itemDescription, Category myCategory, int stock) {
        
        super(index, name, price, theSupplier, expirationDate, itemDescription, myCategory);
        this.stock = stock;  
    }
    
    public ItemStock() {
        super();
        stock = 0;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
