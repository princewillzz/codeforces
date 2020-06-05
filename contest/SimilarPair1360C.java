import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimilarPair1360C {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            String str[] = br.readLine().split(" ");
            int ar[] = new int[n], odd_len = 0, even_len = 0;
            ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
                if (ar[i] % 2 == 0) {
                    even.add(ar[i]);
                    even_len++;
                } else {
                    odd_len++;
                    odd.add(ar[i]);
                }
            }

            boolean ans = false;

            if (odd_len % 2 == 0 && even_len % 2 == 0)
                ans = true;
            else {
                for (int i : even) {
                    for (int j : odd) {
                        if (Math.abs(i - j) == 1) {
                            ans = true;
                            break;
                        }
                    }
                    if (ans == true)
                        break;
                }
            }

            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

}