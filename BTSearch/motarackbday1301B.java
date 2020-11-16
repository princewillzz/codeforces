import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class motarackbday1301B{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().trim().split(" ");
            int ar[] = new int[n], index = 0, i=0, max = 0, min = 0;
            boolean flag = true;
            for(String ele: str) {
                ar[index] = Integer.parseInt(ele);
                index++;
            }
            for(i = 0; i < n; i++) {
                if(i > 0 && ar[i] == -1 && ar[i - 1] != -1) 
                    {min = Math.min(min , ar[i - 1]) ; max = Math.max(max , ar[i - 1]);}
                if(i < n - 1 && ar[i] == - 1 && ar[i + 1] != -1)
                    {min = Math.min(min , ar[i + 1]) ; max = Math.max(max , ar[i + 1]);}
            }
            int k = (max+min)/2;max = Integer.MIN_VALUE;
            for(i=0;i<n;i++){
                if(ar[i] == -1)
                    ar[i] = k;
                if(i!=0)
                    max = Math.max(max,Math.abs(ar[i] - ar[i - 1]));
            }
            System.out.println(max+" "+k);
        }

    }

}