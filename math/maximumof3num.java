package math;
//628 https://leetcode.com/problems/maximum-product-of-three-numbers/description/
import java.util.Arrays;

public class maximumof3num {

class Solution {
    public int maximumProduct(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
   
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(option1, option2);
    }
}






//    timelimit excedded 
    // class Solution {
    //     public int maximumProduct(int[] nums) {
            
    //         int maxi =Integer.MIN_VALUE;
    //         for(int i=0;i<nums.length-2;i++){
    //             for(int j=i+1;j<nums.length-1;j++){
    //                 for(int k=j+1;k<nums.length;k++){
    //          int max = nums[i] * nums[j] *nums[k];
    //          maxi = Math.max(max,maxi); 
    //             }
    //             }
    //         }return maxi;
    //     }
 //   }
}
