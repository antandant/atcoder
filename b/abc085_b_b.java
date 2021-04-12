import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> dset = new HashSet<>();
        for (int i=0; i < n; i++) {
            int di = sc.nextInt();
            dset.add(di);
        }
        System.out.println(dset.size());
    }
}