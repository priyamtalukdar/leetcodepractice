package arrays;
// 1304. Find N Unique Integers Sum up to Zero
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
public class uniquensum0 {
    class Solution {
        public int[] sumZero(int n) {
            int arr[] = new int[n];
            int k = n-1;
         for(int i=0;i<n/2;i++){
             arr[i] = i+1;
             arr[k] = -(arr[i] );
             k--;
         }
        return arr;
    }}
}
