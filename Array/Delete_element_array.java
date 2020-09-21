package Array;

public class Delete_element_array {
    public int removeElement(int[] nums, int val) {
        int result = 0;

        int prev = 0;
        int curr = 0;

        while(curr < nums.length) {
            if(nums[curr] != val) {
                nums[prev] = nums[curr];
                prev++;

            }

            curr++;
        }

        return prev;
    }
}
