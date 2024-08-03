import java.util.*;

class Solution {
    public int solution(int order) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(9);
        
        String str = Integer.toString(order);
        char[] ch = str.toCharArray();
        int count = 0;
        for(char c: ch)
            if(arr.contains(c-'0')) count++;
        return count;
    }
}