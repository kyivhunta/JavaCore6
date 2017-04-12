package com.serega.practice.module10.task02;

public class UseMyException {


    public static void testException() throws MyException {

        throw new MyException("ATTENTION");

    }

    public static void main(String[] args) {

        try {
            testException();
        } catch (MyException e) {
            System.out.println(e.getReference());
        } finally {
            System.out.println("EVERYTHING IS OKAY");
        }

    }
}
