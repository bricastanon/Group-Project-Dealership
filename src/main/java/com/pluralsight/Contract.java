package com.pluralsight;

public abstract class Contract {

    // is an abstract class
    // abstract classes can't instantiate objects
    protected String date;
    protected String customerName;
    protected String customerEmail;
    protected int vin;
    protected double totalPrice;
    protected double monthlyPayment;

    //constructor
    public Contract(String _date, String _customerName, String _customerEmail, int _vin) {
        this.date = _date;
        this.customerName = _customerName;
        this.customerEmail = _customerEmail;
        this.vin = _vin;
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

    public int getVin() {
        return vin;
    }
    public void setVin(int vin) {
        this.vin = vin;
    }

    // abstract methods
    public double getMonthlyPayment(Vehicle vehicle) {
        return monthlyPayment;
    }

    public double getTotalPrice(Vehicle vehicle) {
        return totalPrice;
    }
}


