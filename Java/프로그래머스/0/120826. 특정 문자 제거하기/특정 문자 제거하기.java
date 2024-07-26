import java.util.*;

class Solution {
    public String solution(String str, String letter) {
       StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == letter.charAt(0))
                continue;
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}