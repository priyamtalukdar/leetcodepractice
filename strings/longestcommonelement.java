package strings;
// 14 https://leetcode.com/problems/longest-common-prefix/description/
import java.util.Arrays;

public class longestcommonelement {
   class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;
         String s1 = strs[0];
        String s2 = strs[strs.length-1];
        while(i<s1.length() && i<s2.length()){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 == ch2){
                i++;
            }else{
                break;
            }
        }return (strs[0].substring(0,i));
    }
}
 
}
