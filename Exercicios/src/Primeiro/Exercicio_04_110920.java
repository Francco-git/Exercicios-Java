package Primeiro;

import java.util.Scanner;

public class Exercicio_04_110920 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matrizSoma[][] = new float[2][2],constante;
		float matrizSubtrai[][] = new float[2][2];
		int op;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Entre com o valor da matriz1: ");
				matriz1[i][j] = ler.nextFloat();
				System.out.println("Entre com o valor da matriz2: ");
				matriz2[i][j] = ler.nextFloat();
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				matrizSubtrai[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
		
		System.out.println("Leia o valor de uma constante: ");
		constante = ler.nextFloat();
		
		System.out.println("\nMenu de op��es");
		System.out.println("\n1- Somar as duas matrizes ");
		System.out.println("\n2- Subtrair a primeira matriz da segunda ");
		System.out.println("\n3- Adicionar uma constante as duas matrizes");
		System.out.println("\n4- Imprimir as matrizes ");
		System.out.println("\n5- Sair do sistema ");
		System.out.println("\nDigite a sua op��o: ");
		op = ler.nextInt();
		do
		{
			if(op==5)
			{
				System.out.println("Muito obrigado por utilizar o nosso sisteminha...");
			}
			else
			{
			switch(op)
			{
			case 1:
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.println("\nSomat�rio: "+matrizSoma[i][j]);
					}
				}
				break;
			case 2:
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.println("\nSubtra��o: "+matrizSubtrai[i][j]);
					}
				}
				break;
			case 3:
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						matriz1[i][j] = matriz1[i][j] + constante;
						matriz2[i][j] = matriz2[i][j] + constante;
						System.out.println("Matriz1: "+matriz1[i][j]);
						System.out.println("Matriz2: "+matriz2[i][j]);
					}
				}
				break;
			case 4:
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						
						System.out.println("Matriz1: "+matriz1[i][j]);
						System.out.println("Matriz2: "+matriz2[i][j]);
					}
				}
				break;
			
				default:
					System.out.println("Op��o inv�lida...");
			
			}
			
			System.out.println("\nMenu de op��es");
			System.out.println("\n1- Somar as duas matrizes ");
			System.out.println("\n2- Subtrair a primeira matriz da segunda ");
			System.out.println("\n3- Adicionar uma constante as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes ");
			System.out.println("\n5- Sair do sistema ");
			System.out.println("\nDigite a sua op��o: ");
			op = ler.nextInt();
			}
			
		}while(op!=5);
	}
}

