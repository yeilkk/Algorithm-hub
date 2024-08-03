import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 2;
        while(n>=a){
            if(n%a == 0){
                n /= a;
                if(!arr.contains(a))
                    arr.add(a);
            } else{
                a++;
            }   
        }
        
        if(arr.size() == 0) 
            return new int[]{n};
        
        int[] b = new int[arr.size()];
        int count = 0;
        for(int e:arr)
            b[count++] = e;
            
        return b;
    }
}