package com.serega.practice.module08.task04;

import com.serega.practice.module08.task02.Food;
import com.serega.practice.module08.task03.IManageSystem;

import java.util.*;

public class IManageSystemRealisation implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<Food, Double>();

    private static final double DEFAULT_PRICE = 0.0;

    public Food save(Food obj, double price) {
        database.put(obj, price);
        return obj;
    }

    public Food save(Food obj) {

        if (database.containsKey(obj)) {
            System.out.println("Такой товар уже существует в базе!!!");
            return obj;
        }
        database.put(obj, DEFAULT_PRICE);
        return obj;
    }

    public void delete(Food obj) {
        database.remove(obj);
    }

    public void deleteById(int id) {
        Iterator<Food> iterator = database.keySet().iterator();
        while (iterator.hasNext()) {
            Food next = iterator.next();
            if (next.getId() == id) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Товар с таким ID не найден!!!");
    }

    public void printProductsSortedByName() {
        Map<Food, Double> tmpMap = new TreeMap<Food, Double>(new Comparator<Food>() {
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        tmpMap.putAll(database);
        for (Food food : tmpMap.keySet()) {
            System.out.print(tmpMap.get(food) + " | " + food);
        }

    }

    public void printProductsSortedByPrice() {

        List<Double> tmpMap = new ArrayList<Double>(database.values());
        Collections.sort(tmpMap);

        for (Double aDouble : tmpMap) {

            for (Food food : database.keySet()) {
                if (database.get(food) == aDouble) System.out.print(aDouble + " | " + food);
            }
        }
    }

    public Food get(int id) {
        Food localfood = null;
        for (Food food : database.keySet()) {
            if (food.getId() == id) localfood = food;
        }
        if (localfood == null) {
            System.out.println("Товара с таким ID не найдено");
            return localfood;
        }
        return localfood;
    }

    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    public Set<Food> getProducts() {
        if (database.isEmpty()) {
            System.out.println("Список товаров пустой!!!");
            return Collections.emptySet();
        }
        return database.keySet();
    }

    public List<Double> getPrices() {
        if (database.isEmpty()) {
            System.out.println("Список товаров пустой!!!");
            return Collections.emptyList();
        }
        return new ArrayList<Double>(database.values());

    }

}
