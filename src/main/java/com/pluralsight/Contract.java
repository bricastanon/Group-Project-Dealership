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

    public Contract(String _date, String _customerName, String _customerEmail, int _vin) {
        this.date = _date;
        this.customerName = _customerName;
        this.customerEmail = _customerEmail;
        this.vin = _vin;
    }

    // abstract methods
    public abstract double getMonthlyPayment(Vehicle vehicle);

    public abstract double getTotalPrice(Vehicle vehicle);

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

    public int getVehicleSold() {
        return vin;
    }
    public void setvin(int vin) {
        this.vin = vin;
    }
}
