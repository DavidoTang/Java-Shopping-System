/**
 *
 * @author Dave
 */
public class ItemOrder extends Item {
    
    private int orderNum;
    
    public ItemOrder (String name, double price, Supplier theSupplier,
            String expirationDate, String itemDescription, Category myCategory, int orderNum) {
        
        super(name, price, theSupplier, expirationDate, itemDescription, myCategory);
        this.orderNum = orderNum;
 
    }

    public ItemOrder() {
        super();
        orderNum = 0;
    }
    
    
    
    
    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    
    
}
