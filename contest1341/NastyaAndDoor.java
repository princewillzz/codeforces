import java.util.Scanner;

public class NastyaAndDoor {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++) ar[i] = sc.nextInt();
            int max_no_peaks = 0, left_index = 0;
            boolean has = false;
            for(int i = 1; i < k-1; i++) {
                if(ar[i] > ar[i-1] && ar[i] > ar[i+1]){ max_no_peaks++;
                if(i==1) has = true; left_index = 1;}
            }
            int i = k-1;
            int curr_peak = max_no_peaks;
            for(int start = 1, end = k; end < n; start++, end++, i++) {
                
                if(has) curr_peak--;

                if(ar[i] > ar[i-1] && ar[i] > ar[i+1]) curr_peak++;
                
                
                if(curr_peak > max_no_peaks) {
                    left_index = start+1;
                    max_no_peaks = curr_peak;
                }
                if(ar[start+1] > ar[start] && ar[start+1] > ar[start+2]) has=true;
                else has = false;
            }

            
            System.out.println(max_no_peaks+1 + " " + left_index);

        }

    }
    

}