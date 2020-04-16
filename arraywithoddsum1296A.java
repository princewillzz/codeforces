import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraywithoddsum1296A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            if(solve(s, n)) System.out.println("Yes");
            else System.out.println("No");
        }

    }
    
    static boolean solve(String s[], int n) {
        int ar[] = new int[n];
        int sum = 0;
    
		int odd = 0, even = 0;
		for (int i = 0; i < n; ++i) {
			int x = ar[i] = Integer.parseInt(s[i]);
			sum += x;
            
            if(x%2==0) even++;
            else odd++;
            
        }
        System.out.println(sum);
		if (sum % 2 != 0 || (odd>=1 && even>=1)) return true ;
		else return false;

    }

}