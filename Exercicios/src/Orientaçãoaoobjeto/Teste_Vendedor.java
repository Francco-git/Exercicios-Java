package Orientaçãoaoobjeto;

public class Teste_Vendedor {

	public static void main(String[] args) {
		Vendedor_160920 Weslley = new Vendedor_160920  ("Wesley","Rua Floribella","123456789","124587946" ,"264718593",50,20);
		Vendedor_160920 Alex = new Vendedor_160920 ("Alex","Rua Marola","1234584689","1258767946" ,"264757654593",50,20);
		Vendedor_160920 Matheus = new Vendedor_160920 ("Matheus","Rua circo","14876584689","59879767946" ,"26470644593",50,20);

		Weslley.ValordeVendas();
		Alex.ValordeVendas();
		Matheus.ValordeVendas();
	}

}
