import java.util.*;
public class beautifulMatrix263A {
    public static void main(String argv[]) {
        int n, index_of_one = 0, answer = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 25; i++) {
            n = sc.nextInt();
            if(n==1) index_of_one = i;
        }
        if(index_of_one>13) index_of_one = 25 - index_of_one + 1;
        while(index_of_one != 13) {
            if(index_of_one + 5 <= 15) {
                answer++;
                index_of_one+=5;
            } else {answer += Math.abs(13 - index_of_one);index_of_one = 13;}
        }
        System.out.print(answer);
    }
}
/*

0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0 

*/