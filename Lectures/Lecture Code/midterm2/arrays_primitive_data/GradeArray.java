import  java.util.Scanner;

/* This program illustrates how to use an array. First, an integer array is 
 * declared and constructed. Next, integers are read from the keyboard and 
 * assigned to the elements of the array. The content of the array is then 
 * printed. Finally, the average of the array elements is calculated and 
 * printed. Note that each step (other than constructing the array) is 
 * accomplished using a loop.
 */
public class GradeArray {

	public static void main(String[] args) {
		
		// Create a Scanner to get the grades from the user.
		Scanner keyboard = new Scanner(System.in);
		
		// Declare an integer array reference.
		int[] grades;
		
		// Construct an integer array (on the heap), and assign the address of 
		// the array to the reference grades (declared above). Note that the 
		// array can only hold 3 grades. If I want to store more grades, I need 
		// to increase the number in brackets.
		grades = new int[3];
		
		// Prompt the user to enter as many grades as there are integers in the 
		// array. Note that I get the number of integers by calling 
		// grades.length. length is a variable stored in the array object that 
		// stores the number of elements (integers in this case). We call this 
		// type of variable a "field."
		System.out.println("Please enter " + grades.length + " grades.");
		
		// Read the grades. Note that by using a loop and an array, I don't 
		// have to write multiple keyboard.nextInt() statements, as I've had to 
		// do in the past (like on Midterm 1).
		for (int index = 0; index < grades.length; ++index) {
			
			int grade = keyboard.nextInt();
			// Assign the last grade entered to the element of the array 
			// specified by the value of index. Note that index starts at 0 and 
			// takes on every integer up to grades.length. (The body of the 
			// loop does not execute when index equals grades.length, since 
			// index < grades.length is false.)
			grades[index] = grade;
		}
		
		// A common error when working with arrays is to print the reference 
		// when you want to print the content of the array. The following line 
		// of code will only print the address in the heap where the array is 
		// stored:
		//     System.out.println(grades);
		// In order to print the integers, I can use a loop.
		System.out.println("Below are the grades you entered.");
		for (int index = 0; index < grades.length; ++index) {
			
			// I will print each grade in two steps. First, I will copy the 
			// grade from the array to a temporary variable. Then I will print 
			// the variable. I could do this without a temporary variable, but 
			// I want to emphasize how the elements of the array are accessed.
			int grade = grades[index];
			System.out.println(grade);
		}
		
		// Calculate the average of all the grades stored in the array. Again, 
		// I will use a loop that iterates through every element of the array. 
		// Rather than print each integer, this time I will add each to the 
		// current value of an accumulator named "sum."
		int sum = 0;
		for (int idx = 0; idx < grades.length; ++idx) {
			
			// I used the name "idx" rather than "index" for the loop variable 
			// this time. The name is arbitrary, so I decided to abbreviate it.
			sum = sum + grades[idx];
		}
		
		// Calculate the average. Note that the numbers stored in sum and 
		// grades.length are both integers. I need to cast one of them as a 
		// double so the fractional part of the quotient is retained.
		double average = sum / (double) grades.length;
		
		System.out.println("Here is the average: " + average);
		
		keyboard.close();
	}
}
