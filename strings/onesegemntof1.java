package strings;
// 1784  https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
public class onesegemntof1 {
    class Solution {
        public boolean checkOnesSegment(String s) {
            
            
           for(int i = 1;i<s.length();i++){
              char ch1 =  s.charAt(i);
               char ch2 = s.charAt(i-1);
                   if(ch1 == '1' && ch2 == '0'){
                      return false;
                       
                   }
               
           }return true;
        }
    }
}
