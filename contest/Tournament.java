import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tournament{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {

            String line1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(line1[0]), m = Integer.parseInt(line1[1]);

            int[][] ar = new int[n][m+1];

            String initial[] = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++) {
                ar[i][0] = Integer.parseInt(initial[i]);
            }

            for(int i = 0; i < n; i++) {
                String month[] = br.readLine().trim().split(" ");
                for(int j = 1; j < m+1; j++) {
                    ar[i][j] = ar[i][j-1] + Integer.parseInt(month[j-1]);
                } 
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m+1; j++) {
                    System.out.print(ar[i][j]+" ");
                } System.out.println();
            }

            System.out.println(solve(ar, n, m));

        }
        

    }

    public static int solve(int ratings[][], int n, int m) {
        int ans = 0;
        ArrayList<Integer> topRa = new ArrayList<>();
        // Top rating of each person
        for(int i = 0; i < n; i++) {
            int top = ratings[i][1], month = 0;
            for(int j = 1; j < m+1; j++) {
                if(top < ratings[i][j]) {
                    top = ratings[i][j];
                    month = j-1;
                }

            }
            topRa.add(month);
            
        }System.out.println(topRa);

        // rankings
        ArrayList<Integer> topR = new ArrayList<>();
        for(int i = 0; i < n; i++ ) {
            int top = 0;
            for(int col = 1; col < m+1; col++) {
                
                for(int row = 0; row < n; row++) {
                    if(ratings[row][col] > ratings[top][col]) {
                        top = row;
                    }
                }
                
            }
            topR.add(top);
        }
        System.out.println(topR);

        for(int i = 0; i < n; i++) {
            int month = topRa.get(i);
            for(int j = 0; j < m; j++) {
                if(month == j) continue;
                int winner = topR.get(j);
                if(winner == i) {
                    ans++;break;
                }
            }System.out.println(ans);
        }



        return ans;
    }

}