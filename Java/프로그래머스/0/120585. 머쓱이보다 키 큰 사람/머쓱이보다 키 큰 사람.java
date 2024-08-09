import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int[] arr = Arrays.copyOf(array, array.length + 1);
        arr[arr.length-1] = height;
        int count = 0;
        for(int a : arr){
            if(a > height) count++;
        }
        return count;
    }
}