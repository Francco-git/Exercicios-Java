package Orientaçãoaoobjeto;

public class Preguiça_17092020 extends Animal_17092020 
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
    	return "\nnome da peguiça:" +super.getNome()+"\nidade da preguiça" +super.getIdade()+"\nO barulho da preguiça é:"+this.getEmitirsom()+"\nA preguiça gosta de"+this.getSubirarvore();

    }

    	

}
