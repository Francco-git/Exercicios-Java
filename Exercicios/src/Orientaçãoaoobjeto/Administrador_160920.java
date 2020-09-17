package Orientaçãoaoobjeto;

public class Administrador_160920  extends Pessoa_160920
{
	private double AjudadeCusto;
	
	public Administrador_160920(String nome,String endereço,String telefone,String Cpf,String Rg,double AjudadeCusto) 
	{
		super (nome,endereço,telefone,Cpf,Rg);
		this.AjudadeCusto = AjudadeCusto;
		

	}

	public double getAjudadeCusto() {
		return AjudadeCusto;
	}

	public void setAjudadeCusto(double ajudadeCusto) {
		AjudadeCusto = ajudadeCusto;
	}
	
	
}