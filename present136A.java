import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class present136A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String inp[] = input.split(" ");
        int gifts[] = new int[n];
        for(int i = 0; i < n; i++) gifts[i] = Integer.parseInt(inp[i]);

        int output[] = new int[n];
        for(int i = 0; i < n; i++) {
            output[gifts[i]-1] = i+1;
        }
        for(int outputs: output)
            System.out.print(outputs + " ");
    }
}

/*abstract
0 1 2 3 
2 3 4 1

3 0 1 2

4 1 2 3
*/