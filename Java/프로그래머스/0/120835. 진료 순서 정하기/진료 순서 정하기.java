import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(emergency);
        int[] arr = new int[copy.length];
        for(int i=0; i<copy.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(copy[i] == emergency[j])
                    arr[i] = Math.abs(j-copy.length);
            }
        }
        return arr;
    }
}