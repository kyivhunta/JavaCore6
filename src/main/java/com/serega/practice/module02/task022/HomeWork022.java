package com.serega.practice.module02.task022;


public class HomeWork022 {

    public void balance(double b, double w) {
        double ok, pers, okPers;
        ok = b - w;
        pers = (w / 100) * 5;
        okPers = ok - pers;
        String out;
        System.out.println(out = okPers >= 0 ? "OK " + pers + " " + okPers : "NO");


    }

    public static void main(String[] args) {

        HomeWork022 obj = new HomeWork022();
        obj.balance(1500, 1000);

    }
}
