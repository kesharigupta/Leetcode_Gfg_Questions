import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
       int result =0;
       int prev = 0;
        
        for(int i = s.length() -1; i>=0; i--){
            int currv = map.get(s.charAt(i));
            if(currv < prev){
                result -= currv;
            }else {
                result += currv;
            }
            prev = currv;
        }
         return result;       
    }
}