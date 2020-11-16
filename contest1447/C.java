import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            long n = Long.parseLong(s[0]), w = Long.parseLong(s[1]);
            String str[] = br.readLine().trim().split(" ");
            long ar[] = new long[str.length];
            int index = 0;
            for (String s1 : str)
                ar[index++] = Integer.parseInt(s1);

            ArrayList<Integer> alist = new ArrayList<>();
            long countSum = 0;
            boolean flag = false;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] > w)
                    continue;
                if (ar[i] >= (w + 1) / 2) {
                    System.out.println(1);
                    System.out.println(i + 1);
                    flag = true;
                    break;
                } else if (countSum + ar[i] < w) {
                    countSum += ar[i];
                    alist.add(i + 1);
                }
            }

            if (!flag)
                if (countSum >= (w + 1) / 2) {
                    System.out.println(alist.size());
                    for (Integer ele : alist) {
                        System.out.print(ele + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println(-1);
                }

        }

    }

}