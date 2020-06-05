import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimalSquare1360A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);

            int small = Math.min(a, b), big = a + b - small;

            int side = 2 * small;
            while (side < big) {
                side++;
            }
            System.out.println(side * side);
        }

    }

}