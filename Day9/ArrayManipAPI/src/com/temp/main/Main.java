package com.temp.main;

import com.temp.array.ArrayOperation;

/**
 * Created by karodes on 7/28/2017.
 */
public class Main {
    public static void main(String[] args) {
     int[] arr = {2,3,4,5,6,7};
        ArrayOperation.operate(arr,(int[] array)->{
            for (int i:array) {
                System.out.println(i);
            }
        });
    }
}
