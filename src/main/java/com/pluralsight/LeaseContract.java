package com.pluralsight;

public class LeaseContract extends Contract{
    //constants
    private static final double EXPECTED_ENDING_VALUE_MULTIPLIER = 0.50;
    private static final double LEASE_FEE_MULTIPLIER = 0.07;
    private static final double MONTHLY_LEASE_FEE_MULTIPLIER = 0.04;
    private static final int LEASE_TERM = 36;
    //attributes
    private double expectedEndValue; //this will be 50% of the original price
    private double leaseFee; //this will be 7% of the original price

    //
    //lease contract constructor
    public LeaseContract(String date, String customerName, String customerEmail, int vin) {
        super(date, customerName, customerEmail, vin);
    }

    //getters for the math done for Lease contract
    public double getLeaseFee(Vehicle vehicle) {
        double originalPrice = Vehicle.getPrice();
        this.leaseFee = originalPrice * (1 + LEASE_FEE_MULTIPLIER);
        return this.leaseFee;
    }
    public double getExpectedEndValue(Vehicle vehicle) {
        double originalPrice = Vehicle.getPrice();
        this.expectedEndValue = originalPrice * (1 + EXPECTED_ENDING_VALUE_MULTIPLIER);
        return this.expectedEndValue;
    }
    //overriding the abstract attributes from Contract class
    @Override
    public double getTotalPrice(Vehicle vehicle) {
        //total price = getLeaseFee()( which is og price + lease fee) + getExpectedEndingValue + getMonthlyPayment();
        this.totalPrice = 5

        return this.totalPrice;
    }
    @Override
    public double getMonthlyPayment(Vehicle vehicle) {
        //4% charge over the course of 36 months
        this.monthlyPayment = ()
        return this.monthlyPayment;
    }

}
