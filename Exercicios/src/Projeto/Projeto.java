package Projeto;

import java.util.Scanner;

public class Projeto extends Cadastro {
//ATRIBUTOS
	public Projeto(String endereço, int telefone) {
		super(endereço, telefone);
	}


	private static final String Pizza = null;

	public static void Menu() 
	{
		
	}
//FUNÇÕES
	public static void Mussarela() {
		System.out.println("OBRIGADO PELO SEU PEDIDO, SUA PIZZA DE MUSSARELA CHEGA EM 20 MINUTOS \nENDEREÇO: RUA DAS FLECHAS \nPAGAMENTO: EM DINHEIRO");
		
	}
	public static void Calabresa() {
		System.out.println("OBRIGADO PELO SEU PEDIDO, SUA PIZZA DE CALABRESA CHEGA EM 20 MINUTOS \nENDEREÇO: RUA DAS FLECHAS \nPAGAMENTO: EM DINHEIRO");

	}
	
	public static void Frango() {
		System.out.println("OBRIGADO PELO SEU PEDIDO, SUA PIZZA DE FRANGO C/ CATUPIRY CHEGA EM 20 MINUTOS \nENDEREÇO: RUA DAS FLECHAS \nPAGAMENTO: EM DINHEIRO");

	}
	public static void Marguerita() {
		System.out.println("OBRIGADO PELO SEU PEDIDO, SUA PIZZA DE MARGUERITA CHEGA EM 20 MINUTOS \nENDEREÇO: RUA DAS FLECHAS \nPAGAMENTO: EM DINHEIRO");

	}
	public static void Sair() {
		System.out.println("VOCÊ SAIU DO PROGRAMA");

	}
//ESCOPO DO MENU
public void pizzas()
	
{
	System.out.println("=========================================  PIZZARIA GENERATION  ===================================================================\n");
	System.out.println("");
	System.out.println("BEM VINDO(A) AO NOSSO MENU DE CARDAPIO:\n\n" );
	System.out.println("1- PIZZA DE MUSSARELA POR 29,90 R$\n" );
	System.out.println("2- PIZZA DE CALABRESA por 29,90 R$\n" );
	System.out.println("3- PIZZA DE FRANGO C/ CATUPIRY POR 32,90 R$\n");
	System.out.println("4- PIZZA DE MARGUERITA por 29,90 R$\n");
	System.out.println("5- SAIR                             \n\n");
	System.out.println("POR GENTILEZA ESCOLHA O SABOR DESEJADO:\n\n");
	

	
	
//SWITCH CASE	
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
				System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE !!!");
		
		}
		
	
	}
	

	
		
	}
	

	
	