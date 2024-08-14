class Solution {
    public int solution(int a) {
        int n;
        int sum = 0;

        if(a%2 != 0){
            n = 1;
            sum += n;
            while(n<a){
                n += 2;
                sum += n;
            }
        } else {
            n = 2;
            sum += Math.pow(n,2);
            while (n<a){
                n += 2;
                sum += Math.pow(n,2);
            }
        }
        return sum;
    }
}