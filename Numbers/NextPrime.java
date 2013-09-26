/** Next Prime Number - Have the program find prime numbers until the user chooses
 *  to stop asking for the next one.
 * */ 

import java.util.*;
import java.io.*;

public class NextPrime {
	private static List<Integer> primes;
	
	private static boolean check(int n) {
		for(int i : primes)
			if ((n%i == 0) && (n!=i)) return false;
		return true;
	}
	
	public static void main(String args[]) throws IOException{
		primes = new LinkedList<Integer>();
		primes.add(2);
		System.out.println("Prime numbers generator. For next press [ENTER], for exit - CTRL+D");
		
		int p = 2;
		System.out.print(2);
		while(System.in.read()>=0) { //-1 if eof
			while(true){
				p++;
				if (check(p)){
					primes.add(p);
					System.out.print(p);
					break;
				}
			}
		}
		System.out.println();
	}
}