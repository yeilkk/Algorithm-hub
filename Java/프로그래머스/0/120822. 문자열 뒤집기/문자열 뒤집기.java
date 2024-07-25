class Solution {
    public String solution(String str) {
        char[] ch = new char[str.length()];
        int idx = 0;
        for(int i=str.length()-1; i>=0; i--){
            ch[idx++] = str.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for(char c: ch){
            sb.append(c);
        }
        return sb.toString();
            
    }
}