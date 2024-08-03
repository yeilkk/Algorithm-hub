import java.util.*;

class Solution {
    public int solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<=9;i++)
            arr.add(i);
        char[] ch = my_string.toCharArray();
        int sum = 0;
        for(char c: ch){
            if(arr.contains(c-'0')) {
                sum+= c-'0';
            }
        }
        return sum;
    }
}