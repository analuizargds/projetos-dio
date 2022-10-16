package sobrecarga;

public class Area {
	
	public static void areaQuadrilatero(double base) {
		double areaQuadrado = base * base;
		System.out.println("A �rea do quadrado �: " + areaQuadrado);
	}
	
	public static void areaQuadrilatero(double base, double altura) {
		double areaRetangulo = base * altura;
		System.out.println("A �rea do ret�ngulo �: " + areaRetangulo);
	}
	
	public static void areaQuadrilatero(double baseMenor, double baseMaior, double altura) {
		double areaTrapezio = ((baseMenor + baseMaior) * altura)/2;
		System.out.println("A �rea do trap�zio �: " + areaTrapezio);
	}
}
