import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonandDigits734B {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp[] = br.readLine().split(" ");
        int k2 = Integer.parseInt(inp[0]), k3 = Integer.parseInt(inp[1]),k5 = Integer.parseInt(inp[2]), k6 = Integer.parseInt(inp[3]);
        int max = k5<k6?k5:k6;
        int sum = 0;
        if(k2>max) {
            sum += max*256;
            k2-=max;
            if(k3 > k2) {
                sum += k2*32;
            } else {
                sum += k3*32;
            }
        } else {
            sum += k2 * 256;
        }
        System.out.println(sum);

    }
    
    static int solve() {

        return 0;
    }

}