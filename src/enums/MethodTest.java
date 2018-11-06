package enums;

public class MethodTest {

	public static void main(String[] args) {

//		Fr�ga 1 - Hur mycket v�ger 80 dm^3 j�rn?

		System.out.println(Physics.volumeToMass(SolidTable.IRON, 0.008) + " kg");

//		Fr�ga 2 - Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.8 m/s i 60 minuter?

		System.out.println(Physics.svtDistance(2.8, 3600) + " m");

//		Fr�ga 3 - Hur mycket energi kr�vs f�r att v�rma upp 5 liter vatten?

		System.out.println(Physics.heat(FluidTable.H2O, 0.005, 1) + " Joule");

//		Hur stort �r det totala trycket 100 meter under havsytan?

		System.out.println(Physics.pressureUnderWater(100) + Physics.p_0 + " Pa");

//		Tomas som �r 180cm l�ng kastar upp en boll med massan 200 gram i luften s� den f�r starthastigheten 50 km/h. Hur h�gt kommer bollen?

		System.out.println((Physics.velocityToHeight(180) + 1.80) + " m");

//		En bil med massan 740kg accelererar fr�n 0-100 p� 4.4 sekunder. Hur stor effekt har bilens motor uppn�tt?

		System.out.println(Physics.power(Physics.work(740, 100), 4.4) + " W");

//		En studsboll sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?

		int sol = 0;
		for (double i = 10; i > 0.5;) {
			i = Physics.velocityToHeight((Physics.fallSpeed(i) - (i / 100)));
			sol++;
		}
		System.out.println(sol + " g�nger");

//		

//		Formulera en egen uppgift man kan l�sa med hj�lp av dina metoder.

//		Formulera en egen uppgift man kan l�sa med hj�lp av dina metoder.

	}

}