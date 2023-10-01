package arrays;
// https://leetcode.com/problems/jump-game/submissions/
// 55
public class jumpgame {
    class Solution {
        public boolean canJump(int[] nums) {
            int finalidx = nums.length-1;
            for(int i = nums.length-2 ;i>=0;i--){
                if(i + nums[i] >= finalidx){
                   finalidx = i;
                }
            }return finalidx == 0;
        }
    }
}
