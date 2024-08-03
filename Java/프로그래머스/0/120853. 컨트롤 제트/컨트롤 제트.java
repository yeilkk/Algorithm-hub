import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        
        int sum = 0;
        int last = 0;
        for(String str: arr){
            if(str.equals("Z")){
                sum -= last;
                continue;
            }
            sum += Integer.parseInt(str);
            last = Integer.parseInt(str);
        }
        return sum;
    }
}