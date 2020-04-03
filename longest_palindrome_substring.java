import java.lang.Math;
class solution {
    public static void main(String[] args) {
        System.out.println(solve(args[0]));
    }

    static String solve(String str) {
        int start = 0, end = 1;
        
        for(int i = 0; i < str.length(); i++) {
            int len1 = check(i, i, str);
            int len2 = check(i, i+1, str);
            int max = Math.max(len1, len2);
            if(max > end - start) {
                start = i - (max-1)/2;  
                end = i + max/2 + 1;       
            }
        }
        return str.substring(start, end);
    }

    static int check(int start, int end, String str) {
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start --;
            end ++;
        }
        return end - start - 1;
    }
}

