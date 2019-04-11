/**
 *
 * @author Dave
 */
public class AdminAccount extends User{
    
    private String employeeID;
    private String hireDate;
    
    public AdminAccount(String firstName, String lastName, String accountCreationDate, Address addr, ContactInfo contact, 
            LoginCredentials loginCreds, String employeeID, String hireDate) {
        
        super(firstName, lastName, accountCreationDate, addr, contact, loginCreds);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }
    
    
    public AdminAccount(){
        super();
        this.employeeID = "";
        this.hireDate = "";        
    }

    //addItem()
    //removeItem()
    //changePrice()
    //changeName()
    //changeItemDesc
    //changeCategory()
    //changeCategroyDesc()
    //updateStock()
    //addUser()
    //removeUser()
       
    public void addItem( String name, double price, int orderQuantity, int stock, Supplier theSupplier, String supplier,
            String expirationDate, String itemDescription )
    {
        Item create = new Item( name, price, orderQuantity, stock, theSupplier, supplier, expirationDate, itemDescription );
        Item.addItem( create );
    }
    
    public void removeItem( String name )
    {
        if( !Item.removeItem( name ) ) // If removeItem() returns false ( item DNE )
        {
            // GUI stuff telling admin item did not exist, try again
        }
    }
    
    public void changePrice( Item target, double input ) // target is specified from the GUI
    {
        target.changePrice( input );
    }
    
    
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    
    
}
