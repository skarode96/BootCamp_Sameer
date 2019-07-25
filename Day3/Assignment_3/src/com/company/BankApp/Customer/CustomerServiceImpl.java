package com.company.BankApp.Customer;

import com.company.BankApp.Account.AccountServiceImpl;

/**
 * Created by karodes on 7/16/2017.
 */
public class CustomerServiceImpl implements CustomerServices {

    String accountHolderName;
    long addharId;
    String panId;
    String address;
    long contactNo;
    AccountServiceImpl accountServiceImpl;

    public CustomerServiceImpl(String accountHolderName, long addharId, String panId, String address, long contactNo) {
        this.accountHolderName = accountHolderName;
        this.addharId = addharId;
        this.panId = panId;
        this.address = address;
        this.contactNo = contactNo;
    }
    public CustomerServiceImpl(String accountHolderName, long addharId, String panId, String address, long contactNo, AccountServiceImpl accountServiceImpl) {
        this.accountHolderName = accountHolderName;
        this.addharId = addharId;
        this.panId = panId;
        this.address = address;
        this.contactNo = contactNo;
        this.accountServiceImpl = accountServiceImpl;

    }



    @Override
    public void details() {
        System.out.println("=============Account holder Details ===========");
        System.out.println("Name  : " + this.accountHolderName);
        System.out.println("Aadhar Id : " + this.addharId);
        System.out.println("Pan Id : " + this.panId);
        accountServiceImpl.getDetails();


    }

    @Override
    public void updateAddress(String address) {
        this.address = address;
        System.out.println("Address has been updated to : " + this.address);
    }

    @Override
    public void updateMobile(long contactNo) {
        this.contactNo = contactNo;
        System.out.println("Contact number has been updated to : " + this.contactNo);
    }
}
