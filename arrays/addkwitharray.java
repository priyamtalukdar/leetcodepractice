package arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 989. Add to Array-Form of Integer
// https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class addkwitharray {
    class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list =  new ArrayList<>();
        int carry = 0;
        for(int i = num.length-1;i>=0;i--){
            num[i] = num[i] + k%10+ carry;
            list.add(num[i]%10);
            k = k/10;
            carry = num[i]/10;
        }
        k= k+carry;
        while(k !=0){
         list.add(k%10);
         k = k/10;
        }
        
        Collections.reverse(list);
        return list;
    }
}
}
