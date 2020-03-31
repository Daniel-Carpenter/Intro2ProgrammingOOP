/**
 * This program was written at the end of our discussion on numerical 
 * operations. It calculates the average of three grades.
 */
public class AverageGrade {
	
	public static void main(String[] args) {
	
		// Note that these grades are stored as integers.
		int grade1 = 50;
		int grade2 = 99;
		int grade3 = 87;
		
		// The average must be calculated as a double. There are multiple ways 
		// to do this. Here I've used a double for the denominator. When the 
		// division is performed, the numerator is promoted to a double.
		double average = (grade1 + grade2 + grade3) / 3.0;
		
		System.out.println("The average is " + average);
	}
}
