/* This program shows three ways of writing a method with an object reference 
 * parameter. All three methods are intended to change an object; however, the 
 * second method does not work. It is an example of a common mistake.
 * 
 * To keep the code as simple as possible, the object passed to each method is 
 * an integer array with only a single element. Each method is intended to set 
 * the element to 1. The first method modifies the given array. The second 
 * method creates and modifies a copy of the array, but returns nothing. The 
 * third method works like the second, but it returns the copy.
 */

public class MethodsAndReferences {

	public static void main(String[] args)
	{		
		// Case 1: pass by sharing. The main method and setToOneCase1 share the 
		// object array1. The method setToOneCase1 modifies the array.
		int[] array1 = {42};
		setToOneCase1(array1);
		System.out.println("Case 1: pass by sharing");
		System.out.println("array1[0]: " + array1[0]);
		System.out.println();
		
		// Case 2: copy the object but do not return it (error). The method 
		// setToOneCase2 makes a copy of array2 and modifies the copy. It does 
		// not return the copy. Note that array2 is unchanged by the method.
		int[] array2 = {42};
		setToOneCase2(array2);
		System.out.println("Case 2: copy and modify object; return nothing");
		System.out.println("array2[0]: " + array2[0]);
		System.out.println();
		
		// Case 3: copy, modify, and return the given object. The method 
		// setToOneCase3 makes a copy of array3, changes the copy, and then 
		// returns it. The address of the copy is assigned to array3. The 
		// original array is garbage collected.
		int[] array3 = {42};
		array3 = setToOneCase3(array3);
		System.out.println("Case 3: copy and modify object; return copy");
		System.out.println("array3[0]: " + array3[0]);
		System.out.println();
	}
	
	// This method modifies the given array. It does not create a copy of the 
	// array, and it does not return anything.
	public static void setToOneCase1(int[] arr)
	{
		// The reference variable arr stores the address of an array created 
		// in another method. This method sets the first element to 1.
		arr[0] = 1;
	}
	
	// This method makes a copy of the given array and then modifies the copy. 
	// It does not return anything.
	public static void setToOneCase2(int[] arr)
	{
		// Construct a new array with the same length as the given array. 
		// Overwrite the address stored in arr with the new array address.
		arr = new int[arr.length];
		
		// Set the first element of the new array to 1.
		arr[0] = 1;
		
		// The method does not return the new array. Sometime after the method 
		// returns, the new array will be garbage collected.
	}

	// This method makes a copy of the given array, modifies the copy, and then 
	// returns the copy.
	public static int[] setToOneCase3(int[] arr)
	{
		// Perform the same operations as in the second method.
		arr = new int[arr.length];
		arr[0] = 1;
		
		// Return the copy so it can be used by the calling method.
		return arr;
	}
}
