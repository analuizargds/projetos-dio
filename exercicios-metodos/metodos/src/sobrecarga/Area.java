package sobrecarga;

public class Area {
	
	public static double areaQuadrilatero(double base) {
		
		return base * base;
	}
	
	public static double areaQuadrilatero(double base, double altura) {

		return base * altura;
	}
	
	public static double areaQuadrilatero(double baseMenor, double baseMaior, double altura) {

		return ((baseMenor + baseMaior) * altura)/2;
	}
}
