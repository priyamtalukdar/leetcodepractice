package math;
//gfg
public class armstrong {
    class Solution {
        static String armstrongNumber(int n){
            String ans = "No";
            // code here
            int temp =n;
            int sum = 0;
            int rem = 0;
            while(n>0){
                rem = n%10;
                sum += rem*rem*rem;
                n = n/10;
            }
            if(sum == temp){
               return  "Yes";
            }return ans;
        }
    }
}
