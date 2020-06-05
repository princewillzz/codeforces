import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BuyingShovel1360D {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String str[] = br.readLine().split(" ");
            long n = Long.parseLong(str[0]), k = Long.parseLong(str[1]);

            System.out.println(solve(n, k));
        }

    }

    static long solve(long n, long k) {
        Long ans = (long) 1;
        ArrayList<Long> alist = new ArrayList<Long>();
        for (long i = (long) 1; i <= Math.sqrt(n) && i <= k; i++) {
            if (n % i == 0) {
                alist.add(i);
                alist.add(n / i);
            }
        }

        for (long el : alist) {
            if (el <= k) {
                ans = Math.max(ans, el);
            }
        }

        return n / ans;
    }

}