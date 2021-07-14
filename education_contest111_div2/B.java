import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String[] inp = br.readLine().split(" ");
            int n = Integer.parseInt(inp[0]), a = Integer.parseInt(inp[1]), b = Integer.parseInt(inp[2]);

            StringBuilder s = new StringBuilder(br.readLine());

            int ans = a * n;

            if (b >= 0) {
                ans += b * n;
            } else {
                int c = 1;
                char ch = s.charAt(0);
                for (int i = 1; i < n; i++) {
                    if (ch != s.charAt(i)) {
                        c++;
                        ch = s.charAt(i);
                    }
                }
                if (ch != s.charAt(n - 1)) {
                    c++;
                }

                ans += b * (c / 2 + 1);
            }

            System.out.println(ans);

        }
    }

}
