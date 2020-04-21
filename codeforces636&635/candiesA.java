import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class candiesA {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int x = 3;
            for(int i = 3; n%x!=0; i++) {
                x = (int)Math.pow(2, i) - 1;
            }
            System.out.println(n/x);
        }

    }
    

}