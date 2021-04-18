package Leetcode.Array;
//https://leetcode.com/problems/search-insert-position/
//o(n) complexity is use
// we can do using o(logn) complexity using binary search
//
public class SearchInsertPosion {

        public int searchInsert(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target)
                    return i;
                else if(nums[i]>target)
                    return i;
            }
            return nums.length;

        }

}
