package com.pluralsight;
public class SalesContract extends Contract {
    private double salesTaxRate;
    private double recordingFee;
    private double processingFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, String vehicleSold, double salesTaxRate, double recordingFee, double processingFee, boolean finance) {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTaxRate = salesTaxRate;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
        this.totalPrice = calculateTotalPrice();
        this.monthlyPayment = calculateMonthlyPayment();
    }
    public double getSalesTaxRate() { return salesTaxRate;
    }
    public void setSalesTaxRate(double salesTaxRate) { this.salesTaxRate = salesTaxRate;
    }
    public double getRecordingFee() { return recordingFee;
    }
    public void setRecordingFee(double recordingFee) { this.recordingFee = recordingFee;
    }
    public double getProcessingFee() { return processingFee;
    }
    public void setProcessingFee(double processingFee) { this.processingFee = processingFee;
    }
    public boolean isFinance() { return finance;
    }
    public void setFinance(boolean finance) { this.finance = finance;
    }
    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
    private double calculateTotalPrice() {
        double vehicleCost = Double.parseDouble(vehicleSold);
        return vehicleCost + (vehicleCost * salesTaxRate) + recordingFee + processingFee;
    }
    @Override
    public double getMonthlyPayment() { return monthlyPayment;
    }
    private double calculateMonthlyPayment() {
        if (!finance) {
            return 0;
        }
        double principal = totalPrice;
        double rate = principal >= 10000 ? 0.0425 : 0.0525;
        int term = principal >= 10000 ? 48 : 24;

        // Calculate monthly payment using the formula for annuity
        double monthlyRate = rate / 12;
        return principal * (monthlyRate) / (1 - Math.pow(1 + monthlyRate, -term));
    }
}
