import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
            for(int i = 1; i <= n; i++) System.out.print(i + " ");
            System.out.println();
        }
        
        

    }

}