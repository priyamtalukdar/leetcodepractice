package arrays;

public class shuffelarray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
           int i =0;
           int j= n;
           int k=0;
           int ans[] = new int[n+n]; 
         while(i<n && j<nums.length){
           ans[k++] = nums[i]; 
           ans[k++] = nums[j]; 
           i++;
           j++;
         }return ans;
        }
    }
}
