class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = 0;
        if(len%n == 0) size = len/n;
        else size = len/n + 1;
        
        String[] arr = new String[size];
        StringBuilder sb = new StringBuilder();
        
        int arrSize = 0;
        for(int i=0; i<len; i++){
            sb.append(my_str.charAt(i));
            if(sb.length() >= n || i == len-1){
                arr[arrSize++] = sb.toString();
                sb = new StringBuilder();
            }
        }
        return arr;
    }
}