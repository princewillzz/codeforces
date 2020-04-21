import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandiesAndTwoSisters0A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        int alice, betty, answer;
        while(test-- > 0) {
            alice = 2;betty = 1;answer = 0;
            int n = Integer.parseInt(br.readLine());
            if(n<alice+betty) {
                System.out.println(answer);
                continue;
            }
            if(n%2!=0) {
                betty = n/2;
                answer = betty;

            } else {
                betty = n/2 -1 ;
                answer = betty;
            }
            System.out.println(answer);
        }
        br.close();
    }
    

}