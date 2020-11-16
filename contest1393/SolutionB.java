import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SolutionB{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().trim().split(" ");
        int a[] = new int[(int)1e6], freq[] = new int[(int)1e6];
        for(String s: str) {
            int k = Integer.parseInt(s);
            a[k]++;
            freq[a[k]]++;

        }
        int events = Integer.parseInt(br.readLine().trim());
        
        while(events-- > 0) {

            String e = br.readLine();
            boolean plus = false;
            if(e.charAt(0) == '+') plus = true;

            int plank = Integer.parseInt(String.valueOf(e.charAt(e.length()-1)));

            if(plus) {
                a[plank]++;
                freq[a[plank]]++;
            } else {
                freq[a[plank]]--;
                a[plank]--;
                
            }
            if(freq[8]>=1 || (freq[6]>=1 && freq[2]>=2) || freq[4]>=2 || (freq[2]>=3 && freq[4]>=1)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }

}