package com.serega.practice.module04.task045;


import com.serega.practice.module04.task044.User;

public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {

        if (user.getBank().getLimitOfWithdrawal() < amount)
            System.out.println(user.getName()+", лимит снятия: " + user.getBank().getLimitOfWithdrawal() + " " + user.getBank().getCurrency()+"! Повторите попытку!");
        else {
            user.setBalance(user.getBalance() - amount);
            System.out.println(user.getName()+", транзакция успешна! Снято с баланса: " + amount + " " + user.getBank().getCurrency());
        }

    }

    public void fundUser(User user, int amount) {

        if (user.getBank().getLimitOfFunding() < amount)
            System.out.println("Лимит пополнения: " + user.getBank().getLimitOfFunding() + " " + user.getBank().getCurrency()+"! Повторите попытку!");
        else {
            user.setBalance(user.getBalance() + amount);
            System.out.println(user.getName()+", транзакция успешна! Зачислено на баланс: " + amount + " " + user.getBank().getCurrency());
        }

    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance() - amount - (amount / 100 * fromUser.getBank().getCommission(amount)) < 0) {
            System.out.println("Не достаточно средств на счету для перевода!");
        } else {
            fromUser.setBalance(fromUser.getBalance() - amount - (amount / 100 * fromUser.getBank().getCommission(amount)));
            toUser.setBalance(toUser.getBalance() + amount);
            System.out.println(fromUser.getName()+", транзакция успешна! Переведено: " + amount + " " + fromUser.getBank().getCurrency() + " на счет " + toUser.getName() + "(я)");

        }

    }

    public void paySalary(User user) {

        user.setBalance(user.getBalance() + user.getSalary() + user.getBank().moneyPaidMonthlyForSalary());

        System.out.println(user.getName()+", Вам начислили ЗП в размере " + user.getSalary() + " " + user.getBank().getCurrency()+".  "+(user.getBank().moneyPaidMonthlyForSalary() > 0?"Месячная ставка составила: " + user.getBank().moneyPaidMonthlyForSalary() + " " + user.getBank().getCurrency():" "));

    }
}
