package Orienta��oaoobjeto;

public class Pregui�a_17092020 extends Animal_17092020 
{
	private String subirarvore,emitirsom;

	public void setEmitirsom(String emitirsom) 
	{
		this.emitirsom = emitirsom;

	}

	public String getSubirarvore() {
		return subirarvore;
	}

	public void setSubirarvore(String subirarvore) {
		this.subirarvore = subirarvore;
	}
	
	public String getNome() 
    {
    	return "\nnome da pegui�a:" +super.getNome()+"\nidade da pregui�a" +super.getIdade()+"\nO barulho da pregui�a �:"+this.getEmitirsom()+"\nA pregui�a gosta de"+this.getSubirarvore();

    }

    	

}
