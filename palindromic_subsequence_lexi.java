
import java.util.ArrayList;
class solution {
    public static void main(String[] args) {
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(beforeUsedMem);
        System.out.println(solve(args[0]));
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(afterUsedMem);
        long actualMemUsed=afterUsedMem-beforeUsedMem;
        System.out.println(actualMemUsed);
    }

    static String solve(String str) {
        String strall = "";
        int count = 0, size = 0;
        
        for(int i = 0; i < str.length(); i++) {
            int len1 = check(i, i, str);
        
            int len2 = check(i, i+1, str);
            int max = Math.max(len1, len2);
            if(max > size) {
                strall = str.substring(i-(max-1)/2, i+max/2+1);
                size = max;
            } else if( max == size && strall.compareTo(str.substring(i-(max-1)/2, i+max/2+1)) > 0) {
                strall = str.substring(i-(max-1)/2, i+max/2+1);
            }
        }
                
        return strall;
    }

    static int check(int start, int end, String str) {
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start --;
            end ++;
        }
        return end - start - 1;
    }
}

