import java.io.*;
public class pensandpencils1244A {
    public static void main(String[] args) throws IOException {
        int test, theory, practical;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        test = Integer.parseInt(br.readLine());
        StringBuffer str1 = new StringBuffer();
        int ar[] = new int[5];
        while(test-- > 0) {
            String str = br.readLine();
            String in[] = str.split(" ");
            for(int i = 0; i < 5; i++)
                ar[i] = Integer.parseInt(in[i]);
            
            theory = ar[0]/ar[2];
            ar[0] = ar[0]%ar[2];
            if(ar[0] > 0) theory++;

            practical = ar[1]/ar[3];
            ar[1] = ar[1]%ar[3];
            if(ar[1] > 0) practical++;

            if(theory+practical > ar[4]) str1.append("-1\n").toString();
            else if(theory+practical == ar[4]) str1.append(theory + " " + practical + "\n").toString();
            else {int newTheory = ar[4] - theory - practical;
                theory += newTheory;
                str1.append(theory + " " + practical + " \n").toString();}

        }
        System.out.print(str1);

    }
}