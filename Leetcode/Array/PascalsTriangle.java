package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> previousArrary = new ArrayList<Integer>();
        for (int j =0; j<numRows; j++) {
            List<Integer> newArrary = new ArrayList<Integer>();
            for (int i = 0; i <= pascalsTriangle.size(); i++) {
                if (i == 0 || i == pascalsTriangle.size()) {
                    newArrary.add(1);
                } else {
                    newArrary.add(previousArrary.get(i - 1) + previousArrary.get(i));
                }
            }
            pascalsTriangle.add(newArrary);
            previousArrary = newArrary;
        }
        return pascalsTriangle;
    }
}
