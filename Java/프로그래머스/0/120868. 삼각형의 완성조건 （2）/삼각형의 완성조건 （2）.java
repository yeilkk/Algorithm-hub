class Solution {
    public int solution(int[] sides) {

        int maxIdx = 0;
        int max = 0;
        for(int i=0;i<sides.length; i++){
            if(max<sides[i]) {
                max = sides[i];
                maxIdx = i;
            }
        }
        int minIdx = Math.abs(1-maxIdx);
        int count = 0;
        for(int i=1; i<=max; i++){
            if(i+sides[minIdx]>sides[maxIdx]) count++;
        }
        int count2 = 0;
        int side = Math.max(sides[0], sides[1]);
        while(sides[0]+sides[1] > side){
            if(side > Math.max(sides[0], sides[1])) count2++;
            side++;
        }
        return count + count2;
    }
}