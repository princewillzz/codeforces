import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class constantpalin {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s[] = br.readLine().split(" ");
            String inp[] = br.readLine().split(" ");
            int k = Integer.parseInt(s[1]);
            int n =Integer.parseInt(s[0]);
            int ar[] = new int[n];
            for(int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(inp[i]);
            }
            int a[] = new int[(2*k)+100], cnt[] = new int[(2*k)+100];
            Arrays.fill(a, 0);Arrays.fill(cnt, 0);
            for(int i = 0; i < n/2; i++) {
                a[ar[i]+ar[n-i-1]]++;
                int mn = Math.min(ar[i], ar[n-i-1]);
                int mx = Math.max(ar[i], ar[n-i-1]);
                mn++;mx+=k+1;
                cnt[mn]++;
                cnt[mx]--;
            }
            int ans = n;
            for(int i = 1; i <= 2*k; i++) {
                cnt[i] += cnt[i-1];
                int cur = n - a[i] - cnt[i];
                ans = Math.min(ans, cur);
            }

            
        
            System.out.println(ans);
        }

    }
    
    

}