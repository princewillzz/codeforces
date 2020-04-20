import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EhAbAndGCD {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(x%2==0) {
                System.out.println(x/2+" "+ x/2);
            } else {
                int a=x-1, b = 1;

                System.out.println(a+" "+ b);
            }
        }
        

    }
  

}