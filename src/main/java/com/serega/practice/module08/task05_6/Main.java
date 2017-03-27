package com.serega.practice.module08.task05_6;

import com.serega.practice.module08.task01.Country;
import com.serega.practice.module08.task02.Food;
import com.serega.practice.module08.task04.IManageSystemRealisation;

public class Main {
    public static void main(String[] args) {

        Food apples = new Food("apples", Country.UKRAINE, 90);
        Food mandarines = new Food("mandarines", Country.TURKEY, 40);
        Food bannanas = new Food("bannanas", Country.TURKEY, 30);
        Food lemon = new Food("lemons", Country.GEORGIA, 50);
        Food mashrooms = new Food("mashrooms", Country.CHINA, 20);
        Food pasta = new Food("pasta", Country.ITALY, 200);
        Food shugar = new Food("shugar", Country.USA, 300);
        Food cheese = new Food("cheese", Country.POLAND, 180);

        IManageSystemRealisation ims = new IManageSystemRealisation();

        ims.save(apples, 5.0);
        ims.save(mandarines, 5.5);
        ims.save(bannanas, 7);
        ims.save(lemon, 6.1);
        ims.save(mashrooms, 8.2);
        ims.save(pasta, 10.1);
        ims.save(shugar, 3.4);
        ims.save(cheese, 4.8);

        System.out.println("-> Список всех продуктов: -------------------------------------------- \n" + ims.getProducts() + "---------------------------------------------------------------------");

        System.out.println("-> Найден товар по ID: ----------------------------------------------- \n" + ims.get(7) + "----------------------------------------------------------------------");

        System.out.println("-> Цена товара: " + ims.getPrice(mashrooms));

        System.out.println("-> Цены товаров: " + ims.getPrices());

        ims.delete(mandarines);
        ims.deleteById(4);
        System.out.println("-> Удаление: ------------------------------------------------------- \n" + ims.getProducts() + "-------------------------------------------------------------------");

        System.out.println("-> Сортировка по названию продукта: --------------------------------------");
        ims.printProductsSortedByName();
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Меняем свойства определенного товара, цена не меняеться" + ims.save(new Food("cheese", Country.ITALY, 14))); //название товара должно быть 1:1

        System.out.println("-> Сортировка по цене продукта: ------------------------------------------");
        ims.printProductsSortedByPrice();
        System.out.println("--------------------------------------------------------------------------");


    }

}
