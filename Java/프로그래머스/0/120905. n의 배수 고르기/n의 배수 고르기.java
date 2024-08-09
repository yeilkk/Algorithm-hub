import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arr = new ArrayList<>();
        for(int a: numlist){
            if(a%n==0) arr.add(a);
        }
        int[] result = new int[arr.size()];
        int idx = 0;
        for(int a: arr)
            result[idx++] = a;
        return result;
    }
}