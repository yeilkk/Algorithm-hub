
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
        
        int maxScore = Arrays.stream(scores).max().getAsInt();
        int minScore = Arrays.stream(scores).min().getAsInt();

        System.out.println(maxScore - minScore);
    }
}
