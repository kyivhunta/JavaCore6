package com.serega.practice.module03.task034;


public class WorkingUser {
    public static void main(String[] args) {

        User obj = new User("Серега", 2000, 0, "CIKLUM", 11000, "UAH");

        obj.paySalary();
        obj.withdraw(900);
        obj.monthIncreaser(6);
        obj.companyNameLenght();

    }
}
