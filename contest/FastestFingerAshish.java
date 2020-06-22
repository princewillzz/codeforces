import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FastestFingerAshish{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(solve(n));
        }  
    }
    static String solve(int n) {
        String ashish = "Ashishgup", finger = "FastestFinger";
        boolean a = true;
        ArrayList<Integer> factors = factor(n), temp = new ArrayList<>();
        
        if(n == 1) return finger;
        else if(n==2 || n%2!=0) return ashish;
        else if(factors.isEmpty()) return finger;
        else {
            if((n&(n-1)) == 0) {
                return finger;
            } else if(n%4 != 0 && isPrime(n/2)) {
                return finger;
            }
        }
        return ashish;
        
    }
    static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    static ArrayList<Integer> factor(int n) 
    { 
        ArrayList<Integer> alist = new ArrayList<>();
        
        for (int i=2; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
               
                if (n/i == i) 
                {
                    if(i%2!=0) alist.add(i);
                }
       
                else  {
                    if(i%2!=0) alist.add(i);
                    if((n/i)%2!=0) alist.add(n/i);
                }
                    
            } 
        } 
        
        return alist;
    } 

}