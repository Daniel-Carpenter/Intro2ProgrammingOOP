/* Implement the following UML class diagram:
 * ----------------------------------------
 * |               Contact                |
 * |--------------------------------------|
 * | name: String                         |
 * | phone: String                        |
 * |--------------------------------------|
 * | Contact(name: String, phone: String) |
 * | getName(): String                    |
 * | getPhone(): String                   |
 * | toString(): String                   |
 * ----------------------------------------
 */

// The name of the class appears in the top compartment of the diagram.
public class Contact {

	// The fields appear in the middle compartment of the diagram.
	String name;
	String phone;
	
	// The methods appear in the bottom compartment of the diagram.
	
	// This is a constructor. Note that there is no return type (not even void).
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	// The method toString is called automatically when a reference to a 
	// Contact object is passed to System.out.println.
	public String toString() {
		return name + ": " + phone;
	}
}
