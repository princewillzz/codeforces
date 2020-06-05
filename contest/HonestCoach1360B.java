import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HonestCoach1360B {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (ans > (int) Math.abs(ar[i] - ar[j]))
                        ans = (int) Math.abs(ar[i] - ar[j]);

                }
            }
            System.out.println(ans);
        }

    }

}