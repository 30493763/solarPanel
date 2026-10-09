package models;

/**
 *
 * @author lichi
 */
public class Product {
    // Private Attributes
    private int ProductId;
    private String ProductName;
    private int StockLevel;
    private double Price;
    private String ProductType;

    
    // methods
    
    @Override
     public String toString(){
        return ProductName + " the "+Price;
    }
    
        
        
    // Constructors
    // Default constructor
    public Product() {
        ProductId = 101;
        ProductName = "ProductName_placeholder";
        StockLevel = 0;
        Price = 0;
        ProductName = "ProductType_placeholder";

    }
    
    // Parameterized constructor with 3 parameters (without ProductId)
    public Product(String ProductName, int StockLevel, double Price) {
        this.ProductName = ProductName;
        this.StockLevel = StockLevel;
        this.Price = Price;
        this.ProductId = 101;
        this.ProductType = "ProductType_placeholder";
    }

    // Parameterized constructor with full details including ProductId
    public Product(int ProductIdIn, String ProductNameIn, int StockLevelIn, double PriceIn, String productTypeIn) {
        this.ProductId = ProductIdIn;
        this.ProductName = ProductNameIn;
        this.StockLevel = StockLevelIn;
        this.Price = PriceIn;
        this.ProductType = productTypeIn;
    }

    // Getter for ProductId
    public int getProductId() {
        return ProductId;
    }

    // Setter for ProductId
    public void setProductId(int productIdIn) {
        this.ProductId = productIdIn;
    }

    // Getter for ProductName
    public String getProductname() {
        return ProductName;
    }

    // Setter for ProductName
    public void setProductName(String productNameIn) {
        this.ProductName = productNameIn;
    }

    // Getter for StockLevel
    public int getStockLevel() {
        return StockLevel;
    }

    // Setter for StockLevel
    public void setStockLevel(int stockLevelIn) {
        this.StockLevel = stockLevelIn;
    }

    // Getter for Price
    public double getPrice() {
        return Price;
    }

    // Setter for Price
    public void setPrice(double priceIn) {
        this.Price = priceIn;
    }
    
     // Getter for productType
    public String getProductType() {
        return ProductType;
    }

    // Setter for productType
    public void setProductType(String productTypeIn) {
        this.ProductType = productTypeIn;
    }
}

