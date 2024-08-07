import java.util.*;

class Solution {
    public String solution(String s) {
        ArrayList<Character> engList = new ArrayList<>();
        for(char ch = 'a'; ch <= 'z'; ch++) {
            engList.add(ch);
        }

        int[] count = new int[26];
        for(int i=0; i<count.length; i++){
            count[i] = 0;
        }
        
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<engList.size(); j++){
                if(s.charAt(i) == engList.get(j))
                    count[j]++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int n : count){
            if(n == 1) sb.append(engList.get(index));
            index++;
        }
        return sb.toString();
    }
}