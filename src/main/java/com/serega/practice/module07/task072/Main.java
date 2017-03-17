package com.serega.practice.module07.task072;

import com.serega.practice.module07.task071.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order(1, 8000, CurrencyEnumM7.UAH, "knife", "AMAZON", new User(111111111, "Grisha", "Kolinval", "B", 5000)));
        orders.add(new Order(1, 5000, CurrencyEnumM7.USD, "knife", "AMAZON", new User(222222222, "Vasyl", "Koko", "C", 5000)));
        orders.add(new Order(3, 7000, CurrencyEnumM7.USD, "pistols", "AMAZON", new User(333333333, "Ivan", "Kardan", "A", 5000)));
        orders.add(new Order(4, 6000, CurrencyEnumM7.UAH, "granate", "AMAZON", new User(444444444, "Mykola", "Makhno", "D", 5000)));
        orders.add(new Order(5, 5500, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Igor", "Bandera", "Q", 5000)));
        orders.add(new Order(7, 6500, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Petro", "Kolinval", "D", 5000)));
        orders.add(new Order(7, 8000, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Petro", "Kolinval", "D", 5000)));


        Collections.sort(orders, new ComparatorByPriceDown());
        System.out.println(orders);

        Collections.sort(orders, new ComparatorByPriceUp$City());
        System.out.println(orders);

        Collections.sort(orders, new ComparatorByNameIdCity());
        System.out.println(orders);

        Set<Order> orderSetList = new HashSet<Order>(orders);
        System.out.println(orderSetList);


    }
}
