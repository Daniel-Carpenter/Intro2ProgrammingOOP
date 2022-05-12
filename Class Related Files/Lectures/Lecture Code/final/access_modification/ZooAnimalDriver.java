
public class ZooAnimalDriver {

	public static void main(String[] args) {
		
		// Use the two-argument constructor to create a ZooAnimal object. I 
		// used the public static constant ZooAnimal.LION so I don't need to 
		// look up the full species name.
		ZooAnimal animal1 = new ZooAnimal("Erwin", ZooAnimal.LION);
		
		// The two-argument constructor assigns default values to the food 
		// type, amount of food, habitat temperature, and onDisplay boolean. 
		// Use the set methods to update these fields.
		animal1.setFoodType("Alaskan Salmon");
		animal1.setAmountFoodPounds(8);
		
		// Print the amount of food in kilograms and the habitat temperature in 
		// degrees Celsius.
		System.out.println(animal1.getAmountFoodKilograms());
		System.out.println(animal1.getHabitatTemperatureCelsius());
	}
}
