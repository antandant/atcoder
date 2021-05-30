import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int ans = 0;
        for (int num: Arrays.stream(br.readLine().split(" ")).mapToInt(v -> Integer.parseInt(v)).toArray()) {
            ans += 7 - num;
        }
        System.out.println(ans);
    }
}