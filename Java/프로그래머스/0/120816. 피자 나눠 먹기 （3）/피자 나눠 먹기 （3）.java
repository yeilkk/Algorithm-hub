class Solution {
    public int solution(int slice, int n) {
        int mod = n % slice;
        if(mod != 0) return n/slice+1;
        else return n/slice;
        
    }
}