package Orientaçãoaoobjeto;

public class Eletronicos {

	public static void main(String[] args) 
	{
		Eletronico produtos = new Eletronico (" Francco - Celular", "Xioami Lite 10", "5.150" , "557916446510");
		Eletronico produtos1 = new Eletronico (" Matheus - Celular", "Iphone 11", "11.000" , "5578446510");
		Eletronico produtos2 = new Eletronico (" Weslley - Celular", "Motorola g15", "4.500" , "55158446510");
		System.out.println(produtos.geteletronico());
		System.out.println(produtos1.geteletronico());
		System.out.println(produtos2.geteletronico());
	}

}
