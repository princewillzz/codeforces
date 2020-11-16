import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String a = br.readLine(), b = br.readLine();

        solve(a, b);

    }

    static void solve(String a, String b) {
        int memo[][] = new int[a.length() + 1][b.length() + 1];
        int ans = 0;
        for (int i = 1; i < memo.length; i++) {
            for (int j = 1; j < memo[i].length; j++) {

                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    memo[i][j] = Math.max(memo[i - 1][j - 1] + 2, memo[i][j]);
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]) - 1;
                    if (memo[i][j] < 0)
                        memo[i][j] = 0;
                }
                ans = Math.max(memo[i][j], ans);
            }
        }

        System.out.println(ans);
    }

}