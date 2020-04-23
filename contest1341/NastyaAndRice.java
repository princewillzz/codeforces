import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NastyaAndRice {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), a = Integer.parseInt(s[1]), b = Integer.parseInt(s[2]), c = Integer.parseInt(s[3]), d = Integer.parseInt(s[4]);
            int lowest_weight = Math.abs(a-b);
            int max_weight = a+b;
            int lowest_weight_sack = Math.abs(c-d);
            int max_weight_sack = c+d;
            boolean possible = true;
            if(lowest_weight*n > max_weight_sack || max_weight*n < lowest_weight_sack) possible = false;
            
            if(possible) System.out.println("Yes");
            else System.out.println("No");
        }

    }

}