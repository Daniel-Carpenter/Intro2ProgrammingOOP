
public class ContactDriver {

	public static void main(String[] args) {
		
		// Contact objects are now truly immutable. The fields can only be set 
		// by the constructor.
		Contact contact = new Contact("James", "555-1234");

		// The following line causes an error because the fields are private. 
		// They can only be accessed inside the Contact class. Since the class 
		// has no set methods, the fields cannot be changed.
		//contact.name = "Teddy";
	}
}
