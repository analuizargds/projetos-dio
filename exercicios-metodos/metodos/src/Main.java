
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Exercício calculadora");
		Calculadora.soma(6, 18);
		Calculadora.sub(1000, 565);
		Calculadora.mult(4, 765);
		Calculadora.div(398, 2);
		System.out.println("");
		
		System.out.println("Exercicio empréstimo ");
		Emprestimo.calculaEmprestimo(4000, 2);
		Emprestimo.calculaEmprestimo(2000, 3);
		System.out.println("");
		
		System.out.println("Exercicio mensagem ");
		Mensagem.hora(11);
		Mensagem.hora(17);
		Mensagem.hora(2);
		Mensagem.hora(24);
	}
}
