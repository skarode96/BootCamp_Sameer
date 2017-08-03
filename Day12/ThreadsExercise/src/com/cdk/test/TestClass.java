package com.cdk.test;

import com.cdk.tasks.PrimeGenerator;
import org.junit.Test;

/**
 * Created by karodes on 8/2/2017.
 */
public class TestClass {
    @Test
    public void test1(){
        Thread t1 = new Thread(()->{
            System.out.println(PrimeGenerator.generate(2,100));
            System.out.println(PrimeGenerator.generate(101,200));
            System.out.println(PrimeGenerator.generate(201,1000));
            System.out.println(PrimeGenerator.generate(1001,2000));
        });
        t1.start();
     }

}
