package arrays;

// 1929. Concatenation of Array
//https://leetcode.com/problems/concatenation-of-array/description/
public class concatsamearray {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int count =0;
            int ans[] = new int[nums.length *2];
            for(int i=0;i<nums.length;i++){
             ans[count] = nums [i];
             count++;
            }
            for(int i=0;i<nums.length;i++){
             ans[count] = nums [i];
             count++;
            }return ans;
        }
    }
}
