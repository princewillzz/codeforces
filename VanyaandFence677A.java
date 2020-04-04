import java.util.Scanner;
public class VanyaandFence677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt();
        int width_of_road = 0, height_of_friend;
        for(int i = 0; i < n; i++) {
            height_of_friend = sc.nextInt();
            if(height_of_friend <= h) width_of_road++;
            else width_of_road += 2;

        }
        System.out.println(width_of_road);
    }
}