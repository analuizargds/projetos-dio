
public class Calculadora {

	public static void soma(double a, double b) {
		
		double soma = a+b;
		System.out.println("A soma de " + a + " mais " + b + " = " + soma);
	}
	
	public static void sub(double a, double b) {
		
		double subtracao = a - b;
		System.out.println("A subtra��o de " + a + " menos " + b + " = " + subtracao);
	}
	
	public static void mult(double a, double b) {
		
		double multiplicacao = a * b;
		System.out.println("A multiplica��o de " + a + " vezes " + b + " = " + multiplicacao );
	}
	
	public static void div(double a, double b) {
		
		double divisao = a / b;
		System.out.println("A divis�o de " + a + " por " + b + " = " + divisao);
	}
}
