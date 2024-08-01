class Solution {
    public int solution(int n) {
        int factorial = 1;
        
        int count = 1;
        while(factorial<=n){
            factorial *= count;
            count++;
        }
        return count-2;
    }
}