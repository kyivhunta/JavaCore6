package com.serega.practice.module07.task073;

import com.serega.practice.module07.task071.*;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        TreeSet<Order> orderSet = new TreeSet<Order>(new ComparatorByPriceDown());

        orderSet.add(new Order(1, 9000, CurrencyEnumM7.UAH, "knife", "AMAZON", new User(111, "Grisha", "Kolinval", "B", 5000)));
        orderSet.add(new Order(1, 8000, CurrencyEnumM7.UAH, "knife", "AMAZON", new User(222, "Vasyl", "Koko", "C", 5000)));
        orderSet.add(new Order(3, 4000, CurrencyEnumM7.USD, "pistols", "EBAY", new User(333, "Ivan", "Petrov", "A", 5000)));
        orderSet.add(new Order(4, 3000, CurrencyEnumM7.USD, "granate", "AMAZON", new User(555, "Petro", "Kolinval", "D", 5000)));
        orderSet.add(new Order(4, 3000, CurrencyEnumM7.USD, "granate", "AMAZON", new User(555, "Petro", "Kolinval", "D", 5000)));
        orderSet.add(new Order(6, 7000, CurrencyEnumM7.USD, "RPG-7", "EBAY", new User(666, "Petro", "Petrov", "D", 5000)));
        orderSet.add(new Order(7, 4800, CurrencyEnumM7.USD, "pistols", "AMAZON", new User(777, "Sanya", "Kuzin", "D", 5000)));
        orderSet.add(new Order(8, 20000, CurrencyEnumM7.USD, "Barret", "EBAY", new User(888, "Igor", "Karpov", "D", 5000)));
        orderSet.add(new Order(9, 3500, CurrencyEnumM7.USD, "granate", "AMAZON", new User(999, "Petro", "Kolinval", "Q", 5000)));

        System.out.println(orderSet);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        for (Order order : orderSet) {

            if (order.getUser().getLastName() == "Petrov") System.out.println(order);

        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        Order testorder = new Order(1L, 0, CurrencyEnumM7.USD, "something", "someshop", new User(1, "A", "A", "A", 0));

        for (Order order : orderSet) {

            if (order.getPrice() >= testorder.getPrice())

                testorder = order;

        }
        System.out.println(testorder);


        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()) {

            Order order = iterator.next();

            if (order.getCurrency() == CurrencyEnumM7.USD) {

                iterator.remove();
            }

        }

        System.out.println(orderSet);

    }

}
