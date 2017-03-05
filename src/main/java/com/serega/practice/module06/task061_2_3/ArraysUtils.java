package com.serega.practice.module06.task061_2_3;


import java.util.Arrays;

public final class ArraysUtils {


    public static void secondMax(int[] array) {
        Arrays.sort(array);
        System.out.println("Второй найбольший елемент масива типа int: " + array[array.length - 2]);
    }

    public static void firstAndLastModule(int[] array) {
        System.out.println("Первый елемент: " + Math.abs(array[0]) + " и последний: " + Math.abs(array[array.length - 1]) + " елемент масива типа int по модулю");
    }

    public static void multiplationArray(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        System.out.println("Результат перемноженого масива типа int: " + mult);
    }

    public static void maxPositiveVal(int[] array) {
        int maxpos = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < 0) continue;
            if (maxpos < array[i])
                maxpos = array[i];
        }

        System.out.println(maxpos >= 0 ? "Максимальный позитивный елемент массива типа int: " + maxpos : "Все елементы масива отрицательные числа");
    }

    public static void getSumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма елементов масива типа int: " + sum);
    }

    public static void minValArray(int[] array) {

        int minindex = array[0];

        for (int i = 1; i < array.length; i++) {

            if (minindex > array[i]) {
                minindex = array[i];
            }

        }
        System.out.println("Минимальное значение массива типа int: " + minindex);
    }

    public static void maxValArray(int[] array) {

        int maxIndex = array[0];

        for (int i = 1; i < array.length; i++) {

            if (maxIndex < array[i]) {
                maxIndex = array[i];
            }

        }
        System.out.println("Максимальное значение масива типа int: " + maxIndex);

    }

    public static int[] reverse(int[] array) {

        int[] finalarray = new int[0];

        for (int i = array.length - 1; i >= 0; i--) {
            finalarray = newElementToArray(finalarray, array[i]);
        }

        return finalarray;
    }

    public static int[] findEvenElements(int[] array) {

        int[] finalArray = new int[0];

        for (int i : array) {
            if (i % 2 == 0) finalArray = newElementToArray(finalArray, i);
        }

        return finalArray;
    }

    public static int[] newElementToArray(int[] array, int newelement) {

        int[] copyarray = new int[array.length + 1];
        System.arraycopy(array, 0, copyarray, 0, array.length);
        copyarray[copyarray.length - 1] = newelement;
        return copyarray;

    }


}




