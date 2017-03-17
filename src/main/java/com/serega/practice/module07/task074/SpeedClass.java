package com.serega.practice.module07.task074;

import java.util.*;

public class SpeedClass {

    public final static int NANOSEC_IN_ONEMILLISEC = 1000000;

    public static void main(String[] args) {

        ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
        ArrayList arrlist2 = new ArrayList<Integer>();
        ArrayList arrlist3 = new ArrayList<String>();
        ArrayList arrlist4 = new ArrayList<String>();
        LinkedList linklist5 = new LinkedList<Integer>();
        LinkedList linklist6 = new LinkedList<Integer>();
        LinkedList linklist7 = new LinkedList<String>();
        LinkedList linklist8 = new LinkedList<String>();

        Add(arrlist1, 1000, "Integer");
        Add(arrlist2, 10000, "Integer");
        Add(arrlist3, 1000, "String");
        Add(arrlist4, 10000, "String");
        Add(linklist5, 1000, "Integer");
        Add(linklist6, 10000, "Integer");
        Add(linklist7, 1000, "String");
        Add(linklist8, 10000, "String");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        Get(arrlist1);
        Get(arrlist2);
        Get(arrlist3);
        Get(arrlist4);
        Get(linklist5);
        Get(linklist6);
        Get(linklist7);
        Get(linklist8);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        Set(arrlist1);
        Remove(arrlist1);
        Set(arrlist2);
        Remove(arrlist2);
        Set(arrlist3);
        Remove(arrlist3);
        Set(arrlist4);
        Remove(arrlist4);
        Set(linklist5);
        Remove(linklist5);
        Set(linklist6);
        Remove(linklist6);
        Set(linklist7);
        Remove(linklist7);
        Set(linklist8);
        Remove(linklist8);
        System.out.println("------------------------------------------------------------------------------------------------------------");


    }

    public static void Add(List list, int capacity, String StringOrInteger) {


        if (!(list.isEmpty())) {
            System.out.println("!!!!!!!!!!!СПИСОК НЕ ПУСТОЙ!!!!!!!!!!!");
            return;
        }

        if (!StringOrInteger.equals("String") && !StringOrInteger.equals("Integer")) {
            System.out.println("WRONG DATATYPE!!! Input: String or Integer");
            return;
        }

        if (StringOrInteger.equals("Integer")) {
            long start = System.nanoTime();
            for (int i = 0; i < capacity; i++) {

                list.add(i);

            }
            long finish = System.nanoTime();

            long deltananosec = finish - start;
            double deltamillisec = ((double) finish - start) / NANOSEC_IN_ONEMILLISEC;

            System.out.println("ADD OPERATION --> [Integer] " + (list instanceof ArrayList ? "ArrayList" : "LinkedList") + " with " + capacity + " elements: " + deltananosec + "  nanoseconds, It's: " + deltamillisec + " milliseconds");
        }

        if (StringOrInteger.equals("String")) {
            long start = System.nanoTime();
            for (int i = 0; i < capacity; i++) {

                list.add("add" + i);

            }
            long finish = System.nanoTime();

            long deltananosec = finish - start;
            double deltamillisec = ((double) finish - start) / NANOSEC_IN_ONEMILLISEC;

            System.out.println("ADD OPERATION --> [String] " + (list instanceof ArrayList ? "ArrayList" : "LinkedList") + " with " + capacity + " elements: " + deltananosec + "  nanoseconds, It's: " + deltamillisec + " milliseconds");
        }


    }

    public static void Set(List list) {

        if (list.isEmpty()) {
            System.out.println("!!!!!!!!!!!СПИСОК ПУСТОЙ!!!!!!!!!!!");
            return;
        }

        if (list.get(0) instanceof Integer) {
            long start = System.nanoTime();
            for (int i = 0; i < list.size(); i++) {

                list.set(i, i + 1);

            }
            long finish = System.nanoTime();

            long deltananosec = finish - start;
            double deltamillisec = ((double) finish - start) / NANOSEC_IN_ONEMILLISEC;

            System.out.println("SET OPERATION --> [Integer] " + (list instanceof ArrayList ? "ArrayList" : "LinkedList") + " with " + list.size() + " elements: " + deltananosec + "  nanoseconds, It's: " + deltamillisec + " milliseconds");
        }

        if (list.get(0) instanceof String) {
            long start = System.nanoTime();
            for (int i = 0; i < list.size(); i++) {

                list.set(i, "set" + i);

            }
            long finish = System.nanoTime();

            long deltananosec = finish - start;
            double deltamillisec = ((double) finish - start) / NANOSEC_IN_ONEMILLISEC;

            System.out.println("SET OPERATION --> [String] " + (list instanceof ArrayList ? "ArrayList" : "LinkedList") + " with " + list.size() + " elements: " + deltananosec + "  nanoseconds, It's: " + deltamillisec + " milliseconds");
        }


    }

    public static void Remove(List list) {

        if (list.isEmpty()) {
            System.out.println("!!!!!!!!!!!СПИСОК ПУСТОЙ!!!!!!!!!!!");
            return;
        }

        int sizelist = list.size();
        String ClassNameofElementInList = list.get(0).getClass().getSimpleName();

        Iterator iterator = list.iterator();


        long start = System.nanoTime();
        while (iterator.hasNext()) {

            iterator.next();
            iterator.remove();

        }
        long finish = System.nanoTime();

        long deltananosec = finish - start;
        double deltamillisec = ((double) finish - start) / NANOSEC_IN_ONEMILLISEC;

        System.out.println("REMOVE OPERATION -->  " + ClassNameofElementInList + " " + (list instanceof ArrayList ? "ArrayList" : "LinkedList") + " with " + sizelist + " elements: " + deltananosec + "  nanoseconds, It's: " + deltamillisec + " milliseconds");

    }

    public static void Get(List list) {

        if (list.isEmpty()) {
            System.out.println("!!!!!!!!!!!СПИСОК ПУСТОЙ!!!!!!!!!!!");
            return;
        }

        String ClassNameofElementInList = list.get(0).getClass().getSimpleName();

        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long finish = System.nanoTime();

        long deltananosec = finish - start;
        double deltamillisec = ((double) finish - start) / NANOSEC_IN_ONEMILLISEC;

        System.out.println("GET OPERATION -->  " + ClassNameofElementInList + " " + (list instanceof ArrayList ? "ArrayList" : "LinkedList") + " with " + list.size() + " elements: " + deltananosec + "  nanoseconds, It's: " + deltamillisec + " milliseconds");


    }

}
