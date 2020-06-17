import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BoardMoves1323C {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            long cells = n * n - 1;
            long ans = 0;

            long count = 1;
            long layer = 8, i = 1;

            while (count < cells) {
                ans += layer * i;
                i++;
                layer += 8;

                count = count + layer;
            }

            System.out.println(ans);

        }
        ArrayList<Integer> alist = new ArrayList<>();

    }

}