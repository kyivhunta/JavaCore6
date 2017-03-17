package com.serega.practice.module07.task071;


import java.util.Comparator;

public final class ComparatorByNameIdCity implements Comparator<Order> {

    public int compare(Order o1, Order o2) {

        int result = o1.getItemName().compareTo(o2.getItemName());
        if (result != 0) return result;
        result = Long.valueOf(o1.getId()).compareTo(o2.getId());
        if (result != 0) return result;
        result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
        if (result != 0) return result;

        return result;

    }

}