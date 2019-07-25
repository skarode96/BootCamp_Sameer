package com.company.comparators;

import com.company.car.Car;

import java.util.Comparator;

/**
 * Created by karodes on 7/25/2017.
 */
public class PriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
