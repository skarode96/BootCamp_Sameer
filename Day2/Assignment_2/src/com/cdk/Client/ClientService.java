package com.cdk.Client;

import com.cdk.Bank.BankService;
import com.cdk.Customer.CustomerService;

/**
 * Created by karodes on 7/14/2017.
 */
public class ClientService {
    public static void main(String[] args) {
        CustomerService c1 = new CustomerService("BOA",15000,245003430,40,3432302,"reddy","Pune","02229294949","RAJ",23123231,"ainDFDKKKD");
        c1.display();

    }
}
