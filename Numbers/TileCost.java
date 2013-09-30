/**
 * Find Cost of Tile to Cover W x H Floor - Calculate the total 
 * cost of tile it would take to cover a floor plan of width and height, 
 * using a cost entered by the user.
 * 
 * @author Roman Gotsiy (gotsijroman@gmail.com)
 */

import java.io.*;
import java.util.*;

class TileCost {
	public static void main(String args[]){
		try(Scanner s = new Scanner(new InputStreamReader(System.in))) {
			System.out.println("Input cost per sq. meter: ");
			float cost = s.nextFloat();
			System.out.println("Input floor width: ");
			float width = s.nextFloat();
			System.out.println("Input floor height: ");
			float height = s.nextFloat(); 
			
			 
			System.out.printf("The total cost is $%.2f for %.2f square meters\n",
					cost*width*height,width*height);
		  }
		  catch(InputMismatchException e){
			  System.out.println("Incorrect number. Terminating");
			  System.exit(0);
		  }
	}		  
}