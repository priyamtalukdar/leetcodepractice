package strings;
// 1108. Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/description/
public class replacecahr {
    class Solution {
        public String defangIPaddr(String address) {
            return address.replace("." , "[.]");
        }
    }
}

//2nd way

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
     for( char c : address.toCharArray()){
        sb.append((c == '.')? "[.]" : c);
     }return sb.toString();
     
    }
}