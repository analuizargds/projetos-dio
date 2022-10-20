package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import br.com.dio.collection.list.ExemploOrdenacaoList.Gato;

/*Dados as seguintes informa��es sobre meus gatos, crie uma lista
 * e ordene esta lista exibindo:
 * (nome - idade - cor);
 * 
 * Gato 1 = nome: Jon, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */


public class ExemploOrdenacaoList {
	
	public static void main(String[] args) {
		
		List <Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		
		System.out.println("--\tOrdem de Inser��o\t---");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Aleat�ria\t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Natural (Nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
	}

}

class Gato implements Comparable<Gato> { //para comparar de acordo com a ordem natural de uma classe utiliza-se o Comparable
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return " {nome=" + nome + 
				", idade=" + idade + 
				", cor=" + cor + "}";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
		//retorna um inteiro que � o que vai ser ordenado
		/* se retorna 0 ent�o os gatos comparados s�o iguais
		 * se retorna 1 ent�o o gato vem depois do que est� sendo comparado
		 * se retorna -1 ent�o o gato vem antes do que est� sendo comparado
		 */
	}
	
	
	
	
}
