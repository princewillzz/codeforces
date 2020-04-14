import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class TwoTeamComposing1335C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            
            int n = Integer.parseInt(br.readLine()); 
            String s[] = br.readLine().split(" ");
            HashMap<Integer, Integer> map = new HashMap<>();
            int count_rep = 0;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(s[i]);
                if (!map.containsKey(a)) {
                    map.put(a, 1);
                } else {
                    map.put(a, map.get(a) + 1);
                }
            }
            int ts = 0;
            if(n==1) {System.out.println(0); continue;}
            

                int cmax = 0, cnt = 0;
                for(int j: map.values()) {
                    cmax = Math.max(cmax, j);
                    if(j == 1) cnt++;
                    else count_rep++;
                }
                //System.out.println(cnt);
                
                if(cnt < cmax) {ts = cnt;ts+=count_rep;
                    if(cmax==ts) ts--;
                    else if(ts > cmax) ts=cmax;
                }
                else if(cnt > cmax) {ts = cmax;}
                else {ts = cnt;}
            
            System.out.println(ts);
        }
    }
}