class Solution {
    public String[] solution(String[] quiz) {
        String[] strArr = new String[quiz.length];
        int idx = 0;
        for(String n : quiz){
            String[] arr = n.split(" ");
            int a = Integer.parseInt(arr[4]);
            int b = 0;
            if(arr[1].equals("+")) b = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            else b = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            if(a == b) strArr[idx] = "O";
            else strArr[idx] = "X";
            idx++;
        }
        return strArr;
    }
}