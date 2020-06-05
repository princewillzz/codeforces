import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoArraysAndSwap1353B {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String inp[] = br.readLine().split(" ");
            int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);

            String str1[] = br.readLine().split(" "), str2[] = br.readLine().split(" ");
            int a[] = new int[n], b[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]);
                b[i] = Integer.parseInt(str2[i]);
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for (int start = 0, end = n - 1; start < k; start++, end--) {
                if (a[start] > b[end])
                    break;
                a[start] = b[end];
            }
            int ans = 0;
            for (int element : a)
                ans += element;

            System.out.println(ans);
        }

    }

}
