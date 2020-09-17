package Orientaçãoaoobjeto;

public class Cliente {
	
	//DECLARAÇÃO DE ATRIBUTOS
	private String clientelegal;
	private String clientechato;
	private String clientenervoso;

	//METODO DE CONSTRUÇÃO
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
