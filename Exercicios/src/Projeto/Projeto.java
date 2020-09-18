package Projeto;

import java.util.Scanner;

public class Projeto extends Cadastro {
	
	public Projeto(String endereço, int telefone) {
		super(endereço, telefone);
	}


	private static final String Pizza = null;

	public static void Menu() 
		
	{
	
	System.out.println("=========================================  Pizarria Generation  ===================================================================\n");
	System.out.println("Bem vindo a Pizarria Generation\n" );
	System.out.println("1- Pizza de Mussarela por 29,90 R$\n" );
	System.out.println("2- Pizza de Calabresa por 29,90 R$\n" );
	System.out.println("3- Pizza de Frango c/ catupiry por 32,90 R$\n");
	System.out.println("4- Pizza de Marguerita por 29,90 R$\n");
	System.out.println("5- Sair                             \n");
	System.out.println("Por gentileza escolha o sabor desejado\n");

		
	}
	public static void Mussarela() {
		System.out.println("Obrigado pelo pedido, sua pizza chega em 20 minutos");
		
	}
	public static void Calabresa() {
		System.out.println("Obrigado pelo pedido, sua pizza chega em 20 minutos");

	}
	
	public static void Frango() {
		System.out.println("Obrigado pelo pedido, sua pizza chega em 20 minutos");

	}
	public static void Marguerita() {
		System.out.println("Obrigado pelo pedido, sua pizza chega em 20 minutos");

	}
	public static void Sair() {
		System.out.println("Você saiu do programa");

	}
	

	public static void main(String[] args) 
	{
		int opcao=0;
		
		Scanner ler = new Scanner(System.in);
		
		Menu();
		
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1: 
			 Mussarela();
			break;
		case 2: 
			Calabresa();
			break;
		case 3: 
			Frango();
			break;
		case 4: 
			Marguerita();
			break;
		case 5: 
			Sair();
			break;
			
			default:
				System.out.println("Opcao Invalida, Tente Novamente !!!");
		
		}
		
	
	}
	

	
		
	}
	

	
	