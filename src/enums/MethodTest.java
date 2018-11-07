package enums;

public class MethodTest {

	public static void main(String[] args) {

//		Fråga 1 - Hur mycket väger 80 dm^3 järn?

		System.out.println(Physics.volumeToMass(SolidTable.IRON, 0.008) + " kg");

//		Fråga 2 - Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?

		System.out.println(Physics.svtDistance(2.8, 3600) / 1000 + " km");

//		Fråga 3 - Hur mycket energi krävs för att värma upp 5 liter vatten?

		System.out.println(Physics.heat(FluidTable.H2O, Physics.dmCbToMCb(5), 1) + " Joule");

//		Hur stort är det totala trycket 100 meter under havsytan?

		System.out.println(Physics.pressureUnderWater(100) + Physics.p_0 + " Pa");

//		Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?

		System.out.println((Physics.velocityToHeight(50 / 3.6) + 1.80) + " m");

//		En bil med massan 740kg accelererar från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?

		System.out.println(Physics.power(Physics.work(740, 100), 4.4) + " W");

//		En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?

		int sol = 0;
		for (double i = 10; i > 0.5;) {
			i = Physics.velocityToHeight((Physics.fallSpeed(i) - (i / 100)));
			sol++;
		}
		System.out.println(sol + " gånger");
		
//		Hur mycket energi åtgår för att helt smälta 500 g is med temperaturen -5 C?

		System.out.println(Physics.heat(SolidTable.ICE, 0.5, 5) + Physics.meltingEnergy(SolidTable.ICE, 0.5) / 1000 + " kJ");
		
//		I sommras tog Anders fram en burk läsk (33cl) som stått i rumstemperatur (20 C).
//		För att få läsken kallare la han den i 20 gram is - direkt från frysen (-18 C).
//		Vilken temperatur fick läsken när all is smält? Givet att den enda värme överföringen är mellan läsken och isen.

		double iceE = (Physics.heat(SolidTable.ICE, Physics.gToKg(20), -18, 0) + Physics.meltingEnergy(SolidTable.ICE, Physics.gToKg(20)));
		double laskE = (Physics.heat(FluidTable.H2O, Physics.volumeToMass(FluidTable.H2O, Physics.cmCbToMCb(330)), 20, 0));
		
		System.out.println((Physics.energyToHeat(FluidTable.H2O, Physics.volumeToMass(FluidTable.H2O, Physics.cmCbToMCb(330)), laskE - iceE)) + " C");

//		Du vill att 1m^3 aceton som är 18 grader celsius ska bli till ånga, hur mycket energi tar det?
		
		System.out.println((Physics.heat(FluidTable.ACETON, 1, 18, FluidTable.ACETON.boilPoint) + Physics.boilingEnergy(FluidTable.ACETON, Physics.volumeToMass(FluidTable.ACETON, 1))) / 1000 + " kJ");

	}

}