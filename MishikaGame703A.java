import java.util.Scanner;

public class MishikaGame703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mC = 0, cC = 0;
        while(n-->0) {
            int Mishika = sc.nextInt();
            int Chris = sc.nextInt();
            if(Mishika>Chris) mC++;
            else if(Chris > Mishika) cC++;

        }
        if(mC > cC) System.out.print("Mishka");
        else if(cC > mC) System.out.print("Chris");
        else System.out.print("Friendship is magic!^^");
    }
}