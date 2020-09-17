package Orientaçãoaoobjeto;

public class Fornecedor_160920 extends Pessoa_160920
{
		private double valorcredito;
		private double valordivida;
		
		public Fornecedor_160920(String nome,String endereço,String telefone,String Cpf,String Rg,double valorcredito,double valordivida) 
		{
			super (nome,endereço,telefone,Cpf,Rg); 
			this.valorcredito=valorcredito;
			this.valordivida=valordivida;
			
		}
		
		
		public double getValorcredito() {
			return valorcredito;
		}

		public void setValorcredito(double valorcredito) {
			this.valorcredito = valorcredito;
		}

		public double getValordivida() {
			return valordivida;
		}

		public void setValordivida(double valordivida) {
			this.valordivida = valordivida;
		}
		
		public void obterSaldo() {
			double diferencacd = getValorcredito()-getValordivida();
			System.out.println("O seu Saldo é:"+diferencacd);
		}
		
		public void imprimirInfo (){
			System.out.println("\nNome do fornecedor: "+getNome()+"\n"+"Cpf: "+getCpf()+"\nTelefone: "+getTelefone()+"\n"+"Endereço: "+getEndereço()+"\nValor crédito: "+valorcredito+"\nValor dívida: "+valordivida);
		}
		
		
}
