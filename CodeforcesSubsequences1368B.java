import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CodeforcesSubsequences1368B{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());
        String s = new String("codeforces");
        int ar[] = new int[10];
        Arrays.fill(ar, 1);
        long sum = 1;int i = 0, x = 1;
        while(k > sum) {
            if(i%10==0) x++;
            ar[i%10] += 1;
            sum /=x-1;
            sum *= x;
            i++;
        }
        for(i = 0; i < 10; i++) {
            while(ar[i]-- > 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        int kam = 10, l = kam;
        System.out.println(kam + " " +l);
    }

}