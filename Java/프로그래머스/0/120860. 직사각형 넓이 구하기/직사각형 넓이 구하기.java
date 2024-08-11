import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int a = dots[0][0];
        int b = dots[1][0];
        int c = dots[2][0];
        int d = dots[3][0];
        
        int min = Math.min(a,Math.min(b,Math.min(c,d)));
        int max = Math.max(a,Math.max(b,Math.max(c,d)));
        
        int e = dots[0][1];
        int f = dots[1][1];
        int g = dots[2][1];
        int h = dots[3][1];
        
        int min2 = Math.min(e,Math.min(f,Math.min(g,h)));
        int max2 = Math.max(e,Math.max(f,Math.max(g,h)));
        
        int width = Math.abs(max-min);
        int height = Math.abs(max2-min2);
        return width*height;
        
    }
}