package enums;

public enum FluidTable {

	H2O(0.998, 4.19, 0, 100, 2257, 333.55), 
	WATER(0.998, 4.19, 0, 100, 2257, 333.55),
	H2SO4(1.84, 1.38, 10, 336, 511, 0)
	;

	double density;
	double heatCapacity;
	double smeltPoint;
	double boilPoint;
	double steamEnthalpy;
	double meltEnthalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se, double me) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		smeltPoint = sp;
		boilPoint = bp;
		steamEnthalpy = se * 1E3;
		meltEnthalpy = me * 1E3;
	}

}