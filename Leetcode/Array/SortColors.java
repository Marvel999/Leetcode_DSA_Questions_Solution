package Leetcode.Array;

public class SortColors {
    public void sortColors(int[] nums) {
       int i =nums.length;
       for(int j =0; j<nums.length; j++){
           if (nums[j]==0){
               int temp = nums[j];
               nums[i] = nums[j];
               nums[j] = temp;
               i++;
           }
       }

        for(int j =i; j<nums.length; j++){
            if (nums[j]==1){
                int temp = nums[j];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

    }
}
