package enums;

public class Physics {

	static double G = 9.82;
	static double ATM = 101.3E3; // 101.3 kPa
	static double R = 8.3144598;
	static double p_0 = 101325;
	static double c = 299792458;
	static double g_swe = 9.82;

	/**
	 * 
	 * @param fahrenheit
	 * @return celsius
	 */
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	
	/**
	 * 
	 * @param celsius
	 * @return fahrenheit
	 */

	public static double celsiusToFahrenheit(double celsius) {
		return celsius * 1.8 + 32;
	}
	
	/**
	 * 
	 * @param kelvin
	 * @return celsius
	 */

	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	/**
	 * Calculates the fluid pressure in a specified fluid at a specified depth. <br> <br>
	 * 
	 * Parameter 1 is the type of fluid. <br>
	 * Parameter 2 is how far down - in meters - that the pressure is measured
	 * 
	 * @param fluid
	 * @param depth
	 */

	public static double fluidPressure(FluidTable fluid, double depth) {
		return fluid.density * G * depth;
	}
	
	/**
	 * 
	 * @param depth
	 * @return p
	 */

	public static double pressureUnderWater(double depth) {
		return FluidTable.H2O.density * G * depth;
	}
	/**
	 * 
	 * @param force
	 * @param area
	 * @return p
	 */

	public static double pressure(double force, double area) {
		return force / area;
	}
	
	/**
	 * 
	 * @param mass
	 * @param velocity
	 * @return eKinetic
	 */

	public static double kineticEnergy(double mass, double velocity) {
		return (mass * Math.pow(velocity, 2)) / 2;
	}
	
	/**
	 * 
	 * @param mass
	 * @param height
	 * @return ePotential
	 */

	public static double potentialEnergy(double mass, double height) {
		return mass * G * height;
	}
	
	/**
	 * 
	 * @param height
	 * @return velocity
	 */

	public static double fallSpeed(double height) {
		return Math.sqrt(2 * G * height);
	}

	/**
	 * 
	 * @param first
	 * @param last
	 * @return difference
	 */
	
	public static double delta(double first, double last) {
		return last - first;
	}

	/**
	 * 
	 * @param fluid
	 * @param volume
	 * @return mass
	 */
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return fluid.density * volume;
	}

	/**
	 * 
	 * @param gas
	 * @param volume
	 * @return mass
	 */
	
	public static double volumeToMass(GasTable gas, double volume) {
		return gas.density * volume;
	}

	/**
	 * 
	 * @param solid
	 * @param volume
	 * @return mass
	 */
	
	public static double volumeToMass(SolidTable solid, double volume) {
		return solid.density * volume;
	}
	
	/**
	 * 
	 * @param fluid
	 * @param kg
	 * @return m^3
	 */
	
	public static double massToVolume(FluidTable fluid, double mass) {
		return mass / fluid.density;
	}

	/**
	 * 
	 * @param gas
	 * @param kg
	 * @return m^3
	 */
	
	public static double massToVolume(GasTable gas, double mass) {
		return mass / gas.density;
	}
	
	/**
	 * 
	 * @param solid
	 * @param kg
	 * @return m^3
	 */
	
	public static double massToVolume(SolidTable solid, double mass) {
		return mass / solid.density;
	}
	
	/**
	 * 
	 * @param distance
	 * @param time
	 * @return velocity
	 */
	
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	}

	/**
	 * 
	 * @param velocity
	 * @param time
	 * @return distance
	 */
	
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}

	/**
	 * 
	 * @param distance
	 * @param velocity
	 * @return time
	 */
	
	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	}

	/**
	 * 
	 * @param mass
	 * @param acceleration
	 * @return work
	 */
	
	public static double work(double mass, double acceleration) {
		return mass * acceleration;
	}

	/**
	 * 
	 * @param work
	 * @param time
	 * @return power
	 */
	
	public static double power(double work, double time) {
		return work / time;
	}

	/**
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
	 * 
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
	 * Calculates the peak of height - in m -<br>
	 * that an object will get to in a vacuum from it's current velocity upwards - in m/s
	 * 
	 * @param velocity
	 * @return height
	 */
	
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2) / (2 * G);
	}

	/**
	 * Calculates the mass - kg - from the measured weight / force - newton
	 * 
	 * @param n
	 * @return kg
	 */
	
	public static double kilogramsToNewton(double kg) {
		return kg * G;
	}

	/**
	 * Calculates the weight - in newton - from the measured mass - in kg
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
	 * Calculates the necessary energy to change a fluid to a gas.
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
	 * 
	 * @param solid
	 * @param mass
	 * @return
	 */
	
	public static double meltingEnergy(SolidTable solid, double mass) {
		return solid.smeltEntalpy * mass;
	}
	
	/**
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
