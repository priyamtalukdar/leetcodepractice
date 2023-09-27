package arrays;
//1920 leetcode
// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
public class buildarrayfromindex {
    class Solution {
        public int[] buildArray(int[] nums) {
            int arr[] = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                arr[i] = nums[nums[i]];
            }return arr;
        }
    }
}
