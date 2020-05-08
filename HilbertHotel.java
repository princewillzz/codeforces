import java.util.Arrays;
import java.util.Scanner;

public class HilbertHotel {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++) ar[i] = sc.nextInt();

            int ans[] = new int[n];
            Arrays.fill(ans, 1);

            for(int k = 0; k < n; k++) {
                int rem = ar[k];
                rem += k;
                rem = rem%n;
                if(rem<0) rem = rem+n;
                
                ans[rem] += 1;
                ans[k] -= 1;
                
            }boolean answer = true;
            for(int i = 0; i < n; i++) {
                if(ans[i] < 1 || ans[i] > 1) {
                    answer = false;
                    break;
                }
            }
            if(answer) System.out.println("YES");
            else System.out.println("NO");
        }

    }

}