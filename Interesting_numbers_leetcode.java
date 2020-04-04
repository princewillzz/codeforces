import java.util.HashMap;

class solution {
    //HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>(){{1, 0}, {10, 4}, {100, 4}, {1000, 454}, {10000, 454}, {100000, 45454}, {1000000, 45454}, {10000000, 4545454}, {100000000, 4545454};
    public static void main(String[] args) {
        String L = args[0];
        String R =args[1];
        System.out.println(interestingNumbers(L, R));
    }

    static int interestingNumbers(String L, String R) {
        int start = Integer.parseInt(L);
        int end = Integer.parseInt(R);
        int count = 0, odd, even;
        for(int i = start+1; i < end+1; i++) {
            odd = 0;
            even = 0;
            int temp = i;
            while(temp > 0) {
                int rem = temp%10;
                if(rem%2==0) even++;
                else odd++;
                temp/=10;
            }
            if(even%2 != 0 && odd%2==0) count++; 
        }
        return count;
    }


}