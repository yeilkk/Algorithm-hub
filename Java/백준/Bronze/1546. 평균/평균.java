import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String a = n.readLine();
        String s = n.readLine();
        String[] arr = s.split(" ");
        int max = 0;
        for(String ss : arr){
            int i = Integer.parseInt(ss);
            if(i > max) max = i;
        }
        double[] scores = new double[arr.length];
        for(int i = 0; i < scores.length; i++){
            int score = Integer.parseInt(arr[i]);
            scores[i] = ((double) score / max) * 100;
        }
        double sum = 0;
        for(double j : scores){
            sum += j;
        }
        System.out.print(sum / arr.length);
    }
}
