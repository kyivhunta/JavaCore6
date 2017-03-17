package com.serega.practice.module07.task071;


import java.util.Comparator;

public final class ComparatorByPriceUp$City implements Comparator<Order> {

    public int compare(Order o1, Order o2) {
        int result = Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
        if (result != 0) return result;
        else {
            result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return result;
        }
    }
}
