import java.util.Scanner;

public class RoadToZero1342A {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
	    long t = sc.nextInt();
	    while(t-- > 0) {
            long ans = 0;
            long x = sc.nextInt(), y = sc.nextInt();
            long a = sc.nextInt(), b = sc.nextInt();

        
            if(b<=a || b <= 2*a) {
                ans+=Math.min(x, y) * b;
                ans += (Math.max(x, y) - Math.min(x, y))*a;
            } else {
                ans += x*a;
                ans += y*a;
                x = 0;
                y = 0;
            }
        
            
            System.out.println(ans);

        }
    }
}