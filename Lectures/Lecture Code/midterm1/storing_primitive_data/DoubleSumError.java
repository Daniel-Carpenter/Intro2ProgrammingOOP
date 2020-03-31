/**
 * This program illustrates the limited precision of the double data type using 
 * an example from the slides on primitive data types.
 */
public class DoubleSumError {

	public static void main(String[] args) {
		
		// Assign a big double and a small double to two variables.
		double bigDouble = 732542000000000000000.0;
		double smallDouble = 1.0;
		
		// Add the doubles and output the result to the console.
		System.out.println(bigDouble + smallDouble);
		
		// The output of the previous line and the exact sum are shown below.
		// Console output: 7.325420000000001E20
		//      Exact sum: 7.32542000000000000001E20
		// The computer calculation is not exact because a double only has 
		// enough memory to store about 15 digits in the mantissa (i.e., the 
		// digits after the decimal point).
	}
}