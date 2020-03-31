
public class ColorDriver {

	public static void main(String[] args) {
		
		// Create two color objects using the constructor with three integer 
		// parameters.
		Color red = new Color(255, 0, 0);
		Color blue = new Color(0, 0, 255);
		System.out.println("red: " + red);
		System.out.println("blue: " + blue);
		System.out.println();
		
		// Create a copy of red using the copy constructor.
		Color redCopy = new Color(red);
		System.out.println("new Color(red): " + redCopy);
		System.out.println();
		
		// Create purple using the constructor with two Color parameters.
		Color purple = new Color(red, blue);
		System.out.println("new Color(red, blue): " + purple);
		System.out.println();
		
		// Create purple using the instance mix method. Note that this method 
		// can be called on either red or blue.
		System.out.println("red.mix(blue): " + red.mix(blue));
		System.out.println("blue.mix(red): " + blue.mix(red));
		System.out.println();
		
		// Create purple using the static mix method.
		System.out.println("Color.mix(red, blue): " + Color.mix(red, blue));
	}
}
