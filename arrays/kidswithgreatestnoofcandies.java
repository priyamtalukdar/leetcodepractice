package arrays;
// 1431. Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class kidswithgreatestnoofcandies {
 class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
       List<Boolean> list = new ArrayList<>();

       for(int candy : candies){
           if(candy + extraCandies >= max){
               list.add(true);
           }else{
               list.add(false);
           }
       }return list;
    }
}   
}
