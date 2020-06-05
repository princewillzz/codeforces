import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MixingWaterC {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s[] = br.readLine().split(" ");
            int h = Integer.parseInt(s[0]), c = Integer.parseInt(s[1]), t = Integer.parseInt(s[2]);

            System.out.println(solve(h, c, t));

        }

    }

    static int solve(int h, int c, int t1) {
        if (t1 == 0)
            return 0;
        if (t1 == h)
            return 1;
        if (t1 == h + c)
            return 2;
        int cups = 2;
        double t = (h + c) / 2;
        double avg = t1;
        while (t != (double) t1) {

            if (cups % 2 == 0) {
                avg = (t * cups) + h;
                avg /= (cups + 1);
                if (t1 - avg < t1 - t)
                    t = avg;
                else
                    break;
            } else {
                avg = (t * cups) + c;
                avg = avg / (cups + 1);
                if (t1 - avg < t1 - t)
                    t = avg;
                else
                    break;
            }
            cups += 1;
        }
        return cups;
    }

}