package Orientaçãoaoobjeto;

public class Aviao {

//DECLARAÇÃO DE ATRIBUTOS
	private String passageiroexcessodebagagem;
	private String passageirobagagemnormal;
	private String passageirosembagagem;

	//METODO DE CONSTRUÇÃO
	public Aviao (String excessodebagagem,String bagagemnormal,String sembagagem) 
	{
		passageiroexcessodebagagem=excessodebagagem;
		passageirobagagemnormal=bagagemnormal;
		passageirosembagagem=sembagagem;
	}
	
	public String getbagagemAviao() 
	{
		String bagagemAviao = passageiroexcessodebagagem+" "+passageirobagagemnormal+" "+passageirosembagagem;
		return bagagemAviao;
		
	}

}
