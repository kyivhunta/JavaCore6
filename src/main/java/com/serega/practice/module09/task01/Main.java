package com.serega.practice.module09.task01;

import com.serega.practice.module07.task071.CurrencyEnumM7;
import com.serega.practice.module07.task071.Order;
import com.serega.practice.module07.task071.User;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 8000, CurrencyEnumM7.UAH, "knife", "AMAZON", new User(111111111, "Grisha", "Kolinval", "B", 5000)));
        orders.add(new Order(1, 8000, CurrencyEnumM7.USD, "knife", "AMAZON", new User(222222222, "Vasyl", "Koko", "C", 5000)));
        orders.add(new Order(3, 8000, CurrencyEnumM7.USD, "pistols", "AMAZON", new User(333333333, "Ivan", "Kardan", "A", 5000)));
        orders.add(new Order(4, 6000, CurrencyEnumM7.UAH, "granate", "AMAZON", new User(444444444, "Mykola", "Makhno", "D", 5000)));
        orders.add(new Order(5, 1000, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Igor", "Bandera", "Q", 5000)));
        orders.add(new Order(7, 1100, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Petro", "Kolinval", "D", 5000)));
        orders.add(new Order(7, 8000, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Petro", "Kolinval", "D", 5000)));
        orders.add(new Order(7, 1100, CurrencyEnumM7.USD, "granate", "AMAZON", new User(444444444, "Petro", "Kolinval", "D", 5000)));

        UniqueOrders(orders);
        sortedByPriceDown(orders);
        SortedByPriceUp$City(orders);
        OrdersWithPriceLessThan(orders, 1500);
        OrdersWithUAH(orders);
        OrdersWithUSD(orders);
        OrdersWithCityName(orders, "D");
        containsName(orders, "Bandera");
        deleteUSD(orders);


    }

    public static void deleteUSD(List<Order> orders) {
        List<Order> deleteUSD = orders.stream()
                .filter(order -> !order.getCurrency().equals(CurrencyEnumM7.USD))
                .collect(Collectors.toList());
        System.out.println(deleteUSD);
    }

    public static void containsName(List<Order> orders, String name) {
        List<Order> nameList = new ArrayList<>(orders);
        boolean b = nameList.stream()
                .anyMatch(order -> order.getUser().getLastName().equals(name));
        System.out.println(b);

    }

    public static void SortedByPriceUp$City(List<Order> orders) {
        List<Order> sortedByPriceUp$City = new ArrayList<>(orders);
        sortedByPriceUp$City.sort(Comparator.comparing(Order::getPrice)
                .thenComparing(order -> order.getUser().getCity()));

        System.out.println(sortedByPriceUp$City);
    }

    public static void sortedByPriceDown(List<Order> orders) {
        List<Order> sortedByPriceDown = new ArrayList<>(orders);
        sortedByPriceDown.sort(Comparator.comparingInt(Order::getPrice).reversed());
        System.out.println(sortedByPriceDown);
    }

    public static void UniqueOrders(List<Order> orders) {
        List<Order> newList = new ArrayList<>(orders);
        System.out.println(newList.stream().collect(Collectors.toSet()));

    }

    public static void OrdersWithUSD(List<Order> orders) {
        List<Order> listUSD = orders.stream()
                .filter((a) -> a != null && a.getCurrency().equals(CurrencyEnumM7.USD))
                .collect(Collectors.toList());

        System.out.println(listUSD);
    }

    public static void OrdersWithUAH(List<Order> orders) {
        List<Order> listUAH = orders.stream()
                .filter((a) -> a != null && a.getCurrency().equals(CurrencyEnumM7.UAH))
                .collect(Collectors.toList());

        System.out.println(listUAH);
    }

    public static void OrdersWithPriceLessThan(List<Order> orders, int price) {
        List<Order> tmpList = orders.stream()
                .filter((a) -> a != null && a.getPrice() < price)
                .collect(Collectors.toList());

        System.out.println(tmpList);
    }

    public static void OrdersWithCityName(List<Order> orders, String cityName) {
        List<Order> tmpList = orders.stream()
                .filter((a) -> a != null && a.getUser().getCity().equals(cityName))
                .collect(Collectors.toList());

        System.out.println(tmpList);
    }

}
