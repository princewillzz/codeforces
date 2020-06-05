import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BerlandJokerA {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), k = Integer.parseInt(s[2]);

            int team_size = n / k;
            int ans = 0;
            if (m <= team_size)
                ans = m;
            else {
                if (m < n) {
                    m -= team_size;
                    int team = k - 1, counter = 0;
                    while (m > 0) {
                        counter++;
                        m -= team;
                    }
                    ans = team_size - counter;
                }
            }

            System.out.println(ans);

        }

    }

}