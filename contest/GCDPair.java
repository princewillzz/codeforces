import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDPair{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(solve(n));
        }        

    }
    static int solve(int n) {
        if(n%2 != 0) n--;
        return n/2;
    }
   

}