package com.serega.practice.module07.task071;

import java.util.Comparator;

public final class ComparatorByPriceDown implements Comparator<Order> {

    public int compare(Order o1, Order o2) {
        return Integer.valueOf(o2.getPrice()).compareTo(Integer.valueOf(o1.getPrice()));
    }
}



