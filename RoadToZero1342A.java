import java.util.Scanner;

public class RoadToZero1342A {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            int a = sc.nextInt(), b = sc.nextInt();
            int ans = 0;
            if(b >= 2*a) {
                // Don't use the value of b
                ans += Math.abs(x) * a;
                ans += Math.abs(y) * b;
            } else if(b <= a) {
                int small = Math.min(x, y), big = Math.max(x, y);
                ans += small*b;
                big -= small;
                if(big > 0) {
                    if(big%2==0) ans+=big*b;
                    else { ans += a;
                    big--;
                    ans+=big*b;
                    }   
                }
            } else {
                int small = Math.min(x, y), big = Math.max(x, y);
                
            }
            System.out.println(ans);

        }
    }
}