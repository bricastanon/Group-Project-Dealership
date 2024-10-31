package com.pluralsight;
public class SalesContract extends Contract {
    private double salesTaxRate;
    private double recordingFee;
    private double processingFee;
    private boolean finance;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicle, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicle);
        this.finance = finance;
        this.salesTaxRate = vehicle.getOriginalCost() * 0.05;
        this.recordingFee = 100;
        this.processingFee = vehicle.getOriginalCost() < 10000 ? 295 : 495;
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
    public double getTotalPrice() { return vehicle.getOriginalCost() + salesTaxRate + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        if (!finance) {
            return 0;
        }

        double principal = getTotalPrice();
        double rate = vehicle.getOriginalCost() >= 10000 ? 0.0425 : 0.0525;
        int term = vehicle.getOriginalCost() >= 10000 ? 48 : 24;

        // Calculate monthly payment using the formula for annuity
        double monthlyRate = rate / 12;
        return principal * (monthlyRate) / (1 - Math.pow(1 + monthlyRate, -term));
    }
}

