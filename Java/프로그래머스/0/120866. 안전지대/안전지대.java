import java.util.*;

class Solution {
    public int solution(int[][] board) {
        ArrayList<int[]> arr = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    int[] mine = new int[]{i, j};
                    arr.add(mine);
                }
            }
        }
        
        int[][] area = new int[board.length][board.length];
        for (int[] mines : arr) {
            int x = mines[0];
            int y = mines[1];
            for (int i = x - 1; i < x + 2; i++) {
                if (i < 0 || i > board.length-1) continue;
                for (int j = y - 1; j < y + 2; j++) {
                    if (j < 0 || j > board.length-1) continue;
                    area[i][j] = 1;
                }
            }
        }
        
        int count = 0;
        for(int i=0; i<area.length; i++){
            for(int j=0; j<area[0].length; j++){
                if(area[i][j] != 1) count++;
            }
        }
        return count;
    }
}