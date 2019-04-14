/**
 *
 * @author Dave
 */

import java.util.ArrayList;

public class CustomerAccount extends User{
    
    private String birthDate;
    private ArrayList< Item > cartList = new ArrayList< Item >();
    
    
    
    public CustomerAccount(String firstName, String lastName, String accountCreationDate, Address addr, ContactInfo contact, 
            LoginCredentials loginCreds, String joinDate, String birthDate) {
        
        super(firstName, lastName, accountCreationDate, addr, contact, loginCreds);
        this.birthDate = birthDate;
    }
    
    public CustomerAccount() {
        super();
        this.birthDate = "";
    }

    /*
    We can make the addItem/removeItem methods to return an int to represent success/fail,
    but if the user is selecting items to add/remove from the available items list/their cart,
    this shouldn't be necessary as they can only select existing objects.
    */
    
    public void addItemToCart( Item input ) // Requires that the input is an Item object
    {
        cartList.add( input );
    }
    
    public void removeItemFromCart( Item input ) // Requires that the input is an Item object
    {
        String target = input.getName();
        
        for( int i = 0; i < cartList.size(); i++ )
        {
            Item test = cartList.get( i );
            String checkName = test.getName();
            
            if( checkName.equals( target )
            {
                cartList.remove( i );
                return;
            }
        }
    }

    public double purchaseCart() // Returns total price of the cart
    {
        double total = 0;
        
        for( Item i : cartList )
        {
            total += i.getPrice();
        }
        
        return total;
    }
    
    
    
    
    
    
    
    
    
    
    
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
