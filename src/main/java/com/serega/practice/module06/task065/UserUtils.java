package com.serega.practice.module06.task065;

import com.serega.practice.module06.task064.User;


public final class UserUtils {

    public static User[] uniqueUsers(User[] users) {

        User[] theSameUsers = users.clone();
        User[] finalArray = new User[0];


        for (int i = 0; i < theSameUsers.length; i++) {
            for (int j = theSameUsers.length - 1; j > 0; j--) {
                if (i == j) break;
                else if (users[i].equals(users[j])) {
                    theSameUsers[i] = null;
                }
            }
        }
        for (int i = 0; i < theSameUsers.length; i++) {
            if (theSameUsers[i] != null) {
                finalArray = newElementToArray(finalArray, users[i]);
            }
        }

        return finalArray;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {

        User[] finalArray = new User[0];

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                finalArray = newElementToArray(finalArray, users[i]);
            }
        }

        return finalArray;
    }

    public static final User[] paySalaryToUsers(User[] users) {

        User[] finalArray = users.clone();

        for (User user : finalArray) {

            user.setBalance(user.getBalance() + user.getSalary());

        }
        return finalArray;
    }

    public static final long[] getUsersId(User[] users) {

        long[] usersIdArray = new long[0];

        for (User user : users) {
            usersIdArray = newElementToArray(usersIdArray, user.getId());
        }

        return usersIdArray;
    }

    public static User[] deleteEmptyUsers(User[] users) {

        User[] finalArray = new User[0];

        for (User user : users) {
            if (user != null) {
                finalArray = newElementToArray(finalArray, user);
            }
        }
        return finalArray;
    }

    static User[] newElementToArray(User[] users, User user) {

        User[] copyUsers = new User[users.length + 1];
        System.arraycopy(users, 0, copyUsers, 0, users.length);
        copyUsers[copyUsers.length - 1] = user;
        return copyUsers;

    }

    static long[] newElementToArray(long[] ids, long id) {

        long[] copyIds = new long[ids.length + 1];
        System.arraycopy(ids, 0, copyIds, 0, ids.length);
        copyIds[copyIds.length - 1] = id;
        return copyIds;

    }

}
