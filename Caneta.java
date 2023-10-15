package aula_02;

public class Caneta 
{
	// DEFININDO ATRIBUTOS
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	// DEFININDO MÉTODOS
	void status()
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Tamanho da ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	void rabiscar()
	{
		if (this.tampada == true)
			System.out.println("ERRO! NAO POSSO RABISCAR");
		else
			System.out.println("RABISCANDO...");
	}
	
	void tampar()
	{
		this.tampada = true;
	}
	
	void destampar()
	{
		this.tampada = false;
	}

}

