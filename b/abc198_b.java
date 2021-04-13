import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String ans = "No";
        for (int i=0; i < 10; i++) {
            String res = String.join("", Collections.nCopies(i, "0")) + n;
            StringBuffer strb = new StringBuffer(res);
            if (res.equals(strb.reverse().toString())) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}