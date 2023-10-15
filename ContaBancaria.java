package aula_05;

public class ContaBancaria
{

	public static void main(String[] args) 
	{
		ContaBanco p1 = new ContaBanco();
		p1.setnumConta(1);
		p1.setdono("Jubileu");
		p1.abrirConta("CC");
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setnumConta(2222);
		p2.setdono("Creuza");
		p2.abrirConta("CP");
		
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100);
		
		p1.sacar(150);
		p1.fecharConta();
		
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
