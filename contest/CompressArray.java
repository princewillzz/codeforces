import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressArray{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int ar[] = new int[2*n], o = 0, e = 0, count = 0;
            String inp[] = br.readLine().split(" ");
            boolean odd = true, even = true;
            for(int i = 0; i < inp.length; i++) {
                ar[i] = Integer.parseInt(inp[i]);
                if(ar[i]%2 == 0) {odd = false;e++;}
                else {even = false;o++;}
            }
            
            if(odd || even) {
                for(int i = 0; i < n*2-2; i+=2)  {
                    System.out.println((i+1)+" "+(i+2));
                }
                System.out.println();
                continue;
            }
            count = 1;
            for(int i = 0; i < 2*n ; i++) {
                if(ar[i] == 0) continue;
                if(ar[i]%2 == 0) {
                    for(int j = i+1; j < 2*n; j++) {
                        if(ar[j] == 0) continue;
                        if(ar[j] % 2 == 0) {
                            System.out.println((i+1) + " " + (j+1));
                            ar[i] = 0;
                            ar[j] = 0;
                            count++;
                            break;
                        }
                    }
                } else {
                    for(int j = i+1; j < 2*n; j++) {
                        if(ar[j] == 0) continue;
                        if(ar[j] % 2 != 0) {
                            System.out.println((i+1) + " " + (j+1));
                            ar[i] = 0;
                            ar[j] = 0;
                            count++;
                            break;
                        }
                    }
                }
                if(count >= n) break;
            }
            
            
        }  

    }

}