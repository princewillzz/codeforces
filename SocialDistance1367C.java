import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SocialDistance1367C {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inp[] = br.readLine().split(" ");
            int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);
            String s = br.readLine();

            int limit = k, ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (limit < k)
                        ans--;
                    limit = 0;
                } else {
                    limit++;
                    if (limit == k + 1) {
                        ans++;
                        limit = 0;
                    }
                }
            }

            System.out.println(ans);

        }

    }

}