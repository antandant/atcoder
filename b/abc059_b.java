import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String ans = "EQUAL";
        if (a.length() > b.length()) {
            ans = "GREATER";
        } else if (a.length() < b.length()) {
            ans = "LESS";
        } else {
            for (int i=0; i < a.length(); i++) {
                if (a.charAt(i) > b.charAt(i)) {
                    ans = "GREATER";
                    break;
                } else if (a.charAt(i) < b.charAt(i)) {
                    ans = "LESS";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}