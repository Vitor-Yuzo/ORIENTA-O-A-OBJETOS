package aula_02;

public class Caneta 
{
	// DEFININDO ATRIBUTOS
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	// DEFININDO MÉTODOS
	public void status()
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Tamanho da ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar()
	{
		if (this.tampada == true)
			System.out.println("ERRO! NAO POSSO RABISCAR");
		else
			System.out.println("RABISCANDO...");
	}
	
	public void tampar()
	{
		this.tampada = true;
	}
	
	public void destampar()
	{
		this.tampada = false;
	}

}

