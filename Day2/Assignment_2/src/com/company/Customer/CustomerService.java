package com.company.Customer;

import com.company.Account.AccountService;
import com.company.Branch.BranchService;

/**
 * Created by karodes on 7/14/2017.
 */
public class CustomerService extends BranchService{
    String accountHolderName;
    long addharId;
    String panId;
    AccountService accountService = new AccountService(10000,1232310,"Savings");

    public CustomerService(String bankName, int noOfCustomers, double revenue, int noOfBranches, int IFSC, String managerName, String address, String contact, String acoountHolderName, long addharId, String panId) {
        super(bankName, noOfCustomers, revenue, noOfBranches, IFSC, managerName, address, contact);
        this.accountHolderName = acoountHolderName;
        this.addharId = addharId;
        this.panId = panId;
    }
    public String getAcoountHolderName() {
        return accountHolderName;
    }

    public long getAddharId() {
        return addharId;
    }

    public String getPanId() {
        return panId;
    }

    public void display() {
        System.out.println("=============Account holder Details ===========");
        System.out.println("Name  : " + accountHolderName);
        accountService.display();
        super.display();
    }

}
