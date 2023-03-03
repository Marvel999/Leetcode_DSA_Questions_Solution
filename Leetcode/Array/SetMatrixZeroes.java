package Leetcode.Array;

import javafx.util.Pair;

import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        ArrayList<Pair<Integer,Integer>> indexArray = new ArrayList<>();
        int col = matrix[0].length;
        int row = matrix.length;
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                  if (matrix[i][j] == 0){
                      Pair<Integer, Integer> pair = new Pair<>(i,j);
                      indexArray.add(pair);
                  }
            }
        }

        for (Pair<Integer, Integer> integerIntegerPair : indexArray) {
            int rowIndex = integerIntegerPair.getKey();
            int colIndex = integerIntegerPair.getValue();
            for (int j = 0; j < rowIndex; j++) {
                matrix[j][colIndex] = 0;
            }
            for (int j = 0; j < colIndex; j++) {
                matrix[rowIndex][j] = 0;
            }
        }
    }
}
