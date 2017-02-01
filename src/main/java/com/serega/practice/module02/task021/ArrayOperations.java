package com.serega.practice.module02.task021;

import java.util.Arrays;


public class ArrayOperations {
    public static void main(String[] args) {

        int[] arrayi = {-50, 35, 65, 75, 10, 370, 115, 155, 95, -205};
        double[] arrayd = {-0.32, 5.45, 6.64, 7, 10, 37.1, 11.5, 1.55, 9.5, -20.5};

        ArrayOperations obj = new ArrayOperations();

        obj.getSumArray(arrayi);
        obj.getSumArray(arrayd);

        obj.maxValArray(arrayi);
        obj.maxValArray(arrayd);

        obj.minValArray(arrayi);
        obj.minValArray(arrayd);

        obj.maxPositiveVal(arrayi);
        obj.maxPositiveVal(arrayd);

        obj.multiplationArray(arrayi);
        obj.multiplationArray(arrayd);

        obj.firstAndLastModule(arrayi);
        obj.firstAndLastModule(arrayd);

        obj.secondMax(arrayi);
        obj.secondMax(arrayd);

    }

    public void secondMax(double[] arrayi) {
        Arrays.sort(arrayi);
        System.out.println("Второй найбольший елемент масива типа double: " + arrayi[arrayi.length - 2]);
    }

    public void secondMax(int[] array) {
        Arrays.sort(array);
        System.out.println("Второй найбольший елемент масива типа int: " + array[array.length - 2]);
    }

    public void firstAndLastModule(double[] array) {
        System.out.println("Первый елемент: " + Math.abs(array[0]) + " и последний: " + Math.abs(array[array.length - 1]) + " елемент масива типа double по модулю");
    }

    public void firstAndLastModule(int[] array) {
        System.out.println("Первый елемент: " + Math.abs(array[0]) + " и последний: " + Math.abs(array[array.length - 1]) + " елемент масива типа int по модулю");
    }

    public void multiplationArray(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        System.out.println("Результат перемноженого масива типа int: " + mult);
    }

    public void multiplationArray(double[] array) {
        double mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        System.out.println("Результат перемноженого масива типа double: " + mult);
    }

    public void maxPositiveVal(int[] array) {
        int maxpos = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < 0) continue;
            if (maxpos < array[i])
                maxpos = array[i];
        }

        System.out.println(maxpos >= 0 ? "Максимальный позитивный елемент массива типа int: " + maxpos : "Все елементы масива отрицательные числа");
    }

    public void maxPositiveVal(double[] array) {
        double maxpos = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) continue;
            if (maxpos < array[i]) {
                maxpos = array[i];
            }
        }
        System.out.println(maxpos >= 0 ? "Максимальный позитивный елемент массива типа double: " + maxpos : "Все елементы масива отрицательные числа");
    }

    public void getSumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма елементов масива типа int: " + sum);
    }

    public void getSumArray(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        System.out.println("Сумма елементов масива типа double: " + sum);
    }

    public void minValArray(int[] array) {

        int minindex = array[0];

        for (int i = 1; i < array.length; i++) {

            if (minindex > array[i]) {
                minindex = array[i];
            }

        }
        System.out.println("Минимальное значение массива типа int: " + minindex);
    }

    public void minValArray(double[] array) {

        double minindex = array[0];

        for (int i = 1; i < array.length; i++) {

            if (minindex > array[i]) {
                minindex = array[i];
            }

        }
        System.out.println("Минимальное значение массива типа double: " + minindex);
    }

    public void maxValArray(int[] array) {

        int maxIndex = array[0];

        for (int i = 1; i < array.length; i++) {

            if (maxIndex < array[i]) {
                maxIndex = array[i];
            }

        }
        System.out.println("Максимальное значение масива типа int: " + maxIndex);

    }

    public void maxValArray(double[] array) {

        double maxindex = array[0];

        for (int i = 1; i < array.length; i++) {

            if (maxindex < array[i]) {
                maxindex = array[i];
            }

        }
        System.out.println("Максимальное значение масива типа double: " + maxindex);


    }

}


