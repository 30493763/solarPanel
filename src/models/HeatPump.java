package models;

/**
 *
 * @author lichi
 */
public class HeatPump extends Product {
    // Private Attributes
    private double efficiencyRating;

    // Constructors
    
    // Default constructor (HeatPump())
    public HeatPump() {
        super();
        efficiencyRating = 0;
    }

    // Parameterized constructor with 4 parameters (Everything EXCEPT productId)
    public HeatPump(String ProductNameIn, 
                    int StockLevelIn, 
                    double PriceIn,
                    double efficiencyRatingIn) {
//        this.ProductId = 0;
        super(0, ProductNameIn, StockLevelIn, PriceIn); // Call parent constructor without ProductId
        this.efficiencyRating = efficiencyRatingIn;
        
    }

    // Parameterized constructor with 5 parameters (Everything)
    public HeatPump(int ProductId, 
                    String ProductName, 
                    int StockLevel, 
                    double Price,
                    double efficiencyRating) {
        super(ProductId, ProductName, StockLevel, Price); // Call parent constructor with all parameters
        this.efficiencyRating = efficiencyRating;
    }

    // Getter for efficiencyRating
    public double getEfficiencyRating() {
        return efficiencyRating;
    }

    // Setter for efficiencyRating
    public void setEfficiencyRating(double efficiencyRating) {
        this.efficiencyRating = efficiencyRating;
    }
}
