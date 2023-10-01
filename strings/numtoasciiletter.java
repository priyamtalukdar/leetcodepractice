package strings;
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
// 1309. Decrypt String from Alphabet to Integer Mapping

public class numtoasciiletter {
    class Solution {
        public String freqAlphabets(String s) {
            int i =0;
            StringBuilder sb = new StringBuilder("");
            int n = s.length();
            while(i < s.length()){
                if((i+2)< n && s.charAt(i+2) == '#' ){
                  String word = s.substring(i,i+2);
                  int num = Integer.parseInt(word);
                  char ch = (char) (num + 96);
                  sb.append(ch);
                  i = i+3;
                }
                else{
                    char ch = s.charAt(i);
                   
                sb.append((char)(ch  + 48));
                i++;
                }
    
            }return sb.toString();
        }
    }
}
