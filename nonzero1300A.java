import java.io.*;

public class nonzero1300A {
    public static void main(String[] args) throws IOException {
        int n,test, sum, answer;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        test = Integer.parseInt(br.readLine());
        StringBuffer str1 = new StringBuffer();
        while(test-- > 0) {
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");
            sum = 0; answer = 0;
            for(int i = 0; i < n; i++) {
                int num = Integer.parseInt(s[i]);
                sum += num;
                if(num == 0) {sum++;answer++;}
            }
            if(sum == 0) {
                answer++;
            }
            str1.append(answer + "\n").toString();
            
        }
        System.out.print(str1);

    }
}