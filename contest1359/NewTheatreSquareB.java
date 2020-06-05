import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewTheatreSquareB {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), x = Integer.parseInt(s[2]),
                    y = Integer.parseInt(s[3]);

            int ans = 0;
            for (int r = 0; r < n; r++) {
                String line = br.readLine().trim();

                ans += solve(line, x, y);
            }
            System.out.println(ans);
        }

    }

    static int solve(String line, int x, int y) {
        int ans = 0;
        char s[] = line.toCharArray();
        int len = s.length;
        if (y >= 2 * x) {

            for (char ele : s) {
                if (ele == '.')
                    ans += x;
            }
            return ans;
        }

        for (int i = 0; i < len; i++) {
            if (i + 1 < len && s[i] == '.' && s[i] == s[i + 1]) {
                ans += y;
                i++;
            } else if (s[i] == '.') {
                ans += x;
            }
        }

        return ans;
    }

}