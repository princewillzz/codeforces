import java.util.*;

public class brideHuntingTCS {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int ar[][] = new int[row][col];
        int flag = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int cord[] = new int[2];
        int max_score = 0;
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(r==0 && c == 0) continue;
                
                if(ar[r][c]==1) {
                    int curr_max = 0;
                    /*for(int k = 0; k < 9; k++) {
                        if(r-1 < 0 || r+1 >= row || c-1 < 0 || c+1 >= col) continue;
                        if((r-1 == 0 && (c-1 == 0||c == 0)) || (r == 0 && c-1 == 0)) continue;
                        ar[r][c] = 0;
                    }*/
                    for(int x = r-1; x < r+2; x++) {
                        if(x<0) continue;
                        if(x>=row) break;
                        for(int y = c-1; y < c+2; y++) {
                            if(x==0 && y==0) continue;
                            if(y<0) continue;
                            if(y>=col) break;
                            if(x==r && y==c) continue;
                            if(ar[x][y] == 1) curr_max++;
                        }
                    }
                    
                    if(max_score < curr_max) {
                        max_score = curr_max;
                        cord[0] = r; cord[1] = c;
                        flag = 0;
                    }else if(max_score == curr_max) {
                        double d1 = distance(cord[0], cord[1]);
                        double d2 = distance(r, c);
                        if(d1==d2) flag = 1;
                        if(d2<d1) {
                            cord[0] = r;
                            cord[1] = c;
                        } 
                    }
                }
            }
        }
        if(flag==1) System.out.println("Polygamy");
        else if(max_score==0) System.out.println("No suitable girl found");
        else System.out.println((cord[0]+1)+":"+(cord[1]+1)+":"+max_score);
        
    }

    static double distance(int x1, int y1) {
        
        double dist = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        return dist;
    }

}