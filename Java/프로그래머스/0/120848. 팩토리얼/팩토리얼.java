class Solution {
    public int solution(int n) {
        int factorial = 1;
        
        int count = 1;
        while(factorial<=n){
            factorial = 1;
            for(int i=1; i<=count; i++){
                factorial *= i;
            }
            count++;
        }
        return count-2;
    }
}