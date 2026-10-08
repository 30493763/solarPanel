package models;

/**
 *
 * @author lichi
 */
public class HeatPump extends Product {
    // Private Attributes
    private String productType;
    private double efficiencyRating;

    // Constructors
    
    // Default constructor (HeatPump())
    public HeatPump() {
        super();
        productType = "Heat Pump";
        efficiencyRating = 0;
    }

    // Parameterized constructor with 4 parameters (Everything EXCEPT productId)
    public HeatPump(String ProductNameIn, 
                    int StockLevelIn, 
                    double PriceIn,
                    double efficiencyRatingIn) {
//        this.ProductId = 0;
        super(0, ProductNameIn, StockLevelIn, PriceIn); // Call parent constructor without ProductId
        this.productType = "Heat Pump";
        this.efficiencyRating = efficiencyRatingIn;
        
    }

    // Parameterized constructor with 5 parameters (Everything)
    public HeatPump(int ProductId, 
                    String ProductName, 
                    int StockLevel, 
                    double Price,
                    double efficiencyRating) {
        super(ProductId, ProductName, StockLevel, Price); // Call parent constructor with all parameters
        this.productType = "Heat Pump";
        this.efficiencyRating = efficiencyRating;
    }
    
    // Getter for productType
    public String getProductType() {
        return productType;
    }

    // Setter for productType
    public void setProductType(String productTypeIn) {
        this.productType = productTypeIn;
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
