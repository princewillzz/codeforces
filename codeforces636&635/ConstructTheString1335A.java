import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConstructTheString1335A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0) {
            
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), a = Integer.parseInt(s[1]), b = Integer.parseInt(s[2]);
            String str="", st="";
            
            for(int i = 0; i <= a-b; i++) str += 'a';
            for(int i = 0; i < b-1; ++i) str +=(char)('a'+i+1);
            
            for(int i = 0; i < n; i++) {
                
                st += str.charAt(i%a);
            }
            System.out.println(st);
        }
        br.close();
    }
    

}