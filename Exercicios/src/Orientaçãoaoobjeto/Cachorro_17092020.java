package Orientaçãoaoobjeto;

public class Cachorro_17092020 extends Animal_17092020 
{
	private String devecorrer,emitirsom;
	 
	public String getEmitirsom() {
	return emitirsom;
	}

	public void setEmitirsom(String emitirsom) 
	{
		this.emitirsom = emitirsom;

	}

	public String getDevecorrer() {
		return devecorrer;
	}

	public void setDevecorrer(String devecorrer) {
		this.devecorrer = devecorrer;
	}
	
	Cachorro_17092020()
	
	{
		
	}
    public String getNome() 
    {

    	return "\nnome do cachorro:" +super.getNome()+"\nidade do cachorro" +super.getIdade()+"\nO barulho do cachorro é:"+this.getEmitirsom()+"\nO cachorro gosta de"+this.getDevecorrer();
    	
    	
    	
    }
    
    
}
