package Leetcode.Array;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_sum {
    //optimize solution
        public int[] runningSum(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                nums[i]=sum;
            }
            return nums;
        }

        //More optimize solution
        public int[] runningSum2(int[] nums) {
            for(int i=1;i<nums.length;i++){
                nums[i]+=nums[i-1];
            }
            return nums;
        }
}
