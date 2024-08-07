import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int diff = Math.abs(array[0] - n);
        int value = array[0];

        for (int i : array) {
            int current = Math.abs(n - i);
            if (current < diff || (current == diff && i < value)) {
                diff = current;
                value = i;
            }
        }

        return value;
    }
}