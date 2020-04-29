import java.util.ArrayList;

public class homework6 
{
	public static void main(String[] args) 
	{
		int size = 5;
		ArrayList<Integer> student = new ArrayList<Integer>(size);
		
		student.add(201);
		student.add(0, 202);
		student.add(1, 203);
		
		System.out.print(student);
	}
}
