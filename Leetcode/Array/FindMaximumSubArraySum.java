package Leetcode.Array;
//https://leetcode.com/problems/maximum-subarray/submissions/
//easy
// Kadane's Algorithm---O(n)
// by sum of all sub array for array and find max into that------work-----o(n^2)
//This algo is not working when array all elements are negative.

public class FindMaximumSubArraySum {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum)
                maxSum=currSum;
            if(currSum<0)
                currSum=0;

        }
        return maxSum;
    }
}
