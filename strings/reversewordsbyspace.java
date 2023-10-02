package strings;
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
// 557
public class reversewordsbyspace {
    class Solution {
        public String reverseWords(String s) {
    
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
          StringBuilder str = new StringBuilder(word);
          str.reverse();
          sb.append(str);
          sb.append(" ");
        } return sb.toString().trim();
        }
    }
}
