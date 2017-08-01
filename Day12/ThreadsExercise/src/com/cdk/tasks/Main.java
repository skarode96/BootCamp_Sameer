package com.cdk.tasks;

import java.util.concurrent.*;

/**
 * Created by karodes on 8/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> sum1 = executor.submit(() -> {
            int sum = PrimeGenerator.generate(2, 100).stream().reduce((num1, num2) -> num1 + num2).get();
            return sum;
        });
        Future<Integer> sum2 = executor.submit(() -> {
            int sum = PrimeGenerator.generate(101, 200).stream().reduce((num1, num2) -> num1 + num2).get();
            return sum;
        });
        Future<Integer> sum3 = executor.submit(() -> {
            int sum = PrimeGenerator.generate(201, 300).stream().reduce((num1, num2) -> num1 + num2).get();
            return sum;
        });
        Future<Integer> sum4 = executor.submit(() -> {
            int sum = PrimeGenerator.generate(301, 400).stream().reduce((num1, num2) -> num1 + num2).get();
            return sum;
        });
        Future<Integer> sum5 = executor.submit(() -> {
            int sum = PrimeGenerator.generate(401, 500).stream().reduce((num1, num2) -> num1 + num2).get();
            return sum;
        });

        try {
            int total = sum1.get() + sum2.get() + sum3.get() + sum4.get() + sum5.get();
            System.out.printf("Sum of all task is : %s\n", total);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (CancellationException e) {
            e.printStackTrace();
        }
    }
}
