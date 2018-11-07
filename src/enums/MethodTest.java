package enums;

public class MethodTest {

	public static void main(String[] args) {

//		Fr�ga 1 - Hur mycket v�ger 80 dm^3 j�rn?

		System.out.println(Physics.volumeToMass(SolidTable.IRON, 0.008) + " kg");

//		Fr�ga 2 - Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.8 m/s i 60 minuter?

		System.out.println(Physics.svtDistance(2.8, 3600) / 1000 + " km");

//		Fr�ga 3 - Hur mycket energi kr�vs f�r att v�rma upp 5 liter vatten?

		System.out.println(Physics.heat(FluidTable.H2O, Physics.dmCbToMCb(5), 1) + " Joule");

//		Hur stort �r det totala trycket 100 meter under havsytan?

		System.out.println(Physics.pressureUnderWater(100) + Physics.p_0 + " Pa");

//		Tomas som �r 180cm l�ng kastar upp en boll med massan 200 gram i luften s� den f�r starthastigheten 50 km/h. Hur h�gt kommer bollen?

		System.out.println((Physics.velocityToHeight(50 / 3.6) + 1.80) + " m");

//		En bil med massan 740kg accelererar fr�n 0-100 p� 4.4 sekunder. Hur stor effekt har bilens motor uppn�tt?

		System.out.println(Physics.power(Physics.work(740, 100), 4.4) + " W");

//		En studsboll sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?

		int sol = 0;
		for (double i = 10; i > 0.5;) {
			i = Physics.velocityToHeight((Physics.fallSpeed(i) - (i / 100)));
			sol++;
		}
		System.out.println(sol + " g�nger");
		
//		Hur mycket energi �tg�r f�r att helt sm�lta 500 g is med temperaturen -5 C?

		System.out.println(Physics.heat(SolidTable.ICE, 0.5, 5) + Physics.meltingEnergy(SolidTable.ICE, 0.5) / 1000 + " kJ");
		
//		I sommras tog Anders fram en burk l�sk (33cl) som st�tt i rumstemperatur (20 C).
//		F�r att f� l�sken kallare la han den i 20 gram is - direkt fr�n frysen (-18 C).
//		Vilken temperatur fick l�sken n�r all is sm�lt? Givet att den enda v�rme �verf�ringen �r mellan l�sken och isen.

		double iceE = (Physics.heat(SolidTable.ICE, Physics.gToKg(20), -18, 0) + Physics.meltingEnergy(SolidTable.ICE, Physics.gToKg(20)));
		double laskE = (Physics.heat(FluidTable.H2O, Physics.volumeToMass(FluidTable.H2O, Physics.cmCbToMCb(330)), 20, 0));
		
		System.out.println((Physics.energyToHeat(FluidTable.H2O, Physics.volumeToMass(FluidTable.H2O, Physics.cmCbToMCb(330)), laskE - iceE)) + " C");

//		Du vill att 1m^3 aceton som �r 18 grader celsius ska bli till �nga, hur mycket energi tar det?
		
		System.out.println((Physics.heat(FluidTable.ACETON, 1, 18, FluidTable.ACETON.boilPoint) + Physics.boilingEnergy(FluidTable.ACETON, Physics.volumeToMass(FluidTable.ACETON, 1))) / 1000 + " kJ");

	}

}