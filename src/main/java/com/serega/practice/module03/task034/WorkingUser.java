package com.serega.practice.module03.task034;

import org.omg.CORBA.Object;

public class WorkingUser {
    public static void main(String[] args) {

        User obj = new User("Серега", 0, 0, "CIKLUM", 11000, "UAH");

        obj.paySalary();
        obj.withdraw(900);
        obj.monthIncreaser(6);

        System.out.println("Отработаные месяцы "+obj.getMonthsOfEmployment());
        System.out.println("Длинна имени компании "+obj.companyNameLenght());
        System.out.println("Баланс "+obj.getBalance()+" "+obj.getCurrency());

    }
}
