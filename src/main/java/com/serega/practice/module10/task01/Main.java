package com.serega.practice.module10.task01;


public class Main {

    public static void main(String[] args) {


        try {
            throw new Exception("Исключение!!!");
        } catch (Exception e) {
            System.out.println("!!!!Ошибка!!!! " + e.getMessage());
        } finally

        {
            System.out.println("Everythings is okay!!!");
        }

    }

}

