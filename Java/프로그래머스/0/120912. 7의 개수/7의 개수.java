class Solution {
    public int solution(int[] array) {
        int count = 0;
        for(int n : array){
            String str = Integer.toString(n);
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i) == '7') count++;
            }
        }
        return count;
    }
}