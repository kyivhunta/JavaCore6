package com.serega.practice.module10.task03;


public class NullReference {


    public static void main(String[] args) {

        try {

            String name = null;
            name.length();

        } catch (NullPointerException n) {

            System.out.println("Исключение поймано ваше величество");
        } finally {
            System.out.println("Sir, Yes Sir");
        }

    }

}
