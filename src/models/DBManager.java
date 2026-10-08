package models;

import java.sql.*;
import java.util.ArrayList;

/**
 * Utility class to manage database connections and load data from the ShopDB Access database file.
 * Uses JDBC for connectivity.
 */
public class DBManager {
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\ShopDB.accdb";

    /**
     * Attempts to log in a Customer based on username and password loaded from the DB.
     * @param userName The user's name.
     * @param password The user's password.
     * @return A Customer object if credentials match, otherwise null.
     */
    public Customer customerLogin(String userName, String password){
         ArrayList<Customer> allCustomers = loadCustomers();

        for(Customer customer : allCustomers){ 
            if( customer.getUserName().equals(userName) && customer.getPassword().equals(password) ){
                return customer;
            }
        }
        return null; // if no match found after loop
    }
    

    /**
     * Attempts to log in a Staff member based on username and password loaded from the DB.
     * @param userName The user's name.
     * @param password The user's password.
     * @return A Staff object if credentials match, otherwise null.
     */
    public Staff staffLogin(String userName, String password){
        ArrayList<Staff> allStaffs = loadStaff();
         
        for(Staff staff : allStaffs){ 
            if( staff.getUserName().equals(userName) && staff.getPassword().equals(password) ){
                return staff;
            }
            
        }
        return null; // if no match found after loop
    }
    

    /**
     * Loads all customer records from the "Customers" table into an ArrayList of Customer objects.
     * Handles JDBC resource cleanup using try-with-resources.
     * @return An ArrayList containing all Customer records.
     */
    public ArrayList<Customer> loadCustomers() {
        ArrayList<Customer> allCustomers = new ArrayList<>();
        
        try{
             Class.forName(driver); 
             Connection conn = DriverManager.getConnection(connectionString);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
            
            while(rs.next()) {
                // Use getString() for all fields as per the original logic, assuming they are text-based in the database schema.
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine_1 = rs.getString("AddressLine1");
                String addressLine_2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postCode = rs.getString("Postcode");                            
             
                Customer customersFormDB = new Customer(
                    firstName, 
                    lastName, 
                    userName,
                    password,
                    addressLine_1,
                    addressLine_2,
                    town,
                    postCode
                );
                allCustomers.add(customersFormDB);
            } // end of while
        } // end of try
        catch(Exception ex){
            System.out.println("Error loading customer: " + ex.getMessage());
        }
        finally {
            return allCustomers;
        }      
        
    }// end of loadCustomers

    /**
     * Loads all staff records from the "Staff" table into an ArrayList of Staff objects.
     * Handles JDBC resource cleanup using try-with-resources.
     * @return An ArrayList containing all Staff records.
     */
    public ArrayList<Staff> loadStaff() {
        ArrayList<Staff> allStaffs = new ArrayList<>();

        try {
            Class.forName(driver);
        
             Connection conn = DriverManager.getConnection(connectionString);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
            
            while(rs.next()) { 
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                double salary = rs.getDouble("Salary");                        
                            
                Staff staffsFormDB = new Staff(
                    firstName, 
                    lastName, 
                    userName,
                    password,
                    position,
                    salary
                );
                
                System.out.println("adding Staff userName: " + userName);
                allStaffs.add(staffsFormDB);
            }
        } catch (Exception ex) {
            System.out.println("Error loading customer: " + ex.getMessage());
        } 
        finally{
           return allStaffs;
        }
        
    } // end of loadStaff()
    
    public ArrayList<Product> loadProducts() {
        ArrayList<Product> allProducts = new ArrayList<>();

        try {
            Class.forName(driver);
        
             Connection conn = DriverManager.getConnection(connectionString);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
            
            while(rs.next()) { 
                int productId = rs.getInt("ProductId");
                String productName = rs.getString("ProductName");
                double price = rs.getDouble("Price");
                int stockLevel = rs.getInt("StockLevel");
                String productType = rs.getString("ProductType");
                int wattageOutput = rs.getInt("WattageOutput");       
                double efficiencyRating = rs.getDouble("EfficiencyRating");                        

                            
                if(productType.equals("Solar Panel")){
                    SolarPanel sPanelFromDB = new SolarPanel(productId, productName, stockLevel, price, wattageOutput);
                    allProducts.add(sPanelFromDB);
                }
                else if (productType.equals("Heat Pump")){
                    HeatPump hPumpFromDB = new HeatPump(productId, productName, stockLevel, price, efficiencyRating);
                    allProducts.add(hPumpFromDB);
                }

            }// end of while
        } catch (Exception ex) {
            System.out.println("Error loading customer: " + ex.getMessage());
        } 
        finally{
           return allProducts;
        }
        
    } // end of loadProducts()
}