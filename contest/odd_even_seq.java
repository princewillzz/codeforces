import java.util.*;

public class odd_even_seq{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int s[] = new int[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        
        System.out.println(solve(s, n, k));       

    }
    static int solve(int[] s, int n, int k) {
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(i%2 == 0 && i != 0) even.add(s[i]);
            else odd.add(s[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int l1 = even.size()-1, l2 = odd.size()-1;

        int deletes = n-k;
        if(l1 == deletes || l2 == deletes) {

        }
        
        while(deletes > 0) {
            if(even.get(l1-deletes) < odd.get(l2-deletes)) {
                return even.get(l1-deletes);
            } else if(even.get(l1-deletes) > odd.get(l2-deletes)) {
                return odd.get(l2-deletes);
            }
            deletes--;
        }

        return Math.min(even.get(l1), odd.get(l2));
    }

}