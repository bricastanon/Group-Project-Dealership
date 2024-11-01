package com.pluralsight;

import java.io.*;


public class ContractFileManager {


    File filename = new File("src/contract.csv");


    String lease;// lease | date | name | email | vin | year | make | model | type | color | mileage |  orignalcost |
    // expectedendingvalue | leasefee | totalleasecost | monthlypayment

    String sale;// sale | date | name | email | vin | year | make | model | type | color | mileage |
    // salestaxamount | recording fee | processingfee | monthlypayment | financeoption | financeamount

    // accepting a contract parameter
    // instantiates the correct type of contract
    // trying to do instanceof to choose which object to write
    public void saveContract(Contract contract) throws FileNotFoundException {
        try (FileWriter fWriter = new FileWriter("contract.csv", true);
             BufferedWriter bWriter = new BufferedWriter(fWriter)){
            if (contract instanceof SalesContract){
                bWriter.write();
                bWriter.newLine();
                System.out.println("A contact entry was added.");
            }
            if (contract instanceof LeaseContract){
                bWriter.write();
                bWriter.newLine();
                System.out.println("A contact entry was added.");
            }
            bWriter.close(); // why is this redundant
        } catch (IOException e) {
            System.out.println("Error: a file entry was not added");
            e.printStackTrace();
        }
    }
}

//    SALE|20210928|Dana Wyatt|dana@texas.com|10112|1993|
//    Ford|Explorer|SUV|Red|525123|995.00|
//            49.75|100.00|295.00|1439.75|NO|0.00
// sale | date | name | email | vin | year | make | model | type | color | mileage |
// salestaxamount | recording fee | processingfee | monthlypayment | financeoption | financeamount
//    LEASE|20210928|Zachary Westly|zach@texas.com|37846|2021|
//    Chevrolet|Silverado|truck|Black|2750|31995.00|
//            15997.50|2239.65|18337.15|541.39
// lease | date | name | email | vin | year | make | model | type | color | mileage |  orignalcost |
// expectedendingvalue | leasefee | totalleasecost | monthlypayment

