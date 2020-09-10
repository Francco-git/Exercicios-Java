package Primeiro;

import java.util.Scanner;

public class exercicio_04_090920 {

	public static void main(String[] args) {
		float numero;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = leitura.nextFloat();
		
		if (numero%2==0)
		{
		System.out.println("O numero é PAR...: "+Math.sqrt(numero));

		}
		
		else System.out.println("O numero é IMPAR...: "+(numero*numero));
		
		




	}

}
