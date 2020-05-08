import java.util.Scanner;

public class KanaDragonQuest1337B {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int x = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();
			while(n-- > 0 && x > 20) {
				x /=2;
				x += 10;
			}
			while(m-- > 0 && x > 0) {
				x -= 10;
			}
			if(x <= 0) System.out.println("YES");
			else System.out.println("NO");
		}

    }

}