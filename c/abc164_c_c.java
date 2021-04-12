import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> hset = new HashSet<>();
        for (int i=0; i < n; i++) {
            String s = sc.next();
            hset.add(s);
        }
        System.out.println(hset.size());
    }
}