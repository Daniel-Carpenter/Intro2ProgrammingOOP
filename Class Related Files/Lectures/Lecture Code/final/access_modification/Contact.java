/* Objects of the Contact class are intended to be immutable. However, without 
 * using access modifiers, the fields can be changed even if the class does not 
 * include set methods. Below is an example:
 * 
 * Contact contact = new Contact("James", "555-1234");
 * contact.name = "Teddy";
 * 
 * To prevent the fields from being directly accessibly, update the Contact 
 * class and make the fields private.
 * 
 * -----------------------------------------
 * |                Contact                |
 * |---------------------------------------|
 * | -name: String                         |
 * | -phone: String                        |
 * |---------------------------------------|
 * | +Contact(name: String, phone: String) |
 * | +getName(): String                    |
 * | +getPhone(): String                   |
 * | +toString(): String                   |
 * -----------------------------------------
 */

public class Contact {

	// Add the private keyword to each field.
	private String name;
	private String phone;
	
	// The only way to set the name and phone fields is with the constructor. 
	// After a Contact object is created, its state cannot be changed.
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
	
	public String toString() {
		return name + ": " + phone;
	}
}
