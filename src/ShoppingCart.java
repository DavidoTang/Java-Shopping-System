/**
 *
 * @author Dave
 */
import java.util.ArrayList;
public class ShoppingCart {
    
    private ArrayList<Item> cart;
    private CustomerAccount cust;
    private double totalCartPrice;      //Didn't include in constructor
    
    
    
    public ShoppingCart(ArrayList<Item> cart, CustomerAccount cust) {
        this.cart = cart;
        this.cust = cust;
    }
    
    public ShoppingCart() {
        this.cart = null;
        this.cust = null;
    }

    public ArrayList<Item> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Item> cart) {
        this.cart = cart;
    }

    public CustomerAccount getCust() {
        return cust;
    }

    public void setCust(CustomerAccount cust) {
        this.cust = cust;
    }

    public double getTotalCartPrice() {
        return totalCartPrice;
    }

    public void setTotalCartPrice(double totalCartPrice) {
        this.totalCartPrice = totalCartPrice;
    }
    
    
    
    
}
