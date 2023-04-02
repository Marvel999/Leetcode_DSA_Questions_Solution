package Leetcode.Array;

public class RotateImage {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int arr[][] = new int[rows][cols];
        for (int i =0; i< rows; i++){
            for (int j =0; j< cols; j++){
                arr[i][j] = matrix[rows-1-j][i];
            }
        }

        for (int i =0; i< rows; i++){
            for (int j =0; j< cols; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
