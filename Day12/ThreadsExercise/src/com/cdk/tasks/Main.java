package com.cdk.tasks;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.*;

/**
 * Created by karodes on 8/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> sum1 = executor.submit(primeCallable(2, 100));
        Future<Integer> sum2 = executor.submit(primeCallable(101, 200));
        Future<Integer> sum3 = executor.submit(primeCallable(201, 300));
        Future<Integer> sum4 = executor.submit(primeCallable(301, 400));
        Future<Integer> sum5 = executor.submit(primeCallable(401, 500));

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

    @NotNull
    private static Callable<Integer> primeCallable(int lowerBound, int upperBound) {
        return () -> {
            int sum = PrimeGenerator.generate(lowerBound, upperBound).stream().reduce((num1, num2) -> num1 + num2).get();
            return sum;
        };
    }
}
