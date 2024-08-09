class Solution {
    public String solution(String my_string) {
        String lower = my_string.toLowerCase();
        char[] arr = lower.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return new String(arr);
    }
}