package Orienta��oaoobjeto;

public class Aviao {

//DECLARA��O DE ATRIBUTOS
	private String passageiroexcessodebagagem;
	private String passageirobagagemnormal;
	private String passageirosembagagem;

	//METODO DE CONSTRU��O
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
