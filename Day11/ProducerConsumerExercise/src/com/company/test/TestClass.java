package com.company.test;

import org.junit.Test;

/**
 * Created by karodes on 7/31/2017.
 */
public class TestClass {
    public int i = 0;

    @Test
    public void test1() {
        Thread incrementorWorker = new Thread(() -> {
            int j = 0;
            while (j < 200000000) {
                TestClass.this.i++;
                j++;
            }
        });

        Thread displayWorker = new Thread(() -> {
            int j = 0;
            while (j < 20000) {
                System.out.println("Value of i : " + this.i);
                j++;
            }
        });
        incrementorWorker.start();
        displayWorker.start();
    }
}
