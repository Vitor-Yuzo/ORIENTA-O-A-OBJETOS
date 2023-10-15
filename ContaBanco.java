package aula_05;

public class ContaBanco 
{
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Método Construtor 
	public ContaBanco()
	{
		this.saldo = 0;
		this.status = false;
	}
	 

	public void estadoAtual()
	{
		System.out.println("------------------------------------");
		System.out.println("Conta: " + this.getnumConta());
		System.out.println("Tipo:  " + this.gettipo());
		System.out.println("Dono: " + this.getdono());
		System.out.println("Saldo: " + this.getsaldo());
		System.out.println("Status: " + this.getstatus());
	}
	
	// Métodos especiais
	
	public void setnumConta(int numero)
	{
		this.numConta = numero; 
	}
	
	public int getnumConta()
	{
		return this.numConta;
	}
	
	public void settipo(String t)
	{
		this.tipo = t;
	}
	
	public String gettipo()
	{
		return this.tipo;
	}
	
	public void setdono(String nome)
	{
		this.dono = nome;
	}
	
	public String getdono()
	{
		return this.dono;
	}
	
	public void setsaldo(float dinheiro)
	{
		this.saldo = dinheiro;
	}
	
	public float getsaldo()
	{
		return this.saldo;
	}
	
	public void setstatus(boolean modo)
	{
		this.status = modo;
	}
	
	public boolean getstatus()
	{
		return this.status;
	}
	
	// Demais métodos
	
	public void abrirConta(String t)
	{
		this.settipo(t);
		this.setstatus(true);
		
		if(t == "CC")
		{
			this.setsaldo(50);
		}
		else
		{
			this.setsaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso");
		
	}
	
	public void fecharConta()
	{
		if(this.getsaldo() > 0)
		{
			System.out.println("Você deve sacar todo o saldo antes de fechar a conta !!");
		}
		else
		{
			if(this.getsaldo() < 0)
			{
				System.out.println("Ainda há débito na conta !!");
			}
			else
			{
				this.setstatus(false);
				System.out.println("Conta fechada com sucesso");
			}
		}
	}
	
	public void depositar(float valor)
	{
		if(this.getstatus() == true)
		{
			this.setsaldo(this.getsaldo() + valor);
			System.out.println("Deposito realizado com sucesso na conta de " + this.getdono());
		}
		else
		{
			System.out.println("A conta está bloqueada, impossível depositar !!");
		}
	}
	
	public void sacar(float valor)
	{
		if(this.status == true)
		{
			if(this.getsaldo() >= valor)
			{
				this.setsaldo(this.getsaldo() - valor);
				System.out.println("Saque realizado com sucesso");
			}
			else
			{
				System.out.println("Saldo insuficiente !!");
			}
		}
		else
		{
			System.out.println("Conta bloqueada!! impossível sacar");
		}
	}
	
	public void pagarMensal()
	{
		int v;
		
		if(this.gettipo() == "CC")
		{
			v = 12;
		}
		else
		{
			v = 20;
		}
		
		if(this.getstatus() == true)
		{
			if(this.getsaldo() > v)
			{
				this.setsaldo(getsaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getdono());
			}
			else
			{
				System.out.println("Saldo insuficiente !!");
			}	
		}
		else
		{
			System.out.println("Conta fechada, impossivel pagar a mensalidade !!");
		}
	}
}
