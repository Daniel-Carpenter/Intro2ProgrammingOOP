/* This class illustrates various ways of accessing instance and static data 
 * and calling instance and static methods.
 */
public class UsingStaticDriver {

	public static void main(String[] args) {
		
		// Construct two UsingStatic objects.
		UsingStatic obj1 = new UsingStatic();
		UsingStatic obj2 = new UsingStatic();
		
		// Both the instance field and the static field can be accessed using 
		// an object reference.
		obj1.objData = 1;
		obj1.classData = 'a';
		obj2.objData = 2;
		obj2.classData = 'b';
		
		// Each object has its own copy of the instance field.
		System.out.println("obj1.objData: " + obj1.objData);
		System.out.println("obj2.objData: " + obj2.objData);
		System.out.println();
		
		// There is only one copy of the static field, so it stores whatever 
		// the last value it was assigned.
		System.out.println("obj1.classData: " + obj1.classData);
		System.out.println("obj2.classData: " + obj2.classData);
		System.out.println();
		
		// It is bad practice to access static data using an object reference. 
		// The better way to access static data is using the class name.
		UsingStatic.classData = 'z';
		
		// The static field has the same value regardless of how it is accessed.
		System.out.println("obj1.classData: " + obj1.classData);
		System.out.println("obj2.classData: " + obj2.classData);
		System.out.println("UsingStatic.classData: " + UsingStatic.classData);
		System.out.println();
		
		// Instance methods must be called on objects.
		System.out.println("obj1.getObjData(): " + obj1.getObjData());
		System.out.println("obj1.getClassData(): " + obj1.getClassData());
		System.out.println("obj2.getObjData(): " + obj2.getObjData());
		System.out.println("obj2.getClassData(): " + obj2.getClassData());
		System.out.println();
		
		// Static methods can be called on objects; however, like accessing 
		// static data, this is considered bad practice. The better way to call 
		// static methods is using the class name.
		System.out.println("obj1.sGetClassData(): " + obj1.sGetClassData());
		System.out.println("obj2.sGetClassData(): " + obj1.sGetClassData());
		System.out.println("UsingStatic.sGetClassData(): " 
				+ UsingStatic.sGetClassData());
		System.out.println();
		
		// Static methods can return instance data if they are passed an object.
		System.out.println("UsingStatic.sGetObjData(obj1): " 
				+ UsingStatic.sGetObjData(obj1));
		System.out.println("UsingStatic.sGetObjData(obj2): " 
				+ UsingStatic.sGetObjData(obj2));
		System.out.println();
	}
}
