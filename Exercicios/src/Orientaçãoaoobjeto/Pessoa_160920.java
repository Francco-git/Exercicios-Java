package Orientaçãoaoobjeto;

public class Pessoa_160920 {
	//Atributos
	private String nome;
	private String endereço;
	private String telefone;
	private String Cpf;
	private String Rg;
	public Object obterSaldo;
	
	//Construtores
	public Pessoa_160920 (String nome,String endereço,String telefone, String Cpf,String Rg) 
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
		this.Cpf = Cpf;
		this.Rg = Rg;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}

}
