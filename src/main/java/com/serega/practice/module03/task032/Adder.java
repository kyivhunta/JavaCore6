package com.serega.practice.module03.task032;


public class Adder extends Arithmetic {

    boolean check(Integer a, Integer b) {
        if (a >= b) return true;
        else return false;
    }


    public static void main(String[] args) {

        Adder obj = new Adder();
        System.out.println(obj.add(5, 5) + "\n" + obj.check(5, 6));


    }

}
