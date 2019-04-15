/**
 *
 * @author Dave
 */
public class Item {
    
    private int index;
    private String name;
    private double price;
    private Supplier theSupplier;
    private String expirationDate;
    private String itemDescription;
    private Category myCategory;
    
    public Item(int index, String name, double price, Supplier theSupplier,
            String expirationDate, String itemDescription, Category myCategory) {
       
        this.index = index;
        this.name = name;
        this.price = price;
        this.theSupplier = theSupplier;
        this.expirationDate = expirationDate;
        this.itemDescription = itemDescription;
        this.myCategory = myCategory;
    }
    
    public Item() {
        
        this.index = -1;
        this.name = "";
        this.price = 0;
        this.theSupplier = null;
        this.expirationDate = "";
        this.itemDescription = "";
        this.myCategory = null;
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

    public Category getMyCategory() {
        return myCategory;
    }

    public void setMyCategory(Category myCategory) {
        this.myCategory = myCategory;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    
}
