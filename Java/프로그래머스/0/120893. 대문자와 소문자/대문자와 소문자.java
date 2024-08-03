class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z')
                sb.append((char)(c - 32)); // 소문자를 대문자로 변환
            else
                sb.append((char)(c + 32)); // 대문자를 소문자로 변환
        }
        return sb.toString();
    }
}