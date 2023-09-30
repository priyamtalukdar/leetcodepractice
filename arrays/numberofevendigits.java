package arrays;
// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class numberofevendigits {
    class Solution {
        public int findNumbers(int[] nums) {
            int count =0;
            for(int i=0; i<nums.length; i++){
                if((nums[i]+"").length() % 2 == 0){
                    count++;
                }
            }
            return count;
        }
    }
}
