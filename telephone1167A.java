import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class telephone1167A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0) {
            int len = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if(solve(s, len)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    
    static boolean solve(String s, int len) {
        if (len < 11) return false;
        for(int i = 0; i < len; i++) {
            int num = Integer.valueOf(s.charAt(i)) - 48;
            if(num == 8 && len-i >= 11) return true;
        }

        return false;
    }

}