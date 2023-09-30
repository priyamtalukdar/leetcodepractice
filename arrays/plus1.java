package arrays;
// https://leetcode.com/problems/plus-one/submissions/
// puls1 66
public class plus1 {
    class Solution {
        public int[] plusOne(int[] nums) {
           for(int i = nums.length-1;i>=0;i--){
               if(nums[i] < 9){
                   nums[i]++;
                   return nums;
               }else{
                   nums[i] = 0;
               }
           }int ans[] = new int[nums.length+1];
           ans[0] =1;
           return ans;
        }
    }
}
