package com.serega.practice.module10.task05;

public class UseCommonEx {

    public static void testMethodForEx() throws FirstEx, SecondEx, ThirdEx {
//        throw new FirstEx("First");
        throw new SecondEx("Second");
//        throw new ThirdEx("Third");

    }

    public static void main(String[] args) {

        try {
            testMethodForEx();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
