package enums;

public enum GasTable{

	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92),
	XENON(5.89, 0.16),
	ARGON(1.78, 0.52),
	NITROGEN(1.25, 1.04),
	HYDROGEN(0.09, 14.2),
	NEON(0.9, 1.03)
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		heatCapacity = hc;
		density = d * 1E3; // 1E3 = 1*10^3
	}

}