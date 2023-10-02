package strings;
// https://leetcode.com/problems/merge-strings-alternately/description/
// 1768
public class mergestringalternatively {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
          while(i<word1.length() && i<word2.length()){
                char ch1 = word1.charAt(i);
                char ch2 = word2.charAt(i);
                sb.append(ch1);
                sb.append(ch2);
                i++;
            }
            while(i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            while(i<word2.length()){
                sb.append(word2.charAt(i));
                i++;
            }
            return sb.toString();
        }
    }
}
