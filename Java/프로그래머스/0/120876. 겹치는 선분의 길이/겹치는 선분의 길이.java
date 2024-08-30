import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]; j<lines[i][1]; j++){
                count[j+100]++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<count.length; i++){
            if(count[i] >= 2) arr.add(i);
        }
        return arr.size();
    }
}