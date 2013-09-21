import java.io.*;

/**
 * Check if Palindrome - Enter a string and the program
 * will check it for polindrome and print result.
 * @author RomanGotsiy (gotsijroman@gmail.com
 */

public class PalindromeCheck {
	
	public static void main(String args[]) 
	throws IOException {
		System.out.println("Enter string: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine().toLowerCase();
		
		boolean res = line.equals(new StringBuilder(line).reverse().toString());
		
		if (res)
			System.out.println("Palindrome!");
		else
			System.out.println("Oops. Not a palindrome. Try again!");
	}
}
