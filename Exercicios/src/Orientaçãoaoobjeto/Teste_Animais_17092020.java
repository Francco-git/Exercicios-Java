package Orienta��oaoobjeto;

public class Teste_Animais_17092020 {

	public static void main(String[] args) 
	{ 
		Cachorro_17092020 cachorro = new Cachorro_17092020 ();
		cachorro.setNome("luna");
		cachorro.setIdade(3);
		cachorro.setEmitirsom("Au Au Au...");
		cachorro.setDevecorrer("Corre Bastante....");
		
		Cavalo_17092020 cavalo = new Cavalo_17092020();
		cavalo.setNome("Estilo Talentoso");
		cavalo.setIdade(7);
		cavalo.setEmitirsom("Gr Gr Gr .....");
		cavalo.setDevecorrer("Correee muitoooo...");
		
		Pregui�a_17092020 pregui�a = new Pregui�a_17092020();
		pregui�a.setNome("Toby...");
		pregui�a.setIdade(4);
		pregui�a.setEmitirsom("pi pi pi pi ....");
		pregui�a.setSubirarvore("Sobeee Bastante.....");
		
		System.out.println(cachorro.getNome());
		System.out.println();
		System.out.println(cavalo.getNome());
		System.out.println();
		System.out.println(pregui�a.getNome());

		
	}

}
