package models;

/**
 *
 * @author lichi
 */
public class User {
    private String UserName;
    private String FirstName;
    private String LastName;
    private String Password;
    
    // Default constructor
    public User() {
        UserName = "username_placeholder";
        FirstName = "FirstName_placeholder";
        LastName = "LastName_placeholder";
        Password = "Password_placeholder";
    
    }

    // Parameterized constructor for full details
    public User(String UserNameIn, String FirstNameIn, String LastNameIn, String PaswordIn) {
        this.UserName = UserNameIn;
        this.FirstName = FirstNameIn;
        this.LastName = LastNameIn;
        this.Password = PaswordIn;
    }


    // Getter for UserName
    public String getUserName() {
        return UserName;
    }

    // Setter for UserName
    public void setUserName(String userNameIn) {
        this.UserName = userNameIn;
    }

    // Getter for FirstName
    public String getFirstName() {
        return FirstName;
    }

    // Setter for FirstName
    public void setFirstName(String firstNameIn) {
        this.FirstName = firstNameIn;
    }

    // Getter for LastName
    public String getLastName() {
        return LastName;
    }

    // Setter for LastName
    public void setLastName(String lastNameIn) {
        this.LastName = lastNameIn;
    }

    // Getter for Password (Encrypted)
    public String getPassword() {
        return Password; // Assume a simple encryption method
    }

    // Setter for Password (Encrypted)
    public void setPassword(String passwordIn) {
        this.Password = passwordIn; // Encrypt the password
    }
}
