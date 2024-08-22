class Solution {
    public int solution(int n) {
        int a = 1;
        int count = 0;
        
        while (count < n) {
            String str = Integer.toString(a);

            if (a % 3 != 0 && !str.contains("3"))
                count++;
            
            a++;
        }

        return a-1; 
    }
}