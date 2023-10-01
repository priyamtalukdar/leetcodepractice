package strings;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/   
//  1662
public class check2stringarrayareequal {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
           String s1 =""; 
           String s2 ="";
           for(int i=0;i<word1.length;i++){
               s1 += word1[i];
           } 
           for(int i=0;i<word2.length;i++){
               s2 += word2[i];
           }return s1.equals(s2); 
        }
    }
}
