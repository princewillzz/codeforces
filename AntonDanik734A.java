import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonDanik734A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), anton = 0, danik = 0;
        String input = br.readLine();
        for(int i = 0; i < n; i++) {
            if(input.charAt(i) == 'A') anton++;
            else danik++;

        }
        if(anton > danik ) System.out.print("Anton");
        else if(danik > anton) System.out.print("Danik");
        else System.out.print("Friendship");
        
    }
}
