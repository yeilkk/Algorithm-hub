class Solution {
    public int solution(int price) {
        int rate = 0;
        if(price>=500000) rate = 20;
        else if(price>=300000) rate = 10;
        else if(price>=100000) rate = 5;
        int n = 100 - rate;
        System.out.println(n);
        return price * n / 100;
    }
}