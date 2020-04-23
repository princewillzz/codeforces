import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class constantpalin {
    public static void main(final String argv[]) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();
        while (t-- > 0) {
            final String s[] = br.readLine().split(" ");
            final String inp[] = br.readLine().split(" ");
            final int k = Integer.parseInt(s[1]);
            final int n = Integer.parseInt(s[0]);
            final int ar[] = new int[n];
            int max_pair = 0, b = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(inp[i]);
                        
            if (i < n / 2) {
                final int curr = ar[i] + Integer.parseInt(inp[n - i - 1]);
                max_pair = Math.min(curr, max_pair);
                b = Math.max(curr, b);
            } }
            int ac_ans = Integer.MAX_VALUE;
            while (max_pair <= b) {
                max_pair++;
                int ans = 0;
                for (int i = 0, j = n - 1; i < j; i++, j--) {
                    final int curr_pair = ar[i] + ar[j];
                    if (curr_pair == max_pair)
                        continue;
                    if (curr_pair < max_pair) {
                        final int diff = max_pair - curr_pair;
                        if (ar[i] + diff <= k || ar[j] + diff <= k)
                            ans++;
                        else
                            ans += 2;
                    } else {
                        final int diff = curr_pair - max_pair;
                        if(ar[i]-diff >= 1 || ar[j]-diff >= 1) ans++;
                        else ans+=2;
                    };
                }
                ac_ans = Math.min(ac_ans, ans);
                
            }
        str.append(ac_ans + "\n");
        
        }
        System.out.println(str);
        
    }
}
