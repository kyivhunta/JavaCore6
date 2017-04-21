package com.serega.practice.module11.task02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileContentReplacer {
    public static void main(String[] args) {

        Map<String, String> newWords = new HashMap<>();
        newWords.put("...", "often");
        newWords.put("***", "always");
        newWords.put(">>>", "$hit");


        reader(fileContentReplacer(newWords));
    }

    public static File fileContentReplacer(Map<String, String> map) {

        File src = new File("src/main/java/com/serega/practice/module11/task02/text02.txt");
        try {
            FileInputStream fis = new FileInputStream(src);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            String res="";
            while ((line = br.readLine()) != null) {

                for (String key : map.keySet()) {

                    line = line.replace(key, map.get(key));
                }
                res+=line+"\n";
            }
            FileOutputStream fos = new FileOutputStream(src);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(res);
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return src;

    }

    public static void reader(File file) {

        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
