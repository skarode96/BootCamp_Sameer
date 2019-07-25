package com.company.tasks;

/**
 * Created by karodes on 8/1/2017.
 */
public class TaskA implements Runnable {
    public static int count = 0;

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            sum = sum + i;
        }
        count++;
        System.out.printf("Sum : %s for Iteration %s\n", sum, count);
    }
}
