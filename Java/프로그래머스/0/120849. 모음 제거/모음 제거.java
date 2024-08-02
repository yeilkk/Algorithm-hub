import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        char[] ch = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            if(!vowels.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}