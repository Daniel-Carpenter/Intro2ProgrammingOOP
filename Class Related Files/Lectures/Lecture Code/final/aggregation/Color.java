/* Implement the following UML class diagram:
 * -------------------------------------------
 * |                  Color                  |
 * |-----------------------------------------|
 * | -red: int                               |
 * | -green: int                             |
 * | -blue: int                              |
 * |-----------------------------------------|
 * | +Color(red: int, green: int, blue: int) |
 * | +Color(Color color)                     |
 * | +Color(Color color1, Color color2)      |
 * | +mix(Color otherColor): Color           |
 * | +mix(Color color1, Color color2): Color |
 * |  -------------------------------------- |
 * | +rgbValues(): int[]                     |
 * | +toString(): String                     |
 * -------------------------------------------
 */

public class Color {

	private int red;
	private int green;
	private int blue;
	
	public Color(int red, int green, int blue) {
		// It's necessary to use "this" in the following code to distinguish 
		// the parameters from the fields.
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public Color(Color color) {
		// It's not necessary to use "this" in the following code, but I think 
		// it makes the assignment statements more clear.
		this.red = color.red;
		this.green = color.green;
		this.blue = color.blue;
	}
	
	public Color(Color color1, Color color2) {
		// It's not necessary to use "this" here, but as in the previous 
		// constructor, it helps emphasize which fields belong to which objects.
		this.red = (color1.red + color2.red) / 2;
		this.green = (color1.green + color2.green) / 2;
		this.blue = (color1.blue + color2.blue) / 2;
	}
	
	public Color mix(Color otherColor) {
				
		// Methods of a class can call other methods, including constructors.
		return new Color(this, otherColor);
		
		/* Below is an alternative implementation:
		int newRed = (this.red + otherColor.red) / 2;
		int newGreen = (this.green + otherColor.green) / 2;
		int newBlue = (this.blue + otherColor.blue) / 2;
		
		return new Color(newRed, newGreen, newBlue);
		 */
	}
	
	// This is a static method. Unlike the instance mix method above, it has no 
	// implicit this parameter, since it is called on the class. That means it 
	// requires two (explicit) Color parameters.
	public static Color mix(Color color1, Color color2) {
		
		return new Color(color1, color2);
		
		/* Below is an alternative implementation:
		int newRed = (color1.red + color2.red) / 2;
		int newGreen = (color1.green + color2.green) / 2;
		int newBlue = (color1.blue + color2.blue) / 2;
		
		return new Color(newRed, newGreen, newBlue);
		 */
	}
	
	public int[] rgbValues() {
		int[] values = {red, green, blue};
		return values;
	}
	
	public String toString() {
		return "(" + red + ", " + green + ", " + blue + ")";
	}
}
