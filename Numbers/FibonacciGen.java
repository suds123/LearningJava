/* Fibonacci Sequence - Enter a number and have the program generate the 
 * Fibonacci sequence to that number or to the Nth number.
 * @author RomanGotsiy (gotsijroman@gmail.com)
 */ 

import java.util.*;
import java.io.*;

public class FibonacciGen {
	
	public static void main(String args[]) throws IOException{
		System.out.println("How many Fibonacci numbers should I print for you?:");
		int userAns = 10;
		
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			userAns = Integer.parseInt(in.readLine());
		}
		
		if (userAns<1) { System.exit(0); }
		System.out.print("0");
		
		if (userAns==1){
			System.out.println();
			System.exit(0);	
		}
		
		System.out.print(" 1");
		if (userAns==2) {
			System.out.println();
			System.exit(0);
		}
		
		//else
		
		int n_2 = 0; //(n-2)th number
		int n_1 = 1; //(n-1)th number
		for(int i=3; i<userAns+1; i++)
		{
			int n = n_2 + n_1;
			System.out.print(" "+n);
			n_2 = n_1;
			n_1=n;
		}
		System.out.println();
	}
}