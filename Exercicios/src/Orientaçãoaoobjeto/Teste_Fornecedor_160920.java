package Orientaçãoaoobjeto;

public class Teste_Fornecedor_160920  { 

	public static void main(String[] args) {
		
		Fornecedor_160920 Weslley = new Fornecedor_160920  ("Wesley","Rua Floribella","123456789","124587946" ,"264718593",50.,25);
		Fornecedor_160920 Alex = new Fornecedor_160920 ("Alex","Rua Marola","1234584689","1258767946" ,"264757654593",50.,25);
		Fornecedor_160920 Matheus = new Fornecedor_160920 ("Matheus","Rua circo","14876584689","59879767946" ,"26470644593",50,25);

		Weslley.imprimirInfo();
		Alex.imprimirInfo();
		Matheus.imprimirInfo();
		Weslley.obterSaldo();
		Alex.obterSaldo();
		Matheus.obterSaldo();
	}

}
