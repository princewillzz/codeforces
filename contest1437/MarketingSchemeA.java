import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarketingSchemeA {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().trim().split(" ");
            int l = Integer.parseInt(str[0]), r = Integer.parseInt(str[1]);
            boolean flag = false;
            // for (int a = 1; a < l; a++) {
            // if (a * 2 > r && (l % a) * 2 >= a) {
            // flag = true;
            // // System.out.println("here");
            // break;
            // }
            // }
            int start = 1, end = l - 1;
            while (start <= end) {
                int a = start + (end - start) / 2;
                if (a * 2 > r && (l % a) * 2 >= a) {
                    flag = true;
                    // System.out.println("here");
                    break;
                }
                if (a * 2 <= r)
                    start = a + 1;
                else
                    end = a - 1;
            }

            if ((l % (r + 1)) * 2 >= (r + 1)) {
                flag = true;
                // System.out.println("or here");
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

}