package Primeiro;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int segundot,segundo,minuto,hora;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tempo de duraçao da fabrica expressa em segundos");
		segundot = leia.nextInt();
		
		hora = segundot/3600;
		minuto = (segundot%3600)/60;
		segundo= (segundot/3600/60);
		
		
		System.out.println("O tempo de duraçao do evento na fabrica é de:\n" +hora+ " horas " +minuto+  " minutos " +segundo+  " segundo " );





	}

}
