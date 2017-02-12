package com.serega.practice.module03.task034;


public class User {

    public static final double FIVEPERSENT = 0.05, TENPERSENT = 0.1;
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary() {

        balance += salary;
        System.out.println(" -------------------------------------------------------------------\n"+
                "|"+"  Вам начислили ЗП в размере: "+salary+", Ваш баланс составляет: "+balance+"  |\n"+
                "|            =======================================                |\n" +
                "|            == \"ПриватБанк\" - банк №1 в Україні ==                |\n"+
                "|            =======================================                |\n"+
                "|                                                                   |\n"+
                " -------------------------------------------------------------------\n"   );

    }

    public void withdraw(int summ) {

        double pers;

        if ((balance-summ-(summ*summ<1000?FIVEPERSENT:TENPERSENT)<0)) {
            System.out.println(" -------------------------------------------------------------\n"+
                    "|  Невозможно провести транзакцию, не достатточно средств!!!  |\n"+
                    "|            =======================================          |\n" +
                    "|            == \"ПриватБанк\" - банк №1 в Україні ==          |\n"+
                    "|            =======================================          |\n"+
                    "|                                                             |\n"+
                    " -------------------------------------------------------------\n"   );
            }

            else if (summ < 1000) {
            balance -= summ;
            pers = summ * FIVEPERSENT;
            balance -= pers;
            System.out.println(" -------------------------------------------------------------\n"+
                    "|"+"  Сума снятия: "+summ+currency+" Комисия 5% "+"Остаток на счету: "+balance+currency+"  |\n"+
                    "|            =======================================          |\n" +
                    "|            == \"ПриватБанк\" - банк №1 в Україні ==          |\n"+
                    "|            =======================================          |\n"+
                    "|                                                             |\n"+
                    " -------------------------------------------------------------\n"   );

        }   else {
            balance -= summ;
            pers = summ * TENPERSENT;
            balance -= pers;
            System.out.println(" ---------------------------------------------------------------\n"+
                    "|"+"  Сума снятия: "+summ+currency+" Комисия 10% "+"Остаток на счету: "+balance+currency+"  |\n"+
                    "|            =======================================            |\n" +
                    "|            == \"ПриватБанк\" - банк №1 в Україні ==            |\n"+
                    "|            =======================================            |\n"+
                    "|                                                               |\n"+
                    " ---------------------------------------------------------------\n"   );

        }


    }

    public void companyNameLenght() {

        System.out.println("Длинна имени компании: "+companyName.length()+" символов");
    }

    public void monthIncreaser(int addMonth) {

        monthsOfEmployment += addMonth;
        System.out.println("Отработаные месяцы: "+monthsOfEmployment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
