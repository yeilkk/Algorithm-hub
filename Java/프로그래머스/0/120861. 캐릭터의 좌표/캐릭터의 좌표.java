class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int width = board[0]/2;
        int height = board[1]/2;
        int[] map = new int[]{height, width, height*-1, width*-1};

        int[] arr = new int[2];
        for(String str : keyinput){
            if(str.equals("left") && arr[0]-1>=map[3])
                    arr[0]--;
            else if(str.equals("right") && arr[0]+1<=map[1])
                    arr[0]++;
            else if(str.equals("up") && arr[1]+1<=map[0])
                    arr[1]++;
            else if(str.equals("down") && arr[1]-1>=map[2])
                    arr[1]--;
        }
        
        return arr;
    }
}