package enums;

public class MethodTest {

	public static void main(String[] args) {

//		Fråga 1 - Hur mycket väger 80 dm^3 järn?
		
		System.out.println(Physics.volumeToMass(SolidTable.IRON, 0.08) + " kg/m^2");
		
//		Fråga 2 - Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?
		
		System.out.println(Physics.svtDistance(2.8, 60) + " m");
		
//		Fråga 3 - Hur mycket energi krävs för att värma upp 5 liter vatten?
		
		System.out.println(Physics.heat(FluidTable.H2O, 0.005, 1) + " Joule");
		
//		Hur stort är det totala trycket 100 meter under havsytan?
		
		System.out.println(Physics.fluidPressure(FluidTable.WATER, 100) + " Pa");
		
//		Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?
		
		System.out.println((Physics.velocityToHeight(180) + 1.80) + " m");
		
//		En bil med massan 740kg accelererar från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?
		
		System.out.println(Physics.power(Physics.work(740, 100), 4.4) + " W");
		
//		En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?

		int sol = 0;
		for (double i = 10; i > 0.5; ) {
			i = Physics.velocityToHeight((Physics.fallSpeed(i) - (i / 100)));
			sol++;
		}
		System.out.println(sol + " gånger");
		
//		Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
		
		
		
//		Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
		
		
		
//		Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
		
	}
	
}