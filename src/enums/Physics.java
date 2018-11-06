package enums;

public class Physics {

	static double G = 9.82;
	static double ATM = 101.3E3; // 101.3 kPa
	static double R = 8.3144598;
	static double p_0 = 101325;
	static double c = 299792458;
	static double g_swe = 9.82;

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}

	public static double celsiusToFarenheit(double celsius) {
		return celsius * 1.8 + 32;
	}

	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	/**
	 * Calculates the fluid pressure in a specified fluid at a specified depth.
	 * 
	 * Parameter 1 is the type of fluid. Parameter 2 is how far down - in meters -
	 * that the pressure is measured
	 * 
	 * @param fluid
	 * @param depth
	 */

	public static double fluidPressure(FluidTable fluid, double depth) {
		return fluid.density * G * depth;
	}

	public static double pressureUnderWater(double depth) {
		return FluidTable.H2O.density * G * depth;
	}

	public static double pressure(double force, double area) {
		return force / area;
	}

	public static double kineticEnergy(double mass, double velocity) {
		return (mass * Math.pow(velocity, 2)) / 2;
	}

	public static double potentialEnergy(double mass, double height) {
		return mass * G * height;
	}

	public static double fallSpeed(double height) {
		return Math.sqrt(2 * G * height);
	}

	public static double delta(double first, double last) {
		return last - first;
	}

	public static double volumeToMass(FluidTable fluid, double volume) {
		return fluid.density * volume;
	}

	public static double volumeToMass(GasTable gas, double volume) {
		return gas.density * volume;
	}

	public static double volumeToMass(SolidTable solid, double volume) {
		return solid.density * volume;
	}
	
	public static double massToVolume(FluidTable fluid, double mass) {
		return mass / fluid.density;
	}

	public static double massToVolume(GasTable gas, double mass) {
		return mass / gas.density;
	}
	
	public static double massToVolume(SolidTable solid, double mass) {
		return mass / solid.density;
	}
	
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	}

	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}

	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	}

	public static double work(double mass, double acceleration) {
		return mass * acceleration;
	}

	public static double power(double work, double time) {
		return work / time;
	}

	public static double heat(SolidTable solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * (Math.abs(deltaT));
	}

	public static double heat(FluidTable fluid, double volume, double deltaT) {
		return fluid.heatCapacity * volume * fluid.density * (Math.abs(deltaT));
	}

	public static double heat(GasTable gas, double volume, double deltaT) {
		return gas.heatCapacity * volume * gas.density * (Math.abs(deltaT));
	}

	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2) / (2 * G);
	}

	public static double kilogramsToNewton(double kg) {
		return kg * G;
	}

	public static double newtonToKilograms(double n) {
		return n / G;
	}

	/**
	 * Calculates the necessary energy to change the temperature.
	 * 
	 * Parameter 1 is the type of fluid. Parameter 2 is the mass of that fluid.
	 * Parameter 3 is the temperature before the heat exchange, and Parameter 4 is
	 * the temperature after.
	 * 
	 * @param fluid
	 * @param mass
	 * @param startT
	 * @param endT
	 */

	public static double heatEnergy(FluidTable fluid, double mass, double startT, double endT) {

		return fluid.heatCapacity * mass * (Math.abs(startT - endT));

	}

	/**
	 * Calculates the necessary energy to change the temperature.
	 * 
	 * Parameter 1 is the type of gas. Parameter 2 is the mass of that gas.
	 * Parameter 3 is the temperature before the heat exchange, and Parameter 4 is
	 * the temperature after.
	 * 
	 * @param gas
	 * @param mass
	 * @param startT
	 * @param endT
	 */
	public static double heatEnergy(GasTable gas, double mass, double startT, double endT) {

		return gas.heatCapacity * mass * (Math.abs(startT - endT));

	}

	/**
	 * Calculates the necessary energy to change the temperature.
	 * 
	 * Parameter 1 is the type of solid. Parameter 2 is the mass of that solid.
	 * Parameter 3 is the temperature before the heat exchange, and Parameter 4 is
	 * the temperature after.
	 * 
	 * @param solid
	 * @param mass
	 * @param startT
	 * @param endT
	 */
	public static double heatEnergy(SolidTable solid, double mass, double startT, double endT) {

		return solid.heatCapacity * mass * (Math.abs(startT - endT));

	}

	public static double boilingEnergy(FluidTable fluid, double mass) {

		return fluid.steamEnthalpy * mass;

	}

}
