package DataStructure.Day2;

public class solution {

    public static int[][] rotateArrayRight(int[][] arr) {
        int[][] arr1 = new int[arr.length][arr.length];
        int z = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                arr1[j][i] = arr[z][j];
            }
            z++;
        }
        return arr1;
    }
}
