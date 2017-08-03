package com.cdk.tasks;

import java.util.ArrayList;

/**
 * Created by karodes on 8/1/2017.
 */
public class PrimeGenerator {

    public static ArrayList<Integer> generate(int lowerBound, int upperBound) {
        ArrayList<Integer> primeList = new ArrayList<>(100);
        boolean flag;
        for (int n = lowerBound; n < upperBound; n++) {
            flag = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                primeList.add(n);
            }
        }
        return primeList;
    }
}
