package br.com.dio.collection.list.exerciciospropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioPerguntas {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <String>pergunta = new ArrayList<>();
		
		System.out.println("1 - Telefonou para a v�tima?(s/n) ");
		pergunta.add((scan.next()).toLowerCase());
		System.out.println("2 - Esteve no local do crime?(s/n) ");
		pergunta.add((scan.next()).toLowerCase());
		System.out.println("3 - Mora perto da v�tima?(s/n) ");
		pergunta.add((scan.next()).toLowerCase());
		System.out.println("4 - Devia para a v�tima?(s/n) ");
		pergunta.add((scan.next()).toLowerCase());
		System.out.println("5 - J� trabalhou com a v�tima?(s/n) ");
		pergunta.add((scan.next()).toLowerCase());
		
		Iterator <String> iterator = pergunta.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			if(next.contentEquals("n")) iterator.remove();
		}
		
		System.out.println("Voc� � considerado ");
		switch(pergunta.size()) {
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
		case 4:
			System.out.println("Cumplice");
			break;
		case 5:
			System.out.println("Assassino");
			break;
		default:
			System.out.println("Inocente");
			break;
		}
	}

}
