/**
 *
 * @author Dave
 */
public class CustomerAccount extends User{
    
    private String birthDate;
    
    
    
    
    public CustomerAccount(String firstName, String lastName, String accountCreationDate, Address addr, ContactInfo contact, 
            LoginCredentials loginCreds, String joinDate, String birthDate) {
        
        super(firstName, lastName, accountCreationDate, addr, contact, loginCreds);
        this.birthDate = birthDate;
    }
    
    public CustomerAccount() {
        super();
        this.birthDate = "";
    }

    
    //addItemCar()
    
    //removeItemCart()
    
    //purchaseCart()
    
    
    
    
    
    
    
    
    
    
    
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
