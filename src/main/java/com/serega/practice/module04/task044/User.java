package com.serega.practice.module04.task044;


import com.serega.practice.module04.task041.Bank;

public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "=========================================================" + "\n" +
                "User " +
                "id: " + id + "\n" +
                "Имя: '" + name + '\'' + "\n" +
                "Баланс: " + balance + " " + getBank().getCurrency() + "\n" +
                "monthsOfEmployment: " + monthsOfEmployment + "\n" +
                "Имя компании: '" + companyName + '\'' + "\n" +
                "Зарплата: " + salary + getBank().getCurrency() + "\n" +
                "Банк: " + bank.getClass().getSimpleName() + "\n" +
                "=========================================================";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
