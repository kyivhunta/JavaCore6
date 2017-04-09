package com.serega.practice.module10.task01;


public class Main {
    public Main(String string) throws Exception {
        if (string instanceof String) throw new Exception(string);
    }

    public static void main(String[] args) {


        try {
            Main main = new Main("---SSSSSSSS---");
        } catch (Exception e) {
            System.out.println("!!!!Ошибка!!!! Aргумент коструктора Main являеться обькт типа String: " + e.getMessage());
        } finally

        {
            System.out.println("Everythings is okay!!!");
        }

    }

}

