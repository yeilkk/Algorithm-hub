import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        int column = box[0] / n;
        int row = box[1] / n;
        int height = box[2] / n;
        return column * row * height;
    }
}