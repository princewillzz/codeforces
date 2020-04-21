import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class poweredAddition1338A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ar[] = new int[n];
            String s[] = br.readLine().split(" ");
            for(int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(s[i]);
            } int ans = 0;
            for(int i = 1; i < n; i++) {
                if(ar[i] >= ar[i-1]) continue;
                int sec = 0;
                while(ar[i] < ar[i-1]) {
                    ar[i] += (int)Math.pow(2, sec);
                    sec++;
                }ar[i] = ar[i-1];
                ans = Math.max(sec, ans);
            }
            System.out.println(ans);
        }

    }
    
    

}