package com.serega.practice.module10.task04;


import java.io.IOException;

public class FGMethods {

    public static void f() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();


    }

    public static void g() throws IOException {
        try {
            f();

        } catch (ArrayIndexOutOfBoundsException newexception) {
            System.out.println("Исключение ArrayIndexOutOfBoundsException  в методе \"f\" поймано!!!");
            try {
                throw new IOException();
            } catch (IOException io) {
                System.out.println("Исключение IOException  в методе \"f\" поймано!!!");
            } finally {
                System.out.println("Everythings is okay!!!");
            }
        } finally {
            System.out.println("Everythings is okay!!!");
        }
    }

    public static void main(String[] args) throws IOException {
        g();
    }

}
