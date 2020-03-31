import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class Test_8
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        //Array with duplicate elements
        String[] array = new String[] {"aaa","aaa","ccc","bbb"};
         
        //This array has duplicate elements
        //System.out.println( Arrays.toString(numbers) );
         
        //Create set from array elements
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(array) );
        String[] numbersWithoutDuplicates = linkedHashSet.toArray(new String[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}