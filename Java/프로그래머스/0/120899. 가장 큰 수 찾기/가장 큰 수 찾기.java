class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int idx = 0;
        int maxIdx = 0;
        for(int n: array){
            if(n>max) {
                max = n;
                maxIdx = idx;
            }
            idx++;
        }
        return new int[]{max, maxIdx};
    }
}