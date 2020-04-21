import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillingDiamonds1339A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if(n==1) System.out.println(1);
            else System.out.println(2);
        }

    }
    
    

}