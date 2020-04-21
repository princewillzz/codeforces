import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedArray {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int size1 = n/2, size2 = n/2;
            if(size1%2!=0) System.out.print("NO");
            else {
                int ar[] = new int[n];
                int sum1 = 0, sum2 = 0;
                for(int i = 0; i < size1; i++) {
                    ar[i] = 2*(i+1);
                    sum1+=ar[i];
                    //System.out.println(sum1);
                }
                for(int i = size1, j = 1; i<n; i++, j+=2) {
                    ar[i] = j;
                    sum2 += ar[i];
                   //System.out.println(sum2);
                  
                }
                int diff = sum1 - sum2;
                //System.out.println(diff);
                ar[n-1] += (sum1 - sum2);
                System.out.println("YES");
                for(int i = 0; i<n; i++) System.out.print(ar[i]+" ");
            }
            System.out.println();
        }

    }
    
    
}