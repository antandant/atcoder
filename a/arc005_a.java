import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine());
        String[] w = br.readLine().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(
            "TAKAHASHIKUN", "Takahashikun", "takahashikun", "TAKAHASHIKUN.", "Takahashikun.", "takahashikun."
        ));
        int ans = 0;
        for (String wi: w) {
            if (set.contains(wi)) ans++;
        }
        System.out.println(ans);
    }
}