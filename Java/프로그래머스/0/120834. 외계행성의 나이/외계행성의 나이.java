class Solution {
    public String solution(int age) {
        char[] arr = new char[10];
        char ch = 'a';
        for(int i=0; i<arr.length; i++){
            arr[i] = ch++;
        }
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);
        for(int i=0; i<str.length(); i++){
            sb.append(arr[str.charAt(i)-'0']);
        }
        return sb.toString();
    }
}