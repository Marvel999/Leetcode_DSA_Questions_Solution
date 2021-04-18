package Leetcode.Array;

//https://leetcode.com/problems/pascals-triangle-ii/submissions/


import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            int ncr=1;
            for(int j=0;j<=i;j++){
                if(i==rowIndex){
                    arr.add(ncr);
                }
                ncr=ncr*(i-j)/(j+1);
            }
        }

        return arr;
    }
}
