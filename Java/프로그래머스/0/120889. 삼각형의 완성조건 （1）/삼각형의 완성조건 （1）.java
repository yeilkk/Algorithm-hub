class Solution {
    public int solution(int[] sides) {
        int idx = 0;
        int max = 0;
        int maxIdx = 0;
        for(int n : sides){
            if(max<n) {
                max = n;
                maxIdx = idx;
            }
            idx++;
        }
        int index = 0;
        int[] idxArr = new int[2];
        for(int i=0; i<3; i++){
            if(i != maxIdx){
                idxArr[index++] = i;
            }
        }
        System.out.println(sides[idxArr[0]]);
        System.out.println(sides[idxArr[1]]);
        if(max < (sides[idxArr[0]] + sides[idxArr[1]]))
            return 1;
        else
            return 2;
    }
}