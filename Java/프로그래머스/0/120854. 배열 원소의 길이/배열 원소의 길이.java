class Solution {
    public int[] solution(String[] strlist) {
        int[] arr = new int[strlist.length];
        
        int idx = 0;
        for(String str: strlist)
            arr[idx++] = str.length();
        
        return arr;
    }
}