class Solution {
    public int[] solution(int money) {
        int price = 5500;
        int n = money / 5500;
        int mod = money % 5500;
        int[] arr = new int[2];
        arr[0] = n;
        arr[1] = mod;
        return arr;
    }
}