class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        boolean add = true;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("+")) {
                add = true;
                continue;
            } else if(arr[i].equals("-")){
                add = false;
                continue;
            }
            if(add) sum += Integer.parseInt(arr[i]);
            else sum -= Integer.parseInt(arr[i]);
        }
        return sum;
    }
}