package Leetcode.Array;


//https://leetcode.com/problems/number-of-good-pair
public class FindBestPair {
// not Efficient Solution
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }

// most Efficient solution
    //For understanding this solution you should have good understanding of
    // Pre and post increment operator and its working.
    public int numIdenticalPairs1(int[] nums) {
        int count=0, exp[]=new int[101];
        for(int i=0;i<nums.length;i++){
            count+=exp[nums[i]]++;

        }
        return count;
    }
}
