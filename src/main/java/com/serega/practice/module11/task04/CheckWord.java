package com.serega.practice.module11.task04;


import java.io.*;

public class CheckWord {
    public static void main(String[] args) {

        System.out.println(checkWordWithResourses("the"));
        System.out.println(checkWordWithTry("DAO"));
    }

    public static int checkWordWithResourses(String word) {

        File file = new File("src/main/java/com/serega/practice/module11/task04/text04.txt");
        int count = 0;
        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {

            while ((line = br.readLine()) != null) {

                String[] split = line.split(" ");
                for (String s : split) {
                    if (s.contains(word))count++;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static int checkWordWithTry(String word) {
        File file = new File("src/main/java/com/serega/practice/module11/task04/text04.txt");
        int count = 0;
        String line;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                for (String s : split) {
                if (s.contains(word))count++;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
