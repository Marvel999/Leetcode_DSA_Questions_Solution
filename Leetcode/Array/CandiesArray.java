package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CandiesArray {
    // Optimize solution
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> list=new ArrayList<>();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<candies.length;i++)
                if(max<candies[i])
                    max=candies[i];
            for(int ele:candies){
                if((ele+extraCandies)>=max)
                    list.add(true);
                else
                    list.add(false);
            }
            return list;
        }

        // more optimize
        public List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
            int max = Arrays.stream(candies).max().getAsInt();
            return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
        }



}
