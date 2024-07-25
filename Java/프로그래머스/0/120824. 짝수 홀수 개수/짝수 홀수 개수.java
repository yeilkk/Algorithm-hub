class Solution {
    public int[] solution(int[] arr) {
        int[] count = new int[2];
        for(int a: arr){
            if(a%2 == 0)
                count[0]++;
            else
                count[1]++;
        }
        return count;
    }
}