package strings;
// 58
// https://leetcode.com/problems/length-of-last-word/solutions/
public class lastwordindex {
    class Solution {
        public int lengthOfLastWord(String s) {
            String result = s.trim();
            String ans[] = result.split(" ");
            int count = ans[ans.length-1].length();
            return count;
        }
    }
}
