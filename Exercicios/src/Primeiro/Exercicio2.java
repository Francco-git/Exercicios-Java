package Primeiro;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int ano,dia,mes,diaT;
		
	
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva sua idade expressa em dias");
		diaT = leia.nextInt();
		
		ano = (diaT/365);
		mes = (diaT%365)/30;
		dia = (diaT%365)%30;
		
		System.out.println("Sua idade expressa em dia,mes e ano e:\n" +dia+ "dia(s) " +mes+ " mes/meses" +ano+ "ano(s)");





	}

}
