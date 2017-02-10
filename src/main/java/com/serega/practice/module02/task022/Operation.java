package com.serega.practice.module02.task022;



public class Operation {

    final double  FIVEPERSENT = 0.05;

    public void balance(double b, double w) {
        double ok, pers, okPers;
        ok = b - w;
        pers = w *FIVEPERSENT;
        okPers = ok - pers;
        System.out.println(okPers >= 0 ? "OK " + pers + " " + okPers : "NO");


    }

    public static void main(String[] args) {

        Operation obj = new Operation();
        obj.balance(100, 20);

    }
}
