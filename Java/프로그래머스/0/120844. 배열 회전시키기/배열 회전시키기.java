class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] arr = new int[numbers.length];
        
        if(direction.equals("right")){
            int idx = 0;
            for(int i:numbers){
                if(idx+1 > numbers.length -1){
                    arr[0] = numbers[numbers.length-1];
                    idx++;
                    continue;
                }
                arr[idx+1] = numbers[idx];
                idx++;
            }
        } else {
            int idx = numbers.length-1;
            for(int i:numbers){
                if(idx-1 < 0){
                    arr[numbers.length-1] = numbers[0];
                    idx--;
                    continue;
                }
                arr[idx-1] = numbers[idx];
                idx--;
            }
        }
        return arr;
    }
}