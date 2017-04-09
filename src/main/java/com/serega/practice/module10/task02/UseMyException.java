package com.serega.practice.module10.task02;

public class UseMyException {

    private static final int CONST = 11;

    public static void testException() throws MyException {

        if (CONST%2!=0)throw new MyException("ATTENTION");

    }

    public static void main(String[] args) {

        try {
            testException();
        } catch (MyException e) {
            System.out.println(e.reference);
        }
        finally {
            System.out.println("EVERYTHING IS OKAY");
        }

    }
}
