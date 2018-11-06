package enums;

public enum FluidTable {

	H2O(0.998, 4.19, 0, 100, 2257), 
	WATER(0.998, 4.19, 0, 100, 2257),
	H2SO4(1.84, 1.38, 10, 336, 511),
	ACETON(0.79, 2.2, -95, 56, 509),
	BENSEN(0.879, 1.71, 6, 80, 393),
	ETHANOL(0.789, 2.43, -116, 78.2, 841),
	MERCURY(13.55, 0.14, -39, 357, 296)
	;

	double density;
	double heatCapacity;
	double smeltPoint;
	double boilPoint;
	double steamEnthalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		smeltPoint = sp;
		boilPoint = bp;
		steamEnthalpy = se * 1E3;
	}

}