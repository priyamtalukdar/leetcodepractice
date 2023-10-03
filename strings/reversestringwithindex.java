package strings;
//2000    https://leetcode.com/problems/reverse-prefix-of-word/description/
public class reversestringwithindex {
    class Solution {
        public String reversePrefix(String word, char ch) {
            int ind = word.indexOf(ch);
            String s = "";
            for(int i=ind;i>=0;i--){
                char ch1 = word.charAt(i);
                s += ch1;       
                 }
             for(int i=ind+1;i<word.length();i++){
                char ch1 = word.charAt(i);
                s += ch1; 
                 }
        return s;
    }

   // 2ndway
//      class Solution {
//         public String reversePrefix(String word, char ch) {
//             int index = word.indexOf(ch);
//             if(index == -1) return word;
//             StringBuilder sb = new StringBuilder(word.substring(0,index+1));
//             return sb.reverse().toString()+word.substring(index+1);
//         }
//     }    
       
// }

    }
    
}