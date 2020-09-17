package Orientaçãoaoobjeto;

public class bagagemAviao {

	public static void main(String[] args) 
	{
		Aviao bagagemAviao1 = new Aviao("\nWeslley = passageiro com excesso de bagagem",""
		+ "\nMatheus = passageiro com bagagem normal","\nAlex = passageiro sem bagagem");
		System.out.println(bagagemAviao1.getbagagemAviao());

	}

}
