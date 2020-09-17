package Orientaçãoaoobjeto;

public class Eletronico {
	
	private String produto;
	private String modelo;
	private String numserie;
	private String valor;
	
	
	public Eletronico (String produto,String modelo, String valor, String numserie) 
	{
		this.produto = produto;
		this.modelo	= modelo;
		this.valor = valor;
		this.numserie = numserie;
	}
	
	public String geteletronico() 
	{
		String eletronico = produto+" "+modelo+" "+valor+ " "+numserie;
		return eletronico;
		
	}

}
