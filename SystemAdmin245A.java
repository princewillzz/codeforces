import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemAdmin245A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int serverA = 0, serverB = 0, lostA = 0, lostB = 0;
        while(n-- > 0) {
            String inp[] = br.readLine().split(" ");
            int server = Integer.parseInt(inp[0]);
            if(server == 1) {
                serverA ++;
                lostA += Integer.parseInt(inp[1]);

            } else {
                serverB++;
                lostB += Integer.parseInt(inp[1]);
            }
        }

        if((lostA/serverA) >= 5) System.out.println("LIVE");
        else System.out.println("DEAD");

        
        if((lostB/serverB) >= 5) System.out.println("LIVE");
        else System.out.println("DEAD");

    }
   

}