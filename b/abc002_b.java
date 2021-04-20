import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "i", "u", "e", "o"));
        String ans = "";
        for (String wi: w.split("")) {
            if (!vowels.contains(wi)) {
                ans += wi;
            }
        }
        System.out.println(ans);
        br.close();
    }
}