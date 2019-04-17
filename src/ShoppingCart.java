/**
 *
 * @author Dave
 */
import java.util.ArrayList;
public class ShoppingCart {
    
    private ArrayList<ItemOrder> cart = new ArrayList<>();
    private double totalCartPrice = 0;      //Didn't include in constructor
    
    

    public ShoppingCart(ArrayList<ItemOrder> cart) {
        this.cart = cart;
    }
    
    public ShoppingCart() {
        //this.cart = null;
    }

    public void calculateCost()
    {
        double newPrice = 0.0;
        
        for( ItemOrder item : cart )
        {
            newPrice += item.getPrice();
        }
        
        totalCartPrice = newPrice;
    }
    
    
    /*
    We can make the addItem/removeItem methods to return an int to represent success/fail,
    but if the user is selecting items to add/remove from the available items list/their cart,
    this shouldn't be necessary as they can only select existing objects.
    */
    
    public void addItemToCart( ItemOrder input ) // Requires that the input is an ItemOrder object
    {
        cart.add( input );
        totalCartPrice += input.getPrice();
    }
    
    
    public void removeItemFromCart( Item input ) // Requires that the input is an ItemOrder object
    {
        String target = input.getName();
        
        for( int i = 0; i < cart.size(); i++ )
        {
            Item test = cart.get( i );
            String checkName = test.getName();
            
            if( checkName.equals( target ))
            {
                cart.remove( i );
                return;
            }
        }
    }    
    
     
    
    
    
    
    public ArrayList<ItemOrder> getCart() {
        return cart;
    }

    public void setCart(ArrayList<ItemOrder> cart) {
        this.cart = cart;
    }



    public double getTotalCartPrice() {
        return totalCartPrice;
    }

    public void setTotalCartPrice(double totalCartPrice) {
        this.totalCartPrice = totalCartPrice;
    }
    
    
    
    
}
