package com.cdk.Account;

/**
 * Created by karodes on 7/14/2017.
 */
public class AccountService {
    double balance;
    long accountNumber;
    String accountType;

    public AccountService() {

    }

    public AccountService(double balance, long accountNumber, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }


    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void display() {
        System.out.println("Balance : " + this.balance);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type : " + this.accountType);
    }

   public void withdrawMoney (double money) {
        if(money > this.balance) {
            System.out.println("Insufficient balance to withdraw money from the account");
        }
        else {
            this.balance = this.balance - money;
            System.out.println("Amount of : " + money + " has been withdrawned");
        }
    }

   public void depositMoney (double money) {
        if(money > 0) {
            this.balance = this.balance + money;
            System.out.println("account is credited with : " + money +" ");
            System.out.println("Updated balance : " + this.balance);
        }
    }


}
