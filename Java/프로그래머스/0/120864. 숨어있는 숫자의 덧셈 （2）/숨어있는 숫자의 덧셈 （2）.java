class Solution {
    public long solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        long sum = 0L;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    sum += Long.parseLong(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }

        if (sb.length() > 0) {
            sum += Long.parseLong(sb.toString());
        }

        return sum;
    }
}
