import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> arr = new ArrayList<Integer>();
        int a = 1;
        while(a<=n){
            if(n%a == 0) arr.add(a);
            a++;
        }
        return arr.size();
    }
}