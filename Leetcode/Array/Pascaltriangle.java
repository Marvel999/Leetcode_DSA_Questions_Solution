package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle {

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> out=new ArrayList<>();
            for(int  i=0;i<numRows;i++){
                List<Integer> templist=new ArrayList<>();
                int ncr=1;
                for(int  j=0;j<=i;j++){
                    ncr=ncr*(i-j)/(j+1);;
                    templist.add(ncr);
                }
                out.add(templist);
            }
            return out;
        }

}
