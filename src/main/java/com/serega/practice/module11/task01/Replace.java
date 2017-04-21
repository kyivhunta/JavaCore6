package com.serega.practice.module11.task01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Replace {
    public static void main(String[] args) {

        Map<String, String> newWords = new HashMap<>();
        newWords.put(",",",,");
        newWords.put("!","!!!");
        newWords.put("о","О");
        System.out.println(replace(newWords));

    }

    public static String replace(Map<String, String> map) {

        String res = "";
        try {

            File file = new File("src/main/java/com/serega/practice/module11/task01/text01.txt");
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {

                for (String s : map.keySet()) {

                     line = line.replace(s,map.get(s));

                }

                res+=line+"\n";
            }

        } catch (FileNotFoundException e) {
            System.err.println("FILE NOT FOUND");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
