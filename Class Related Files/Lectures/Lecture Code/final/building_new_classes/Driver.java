import java.util.ArrayList;

// This program is composed of two classes: Contact and Driver. The Driver 
// class simply contains the main method.
public class Driver {

	public static void main(String[] args) {
		
		// Construct a couple of Contact objects, which each contain a name and 
		// phone number.
		Contact contact1 = new Contact("James", "405-555-1234");
		Contact contact2 = new Contact("Teddy", "610-555-4321");
		
		// The getter methods return the data stored in the object on which 
		// they are called.
		System.out.println("contact1.getName(): " + contact1.getName());
		System.out.println("contact2.getName(): " + contact2.getName());
		System.out.println("contact1.getPhone(): " + contact1.getPhone());
		System.out.println("contact2.getPhone(): " + contact2.getPhone());
		System.out.println();
		
		// Objects of our class can be stored in an ArrayList. To do this, use 
		// the class name as the type parameter.
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact1);
		contactList.add(contact2);
		
		// Print the contact list. Because the toString method is defined in 
		// the Contact class, the names and phone numbers of the Contact 
		// objects are printed, rather than their addresses.
		System.out.println(contactList);
	}
}
