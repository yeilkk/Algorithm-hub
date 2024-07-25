class Solution {
    public String solution(String str, int n) {
        char[] ch = new char[str.length() * n];
        int idx = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<n; j++){
                ch[idx++] = str.charAt(i);
            }
        }
        return new String(ch);
    }
}