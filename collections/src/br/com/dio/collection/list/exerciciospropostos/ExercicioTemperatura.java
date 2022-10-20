package br.com.dio.collection.list.exerciciospropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class ExercicioTemperatura {
	
	public static void main(String[] args) {
		
		List <Double> tempMensal = new ArrayList<>();
		int i = 0;
		for (i=1; i<=6; i++ ) {
			tempMensal.add(valorAleatorio());
		}
		System.out.println(tempMensal);
		
		double soma = 0d;
		Iterator<Double> iterator = tempMensal.iterator();
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		double media = soma/tempMensal.size();
		System.out.println(String.format("A temperatua média é: %.3f", media));
		
		System.out.println("Meses que apresentaram temperatura acima da média: ");
		
		for(Double temp: tempMensal) {
			if (temp > media) {
				int index = tempMensal.indexOf(temp);
				switch (index) {
				case 0:
					System.out.println(String.format("1-Janeiro %.3f ", temp));
					break;
				case 1:
					System.out.println(String.format("2-Fevereiro %.3f ", temp));
					break;
				case 2:
					System.out.println(String.format("3-Março %.3f ", temp));
					break;
				case 3:
					System.out.println(String.format("4-Abril %.3f ", temp));
					break;
				case 4:
					System.out.println(String.format("5-Maio %.3f ", temp));
					break;
				case 5:
					System.out.println(String.format("6-Junho %.3f ", temp));
					break;
				default:
					break;
				}
			}
		}
	}
	
	
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(10,30);
	}
}