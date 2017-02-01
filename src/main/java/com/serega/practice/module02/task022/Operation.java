package com.serega.practice.module02.task022;


public class Operation {

    public void balance(double b, double w) {
        double ok, pers, okPers;
        ok = b - w;
        pers = (w / 100) * 5;
        okPers = ok - pers;
        System.out.println(okPers >= 0 ? "OK " + pers + " " + okPers : "NO");


    }

    public static void main(String[] args) {

        Operation obj = new Operation();
        obj.balance(1500, 1000);

    }
}
