import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        double x = dots[0][0]-dots[1][0];
        double y = dots[0][1]-dots[1][1];
        double c = y/x;
        
        double x1 = Math.abs(dots[2][0]-dots[3][0]);
        double y1 = Math.abs(dots[2][1]-dots[3][1]);
        double c1 = y1/x1;
        
        if(c == c1) return 1;
        
        x = Math.abs(dots[0][0]-dots[2][0]);
        y = Math.abs(dots[0][1]-dots[2][1]);
        c = y/x;
        
        x1 = Math.abs(dots[1][0]-dots[3][0]);
        y1 = Math.abs(dots[1][1]-dots[3][1]);
        c1 = y1/x1;
        
        if(c == c1) return 1;
        
        x = Math.abs(dots[0][0]-dots[3][0]);
        y = Math.abs(dots[0][1]-dots[3][1]);
        c = y/x;
        
        x1 = Math.abs(dots[1][0]-dots[2][0]);
        y1 = Math.abs(dots[1][1]-dots[2][1]);
        c1 = y1/x1;
        
        if(c == c1) return 1;
        
        return 0;
    }
}