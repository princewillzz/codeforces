import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisibility1328A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0) {
            String inp[] = br.readLine().split(" ");
            int a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]);
            if(a < b) {
                System.out.println(b-a);
                continue ;
            }
            if(a%b == 0) {
                System.out.println(0);
                continue;
            }
            int divisor = a/b;
            int result = (++divisor) * b - a;
            System.out.println(result);

        }

    }
    
}