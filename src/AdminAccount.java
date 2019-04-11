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
