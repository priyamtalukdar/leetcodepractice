package arrays;
// 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/
public class maxheight {
    class Solution {
        public int largestAltitude(int[] gain) {
         int high = 0;
         int maxheight = 0;
    
         for(int i = 0;i<gain.length;i++){
             high += gain[i]; 
          maxheight = Math.max(high, maxheight);}
         return maxheight;   
        }
    }
}
