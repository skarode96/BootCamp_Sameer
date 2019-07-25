package com.company.BankApp.Bank;

import com.company.BankApp.Account.AccountServiceImpl;
import com.company.BankApp.Customer.CustomerServiceImpl;

/**
 * Created by karodes on 7/16/2017.
 */
public class Bank {
    public static void main(String[] args) {
        AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
        accountServiceImpl.open(10000,12327853,"Savings");
        accountServiceImpl.balance();
        accountServiceImpl.deposit(24000);
        accountServiceImpl.withdraw(1000);

        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl("Sameer",123443454,"AIB1232","Mumbai",996493920,accountServiceImpl);
        customerServiceImpl.details();

    }
}
