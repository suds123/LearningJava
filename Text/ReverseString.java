import java.io.*;

/**
 * Reverse a String - Enter a string and the program
 * will reverse it and print it out.
 * @author RomanGotsiy (gotsijroman@gmail.com
 */

public class ReverseString {
	
	public static void main(String args[]) 
	throws IOException {
		System.out.println("Whatchu wanna say to me? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		String reversed = new StringBuilder(line).reverse().toString();
		System.out.printf("You say '%s', I say '%s' \n",line,reversed);
	}
}
