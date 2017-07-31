package com.cdk.array;

import org.junit.Test;

import java.lang.reflect.Array;

/**
 * Created by karodes on 7/28/2017.
 */
public class TestAPI {
    @Test
    public void test1(){
        int[] arr = {34,23,123,5,7,78};
        ArrayHolder arrayHolder = new ArrayHolder(arr);
//        ArrayHolder arrayHolder = new ArrayHolder(arr);
        arrayHolder.forEach( (Integer num) -> System.out.println(num));
        display(arr);

    }
    @Test
    public void test2(){
        int[] arr = {34,23,123,5,7,78};
        ArrayHolder arrayHolder = new ArrayHolder(arr);
        arrayHolder.modify((Integer num)-> num*num);
        display(arr);
    }

    @Test
    public void test3(){
        int[] arr = {34,23,123,5,7,78};
        ArrayHolder arrayHolder = new ArrayHolder(arr);
        arrayHolder.delete((Integer num)-> num < 25);
        display(arr);
    }
    @Test
    public void test4(){
        int[] arr = {1,2,3,4};
        ArrayHolder arrayHolder = new ArrayHolder(arr);
        System.out.println(arrayHolder.fold((Integer num1,Integer num2)-> num1+num2));
    }
    private void display(int[] arr) {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println("=======");
    }
}
