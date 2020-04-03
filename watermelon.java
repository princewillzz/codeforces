
import java.util.Scanner;

class watermelon {

	public static void main(String arg[]) {
		


float startTime = System.currentTimeMillis();


		int w = 90;

		if(w % 2 == 0 && w > 3) System.out.println("Yes");
		else System.out.println("No");

float endTime = System.currentTimeMillis();
System.out.println("Took "+(endTime - startTime) + " ms"); 

}
}