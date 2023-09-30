package arrays;
// 53 maximum sybarray
// https://leetcode.com/problems/maximum-subarray/description/
public class Maximumsubsarr53 {
    class Solution {
        public int maxSubArray(int[] nums) {
           
            int maxsum = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                 sum = sum+ nums[i];
                maxsum =  Math.max(sum,maxsum);
                if(sum<0)
                sum=0;
                
            }
            
            return maxsum;
        }
    }
    
}
