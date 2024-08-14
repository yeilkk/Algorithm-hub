import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        ArrayList<String> dicArr = new ArrayList<>();
        for(String s : dic)
            dicArr.add(s);
        for(String s:dicArr){
            int a = 0;
            for(String st: spell){
                if(s.contains(st)) a++;
            }
            if(a==spell.length) return 1;
        }
        return 2;
    }
}