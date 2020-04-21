import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingSubsequence {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            boolean pos = false, neg = false;
            int curr = Integer.parseInt(s[0]);
            if(curr < 0) neg = true;
            else pos = true;
            long sum = 0;
            for(int i = 0; i < n; ) {
                int num = Integer.parseInt(s[i]);
                if(pos) {
                    curr = num;
                    while(num >= 0) {
                        if(num > curr) curr = num;
                        i++;
                        if(i >= n) break;
                        num = Integer.parseInt(s[i]);
                    }neg = true;
                    sum+=curr;
                } if(i >= n) break;
                if(neg) {
                    curr = num;
                    while(num < 0) {
                        if(num > curr) curr = num;
                        i++;
                        if(i >= n) break;
                        num = Integer.parseInt(s[i]);
                    }pos = true;
                    sum+=curr;
                }
            }
            System.out.println(sum);
        }

    }
   
}