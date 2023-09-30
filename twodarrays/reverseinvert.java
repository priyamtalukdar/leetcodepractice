package twodarrays;
// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/description/
public class reverseinvert {
    class Solution {
        static void reverse(int arr[]){
            int start = 0;
            int end = arr.length -1;
    
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]  = temp;
                start++;
                end--;
            }
        }
        static void invert(int arr[]){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 1){
                    arr[i] =0;
                }else{
                    arr[i] = 1;
                }
            }
        }
    
        public int[][] flipAndInvertImage(int[][] arr) {
         int res [][]= new int[arr.length][arr[0].length];
         for(int i = 0;i<arr.length;i++){
             reverse(arr[i]);
             invert(arr[i]);
             res[i] = arr[i];
    
         }return res;
        }
    } 
}
