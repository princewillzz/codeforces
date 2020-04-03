import java.io.*;
import java.util.*;
class solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine();
        StringTokenizer tk = new StringTokenizer(br.readLine());
        while(tk.hasMoreTokens()) {
            int n = Integer.parseInt(tk.nextToken());
            if(n == 1) {
                System.out.println("Hard");
                return ;
            }
        }
            
        System.out.println("easy");
        br.close();
    }
    static boolean solve(int n, int k) {
        if(n <= 1 ) return true;
        int sum = 0;
        sum = helper(n, n, k);
        if(n == sum) return true;
        return false;
    }
    static int helper(int n, int sum, int k) {
        if(n <= 1) return 1;
        else if(n > sum ) return 0;
        int result = 0;
        while(k > 0){
        result += helper(n-k, sum, k);
        }
        
        return result;
    }
}