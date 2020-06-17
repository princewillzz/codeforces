import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenArray1367B {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s[] = br.readLine().split(" ");
            int ar[] = new int[n], index = 0;
            for (String a : s)
                ar[index++] = Integer.parseInt(a);

            int odd = 0, even = 0;
            for (int i = 0; i < ar.length; i++) {
                if (i % 2 == ar[i] % 2)
                    continue;
                if (i % 2 == 0 && ar[i] % 2 == 1)
                    even++;
                else
                    odd++;
            }
            int ans = -1;
            if (odd > n / 2)
                ans = -1;
            else if (even > (n + 1) / 2)
                ans = -1;
            else {
                if (odd == even)
                    ans = even;
                else
                    ans = -1;
            }

            System.out.println(ans);

        }

    }

}