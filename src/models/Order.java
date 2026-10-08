package models;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author lichi
 */


public class Order {
    // Private Attributes
    private int orderId;
    private Date orderDate;
    private double orderTotal;
    private String status;
    private HashMap<Integer, OrderLine> orderLines;

    // Constructors
    
    // Default constructor (Order()) - setting orderDate to new Date() and orderLines to a new HashMap
    public Order() {
        this.orderDate = new Date();
        this.orderLines = new HashMap<>();
        this.orderTotal = 0;
        this.status = "on going";
        this.orderId = 101;
    }

    // Parameterized constructor with everything except orderLines
    public Order(int orderIdIn, 
                 Date orderDateIn, 
                 double orderTotalIn, 
                 String statusIn) {
        this.orderId = orderIdIn;
        this.orderDate = orderDateIn;
        this.orderTotal = orderTotalIn;
        this.status = statusIn;
        this.orderLines = new HashMap<>();
    }

    // Getters
    
    // Getter for orderId
    public int getOrderId() {
        return orderId;
    }

    // Setter for orderId
    public void setOrderId(int orderIdIn) {
        this.orderId = orderIdIn;
    }

    // Getter for orderDate
    public Date getOrderDate() {
        return orderDate;
    }

    // Setter for orderDate
    public void setOrderDate(Date orderDateIn) {
        this.orderDate = orderDateIn;
    }

    // Getter for orderTotal
    public double getOrderTotal() {
        return orderTotal;
    }

    // Setter for orderTotal
    public void setOrderTotal(double orderTotalIn) {
        this.orderTotal = orderTotalIn;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String statusIn) {
        this.status = statusIn;
    }

    // Getter for orderLines
    public HashMap<Integer, OrderLine> getOrderLines() {
        return orderLines;
    }

    // Setter for orderLines
    public void setOrderLines(HashMap<Integer, OrderLine> orderLinesIn) {
        this.orderLines = orderLinesIn;
    }
}
