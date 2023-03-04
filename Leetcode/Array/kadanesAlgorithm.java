package Leetcode.Array;

public class kadanesAlgorithm {

    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnding = 0;
        for (int i =0; i<nums.length; i++){
            maxEnding = maxEnding+nums[i];
            if (maxSoFar<maxEnding){
                maxSoFar = maxEnding;
            }
            if (maxEnding<0){
                maxEnding =0;
            }
        }
        return maxSoFar;
    }
}
