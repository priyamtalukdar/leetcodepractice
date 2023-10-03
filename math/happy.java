package math;
//202
public class happy {
    class Solution {
        public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
      
      do{
          fast = findsq(findsq(fast));
          slow = findsq(slow);
    
      }while(slow != fast);
      if(fast == 1){
          return true;
      }
      return false;
        }
     public int findsq(int n){
          int sum = 0;
          int rem = 0;
          while(n>0){
              rem = n%10;
              sum += rem*rem;
              n = n/10;
          }return sum;
      
        }
    }
}
