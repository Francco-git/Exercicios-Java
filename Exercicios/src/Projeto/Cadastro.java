package Projeto;

import java.util.Scanner;

public class Cadastro {
	
	
	Scanner ler = new Scanner(System.in);
	private String endereço;
	private int telefone;
	
	public Cadastro (String endereço,int telefone) 
	{
		
		this.endereço = endereço;
		this.telefone = telefone;
			
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		System.out.println("INSIRA O SEU ENDEREÇO:");
		setEndereço(ler.next());

	}
	
	
	


}




