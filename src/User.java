/**
 *
 * @author Dave
 */
public abstract class User {
    
    private String firstName;
    private String lastName;
    private String accountCreationDate;
    private Address addr;
    private ContactInfo contact;
    private LoginCredentials loginCreds;
    
    
    public User(String firstName, String lastName, String accountCreationDate, Address addr, ContactInfo contact, 
            LoginCredentials loginCreds) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreationDate = accountCreationDate;
        this.addr = addr;
        this.contact = contact;
        this.loginCreds = loginCreds;
        
    }
    
    
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.accountCreationDate = "";
        this.addr = null;
        this.contact = null;
        this.loginCreds = null;
                
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public LoginCredentials getLoginCreds() {
        return loginCreds;
    }

    public void setLoginCreds(LoginCredentials loginCreds) {
        this.loginCreds = loginCreds;
    }
    
}
