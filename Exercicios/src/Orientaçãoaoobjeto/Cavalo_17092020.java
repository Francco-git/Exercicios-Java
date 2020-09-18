package Orientaçãoaoobjeto;

public class Cavalo_17092020 extends Animal_17092020 
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

	public void setDevecorrer(String devecorrer2) {
		this.devecorrer = devecorrer2;
	}
	
	public String getNome() 
    {

    	return "\nnome do cavalo:" +super.getNome()+"\nidade do cavalo" +super.getIdade()+"\nO barulho do cavalo é:"+this.getEmitirsom()+"\nO cavalo gosta de"+this.getDevecorrer();
    	
    	
    	
    }
		

}
