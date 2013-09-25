/** **Prime Factorization** - Have the user enter 
 * a number and find all Prime Factors (if there are any) and display them.
 */

import java.io.*;
import java.math.*;
import java.util.*;

public class Factorization {
	/**one of the simplest factorization algorithm.*/
	private static List<Integer> trialDivision(int n){
		List<Integer> result = new ArrayList<Integer>();
		long square = Math.round((Math.sqrt(n))) + 1;
		
		int d=2; //divisor
		while(n>1){
			if (d>square) break;
			while(n%d == 0){
				result.add(d);
				n/=d;
			}
			d+=1;
		}
		return result;
	}
	
	public static void main(String args[]) throws IOException{
		System.out.print("Input a number: ");
		int n=10;
		try(Scanner in= new Scanner(new InputStreamReader(System.in))){
			n = in.nextInt();
		}
		System.out.println();

		System.out.printf("Factorization of number %d: ", n);
		List<Integer> res = trialDivision(n);
		System.out.println(res.toString());
	}
}