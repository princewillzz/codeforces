import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionD{
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);

        char grid[][] = new char[n][m];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                grid[i][j] = str.charAt(j);
            }
        }

        int ans = (n*m) + solve(grid, n, m);
        System.out.println(ans);
    }

    static int solve(char[] grid[],int n,int m) {
        int ans = 0;

        int r = 1, c = 1, sq = 0;
        int t = (int)Math.sqrt(n*m)-2;
        while(t-- > 0) {
            
            for(int i = r; i < n-r; i++) {
                for(int j = c; j < m-c; j++) {
                    int square = sq; boolean flag = true;
                    int row = i, column = j, l = 3;
                    while(square-- > 0) {
                        row--;column--;
                        for(int x = 0; x < l; x++) {
                            for(int y = 0; y < l; y++) {
                                //System.out.print(grid[row+x][column+y]);
                                if(grid[i][j] != grid[row+x][column+y]) {
                                    flag = false;
                                    break;
                                }
                            }
                            //System.out.println(flag);
                            if(!flag) break;
                        }
                        l+=2;

                    }
                    if(flag) {
                        int op = (l-3)/2 + 1;
                        //if(row+1 > n-1 || column+1 > m-1 || row-1 < 0 || column-1 < 0) break;
                        if(grid[i][j] == grid[i][j-op] && grid[i][j] == grid[i][j+op] && grid[i][j] == grid[i-op][j] && grid[i][j] == grid[i+op][j]) {
                            //System.out.println(i+" "+ j);
                            ans++;
                        }
                    }
                }
            }
            r++;c++;sq++;

        }

        return ans;
    }

}