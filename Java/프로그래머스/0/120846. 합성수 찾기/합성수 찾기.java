import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        if(n<=3) 
            return 0;
        
        while(n>0){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=1; j<=n; j++){
                if(arr.size() > 2) 
                    break;
                if(n%j==0) 
                    arr.add(j);
            }
            if(arr.size() > 2) nums.add(n);
            n--;
        }
        return nums.size();
    }
}