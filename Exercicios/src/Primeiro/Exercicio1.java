package Primeiro;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int anos,meses,dias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite quantos anos voc� tem");
			
		anos = leia.nextInt();
		System.out.println("Digite o mes que voce nasceu");
		meses = leia.nextInt();
		
		System.out.println("Digite o dia que voce nasceu");
		dias = leia.nextInt();
		
		dias = dias + (365*anos) + (meses*30);
		
		System.out.println("Sua idade expressa em dias e:" +dias);

		
					

	}
	
}
