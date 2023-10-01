package strings;
// https://leetcode.com/problems/goal-parser-interpretation/description/
public class replacegoalparser {
    class Solution {
        public String interpret(String command) {
            String str1 = command.replace("()", "o");
            String str2 = str1.replace("(al)", "al");
            return str2;
        }
    }
}
