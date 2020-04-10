import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class evenSubsetSum1323A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String inp[] = br.readLine().split(" ");
            solve(n, inp);
        }        

    }
    
    static void solve(int n, String s[]) {
        int ans = 0, index[] = new int[2];
        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(s[i])%2 == 0) {
                ans = 1;
                index[0] = i+1;
                break;
            }
        }
        if(ans == 1) {System.out.println(ans + "\n" + index[0]);return ;}
        int flag = 0;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(s[i]);
            if(num % 2 != 0 && flag ==0) {
                ans+=1;
                index[0] = i+1;
                flag = 1;
            } else if(num % 2 != 0 && flag == 1) {
                    ans += 1;
                    index[1] = i+1;
                    System.out.println(ans + "\n" + index[0] + " " + index[1]);

                    return;
                }
        }
        System.out.println(-1);
        
    }

}