package Orienta��oaoobjeto;

public class Cliente {
	
	//DECLARA��O DE ATRIBUTOS
	private String clientelegal;
	private String clientechato;
	private String clientenervoso;

	//METODO DE CONSTRU��O
	public Cliente (String legal,String chato,String nervoso) 
	{
		clientelegal=legal;
		clientechato=chato;
		clientenervoso=nervoso;
	}
	
	public String getHumorClientes() 
	{
		String HumorClientes = clientelegal+" "+clientechato+" "+clientenervoso;
		return HumorClientes;
		
	}

}
