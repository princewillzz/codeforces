import java.util.Scanner;

public class CountTriangles1355C {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int ans = 0;
        for (int x = a; x <= b; x++) {
            for (int y = b; y <= c; y++) {

                int z = c, end = d;
                while (z <= end) {
                    int mid = z / 2 + d / 2;
                    if (degenarated(x, y, mid)) {
                        end = mid - 1;
                        if (!degenarated(x, y, end)) {
                            ans += end - c;
                            break;
                        }
                    } else {
                        z = mid + 1;
                        if (degenarated(x, y, z)) {
                            ans += z - c;
                            break;
                        }
                    }
                }

            }
        }

        System.out.println(ans);

    }

    static boolean degenarated(int x, int y, int z) {
        if (x + y <= z || x + z <= y || y + z <= x)
            return true;

        return false;
    }

}