package Projeto;

import java.util.Scanner;

public class Cadastro {
	
	
	Scanner ler = new Scanner(System.in);
	private String enderešo;
	private int telefone;
	
	public Cadastro (String enderešo,int telefone) 
	{
		
		this.enderešo = enderešo;
		this.telefone = telefone;
			
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void Cadastro() 
	{
		System.out.println("Insira o seu telefone");
		setTelefone(ler.nextInt());
		System.out.println("Insira o seu enderešo");
		setEnderešo(ler.nextLine());

	}
	
	
	


}




