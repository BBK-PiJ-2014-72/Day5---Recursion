

/* b) Fibonacci
 * 
 * Write a small program with a method that calculates the nth element of the Fibonacci
 * sequence as seen in the notes. It is easy to do this both iteratively and recursively?
 * Try both ways and see which is more natural for you. If one takes too long, try the other way.
 * When doing it recursively, do it with and without memoization.
 * 
 * Compare the time that is in each case to find F(40) or F(45)
 * 
 */

import java.util.Scanner;


public class Fibonacci {

	public static int fib(int n){
		if (n == 1 || n == 2){
			return 1;
		} 
		else{
			int result = fib(n-1) + fib(n-2); //method calls itself
			return result;
		}
	}
	
	public static void main(String[] args){
	
		System.out.println("Please enter a number to calculate fib:");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int num = Integer.parseInt(str);
		int result = Fibonacci.fib(num);
		System.out.println("" + num + " Fibonacci is:" + result);
		
		
	}
	
}
