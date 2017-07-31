package com.cdk.Branch;

import com.cdk.Bank.BankService;

/**
 * Created by karodes on 7/14/2017.
 */
public class BranchService extends BankService {
    int IFSC;
    String managerName;
    String address;
    String contact;

    public BranchService() {

    }
    public BranchService(String bankName, int noOfCustomers, double revenue, int noOfBranches, int IFSC, String managerName, String address, String contact) {
        super(bankName, noOfCustomers, revenue, noOfBranches);
        this.IFSC = IFSC;
        this.managerName = managerName;
        this.address = address;
        this.contact = contact;
    }

    public int getIFSC() {
        return IFSC;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public void display() {
        //super.display();
        System.out.println("==============");
        System.out.println("Manager Name : " + this.managerName);
        System.out.println("IFSC Code : " + this.IFSC);
        System.out.println("Address : " + this.address);
        System.out.println("Contact : " + this.contact);
    }
}
