import java.util.Arrays;

public class Homework2Ans 
{
	public static void main(String[] args)
	{
		// PROBLEM # 1
		int[] array = {-7, 4, 9, -5, 11, 14};
		System.out.println("Element 9:  " + Arrays.binarySearch(array, 9));
		System.out.println("Length:     " + array.length);
		System.out.println("array[1]:   " + array[1]);
		
		Arrays.sort(array);
		System.out.println("Element 11: " + Arrays.binarySearch(array, 11));
		System.out.println("Element 2: " + Arrays.binarySearch(array, 2));
		
		System.out.println("");
		System.out.println("2a");
		System.out.println("________________________________________________");		System.out.println("");
		
		int[] notPrimes = {1, 4, 6};
	    int factor = 2; 
	    System.out.println("Not Scaled: " + Arrays.toString(notPrimes));
	    
	    
	    // PROBLEM # 2
	    notPrimes = scale(notPrimes, factor);
	    System.out.println("Scaled:     " + Arrays.toString(notPrimes));

	    System.out.println("");
	    System.out.println("2b");
		System.out.println("________________________________________________");		System.out.println("");
		
		
		int[] notPrimes2 = {1, 4, 6};
		factor = 3;
	    System.out.println("Not Scaled:  " + Arrays.toString(notPrimes2));
		scale2(notPrimes2, factor);
	    System.out.println("Scaled:      " + Arrays.toString(notPrimes2));
	    
	    System.out.println("");
	    System.out.println("2c");
		System.out.println("________________________________________________");		System.out.println("");
	    
		int[] arrayIn = {9, 3, 7, 4};
	    System.out.println("arrayIn:  " + Arrays.toString(arrayIn));
	    
	    repeatArray(arrayIn);
	    System.out.println("Repeated: " + Arrays.toString(repeatArray(arrayIn)));
	    
		
	    System.out.println("");
	    System.out.println("2d");
		System.out.println("________________________________________________");		System.out.println("");
	    
		int[] arrayIn2 = {7, 8, 9, 10, 12, 14};
	    System.out.println("Normal:  " + Arrays.toString(arrayIn2));
	    
	    int shift = 2;
	    shiftRight(arrayIn2, shift);
	    System.out.println("Offset:  " + Arrays.toString(arrayIn2));
	    
	    System.out.println("");
	    System.out.println("2e");
		System.out.println("________________________________________________");		System.out.println("");
	    
	    int[] arr1 = {7, 1, 6, 5, 2};
	    int[] arr2 = {3, 9, 4};
	    int[] sum = addArrays(arr2, arr1);  //  Careful!

	    System.out.println("arr1: " + Arrays.toString(arr1));
	    System.out.println("arr2: " + Arrays.toString(arr2));
	    System.out.println("sum:  " + Arrays.toString(sum));
	    
	    
	    
	}
	
	public static int[] scale(int[] arr, int mult)
	{
	    int[] product = new int[arr.length*2];

	    for (int idx = 0; idx < arr.length; ++idx)
	    {
	        product[idx*2] = mult * arr[idx];
	        product[idx*2+1] = mult - arr[idx];
	    }

	    return product;
	}
	
	public static void scale2(int[] arr, int mult)
	{
	    for (int idx = 0; idx < arr.length; ++idx)
	    {
	        arr[idx] = mult - arr[idx];
	    }
	}
	
	// REPEAT ARRAY - PROBLEM 2c
	public static int[] repeatArray(int[] arr)
	{
	    int[] repeated = new int[2*arr.length];

	    for (int idx = 0; idx < arr.length; ++idx)
	    {
	        int element = arr[idx];
	        repeated[idx] = element;
	        repeated[idx + arr.length] = element;
	    }

	    return repeated;
	}
	
	
	public static void shiftRight(int[] arr, int offset)
	{
	    int[] temp = new int[arr.length];

	    for (int idx = 0; idx < arr.length; ++idx)
	    {
	        int idxOffset = (idx + offset) % arr.length;
	        temp[idxOffset] = arr[idx];
	    }

	    for (int idx = 0; idx < arr.length; ++idx)
	    {
	        arr[idx] = temp[idx];
	    }
	}
	
	
	public static int[] addArrays(int[] arr1, int[] arr2)
	{
	    if (arr1.length < arr2.length) 
	    {
	        int[] temp = arr1;
	        arr1 = arr2;
	        arr2 = temp;
	    }
	    
	    int[] sum = new int[arr1.length];
	    for (int idx = 0; idx < arr1.length; ++idx) 
	    {
	        sum[idx] = arr1[idx];
	    }

	    for (int idx = 0; idx < arr2.length; ++idx)
	    {
	        sum[idx] = arr1[idx] + arr2[idx];
	    }

	    return sum;
	}


	
	
}

