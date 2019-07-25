package com.company.array;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by karodes on 7/28/2017.
 */
public class ArrayHolder {
    int[] arr;

    public ArrayHolder(int[] arr) {
        this.arr = arr;
    }
    public void forEach(Consumer<Integer> consumer){
        for (int i:arr) {
            consumer.accept(i);
        }
    }
    public void modify(Function<Integer,Integer> function){
        for(int i=0;i<arr.length;i++) {
            arr[i] = function.apply(arr[i]);
        }
    }
    public void delete(Predicate<Integer> predicate) {
        for (int i = 0;i <arr.length;i++ ) {
            if(predicate.test(arr[i]))
                arr[i] = 0;
        }
    }
    public int fold(BiFunction<Integer,Integer,Integer> biFunction) {
        int result = arr[0];
        for (int i = 1; i < arr.length;i++) {
            result = biFunction.apply(result,arr[i]);
        }
        return result;
    }

}
