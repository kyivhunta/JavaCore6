package com.serega.practice.module11.task03;

import com.serega.practice.module11.task02.FileContentReplacer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileContentMerger {
    public static void main(String[] args) {

        Map<String, String> newWords = new HashMap<>();
        newWords.put("is", "is not");
        newWords.put("...", ", now will happen shit");

        FileContentReplacer.reader(fileContentMerger(newWords));
    }

    public static File fileContentMerger(Map<String, String> map) {

        File newfile = new File("src/main/java/com/serega/practice/module11/task03/text03.txt");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(newfile)));
            String line;
            String res = "";
            while ((line = br.readLine()) != null) {

                for (String s : map.keySet()) {

                    line=line.replace(s, map.get(s));

                }
                res+=line+"\n";
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newfile,true)));
            bw.write("\n"+res);
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newfile;
    }


}
