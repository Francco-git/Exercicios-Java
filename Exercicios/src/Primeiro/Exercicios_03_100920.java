package Primeiro;

import java.util.Scanner;

public class Exercicios_03_100920 {

	public static void main(String[] args) {
		int idade,i21=0,i50=0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escreva sua idade.. ou menos de -99 para encerrar:" );

		idade = entrada.nextInt();
		
		while (idade!=-99) {
			
		
		if (idade<21) 
		{
			i21++;
			} 
		
		if(idade>50) 
		{
			i50++;
				 }
			
					 
			System.out.println("Escreva sua idade..:");
			idade = entrada.nextInt();
		
			
			
		
		}
	
			System.out.println("Total de pessoas com menos de 21 anos...: " +i21+ " ");
			System.out.println("Total de pessoas com mais de 50 anos...: " +i50+ " ");

	}

}
