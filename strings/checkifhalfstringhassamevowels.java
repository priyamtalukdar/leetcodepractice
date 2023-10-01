package strings;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
// 1704. Determine if String Halves Are Alike

public class checkifhalfstringhassamevowels {
    class Solution {
        public boolean halvesAreAlike(String s) {
            int half = s.length()/2;
            int count1 =0;
            int count2 =0;
            s = s.toLowerCase();
          for(int i=0;i<half;i++){
              char ch = s.charAt(i); 
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                  count1++;
              }
          }
          for(int i=half;i<s.length();i++){
              char ch = s.charAt(i);
              if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                  count2++;
              }
          }return count1 == count2;
        }
    }
}
