/**
 *
 * @author Dave
 */

import java.util.ArrayList;

public class CustomerAccount extends User{
    
    private String birthDate;
    //private ArrayList< ItemOrder > cartList = new ArrayList< ItemOrder >();
    private ShoppingCart shoppingCart;
    private ArrayList<String> purchaseHistory = new ArrayList<>();

    
    public CustomerAccount(String firstName, String lastName, String accountCreationDate, Address addr, ContactInfo contact, 
            LoginCredentials loginCreds, String joinDate, String birthDate) {
        
        super(firstName, lastName, accountCreationDate, addr, contact, loginCreds);
        this.birthDate = birthDate;
        this.shoppingCart = new ShoppingCart();
    }
    
    public CustomerAccount() {
        super();
        this.birthDate = "";
        this.shoppingCart = new ShoppingCart();

    }
    
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public ShoppingCart getShoppingcart() {
        return shoppingCart;
    }

    public void setShoppingcart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ArrayList<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(ArrayList<String> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
    
    
}
