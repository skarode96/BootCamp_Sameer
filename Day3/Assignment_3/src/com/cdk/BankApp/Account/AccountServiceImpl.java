package com.cdk.BankApp.Account;

/**
 * Created by karodes on 7/16/2017.
 */
public class AccountServiceImpl implements AccountServices{
    double balance;
    long accountNumber;
    String accountType;

    public AccountServiceImpl() {
        this.balance = 0;
        this.accountNumber = 0;
        this.accountType = "";
    }

    @Override
    public void open(double balance, long accountNumber, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        System.out.println("======Account has been created succesfully======");
    }

    @Override
    public void close() {
        System.out.println("Account has been deactivated");
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > this.balance) {
            System.out.println("Insufficient balance to withdraw money from the account");
        }
        else {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Amount of : " + withdrawAmount  + " has been withdrawned");
            System.out.println("Updated Balance : " + this.balance);
        }
    }

    @Override
    public void deposit(double depositAmount) {
        if(depositAmount > 0) {
            this.balance = this.balance + depositAmount;
            System.out.println("account is credited with : " + depositAmount +" ");
            System.out.println("Updated balance : " + this.balance);
        }
    }

    @Override
    public void balance() {
        System.out.println("Your Balance : " + this.balance);
    }

    @Override
    public void getDetails() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type : " + this.accountType);
        System.out.println("Account balance : " + this.balance);
    }
}
