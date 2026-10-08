package models;

import java.util.HashMap;

/**
 *
 * @author lichi
 */
public class Customer extends User {
    // Private Attributes
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    
    //newly added attribute Orders
   private HashMap<Integer, Order> orders;
    
   
    //polymorphism
    public String greeting(){
//        String output = "Customer = "+this.getUserName();
        //or 
        //String output = "Customer = "+getUserName();


        return "Customer = "+this.getUserName();
    }
   
   
    // Constructors
    
    // Default constructor (Customer())
    public Customer() {
        super();
        addressLine1 = "addressLine1_placeholder";
        addressLine2 = "addressLine2_placeholder";
        town = "town_placeholder";
        postcode = "postcode_placeholder";
        isRegistered = false;
        orders =  new HashMap<>();
    }

    // Parameterized constructor with 8 parameters (Everything EXCEPT isRegistered)
    public Customer(String firstNameIn, 
                    String lastNameIn, 
                    String userNameIn,
                    String passwordIn,
                    String addressLine1In,
                    String addressLine2In,
                    String townIn,
                    String postcodeIn) {
        super(userNameIn, firstNameIn, lastNameIn , passwordIn); // Call parent constructor
        this.addressLine1 = addressLine1In;
        this.addressLine2 = addressLine2In;
        this.town = townIn;
        this.postcode = postcodeIn;
        this.isRegistered = false;
        this.orders =  new HashMap<>();
    }

    // Getters
    
    // Getter for addressLine1
    public String getAddressLine1() {
        return addressLine1;
    }

    // Setter for addressLine1
    public void setAddressLine1(String addressLine1In) {
        this.addressLine1 = addressLine1In;
    }

    // Getter for addressLine2
    public String getAddressLine2() {
        return addressLine2;
    }

    // Setter for addressLine2
    public void setAddressLine2(String addressLine2In) {
        this.addressLine2 = addressLine2In;
    }

    // Getter for town
    public String getTown() {
        return town;
    }

    // Setter for town
    public void setTown(String townIn) {
        this.town = townIn;
    }

    // Getter for postcode
    public String getPostcode() {
        return postcode;
    }

    // Setter for postcode
    public void setPostcode(String postcodeIn) {
        this.postcode = postcodeIn;
    }

    // Getter for isRegistered
    public boolean getIsRegistered() {
        return isRegistered;
    }

    // Setter for isRegistered
    public void setIsRegistered(boolean isRegisteredIn) {
        this.isRegistered = isRegisteredIn;
    }
    
    //Getter for orders
    public HashMap<Integer, Order> getOrders() {
        return orders;
    }
    
    //Setter for orders
    public void setOrders(HashMap<Integer, Order> ordersIn) {
        orders = ordersIn;
    }
}
