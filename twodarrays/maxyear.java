package twodarrays;
//1854. Maximum Population Year
// https://leetcode.com/problems/maximum-population-year/solutions/
public class maxyear {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int arr[] = new int[2051];
            int max = 0;
            int maxyear = 1950;
            for( int[] log : logs){
                arr[log[0]] += 1;
                arr[log[1]] -= 1;
            }
            for(int i = 1951;i<2051;i++){
                arr[i] +=arr[i-1];
            }
            for(int i = 1950;i<2051;i++){
                if(max < arr[i]){
                    max = arr[i];
                    maxyear= i;
                }
            }return maxyear;
        }
    }
}
