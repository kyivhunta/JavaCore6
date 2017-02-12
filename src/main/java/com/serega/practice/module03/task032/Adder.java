package com.serega.practice.module03.task032;


public class Adder extends Arithmetic {

    public boolean check(Integer a, Integer b) {
        return a >= b;
    }

    public static void main(String[] args) {

        Adder obj = new Adder();
        System.out.println(obj.add(5, 5) + "\n" + obj.check(5, 6));

    }
}
