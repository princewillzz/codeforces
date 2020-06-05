import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ParkLighting1358A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]), y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]), y2 = Integer.parseInt(str[3]);
            System.out.println(solve(x1, y1, x2, y2));
        }

    }

    static int solve(int x1, int y1, int x2, int y2) {

        int ans = 0;
        // From upside
        int u = y2 - y1;

        // from bottom
        int b = x2 - x1;
        ans = u * b + 1;
        return ans;
    }

}