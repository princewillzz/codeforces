import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionA{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int a = Integer.parseInt(br.readLine());
            if(a == 1) {
                System.out.println(1);
            } else {
                int ans;
                if(a%2==0) {
                    ans = a - 2;
                    ans = ans/2;
                    ans += 2;
                } else {
                    ans = a-3;
                    ans = ans/2;
                    ans += 2;
                }
                System.out.println(ans);
            }
        }

    }

}