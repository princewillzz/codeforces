import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(str[i]);
        }
        solve(ar, n);

    }

    static void solve(int ar[], int n) {
        Arrays.sort(ar);
        double mean = 0.000000d, median = 0.0000d;
        int mode = ar[0], freq = 1, curr_freq = 1;
        // Mean
        for (int i = 0; i < n; i++) {
            mean += ar[i];

            if (i + 1 < n && ar[i] == ar[i + 1]) {
                curr_freq++;
            } else {
                if (curr_freq > freq) {
                    freq = curr_freq;
                    mode = ar[i - 1];
                }
                curr_freq = 1;
                if (i + 1 < n && ar[i] == ar[i + 1])
                    curr_freq++;
            }
        }
        // Median
        if (n % 2 != 0) {
            median = ar[n / 2];

        } else {
            median = ar[n / 2] + ar[n / 2 - 1];
            median /= 2;
        }

        mean = mean / n;
        System.out.println(mean + " " + median + " " + mode);
    }

}