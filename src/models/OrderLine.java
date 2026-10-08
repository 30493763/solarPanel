package models;

/**
 *
 * @author lichi
 */
public class OrderLine {
    // Private Attributes
    private int orderLineId;
    private Product product;
    private int quantity;
    private double lineTotal;

    // Constructors
    
    // Default constructor (OrderLine())
    public OrderLine() {
        orderLineId = 101;
        product = new Product();
        quantity = 0;
        lineTotal = 0;
    }

    // Parameterized constructor with everything in parameters
    public OrderLine(int orderLineIdIn,
                     Product productIn,
                     int quantityIn,
                     double lineTotalIn
                     ) 
    {
    
        this.orderLineId = orderLineIdIn;
        this.product = productIn;
        this.quantity = quantityIn;
        this.lineTotal = lineTotalIn;
    }

    // Parameterized constructor with everything except lineTotal
    public OrderLine(int orderLineIdIn,
                     Product productIn,
                     int quantityIn) 
    {
       
        this.orderLineId = orderLineIdIn;
        this.product = productIn;
        this.quantity = quantityIn;
        this.lineTotal = product.getPrice()*quantity;
    }
  
    // Getter for orderLineId
    public int getOrderLineId() {
        return orderLineId;
    }

    // Setter for orderLineId
    public void setOrderLineId(int orderLineIdIn) {
        this.orderLineId = orderLineIdIn;
    }

    // Getter for product
    public Product getProduct() {
        return product;
    }

    // Setter for product
    public void setProduct(Product productIn) {
        this.product = productIn;
      
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantityIn) {
        this.quantity = quantityIn;
      
    }

    // Getter for lineTotal
    public double getLineTotal() {
        return lineTotal;
    }

    // Setter for lineTotal
    public void setLineTotal(double lineTotalIn) {
        this.lineTotal = lineTotalIn;
    }
}
