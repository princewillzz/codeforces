import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addORsubtract1311A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        while(test-->0) {
            String inp[] = br.readLine().split(" ");
            sb.append(solve(Integer.parseInt(inp[0]), Integer.parseInt(inp[1])) + "\n");
        }
        System.out.println(sb);

    }
    
    static int solve(int a, int b) {
        int answer = 0;
        while(a != b) {
            if(a < b) {
                int diff = b - a;
                if(diff%2==0) answer+=2;
                else answer++;
                a = b;
            } else {
                int diff = b - a;
                if(diff%2==0) answer++;
                else answer += 2;
                a = b;
            }
        }
        return answer;
    }

}