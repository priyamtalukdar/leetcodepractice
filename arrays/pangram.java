package arrays;
// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
import java.util.HashSet;

public class pangram {
  class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs =  new HashSet<>();

    for(char ch : sentence.toCharArray()){
        hs.add(ch);
    }
    if(hs.size() == 26)
    return true;
    return false;
    }
}  
}
