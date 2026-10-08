package models;

/**
 *
 * @author lichi
 */
public class Staff extends User {
    // Private Attributes
    private String position;
    private double salary;

    
        //polymorphism
    public String greeting(){
        return "Staff = "+this.getUserName();
    }
    
    
    // Constructors
    
    // Default constructor (Staff())
    public Staff() {
        super();
        position = "clerk";
        salary = 0;
    }

    // Parameterized constructor with 6 parameters (Everything)
    public Staff(String firstNameIn, 
                 String lastNameIn, 
                 String userNameIn,
                 String passwordIn,
                 String positionIn,
                 double salaryIn) {
        super(firstNameIn, lastNameIn, userNameIn, passwordIn); // Call parent constructor
        this.position = positionIn;
        this.salary = salaryIn;
    }

    // Getters
    
    // Getter for position
    public String getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(String positionIn) {
        this.position = positionIn;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salaryIn) {
        this.salary = salaryIn;
    }
}
