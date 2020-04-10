import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class evenSubstring1139A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(solve(s));

    }
    
    static int solve(String s) {
        int value, answer = 0;
        for(int i = 0; i < s.length(); i++) {
            value = Integer.valueOf(s.charAt(i)) - 48;
            if(value%2 == 0) {
                answer += (i+1);
            }
        }
        return answer;
    }

}