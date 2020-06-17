import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddSelection1363A {
	public static void main(String argv[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]), x = Integer.parseInt(str[1]);
			String s[] = br.readLine().split(" ");
			int odd = 0;
			for (String e : s) {
				if (Integer.parseInt(e) % 2 != 0)
					odd++;
			}

			if (odd > 0 && !(n == x && odd % 2 == 0) && !(odd == n && x % 2 == 0)) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		}

	}

}