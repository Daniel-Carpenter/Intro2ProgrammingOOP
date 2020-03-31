/* The following class is intended to illustrate the effects of the static 
 * keyword on fields and methods. Access modifiers are omitted to focus on this 
 * topic.
 * 
 * UML class diagram:
 * -----------------------------------------------
 * |                 UsingStatic                 |
 * |---------------------------------------------|
 * | objData: int                                |
 * | classData: char                             |
 * | ---------------                             |
 * |---------------------------------------------|
 * | getObjData(): int                           |
 * | getClassData(): char                        |
 * | sGetObjData(): int  <-- This is impossible. |
 * | ------------------                          |
 * | sGetClassData(): char                       |
 * | ---------------------                       |
 * -----------------------------------------------
 */
public class UsingStatic {

	// The class has an instance and a static field. Each object of the class 
	// has its own copy of the instance field, but the class has only one copy 
	// of the static field.
	int objData;  // object (aka instance or non-static) data
	static char classData;  // class (aka static) data
	
	// Define an instance method that returns the instance field. This works 
	// because the method must be called on an object, so there is no 
	// ambiguity as to what copy of the instance field should be returned.
	int getObjData()
	{
		return objData;
	}
	
	// Define an instance method that returns the static field. Although 
	// instance methods must be called on an object, this works because there 
	// is only one copy of the static field. There is no ambiguity as to what 
	// static field should be returned, since there is only one copy.
	char getClassData()
	{
		return classData;
	}
	
	// Define a static method that returns the instance field. This is 
	// impossible because static methods are called on the class. There is no 
	// way for the method to know which copy of the instance field to return.
//	static int sGetObjData()
//	{
//		return obj.objData;
//	}
	
	// A static method can return an instance field, but it requires a 
	// reference to an object of the class, like in the following example. This 
	// is similar to how instance methods work behind the scenes. When an 
	// instance method is called on an object, the method is implicitly given 
	// a reference to the object. The reference is stored in a parameter with 
	// the identifier "this".
	static int sGetObjData(UsingStatic obj)
	{
		return obj.objData;
	}
	
	// Define a static method that returns the static field. This works because 
	// both the method and the field are associated with the class, not any 
	// particular object of the class.
	static char sGetClassData()
	{
		return classData;
	}
}
