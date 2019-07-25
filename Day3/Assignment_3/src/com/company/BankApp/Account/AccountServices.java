package com.company.BankApp.Account;

/**
 * Created by karodes on 7/16/2017.
 */
public interface AccountServices {

    void open(double balance, long accountNumber, String accountType);
    void close();
    void withdraw(double withdrawAmount);
    void deposit(double depositAmount);
    void balance();
    void getDetails();
}
