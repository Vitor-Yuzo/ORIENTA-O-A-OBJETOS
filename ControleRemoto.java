package aula_06;

public class ControleRemoto implements Controlador
{
	// Definindo atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Métodos Especiais
	
	public ControleRemoto()
	{
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume()
	{
		return volume;
	}
	
	private boolean getLigado()
	{
		return ligado;
	}
	
	private boolean getTocando()
	{
		return tocando;
	}
	
	
	private void setVolume(int valor)
	{
		this.volume = valor;
	}
	
	private void setLigado(boolean valor)
	{
		this.ligado = valor;
	}
	
	private void setTocando(boolean valor)
	{
		this.tocando = valor;
	}

	// MÉTODOS ABSTRATOS 
	
	@Override
	public void ligar() 
	{
		this.setLigado(true);
	}

	@Override
	public void desligar() 
	{
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() 
	{
		System.out.println("-----MENU-----");
		System.out.println("Está ligado?: " + getLigado());
		System.out.println("Está tocando?: " + getTocando());
		System.out.print("Volume: " + getVolume());
		
		for(int i = 0 ; i <= this.getVolume() ; i += 10)
		{
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() 
	{
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() 
	{
		if(this.getLigado() == true)
		{
			this.setVolume(this.getVolume() + 5);
		}
		else
		{
			System.out.println("Desligado, impossível aumentar o volume");
		}
		
	}

	@Override
	public void menosVolume() 
	{
		if(this.getLigado() == true)
		{
			if(this.getVolume() == 0)
			{
				System.out.println("Volume = 0, impossivel diminuir");
			}
			else
			{
				this.setVolume(this.getVolume() - 5);
			}
		}
		else
		{
			System.out.println("Desligado, impossível diminuir o volume");
		}
		
	}

	@Override
	public void ligarMudo() 
	{
		if(this.getLigado() == true && this.getVolume() > 0)
		{
			this.setVolume(0);
		}
		else
		{
			if(this.getLigado() == false)
			{
				System.out.println("Desligado, impossivel deixar mudo");
			}
			else
			{
				System.out.println("Já está mudo");
			}
		}
		
	}

	@Override
	public void desligarMudo() 
	{
		if(this.getLigado() == true && this.getVolume() == 0)
		{
			this.setVolume(50);
		}
		else
		{
			if(this.getLigado() == false)
			{
				System.out.println("Desligado, impossivel tirar do mudo");
			}
			else
			{
				System.out.println("Ele não está mudo !!");
			}
		}
	}

	@Override
	public void play() 
	{
		if(this.getLigado() && !this.getTocando())
		{
			this.setTocando(true);
		}
	}

	@Override
	public void pause() 
	{
		if(this.getLigado() && this.getTocando())
		{
			this.setTocando(false);
		}
	}
}
