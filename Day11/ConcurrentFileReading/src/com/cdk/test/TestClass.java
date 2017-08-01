package com.cdk.test;

import com.cdk.threads.FileReader1;
import com.cdk.threads.FileReader2;
import org.junit.Test;

/**
 * Created by karodes on 7/31/2017.
 */
public class TestClass {
    @Test
    public void test1(){
        Thread thread1 = new Thread(new FileReader1());
        Thread thread2 = new Thread(new FileReader2());
        thread1.start();
        thread2.start();
    }

}
