import java.util.Scanner;

public class puzzel {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            boolean ans = false;
            if(n == 1 || m == 1) ans = true;
            else if(n == 2 && m == 2) ans = true;

            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }

    }

}