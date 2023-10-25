package aula_07;

import java.util.Random;

public class Luta 
{
	// Atributos
	private Lutador desafiado;
	private Lutador desafiando;
	private int rounds;
	private boolean aprovada;
	
	// Métodos
	public void marcarLuta(Lutador l1, Lutador l2)
	{
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2)
		{
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiando = l2;
		}
		else
		{
			this.aprovada = false;
			this.desafiado = null;
			this.desafiando = null;
		}
	}
	
	public void lutar()
	{
		if(this.aprovada)
		{
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiando.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0,1,2
			
			switch(vencedor)
			{
				case 0:
					System.out.println("Empatou");
					this.desafiado.empatarLuta();
					this.desafiado.empatarLuta();
					break;
					
				case 1:
					System.out.println("Vitória do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiando.perderLuta();
					break;
					
				case 2:
					System.out.println("Vitória do " + this.desafiando.getNome());
					this.desafiando.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		}
		else
		{
			System.out.println("A luta nao pode acontacer");
		}
	}
	
	// Métodos Especiais
	public void setDesafiado(Lutador a)
	{
		this.desafiado = a;
	}
	
	public Lutador getDesafiado()
	{
		return this.desafiado;
	}
	
	public void setDesafiando(Lutador a)
	{
		this.desafiando = a;
	}
	
	public Lutador getDesafiando()
	{
		return this.desafiando;
	}
	
	public void setRounds(int valor)
	{
		this.rounds = valor;
	}
	
	public int getRounds()
	{
		return this.rounds;
	}
	
	public void setAprovada(boolean a)
	{
		this.aprovada = a;
	}
	
	public boolean getAprovada()
	{
		return this.aprovada;
	}
}
