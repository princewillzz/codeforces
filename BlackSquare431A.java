import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackSquare431A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String s[] = str1.split(" ");
        int ar[] = new int[4];
        for(int i = 0; i < 4; i++) ar[i] = Integer.parseInt(s[i]);
        int sum = 0;
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            int n = Integer.valueOf(str.charAt(i));
            sum += ar[n-49];
        }
        System.out.println(sum);
    }
} 
