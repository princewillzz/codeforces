import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);
            int grid[][] = new int[n][m];
            int ans = 0, small = Integer.MAX_VALUE, minus = 0;
            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {

                    grid[i][j] = Integer.parseInt(s[j]);

                    ans += Math.abs(grid[i][j]);
                    small = Math.min(small, Math.abs(grid[i][j]));
                    if (grid[i][j] < 0)
                        minus++;
                }
            }
            // System.out.println("minus" + minus + " " + ans);
            if (minus % 2 != 0)
                ans -= 2 * small;
            System.out.println(ans);
        }

    }

}