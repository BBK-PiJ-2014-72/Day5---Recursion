
/**
 * 4. Palindrome
 * 
 * Create a program with a (recursive) method that takes a string parameter and returns true
 * and false otherwise. Compare this recursive version with the iterative version you wrote
 * in past weeks. Which one seems clearer?
 * @author dbullo01
 *
 */
import java.util.Scanner;

public class PalindromeRecursive{
	
	public static boolean Palindrome(String str){
		
		if (str.length() == 1){  // Base case1
			return true;
		}
		
		if (str.length() == 2){  // Base case2 - String with 2 characters
			if (str.charAt(0) == str.charAt(1)){
				return true;
			}
			else {
				return false;
			}
		}
	
		int num = 0;
		return PalindromeRecursive.Palindrome(str.substring(num + 1, str.length() - 1)) && (str.charAt(0) == str.charAt(str.length() - 1)) ? true:false;
	}

	public static void main(String[] args){
		System.out.println("Please enter a string");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		boolean isPalindrome = PalindromeRecursive.Palindrome(str);
		System.out.println("Is entered text palindrome?:" + isPalindrome);
	}
	
}
