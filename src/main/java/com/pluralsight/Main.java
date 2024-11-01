package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Contract> contracts = new ArrayList<>();
        UserInterface ui = new UserInterface();
        ui.display();

        // Collect basic sales information from the user
        System.out.print("Enter date of contract (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();
        System.out.print("Enter vehicle make: ");
        String make = scanner.nextLine();
        System.out.print("Enter vehicle model: ");
        String model = scanner.nextLine();
        System.out.print("Enter vehicle year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter vehicle color: ");
        String color = scanner.nextLine();
        System.out.print("Enter vehicle mileage: ");
        int mileage = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter vehicle type (car, truck, SUV, van): ");
        String type = scanner.nextLine();
        System.out.print("Enter vehicle price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Vehicle vehicle = new Vehicle(1, make, model, year, color, mileage, type, price);  // Assuming '1' as an example ID
        System.out.print("Is it a sale or lease? (S/L): ");
        String saleOrLease = scanner.nextLine().toUpperCase();
        if (saleOrLease.equals("S")) {
            System.out.print("Is the vehicle financed? (yes/no): ");
            boolean isFinanced = scanner.nextLine().equalsIgnoreCase("yes");
            SalesContract salesContract = new SalesContract(date, customerName, customerEmail, vehicle.toString(), 0.05, 100, price < 10000 ? 295 : 495, isFinanced);
            try {
                ContractFileManager.writeContractToFile("********.txt", salesContract); // find out file name*****
                System.out.println("Sales contract recorded successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (saleOrLease.equals("L")) {
            if ((2023 - year) > 3) {
                System.out.println("You can't lease a vehicle over 3 years old.");
            } else {
                System.out.println("Proceed with leasing...");
                // Implement leasing logic here
            }
        } else {
            System.out.println("Invalid input. Please enter 'S' for sale or 'L' for lease.");
        }

        scanner.close();
    }
}
