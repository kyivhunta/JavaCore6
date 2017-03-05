package com.serega.practice.module06.task066;

import com.serega.practice.module06.task061_2_3.ArraysUtils;
import com.serega.practice.module06.task064.User;
import com.serega.practice.module06.task065.UserUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(9, "Vasya", "Kek", 5000, 10000);
        User user2 = new User(10, "Vasya", "Kek", 5000, 1500);
        User user3 = new User(11, "Kyzya", "Kek", 5000, 1000);
        User user4 = new User(12, "Vasya", "Kek", 5000, 1000);
        User user5 = new User(13, "Vasya", "Kek", 5000, 1000);

        User[] users = new User[]{user1, user2, user3, user4, user5};


        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users, 1500)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));

        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(Arrays.toString(ArraysUtils.reverse(mass)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(mass)));


    }
}
