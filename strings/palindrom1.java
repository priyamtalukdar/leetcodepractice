package strings;
// https://leetcode.com/problems/valid-palindrome/description/
// 125
public class palindrom1 {
    class Solution {
        public boolean isPalindrome(String s) {
         String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase() ;  
         String g = "";
         for (int i = result.length() - 1; i >= 0; i--) {
                g += result.charAt(i);
            }
        return (g.equals(result));
    }}
    
}
