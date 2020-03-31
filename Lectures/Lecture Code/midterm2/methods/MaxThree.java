/**
 * This program illustrates a method call inside the main method. The method 
 * maxThree, which is defined below the main method, returns the largest of 
 * three integers.
 */
public class MaxThree {
	
	public static void main(String[] args) {
		
		// Call the method maxThree with the arguments 1, 2, and 3. These 
		// values are assigned to the parameters x, y, and z, and then the 
		// method maxThree is executed. The result of the method is the value 
		// output by the return statement. This value is assigned to the local 
		// variable maximum.
		int maximum = maxThree(1, 2, 3);
		
		// Print the value stored in maximum to check that the code in the 
		// method maxThree is working correctly. The value printed should be 3.
		System.out.println("The maximum of the three arguments is " 
				+ maximum + ".");
	}
	
	// maxThree has three integer parameters. When the method is called, the 
	// values of the arguments (inputs) are assigned to the parameters. The 
	// method calculates and then returns (outputs) the largest integer.
	public static int maxThree(int x, int y, int z) {
		
		// Declare a local variable to store the largest of the three values 
		// stored in the parameters x, y, and z.
		int max;
		
		// Assign the larger of the two values stored in the parameters x and y 
		// to the local variable max.
		if (x > y) {
			max = x;
		}
		else {
			max = y;
		}
		
		// Check if the value stored in the parameter z is larger than the 
		// value stored in the local variable max. If so, assign the larger 
		// value to max.
		if (z > max) {
			max = z;
		}
		
		// Output the value stored in max. When the method maxThree is called, 
		// this value will be returned and can be stored in a local variable 
		// in the main method.
		return max;
	}
}
