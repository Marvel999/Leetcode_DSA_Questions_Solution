package Leetcode.Array;

import javafx.application.Application;
import javafx.stage.Stage;

public class SuffelArray {

    //efficient code
    public int[] shuffle(int[] nums, int n) {
        int max = 1001; // M in the above explanation

        //Store number pairs in right half
        for(int i=n;i<nums.length;i++){
            nums[i] = max*nums[i]+nums[i-n];
        }

        //Put pairs in proper positions
        int ind = 0;
        for(int i=n;i<nums.length;i++){
            nums[ind] = nums[i]%max;
            nums[ind+1] = nums[i]/max;
            ind+=2;
        }

        return nums;
    }

    //Not efficient code
    public int[] shuffle1(int[] nums, int n) {
        int[] ans=new int[2*n];
        int p1=0;
        int p2=n;
        for(int i=0;i<2*n;i++){

            if(i%2==0){
                ans[i]=nums[p1];
                p1++;
            }
            else{
                ans[i]=nums[p2];
                p2++;
            }

        }
        return ans;
    }
}
