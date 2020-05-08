import java.util.Scanner;

public class CardConstruct {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int ans = 0, used = 0;
            while(used <= n) {
                boolean h = false;int jump = 2, start = 2;
                while(start<=n-used) {
                    h = true;
                    jump += 3;
                    start += jump;
                    
                } used += start - jump;
                if(h) {
                    ans++;
                } else break;
            }
            System.out.println(ans);
        }

    }

}