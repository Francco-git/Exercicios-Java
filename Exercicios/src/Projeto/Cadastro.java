package Projeto;

import java.util.Scanner;

public class Cadastro {
	
	
	Scanner ler = new Scanner(System.in);
	private String endere�o;
	private int telefone;
	
	public Cadastro (String endere�o,int telefone) 
	{
		
		this.endere�o = endere�o;
		this.telefone = telefone;
			
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void Cadastro() 
	{
		System.out.println("INSIRA O SEU TELEFONE:");
		setTelefone(ler.nextInt());
		System.out.println("INSIRA O SEU ENDERE�O:");
		setEndere�o(ler.next());

	}
	
	
	


}




