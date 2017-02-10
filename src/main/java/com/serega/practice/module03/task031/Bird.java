package com.serega.practice.module03.task031;


public class Bird {

    private final String TEXT = "I'm walking\nI'm flying\nI'm signing\nI'm Bird";
    private String name;


    public Bird(){
    }

    public Bird(String name){
        this.name = name;
        System.out.println("I'm "+name);
    }

    public void sign(){
        System.out.println(TEXT);
        System.out.println();
    }

    public static void main(String[] args) {

        Bird birdwithoutname = new Bird();
        birdwithoutname.sign();


        Bird gosha = new Bird("Gosha");
        gosha.sign();

    }
}
