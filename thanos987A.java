import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thanos987A {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 6 - n, key_int[] = {1, 2, 3, 4, 5, 6};
        String key[] = {"purple", "green", "blue", "orange", "red", "yellow"};
        String gems[] = {"Power", "Time", "Space", "Soul", "Reality", "Mind"};
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < 6; j++) {
                if(s.compareTo(key[j]) == 0) key_int[j] = 0;
            }
        }
        System.out.println(ans);
        for(int j = 0; j < 6; j++) {
            if(key_int[j] != 0)
            System.out.println(gems[j]);
        }

    }


}