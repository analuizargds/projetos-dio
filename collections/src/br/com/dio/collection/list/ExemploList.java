package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploList {
	
	public static void main(String[] args) {
		
		//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
		
		System.out.println("Crie uma lista e adicione as sete notas: ");
		ArrayList <Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		System.out.println(notas);
		
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
		
		System.out.println("Adicione na Lista a nota 8.0 na posição 4");
		notas.add(4, 8d);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5.0), 6d);
		
		System.out.println("Confira se a nota 5.0 está na Lista: " + notas.contains(5d));
		
		System.out.println("Imprima todas as notas na ordem em que foram informados: ");
		for(Double nota: notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: "+ Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		
		Iterator <Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		
		System.out.println("Remova a nota na posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		for (int i=0; i < notas.size(); i++) {
			double nota = notas.get(i);
			if( nota < 7.0) notas.remove(nota);
		}
		System.out.println(notas);
		//Outra alternativa
		/*
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7d) iterator1.remove();
		}
		System.out.println(notas);
		*/
		
		System.out.println("Apague toda a lita");
		//notas.clear();
		//System.out.println(notas);
		
		
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		
		// RESOLVA OS EXERCÍCIOS UTILIZANDO OS MÉTODOS DA IMPLEMENTAÇÃO LINKEDLIST
		
		System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista: ");
		LinkedList<Double> notas2 = new LinkedList<>();
		notas2.addAll(notas);
		System.out.println(notas2);
		
		System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas2.getFirst());
		
		System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.removeFirst());
	}
	
	

}
