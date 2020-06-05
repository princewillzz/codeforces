import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polygon1360E {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ar[][] = new int[n][n];

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    char ch = str.charAt(j);
                    ar[i][j] = Integer.parseInt(String.valueOf(ch));

                }
            }

            boolean ans = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans = reached(ar, i, j, n);
                    if (!ans) {
                        break;
                    }
                }
                if (!ans)
                    break;
            }
            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    static boolean reached(int ar[][], int i, int j, int n) {
        boolean ans = true;
        if (ar[i][j] == 0)
            return ans;

        while (i < n - 1 && j < n - 1) {
            if (ar[i][j + 1] == 1) {
                j++;
            } else if (ar[i + 1][j] == 1) {
                i++;
            } else {
                return false;
            }
        }

        return ans;
    }

}