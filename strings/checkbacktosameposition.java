package strings;
//https://leetcode.com/problems/robot-return-to-origin/description/
//657
public class checkbacktosameposition {
    class Solution {
        public boolean judgeCircle(String moves) {
            int updown = 0;
            int leftright = 0;
            for(int i=0;i<moves.length();i++){
                char ch = moves.charAt(i);
                if(ch == 'U'){
                    updown++;
                }
                if(ch == 'D'){
                    updown--;
                }
                if(ch == 'L'){
                    leftright++;
                }
                if(ch == 'R'){
                    leftright--;
                }
            }return (leftright == 0 && updown == 0);
        }
    }
}
