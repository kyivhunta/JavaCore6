package com.serega.practice.module02.task021;

import java.util.Arrays;


public class HomeWork021 {
    public static void main(String[] args) {

        int[] arrayi = {-50, 35, 65, 75, 10, 370, 115, 155, 95, -205};
        double[] arrayd = {-0.32, 5.45, 6.64, 7, 10, 37.1, 11.5, 1.55, 9.5, -20.5};

        HomeWork021 obj1 = new HomeWork021();
        obj1.getSumArray(arrayi);
        HomeWork021 obj11 = new HomeWork021();
        obj11.getSumArray(arrayd);

        HomeWork021 obj2 = new HomeWork021();
        obj2.maxValArray(arrayi);
        HomeWork021 obj21 = new HomeWork021();
        obj21.maxValArray(arrayd);

        HomeWork021 obj3 = new HomeWork021();
        obj3.minValArray(arrayi);
        HomeWork021 obj31 = new HomeWork021();
        obj31.minValArray(arrayd);

        HomeWork021 obj4 = new HomeWork021();
        obj4.maxPositiveVal(arrayi);
        HomeWork021 obj41 = new HomeWork021();
        obj41.maxPositiveVal(arrayd);

        HomeWork021 obj5 = new HomeWork021();
        obj5.multiplationArray(arrayi);
        HomeWork021 obj51 = new HomeWork021();
        obj51.multiplationArray(arrayd);

        HomeWork021 obj6 = new HomeWork021();
        obj6.firstAndLastModule(arrayi);
        HomeWork021 obj61 = new HomeWork021();
        obj61.firstAndLastModule(arrayd);

        HomeWork021 obj7 = new HomeWork021();
        obj7.secondMax(arrayi);
        HomeWork021 obj71 = new HomeWork021();
        obj71.secondMax(arrayd);

    }

    public void secondMax(double[] arrayi) {
        Arrays.sort(arrayi);

        int secondMax = arrayi.length - 1;
        for (int i = arrayi.length - 1, s = arrayi.length - 2; i > 1; i--, s--) {

            if (arrayi[secondMax] == arrayi[s]) continue;
            else secondMax = s;
            break;
        }
        System.out.println("Второй найбольший елемент масива типа double: " + arrayi[secondMax]);
    }

    public void secondMax(int[] array) {
        Arrays.sort(array);

        int secondMax = array.length - 1;
        for (int i = array.length - 1, s = array.length - 2; i > 1; i--, s--) {

            if (array[secondMax] == array[s]) continue;
            else secondMax = s;
            break;
        }
        System.out.println("Второй найбольший елемент масива типа int: " + array[secondMax]);
    }

    public void firstAndLastModule(double[] array) {
        System.out.println("Первый елемент: " + Math.abs(array[0]) + " и оследний: " + Math.abs(array[array.length - 1]) + " елемент масива типа double по модулю");
    }

    public void firstAndLastModule(int[] array) {
        System.out.println("Первый елемент: " + Math.abs(array[0]) + " и оследний: " + Math.abs(array[array.length - 1]) + " елемент масива типа int по модулю");
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
            if (maxpos < array[i]) {
                maxpos = array[i];
            }
        }
        System.out.println("Максимальный позитивный елемент массива типа int: " + maxpos);
    }

    public void maxPositiveVal(double[] array) {
        double maxpos = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) continue;
            if (maxpos < array[i]) {
                maxpos = array[i];
            }
        }
        System.out.println("Максимальный позитивный елемент массива типа double: " + maxpos);
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

        int minindex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[minindex] > array[i]) {
                minindex = i;
            }

        }
        System.out.println("Минимальное значение массива типа int: " + array[minindex]);
    }

    public void minValArray(double[] array) {

        int minindex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[minindex] > array[i]) {
                minindex = i;
            }

        }
        System.out.println("Минимальное значение массива типа double: " + array[minindex]);
    }

    public void maxValArray(int[] array) {

        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }

        }
        System.out.println("Максимальное значение масива типа int: " + array[maxIndex]);

    }

    public void maxValArray(double[] array) {

        int maxindex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[maxindex] < array[i]) {
                maxindex = i;
            }

        }
        System.out.println("Максимальное значение масива типа double: " + array[maxindex]);


    }

}


