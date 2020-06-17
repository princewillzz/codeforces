import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortSubstrings1367A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine().trim();
            String ans = "";
            for (int i = 0; i < s.length(); i += 2) {
                ans += String.valueOf(s.charAt(i));
            }
            ans += String.valueOf(s.charAt(s.length() - 1));
            System.out.println(ans);
        }

    }

}