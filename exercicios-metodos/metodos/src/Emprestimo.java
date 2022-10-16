
public class Emprestimo {
	
	public static int getDuasParcelas() {
		return 2;
	}
	
	public static int getTresParcelas() {
		return 3;
	}
	
	public static double getTaxaDuasParcelas() {
		return 0.4;
	}
	
	public static double getTaxaTresParcelas() {
		return 0.6;
	}
	
	public static void calculaEmprestimo(double valor, int parcela) {
		
		if (parcela == 2) {
			double total = valor + (valor * parcela * getTaxaDuasParcelas());
			
			System.out.println("Valor para empréstimo de duas parcelas: R$ " + total);
		} else if(parcela ==3 ) {
			double total = valor + (valor * parcela * getTaxaTresParcelas());
			
			System.out.println("Valor para empréstimo de três parcelas: R$ " + total);
		} else {
			System.out.println("Quantidade de parcela inválida");
		}
	}
}
