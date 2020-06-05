import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddSelection1363A{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
        	String str[] = br.readLine().trim().split(" ");
        	int n = Integer.parseInt(str[0]), x = Integer.parseInt(str[1]);
        	String s[] = br.readLine().split(" ");
        	int index = 0, ar[] = new int[n];
        	for(String ele: s) ar[index++] = Integer.parseInt(ele);
        	System.out.println(solve(ar, n, x));
    	}
        

    }
    static String solve(int ar[], int n, int x) {
    	int odd = 0, even = 0;
    	for(int i = 0; i < n; i++) {
    		if(ar[i] % 2 != 0) odd++;
    		else even++;
    	}
    	if(n == x ) {
    		if(edd%2!=0) return "Yes";
    		else return "No";
    	}

    	if(x % 2 == 0 && odd > 0) {
    		if(odd%2 != 0) return "Yes";
    		if((even + odd - 1) >= x) return "Yes";

    	} else if(odd > 0) {
    		if(odd % 2 != 0) return "Yes";
    		if((odd+even-1) >= x) return "Yes";
    	}
    	return "No";
    }

}