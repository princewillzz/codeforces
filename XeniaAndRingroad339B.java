import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XeniaAndRingroad339B{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);
        long ans = 0;int curp = 1;
        String str[] = br.readLine().split(" ");
        for(int i = 0; i < k; i++) {
            int ai = Integer.parseInt(str[i]);
            if(ai >= curp) ans += ai-curp;
            else ans += n-curp+ai;
            curp = ai;
        }
        System.out.println(ans);

    }

}