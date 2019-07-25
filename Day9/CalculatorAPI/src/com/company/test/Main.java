package com.company.test;

import com.company.api.CalculatorService;

/**
 * Created by karodes on 7/28/2017.
 */
public class Main {
    public static void main(String[] args) {

        CalculatorService.doCalculate(23,34,(int num1, int num2) -> {System.out.println(num1+num2);} );
        CalculatorService.doCalculate(23,34,(int num1, int num2) -> {System.out.println(num1-num2);} );

//        CalculatorService.doCalculate(num1,num2,((int num1, num21) -> {System.out.println(num1-num2);}));

    }
}
