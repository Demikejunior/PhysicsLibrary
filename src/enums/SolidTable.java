package enums;

public enum SolidTable {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	LEAD(11.3, 0.13, 327, 24.7),
	GOLD(19.3, 0.13, 1064, 66),
	SILVER(10.5, 0.24, 962, 105)
	;

	double density;
	double heatCapacity;
	double smeltPoint;
	double smeltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		smeltPoint = sp;
		smeltEntalpy = se * 1E3;
	}

	
}