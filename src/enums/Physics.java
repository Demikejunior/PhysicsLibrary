package enums;

public class Physics {

	static double G = 9.82;
	static double ATM = 101.3E3; // 101.3 kPa
	static double R = 8.3144598;
	static double p_0 = 101325;
	static double c = 299792458;
	static double g_swe = 9.82;

	/**
	 * Calculates the temperature given - in fahrenheit - into celsius. <br> <br>
	 * 
	 * Parameter 1 is the temperature in fahrenheit. <br>
	 * Returns the temperature in celsius.
	 * 
	 * @param fahrenheit
	 * @return celsius
	 */
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	
	/**
	 * Calculates the temperature given - in celsius - into fahrenheit. <br> <br>
	 * 
	 * Parameter 1 is the temperature in celsius. <br>
	 * Returns the temperature in fahrenheit.
	 * 
	 * @param celsius
	 * @return fahrenheit
	 */

	public static double celsiusToFahrenheit(double celsius) {
		return celsius * 1.8 + 32;
	}
	
	/**
	 * Calculates the temperature given - in kelvin - into celsius. <br> <br>
	 * 
	 * Parameter 1 is the temperature in kelvin. <br>
	 * Returns the temperature in celsius.
	 * 
	 * @param kelvin
	 * @return celsius
	 */

	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	/**
	 * Calculates the temperature given - in celsius - into kelvin. <br> <br>
	 * 
	 * Parameter 1 is the temperature in celsius. <br>
	 * Returns the temperature in kelvin.
	 * 
	 * @param celsius
	 * @return kelvin
	 */

	public static double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}
	
	/**
	 * Calculates the fluid pressure in a specified fluid at a specified depth. <br> <br>
	 * 
	 * Parameter 1 is the type of fluid. <br>
	 * Parameter 2 is how far down that the pressure is measured - in meters. <br>
	 * Returns the pressure in newtons per square meter.
	 * 
	 * @param fluid
	 * @param depth
	 * @return p
	 */

	public static double fluidPressure(FluidTable fluid, double depth) {
		return fluid.density * G * depth;
	}
	
	/**
	 * Calculates the fluid pressure in a specified fluid at a specified depth. <br> <br>
	 * 
	 * Parameter 1 is how far down that the pressure is measured - in meters. <br>
	 * Returns the pressure in newtons per square meter.
	 * 
	 * @param depth
	 * @return p
	 */

	public static double pressureUnderWater(double depth) {
		return FluidTable.H2O.density * G * depth;
	}
	
	/**
	 * Calculates the amount of pressure on a specified area. <br> <br>
	 * 
	 * Parameter 1 is the force enacted on the area in newton. <br>
	 * Parameter 2 is the area that force is acted upon in m^2. <br>
	 * Returns the pressure in newtons per square meter.
	 * 
	 * @param force
	 * @param area
	 * @return p
	 */

	public static double pressure(double force, double area) {
		return force / area;
	}
	
	/**
	 * Calculates the kinetic energy from the mass, and velocity of the object. <br> <br>
	 * 
	 * Parameter 1 is the mass of the object in kilograms. <br>
	 * Parameter 2 is the velocity of the object in meters per second.
	 * 
	 * @param mass
	 * @param velocity
	 * @return eKinetic
	 */

	public static double kineticEnergy(double mass, double velocity) {
		return (mass * Math.pow(velocity, 2)) / 2;
	}
	
	/**
	 * Calculates the potential energy from the mass, and height of the object. <br> <br>
	 * 
	 * Parameter 1 is the mass of the object in kilograms. <br>
	 * Parameter 2 is the height of the object in meters. <br>
	 * Returns the potential energy in joules.
	 * 
	 * @param mass
	 * @param height
	 * @return ePotential
	 */

	public static double potentialEnergy(double mass, double height) {
		return mass * G * height;
	}
	
	/**
	 * Calculates the velocity of an object after it has fallen a specified length. <br> <br>
	 * 
	 * Parameter 1 is the length from the object to the specified point - regularly the ground - in meters. <br>
	 * Returns the velocity at that point in meters per second.
	 * 
	 * @param height
	 * @return velocity
	 */

	public static double fallSpeed(double height) {
		return Math.sqrt(2 * G * height);
	}

	/**
	 * Calculates the difference between two numbers. <br> <br>
	 * 
	 * Parameter 1 is the first number. <br>
	 * Parameter 2 is the second number. <br>
	 * Returns the difference between them.
	 * 
	 * @param first
	 * @param last
	 * @return difference
	 */
	
	public static double delta(double first, double last) {
		return last - first;
	}

	/**
	 * Calculates the mass of a fluid from the type of fluid, and the volume of that fluid. <br> <br>
	 * 
	 * Parameter 1 is the fluid specified. <br>
	 * Parameter 2 is the volume of the specified fluid in cubic meters. <br>
	 * Returns the mass of the fluid in kilograms.
	 * 
	 * @param fluid
	 * @param volume
	 * @return mass
	 */
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return fluid.density * volume;
	}

	/**
	 * Calculates the mass of a gas from the type of gas, and the volume of that gas. <br> <br>
	 * 
	 * Parameter 1 is the gas specified. <br>
	 * Parameter 2 is the volume of the specified gas in cubic meters. <br>
	 * Returns the mass of the gas in kilograms.
	 * 
	 * @param gas
	 * @param volume
	 * @return mass
	 */
	
	public static double volumeToMass(GasTable gas, double volume) {
		return gas.density * volume;
	}

	/**
	 * Calculates the mass of a solid from the the type of solid, and volume of that solid. <br> <br>
	 * 
	 * Parameter 1 is the solid specified. <br>
	 * Parameter 2 is the volume of the specified solid in cubic meters. <br>
	 * Returns the mass of the solid in kilograms.
	 * 
	 * @param solid
	 * @param volume
	 * @return mass
	 */
	
	public static double volumeToMass(SolidTable solid, double volume) {
		return solid.density * volume;
	}
	
	/**
	 * Calculates the volume of a fluid from the type of fluid, and the mass of that fluid. <br> <br>
	 * 
	 * Parameter 1 is the fluid specified. <br>
	 * Parameter 2 is the mass of the specified fluid in kilograms. <br>
	 * Returns the volume of the fluid in cubic meters.
	 * 
	 * @param fluid
	 * @param mass
	 * @return m^3
	 */
	
	public static double massToVolume(FluidTable fluid, double mass) {
		return mass / fluid.density;
	}

	/**
	 * Calculates the volume of a gas from the type of gas, and the mass of that gas. <br> <br>
	 * 
	 * Parameter 1 is the gas specified. <br>
	 * Parameter 2 is the mass of the specified gas in kilograms. <br>
	 * Returns the volume of the gas in cubic meters.
	 * 
	 * @param gas
	 * @param mass
	 * @return m^3
	 */
	
	public static double massToVolume(GasTable gas, double mass) {
		return mass / gas.density;
	}
	
	/**
	 * Calculates the volume of a solid from the type of solid, and the mass of that solid. <br> <br>
	 * 
	 * Parameter 1 is the solid specified. <br>
	 * Parameter 2 is the mass of the specified solid in kilograms. <br>
	 * Returns the volume of the solid in cubic meters.
	 * 
	 * @param solid
	 * @param mass
	 * @return m^3
	 */
	
	public static double massToVolume(SolidTable solid, double mass) {
		return mass / solid.density;
	}
	
	/**
	 * Calculates the velocity from the distance traveled, and the time taken. <br> <br>
	 * 
	 * Parameter 1 is the distance traveled in meters. <br>
	 * Parameter 2 is the time taken. <br>
	 * Returns the velocity in meters per second.
	 * 
	 * @param distance
	 * @param time
	 * @return velocity
	 */
	
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	}

	/**
	 * Calculates the distance traveled from the velocity, and the time taken <br> <br>
	 * 
	 * Parameter 1 is the velocity in meters per second. <br>
	 * Parameter 2 is the time taken. <br>
	 * Returns the distance traveled in meters.
	 * 
	 * @param velocity
	 * @param time
	 * @return distance
	 */
	
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}

	/**
	 * Calculates the  time taken from the distance traveled, and the velocity <br> <br>
	 * 
	 * Parameter 1 is the distance traveled in meters. <br>
	 * Parameter 2 is the velocity in meters per second. <br>
	 * Returns the time taken.
	 * 
	 * @param distance
	 * @param velocity
	 * @return time
	 */
	
	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	}

	/**
	 * Calculates the work of an action from the mass of the object acted upon, and the stretch that action takes the object. <br> <br>
	 * 
	 * Parameter 1 is the mass of the object in kilograms. <br>
	 * Parameter 2 is the stretch the action takes the object in meters. <br>
	 * Returns the work done in watt.
	 * 
	 * @param mass
	 * @param s
	 * @return work
	 */
	
	public static double work(double mass, double s) {
		return mass * s;
	}

	/**
	 * Calculates the power of an action from the work done, and the time the action took. <br> <br>
	 * 
	 * Parameter 1 is the work done in watt. <br>
	 * Parameter 2 is the time taken. <br>
	 * Returns the power of the action.
	 * 
	 * @param work
	 * @param time
	 * @return power
	 */
	
	public static double power(double work, double time) {
		return work / time;
	}

	/**
	 * Calculates the necessary energy to change the temperature in a solid. <br><br>
	 * 
	 * Parameter 1 is the type of solid. <br>
	 * Parameter 2 is the mass of that solid in kilograms. <br>
	 * Parameter 3 is the difference of temperature in celsius.
	 * 
	 * @param solid
	 * @param mass
	 * @param deltaT
	 * @return energy
	 */
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * (Math.abs(deltaT));
	}

	/**
	 * Calculates the necessary energy to change the temperature in a fluid. <br><br>
	 * 
	 * Parameter 1 is the type of fluid. <br>
	 * Parameter 2 is the mass of that fluid in kilograms. <br>
	 * Parameter 3 is the difference of temperature in celsius.
	 * 
	 * @param fluid
	 * @param volume
	 * @param deltaT
	 * @return energy
	 */
	
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		return fluid.heatCapacity * volume * fluid.density * (Math.abs(deltaT));
	}

	/**
	 * Calculates the necessary energy to change the temperature in a gas. <br><br>
	 * 
	 * Parameter 1 is the type of gas. <br>
	 * Parameter 2 is the mass of that gas in kilograms. <br>
	 * Parameter 3 is the difference of temperature in celsius.
	 * 
	 * @param gas
	 * @param volume
	 * @param deltaT
	 * @return energy
	 */
	
	public static double heat(GasTable gas, double volume, double deltaT) {
		return gas.heatCapacity * volume * gas.density * (Math.abs(deltaT));
	}

	/**
	 * Calculates the peak of height that an object will get to in a vacuum from it's current velocity upwards <br> <br>
	 * 
	 * Parameter 1 is the current velocity upwards in meters per second. <br>
	 * Returns the height that object gets to in meters.
	 * 
	 * @param velocity
	 * @return height
	 */
	
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2) / (2 * G);
	}

	/**
	 * Calculates the mass from the measured weight. <br> <br>
	 * 
	 * Parameter 1 is the mass of the object in kilograms. <br>
	 * Returns the weight of that object in newton.
	 * 
	 * @param n
	 * @return kg
	 */
	
	public static double kilogramsToNewton(double kg) {
		return kg * G;
	}

	/**
	 * Calculates the from the measured 
	 * 
	 * @param n
	 * @return kg
	 */
	
	public static double newtonToKilograms(double n) {
		return n / G;
	}

	/**
	 * Calculates the necessary energy to change the temperature. <br><br>
	 * 
	 * Parameter 1 is the type of fluid. <br>
	 * Parameter 2 is the mass of that fluid. <br>
	 * Parameter 3 is the temperature before the heat exchange. <br>
	 * Parameter 4 is the temperature after.
	 * 
	 * @param fluid
	 * @param kg
	 * @param startT
	 * @param endT
	 * @return joule
	 */

	public static double heat(FluidTable fluid, double mass, double startT, double endT) {
		return fluid.heatCapacity * mass * (Math.abs(startT - endT));
	}

	/**
	 * Calculates the necessary energy to change the temperature. <br> <br>
	 * 
	 * Parameter 1 is the type of gas. <br>
	 * Parameter 2 is the mass of that gas in kg. <br>
	 * Parameter 3 is the temperature before the heat exchange. <br>
	 * Parameter 4 is the temperature after. 
	 * 
	 * @param gas
	 * @param mass
	 * @param startT
	 * @param endT
	 * @return joule
	 */
	public static double heat(GasTable gas, double mass, double startT, double endT) {
		return gas.heatCapacity * mass * (Math.abs(startT - endT));
	}

	/**
	 * Calculates the necessary energy to change the temperature. <br> <br>
	 * 
	 * Parameter 1 is the type of solid. <br>
	 * Parameter 2 is the mass of that solid in kg. <br>
	 * Parameter 3 is the temperature before the heat exchange. <br>
	 * Parameter 4 is the temperature after.
	 * 
	 * @param solid
	 * @param mass
	 * @param startT
	 * @param endT
	 * @return joule
	 */
	public static double heat(SolidTable solid, double mass, double startT, double endT) {
		return solid.heatCapacity * mass * (Math.abs(startT - endT));
	}
	
	/**
	 * Calculates the heat of a fluid from it's mass and energy. <br> <br>
	 * 
	 * 
	 * 
	 * @param fluid
	 * @param mass
	 * @param energy
	 * @return
	 */

	public static double energyToHeat(FluidTable fluid, double mass, double energy) {
		return 1 / (fluid.heatCapacity * mass / energy);
	}
	
	/**
	 * 
	 * @param gas
	 * @param mass
	 * @param energy
	 * @return
	 */

	public static double energyToHeat(GasTable gas, double mass, double energy) {
		return 1 / (gas.heatCapacity * mass / energy);
	}
	
	/**
	 * 
	 * @param solid
	 * @param mass
	 * @param energy
	 * @return
	 */

	public static double energyToHeat(SolidTable solid, double mass, double energy) {
		return 1 / (solid.heatCapacity * mass / energy);
	}
	
	/**
	 * Calculates the necessary energy to change a fluid to a gas. <br> <br>
	 * 
	 * Parameter 1 is the type of fluid. Parameter 2 is the mass of that fluid.
	 * 
	 * @param fluid
	 * @param mass
	 * @return energy
	 */
	
	public static double boilingEnergy(FluidTable fluid, double mass) {
		return fluid.steamEnthalpy * mass;
	}
	
	/**
	 * Calculates the necessary energy to change a solid to a fluid. <br> <br>
	 * 
	 * Parameter 1 is the type of solid. Parameter 2 is the mass of that solid.
	 * 
	 * @param solid
	 * @param mass
	 * @return
	 */
	
	public static double meltingEnergy(SolidTable solid, double mass) {
		return solid.smeltEntalpy * mass;
	}
	
	/**
	 * Calculates
	 * 
	 * @param g
	 * @return
	 */
	
	public static double gToKg(double g) {
		return g / 1000;
	}

	/**
	 * 
	 * @param kg
	 * @return
	 */
	
	public static double kgToG(double kg) {
		return kg * 1000;
	}
	
	/**
	 * 
	 * @param cm
	 * @return
	 */
	
	public static double cmCbToMCb(double cm) {
		return cm / 1000000;
	}
	
	/**
	 * 
	 * @param cm
	 * @return
	 */
	
	public static double cmCbToDmCb(double cm) {
		return cm / 1000;
	}
	
	/**
	 * 
	 * @param dm
	 * @return
	 */
	
	public static double dmCbToMCb(double dm) {
		return dm / 1000;
	}
	
	/**
	 * 
	 * @param dm
	 * @return
	 */
	
	public static double dmCbToCmCb(double dm) {
		return dm * 1000;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	
	public static double mCbToCmCb(double m) {
		return m * 1000000;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	
	public static double mCbToDmCb(double m) {
		return m * 1000;
	}
	
	/**
	 * 
	 * @param cm
	 * @return
	 */
	
	public static double cmSqrToMCb(double cm) {
		return cm / 1000000;
	}
	
	/**
	 * 
	 * @param cm
	 * @return
	 */
	
	public static double cmSqrToDmSqr(double cm) {
		return cm / 100;
	}
	
	/**
	 * 
	 * @param dm
	 * @return
	 */
	
	public static double dmSqrToMSqr(double dm) {
		return dm / 100;
	}
	
	/**
	 * 
	 * @param dm
	 * @return
	 */
	
	public static double dmSqrToCmSqr(double dm) {
		return dm * 100;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	
	public static double mSqrToCmSqr(double m) {
		return m * 10000;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	
	public static double mSqrToDmSqr(double m) {
		return m * 100;
	}

}
