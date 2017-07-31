package com.cdk.Bank;

/**
 * Created by karodes on 7/14/2017.
 */
public class BankService {
    String bankName;
    int noOfCustomers;
    double revenue;
    int noOfBranches;

    public BankService() {

    }

    public BankService(String bankName, int noOfCustomers, double revenue, int noOfBranches) {
        this.bankName = bankName;
        this.noOfCustomers = noOfCustomers;
        this.revenue = revenue;
        this.noOfBranches = noOfBranches;
    }

    public String getBranchName() {

        return bankName;
    }

    public int getNoOfCustomers() {
        return noOfCustomers;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getNoOfBranches() {
        return noOfBranches;
    }

    public void display() {
        System.out.println("========== This is " + this.bankName + " we welcome you ! ============");
        System.out.println("This bank has total " + this.noOfCustomers + "number of customers");
        System.out.println("This bank has total " + this.revenue + " $ of revenue");
        System.out.println("Total number of branches : " + this.noOfBranches);

    }


}
