import java.util.Scanner;

public class BankCompare {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int time = sc.nextInt();
		long banks[] = new long[2];
		for(int op = 0; op < 2; op++) {
			
			int slab = sc.nextInt();
			
			for(int i = 0; i < slab; i++) {
				double sum = 0;
				double period = sc.nextDouble();
				double rate = sc.nextDouble();
				sum = (p*rate)/(1 - 1/(Math.pow((1+rate),(period*12))));
				banks[op] += sum*12 * period;				
			}
			
		} sc.close();
		if(banks[0] < banks[1]) System.out.println("Bank A");
		else System.out.println("Bank B");
		

    }

}