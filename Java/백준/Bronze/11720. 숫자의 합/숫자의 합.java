import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        char[] arr = b.toCharArray();
        int sum = 0;
        for(char c:arr){
            sum += c-'0';
        }
        System.out.print(sum);
    }
}