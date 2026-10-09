
package models;

/**
 *
 * @author lichi
 */
public class SolarPanel extends Product {
      // Private Attributes
    private int wattageOutput;
    
    //constructors:
    
    // Default constructor (HeatPump())
    public SolarPanel() {
        super();
        wattageOutput = 0;
    }
    
    // Parameterized constructor with 4 parameters (Everything EXCEPT productId)
    public SolarPanel(String ProductNameIn, 
                    int StockLevelIn, 
                    double PriceIn,
                    int wattageOutputIn) {
        super(0, ProductNameIn, StockLevelIn, PriceIn, "Solar Panel"); // Call parent constructor without ProductId
        this.wattageOutput = wattageOutputIn;
        
    }
    
    
    // Parameterized constructor with 5 parameters (except ProductType)
    public SolarPanel(int ProductId, 
                    String ProductName, 
                    int StockLevel, 
                    double Price,
                    int wattageOutputIn) {
        super(ProductId, ProductName, StockLevel, Price, "Solar Panel"); // Call parent constructor with all parameters

        this.wattageOutput = wattageOutputIn;
    }

   
//    // Getter for productType
//    public String getProductType() {
//        return productType;
//    }
//
//    // Setter for productType
//    public void setProductType(String productTypeIn) {
//        this.productType = productTypeIn;
//    }
    
    // Getter for wattageOutput
    public int getWattageOutput() {
        return wattageOutput;
    }

    // Setter for wattageOutput
    public void setWattageOutput(int wattageOutputIn) {
        this.wattageOutput = wattageOutputIn;
    }
}
