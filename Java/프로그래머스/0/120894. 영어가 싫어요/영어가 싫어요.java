import java.util.*;

class Solution {
    public long solution(String numbers) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numbers.length(); i++){
            for(String key : map.keySet()){
                if(numbers.startsWith(key, i)){
                    sb.append(map.get(key));
                    i += key.length()-1;
                    break;
                }
            }
        }
        return Long.parseLong(sb.toString());
        
    }
}