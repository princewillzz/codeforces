import java.util.Scanner;

public class AndHappilyeverAfter1331c {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[6];
        int b[] = new int[6];
        for(int i = 5; i >= 0; i--) {
            ar[i] = n%2;
            n >>= 1;
        }for(int i = 0; i < 6; i++) System.out.print(ar[i]);System.out.println();
        b[4] = ar[4];
        b[0] = ar[0];
        b[2] = ar[3];
        b[3] = ar[2];
        b[1] = ar[5];
        b[5] = ar[1];
        for(int i = 0; i < 6; i++) System.out.print(b[i]);System.out.println();
        int ans = 0;
        
        ans += b[0]*32;
        ans += b[1]*16;
        ans += b[2]*8;
        ans += b[3]*4;
        ans += b[4]*2;
        ans += b[5]*1;
        System.out.println(ans);
    }

}