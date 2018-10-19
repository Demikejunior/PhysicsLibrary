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
	
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	/**
	 * Calculates the fluid pressure in a specified fluid at a specified depth. 
	 * 
	 * Parameter 1 is the type of fluid. 
	 * Parameter 2 is how far down - in meters - that the pressure is measured
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
	
	/**
	 * Calculates the necessary energy to change the temperature.
	 * 
	 * Parameter 1 is the type of fluid. 
	 * Parameter 2 is the mass of that fluid. 
	 * Parameter 3 is the temperature before the heat exchange, 
	 * and Parameter 4 is the temperature after.
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
	 * Parameter 1 is the type of gas. 
	 * Parameter 2 is the mass of that gas. 
	 * Parameter 3 is the temperature before the heat exchange, 
	 * and Parameter 4 is the temperature after.
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
	 * Parameter 1 is the type of solid. 
	 * Parameter 2 is the mass of that solid. 
	 * Parameter 3 is the temperature before the heat exchange, 
	 * and Parameter 4 is the temperature after.
	 * 
	 * @param solid
	 * @param mass
	 * @param startT
	 * @param endT
	 */
	public static double heatEnergy(SolidTable solid, double mass, double startT, double endT) {
		
		return solid.heatCapacity * mass * (Math.abs(startT - endT));
		
	}
	
	
	
	/**
	 * 
	 * 
	 * @param fluid
	 * @param mass
	 * @return
	 */
	
	public static double meltingEnergy(FluidTable fluid, double mass) {
		
		return fluid.meltEnthalpy * mass;
		
	}
	
	public static double boilingEnergy(FluidTable fluid, double mass) {
		
		return fluid.steamEnthalpy * mass;
		
	}
	
}
