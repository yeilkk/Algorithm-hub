class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length];
        int index = num_list.length;
        int idx = 0;
        for(int i = num_list.length-1; i>=0; i--){
            arr[idx++] = num_list[i];
        }
        return arr;
    }
}