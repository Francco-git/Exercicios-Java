package Primeiro;

import java.util.Scanner;

public class Exercicio_01_110920 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int[] arrayA = {1,0,5,-2,-5,7};
		int soma=arrayA[0]+arrayA[1]+arrayA[5];
		int cont;
		 
		System.out.println("Soma dos vetores 0,1,5");
				
		System.out.println("A soma � = " +(soma));
		
		arrayA[4] = 100;
		
		for(cont=0;cont<6;cont++) {
		System.out.println("Valor em cada linha " +arrayA[cont]);

		}
		
	

		}

	}


