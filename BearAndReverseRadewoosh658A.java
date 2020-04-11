import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BearAndReverseRadewoosh658A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), c = Integer.parseInt(s[1]);

        String points[] = br.readLine().split(" ");
        String time[] = br.readLine().split(" ");
        int Limak = solve(points, time, c);
        String[] npoints = new String[n], ntime = new String[n];
        for(int i = n, index = 0; i > 0;index++,  i--) {
            npoints[index] = points[i-1];
            ntime[index] = time[i-1];
            //System.out.println(npoints[index] + ntime[index]);
        }
        int Radewoosh = solve(npoints, ntime, c);
        if(Limak > Radewoosh) System.out.println("Limak");
        else if(Radewoosh > Limak) System.out.println("Radewoosh");
        else System.out.println("Tie");

    }
    
    static int solve(String[] points, String[] time, int c) {
        int answer = 0, t = 0;
        for(int i = 0; i < points.length; i++){
            t += Integer.parseInt(time[i]);
            answer += Math.max(0, Integer.parseInt(points[i]) - c * t);
            //System.out.print(answer + " ");
        }
        //System.out.println(answer);
        return answer;
    }

}