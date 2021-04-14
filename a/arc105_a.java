import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cokkies = Arrays.stream(br.readLine().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        int sum = Arrays.stream(cokkies).sum();
        String ans = "No";
        for (int i=0; i < (int)Math.pow(2, 4); i++) {
            int eat = 0;
            for (int j=0; j < 4; j++) {
                if ((1&i >> j) == 1) {
                    eat += cokkies[j];
                }
            }
            if (sum == 2 * eat) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}