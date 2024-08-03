import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        String numbers = "0123456789";
        char[] ch = numbers.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<ch.length; j++){
                if(my_string.charAt(i) == ch[j]){
                    arr.add(my_string.charAt(i)-'0');
                    break;
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}