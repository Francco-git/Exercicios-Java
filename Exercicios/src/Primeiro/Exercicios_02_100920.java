package Primeiro;

import java.util.Scanner;

public class Exercicios_02_100920 {

	public static void main(String[] args) {

		int x,par=0,impar=0,numero;
		
		Scanner ler = new Scanner (System.in);

		for (x = 0; x<10; x++) {
			System.out.println("Entre com um numero :");
			numero = ler.nextInt();

			if (numero%2==0) {
				par++;
				
			}
			
			else {impar++;
				
			}

		}
		
		System.out.println("Teve um total de...: " +impar+ " Impares");
		System.out.println("Teve um total de...: " +par+ " Pares");

	}

}
