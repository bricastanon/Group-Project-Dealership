package com.pluralsight;

public abstract class Contract {

    // is an abstract class
    // abstract classes can't instantiate objects
    protected String date;
    protected String customerName;
    protected String customerEmail;
    protected String vehicleSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract(String _date, String _customerName, String _customerEmail, String _vehicleSold) {
        this.date = _date;
        this.customerName = _customerName;
        this.customerEmail = _customerEmail;
        this.vehicleSold = _vehicleSold;
    }

    // abstract methods
    public double getMonthlyPayment() {
        return monthlyPayment;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    // getters and setters
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }
    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
}
