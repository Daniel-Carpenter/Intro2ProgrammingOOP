/* This class illustrates the use of access modifiers and the static keyword.
 * 
 * UML class diagram:
 * ----------------------------------------------------------------
 * |                          ZooAnimal                           |
 * |--------------------------------------------------------------|
 * | -name: String                                                |
 * | -species: String                                             |
 * | -foodType: String                                            |
 * | -amountFoodPounds: double                                    |
 * | -habitatTemperatureFahrenheit: double                        |
 * | -onDisplay: boolean                                          |
 * | -POUNDS_TO_KILOGRAMS: double                                 |
 * |  ---------------------------                                 |
 * | +LION: String                                                |
 * |  ------------                                                |
 * | +SEA_OTTER: String                                           |
 * |  -----------------                                           |
 * |--------------------------------------------------------------|
 * | +ZooAnimal(name: String, species: String)                    |
 * | +ZooAnimal(name: String, species: String, foodType: String,  |
 * |             amountFoodPounds: double,                        |
 * |             habitatTemperatureFahrenheit: double,            |
 * |             onDisplay: boolean)                              |
 * | +getName(): String                                           |
 * | +getSpecies(): String                                        |
 * | +getFoodType(): String                                       |
 * | +getAmountFoodPounds(): double                               |
 * | +getAmountFoodKilograms(): double                            |
 * | +getHabitatTemperatureFahrenheit(): double                   |
 * | +getHabitatTemperatureCelsius(): double                      |
 * | +getOnDisplay(): boolean                                     |
 * | +setFoodType(foodType: String): void                         |
 * | +setAmountFoodPounds(amountFood: double): void               |
 * | +setAmountFoodKilograms(amountFood: double): void            |
 * | +setHabitatTemperatureFahrenheit(temperature: double): void  |
 * | +setHabitatTemperatureCelsius(temperature: double): void     |
 * | +setOnDisplay(onDisplay: boolean): void                      |
 * | -fahrenheitToCelsius(temperature: double): double            |
 * |  ------------------------------------------------            |
 * | -celsiusToFahrenheit(temperature: double): double            |
 * |  ------------------------------------------------            |
 * ----------------------------------------------------------------
 */
public class ZooAnimal {
	
	// This is instance data. Every ZooAnimal object has its own copy of these
	// variables.
	private String name;
	private String species;
	private String foodType;
	private double amountFoodPounds;
	private double habitatTemperatureFahrenheit;
	private boolean onDisplay;
	
	// This is static data. There is only one copy of each of these variables.
	private static final double POUNDS_PER_KILOGRAM = 2.20462;
	public static final String LION = "Panthera leo";
	public static final String SEA_OTTER = "Enhydra lutris";
	
	// There are no set methods for name and species, so any constructor needs 
	// at least two parameters to initialize these fields.
	public ZooAnimal(String name, String species) {
		
		// Call the constructor below to avoid rewriting all the assignment 
		// statements. This is not required; it just keeps the code concise.
		this(name, species, "", 0.0, 72.0, false);
	}
	
	// This constructor lets the calling method specify all the instance data.
	public ZooAnimal(String name, String species, String foodType, 
			double amountFoodPounds, double habitatTemperatureFahrenheit,
			boolean onDisplay) {
		
		this.name = name;
		this.species = species;
		this.foodType = foodType;
		this.amountFoodPounds = amountFoodPounds;
		this.habitatTemperatureFahrenheit = habitatTemperatureFahrenheit;
		this.onDisplay = onDisplay;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public double getAmountFoodPounds() {
		return amountFoodPounds;
	}
	
	// This get method uses the static constant POUNDS_PER_KILOGRAM to convert 
	// pounds to kilograms before returning the amount of food.
	public double getAmountFoodKilograms() {
		return amountFoodPounds / POUNDS_PER_KILOGRAM;
	}
	
	public double getHabitatTemperatureFahrenheit() {
		return habitatTemperatureFahrenheit;
	}
	
	// This get method uses a static method to convert degrees Fahrenheit to 
	// degrees Celsius before returning the habitat temperature.
	public double getHabitatTemperatureCelsius() {
		return fahrenheitToCelsius(habitatTemperatureFahrenheit);
	}
	
	public boolean getOnDisplay() {
		return onDisplay;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public void setAmountFoodPounds(double amountFood) {
		// The parameter and field have different names, so the keyword "this" 
		// is not required to distinguish them.
		amountFoodPounds = amountFood;
	}
	
	// The static constant POUNDS_PER_KILOGRAM is used here to allow the amount
	// of food to be specified in kilograms. Behind the scenes, though, each 
	// object only stores the amount in pounds.
	public void setAmountFoodKilograms(double amountFood) {
		amountFoodPounds = amountFood * POUNDS_PER_KILOGRAM;
	}
	
	public void setHabitatTemperatureFahrenheit(double temperature) {
		habitatTemperatureFahrenheit = temperature;
	}
	
	// The static method celsiusToFahrenheit is used here to allow the habitat 
	// temperature to be specified in degrees Celsius. Behind the scenes, each 
	// object only stores the temperature in degrees Fahrenheit.
	public void setHabitatTemperatureCelsius(double temperature) {
		habitatTemperatureFahrenheit = celsiusToFahrenheit(temperature);
	}
	
	public void setOnDisplay(boolean onDisplay) {
		this.onDisplay = onDisplay;
	}
	
	private static double fahrenheitToCelsius(double temperature) {
		return (temperature - 32) * (5.0/9.0);
	}
	
	private static double celsiusToFahrenheit(double temperature) {
		return temperature * (9.0/5.0) + 32;
	}
}
