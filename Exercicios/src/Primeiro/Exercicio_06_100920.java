package Primeiro;

import java.util.Scanner;

public class Exercicio_06_100920 {

	public static void main(String[] args) {
		float n, media=0, cont=0;
		
		Scanner ler = new Scanner (System.in);
		
		do {
			System.out.println("Digite um n�mero m�ltiplo de 3 para entrar na m�dia ou digite zero para sair encerrar.");
			n = ler.nextFloat();
			if(n%3==0) {
			media = media + n;
			cont++;
			}
		}while(n!=0);
		System.out.println("A m�dia dos m�ltiplos de 3 �: "+(media/(cont-1)));

	}

}