package aula_04;

public class Caneta 
{
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	// MÉTODO CONSTRUTOR
	public Caneta(String m, String c, float p)
	{
		this.setmodelo(m);
		this.cor = c;
		this.setponta(p);;
		this.tampar();
	}
	
	// MÉTODO GETTER
	public String getmodelo()
	{
		return this.modelo;
	}
	
	// MÉTODO SETTER
	public void setmodelo(String m)
	{
		this.modelo = m;
	}
	
	public float getponta()
	{
		return this.ponta;
	}
	
	public void setponta(float p)
	{
		this.ponta = p;
	}
	
	public void tampar()
	{
		this.tampada = true;
	}
	
	public void destampar()
	{
		this.tampada = false;
	}
	
	public void status()
	{
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
