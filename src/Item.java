/**
 *
 * @author Dave
 */
public class Item {
    
    private String name;
    private double price;
    private int orderQuantity;
    private int stock;
    private Supplier theSupplier;
    private String expirationDate;
    private String itemDescription;
    
    public Item(String name, double price, int orderQuantity, int stock, Supplier theSupplier, String supplier,
            String expirationDate, String itemDescription) {
       
        this.name = name;
        this.price = price;
        this.orderQuantity = orderQuantity;
        this.stock = stock;
        this.theSupplier = theSupplier;
        this.expirationDate = expirationDate;
        this.itemDescription = itemDescription;
    }
    
    public Item() {
        
        this.name = "";
        this.price = 0;
        this.orderQuantity = 0;
        this.stock = 0;
        this.theSupplier = null;
        this.expirationDate = "";
        this.itemDescription = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Supplier getTheSupplier() {
        return theSupplier;
    }

    public void setTheSupplier(Supplier theSupplier) {
        this.theSupplier = theSupplier;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    
    
}
