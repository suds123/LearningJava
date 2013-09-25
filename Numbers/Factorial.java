/**
 * **Factorial Finder** - The Factorial of a positive integer, n, 
 * is defined as the product of the sequence n, n-1, n-2, ...1 and the 
 * factorial of zero, 0, is defined as being 1. 
 * Solve this using both loops and recursion. 
 */

import java.io.*;
import java.math.*;

public class Factorial {
	
	private static BigInteger calcRecursive(int n){
		if (n==0) 
			return BigInteger.valueOf(1);
		else if (n==1) 
			return BigInteger.valueOf(1);
		else
			return calcRecursive(n-1).multiply(BigInteger.valueOf(n));
	}
	
	private static BigInteger calcLoop(int n) {
		BigInteger result = BigInteger.valueOf(1);
		for(int i=n; i>1; i--)
		{
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	
	public static void main(String args[]) throws IOException{
		System.out.println("Factorial calculator. Enter n: ");
		int userAns=10;
		BigInteger result;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			userAns = Integer.parseInt(br.readLine());
		
		
			System.out.print("Recurcive? (y/N): ");
			if (br.readLine().toLowerCase().equals("y")) {
				result = calcRecursive(userAns);
			} else {
				result = calcLoop(userAns);
			}
		}
		
		System.out.printf("Result: %d! = ",userAns);
		System.out.println(result.toString());
	}
}
