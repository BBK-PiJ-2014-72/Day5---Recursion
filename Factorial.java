
/**
 * a) Factorial
 * 
 * Write a small program with a method that calculates the factorial of an integer number
 * as seen in the notes. It is easy to do this both iteratively and recursively? Try both
 * ways and see which is more natural for you. If one takes too long, try the other.
 * 
 * @author dbullo01
 *
 */
import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n){
		if (n == 1){
			return 1;
		}
		else {
			int result = n * factorial(n-1);
			return result;
		}
	}

	public static void main(String[] args){

		System.out.println("Please enter number:");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int num = Integer.parseInt(str);
		double result = Factorial.factorial(num);
		System.out.println("The factorial of " + num + " is:" + result);
		
	}
	
}
