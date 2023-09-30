package arrays;
// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.ArrayList;
import java.util.List;

public class createtargetarray {
    class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      List<Integer> list = new ArrayList<Integer>();
      for(int i = 0;i<nums.length;i++){
          list.add(index[i],nums[i]);
      }
      int res[] = new int[nums.length];
      for(int i = 0;i<nums.length;i++){
          res[i] = list.get(i);
      }return res;
    }
}
}
