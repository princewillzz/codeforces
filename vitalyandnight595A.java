import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vitalyandnight595A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String str[] = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String inp[] = str[i].split(" ");
            for(int j = 0; j < 2*m; j++) {
                if(Integer.parseInt(inp[j]) == 1 ) {
                    ans++;
                    if(j%2==0) j++;
                }
            }
        }
        System.out.println(ans);

    }
}