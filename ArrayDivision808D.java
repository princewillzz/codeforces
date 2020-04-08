import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayDivision808D {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int sum = 0;
        String s[] = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {arr[i] = Integer.parseInt(s[i]);
                                    sum += arr[i];}
        int mm[][] = new int[n][sum/2+1];
        for(int i = 0; i < n; i++) {
            Arrays.fill(mm[i], Integer.MAX_VALUE);
        }
        int answer = solve(n-1, arr, sum/2, mm);
        if(sum%2==0 && answer == sum/2) {
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
    
    static int solve(int n, int ar[], int target, int mm[][]) {
        if(target < 0 || n < 0) return 0;
        if(mm[n][target] != Integer.MAX_VALUE) return mm[n][target];
        int temp = solve(n-1, ar, target, mm);
        mm[n][target] = temp;
        if(temp == target) return temp;
        temp = ar[n] + solve(n-1, ar, target-ar[n], mm);
        mm[n][target] = temp;
        if(temp == target) return temp;
        return 0;
    }

}