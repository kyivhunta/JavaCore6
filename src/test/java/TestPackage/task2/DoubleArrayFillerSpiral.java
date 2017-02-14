package TestPackage.task2;

import javax.swing.*;
import java.util.Arrays;

public class DoubleArrayFillerSpiral {
    public static void main(String[] args) {
        DoubleArrayFillerSpiral doubleArray = new DoubleArrayFillerSpiral();
        int[][] testArray = doubleArray.getFilledArray(4, 4);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));

        }

    }

    public int[][] getFilledArray(int x, int y) {
        int[][] resultArray = new int[y][x];
        int incr = 1;

        for (int i = 0; i < x * y; i++) {
            int a1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение Y (первая цыфра двухзначного числа)\n" + XYArrayIndexes(y, x), "Input Y", 2));
            int a2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение X (вторая цыфра двухзначного числа)\n" + XYArrayIndexes(y, x), "Input X", 2));
            resultArray[a1][a2] += incr++;

        }
        return resultArray;
    }

    public static String XYArrayIndexes(int y, int x) {
        String[][] testArray = new String[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                testArray[i][j] = Integer.toString(i) + Integer.toString(j);

            }

        }

        String res = "";
        for (int i = 0; i < y; i++) {
            res += Arrays.toString(testArray[i]) + "\n";

        }
        return res;
    }

}
