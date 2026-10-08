package models;

import models.DBManager;
import models.Customer;
import java.util.ArrayList;

/**
 * Main class to run the shop application logic and test database connections.
 */
public class Main {

    /**
     * @param args the command line arguments (unused)
     */
    public static void main(String[] args) {
        DBManager db = new DBManager();
        
        // 1. Load Data into memory structures for testing purposes (if needed)
        System.out.println("--- Loading Customer Records ---");
        ArrayList<Customer> customers = db.loadCustomers();
        System.out.println("Loaded " + customers.size() + " customer records.");

        System.out.println("\n--- Loading Staff Records ---");
        ArrayList<Staff> staffs = db.loadStaff();
        System.out.println("Loaded " + staffs.size() + " staff records.");
        
        // 2. Test Customer Login
        String testCustomerUserName = "DonaldL";
        String testCustomerPassword = "blehbleh";
        
        Customer customerToChecked = db.customerLogin(testCustomerUserName, testCustomerPassword);        
        if(customerToChecked != null ){
            System.out.println("\n[SUCCESS] Customer Login: " + customerToChecked.getFirstName() + " " + customerToChecked.getLastName() + " logged in.");
        } else{
            System.out.println("\n[FAILURE] Customer login failed for user: " + testCustomerUserName);
        }
        
        // 3. Test Staff Login (FIXED: Corrected variable types, syntax, and password value)
        String testStaffUserName = "JamesH1";
        // NOTE: Assuming the correct password here is "staffpass" or a valid string literal. 
        // Please replace this with the actual password if the login fails.
        String testStaffPassword = "blahblah1"; 

        Staff staffToChecked = db.staffLogin(testStaffUserName, testStaffPassword); // FIX: Changed return type to Staff
        if(staffToChecked != null ){
            System.out.println("[SUCCESS] Staff Login: " + staffToChecked.getFirstName() + " " + staffToChecked.getLastName() + " logged in.");
        } else{
            System.out.println("[FAILURE] Staff login failed for user: " + testStaffUserName);
        }
    }
}