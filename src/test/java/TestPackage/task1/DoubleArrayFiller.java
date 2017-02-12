package TestPackage.task1;


import java.util.Arrays;

public class DoubleArrayFiller {

    public static void main(String[] args) {
        DoubleArrayFiller doubleArray = new DoubleArrayFiller();
        int[][] testArray = doubleArray.getFilledArray(3, 3);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));

        }
    }

    public int[][] getFilledArray(int x, int y) {
        int[][] resultArray = new int[y][x];
        int incr = 1;
        for (int i = 0; i <resultArray.length ; i++) {
            for (int j = 0; j <resultArray[i].length ; j++) {
                resultArray[i][j]=incr++;

            }

        }

        return resultArray;
    }
}
