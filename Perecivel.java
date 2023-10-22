package cadastro;

import java.time.LocalDate;

public class Perecivel extends Produto
{

	private int[] validade = new int[3];
	
	public Perecivel(String descricaoProd, double valorProd, int dia, int mes, int ano)
	{	
		// Chamando a função pai
		super(descricaoProd,valorProd);
		
		// Atribuindo as datas
		validade[0] = dia;
		validade[1] = mes;
		validade[2] = ano;
	}
	

	public boolean estaVencido()
	{
		// Recebendo data do sistema
		LocalDate dataAtual = LocalDate.now();
		
		int dia_atual = dataAtual.getDayOfMonth();
		int mes_atual = dataAtual.getMonthValue();
		int ano_atual = dataAtual.getYear();
		
		// Analisando se está vencido ou nao
		if(validade[2] <= ano_atual)
		{
			if(validade[2] == ano_atual)
			{
				if(validade[1] <= mes_atual)
				{
					if(validade[1] == mes_atual)
					{
						if(validade[0] <= dia_atual)
						{
							if(validade[0] == dia_atual)
							{
								return false;
							}
							else
							{
								return true;
							}
						}
						else
						{
							return false;
						}
					}
					else
					{
						return true;
					}
				}
				else
				{
					return false;
				}
			}
			else
			{
				return true; //Esta vencido
			}
		}
		else
		{
			return false; // Nao vencido 
		}	
	}
	
	public void aplicarDesconto(double a)
	{
		
	}
	
	
	public String toString() 
	{
		String ret;
		
		ret = "\n----- METODO TO STRING -----"
				+ "\nDescricao: " + this.getDescricao() 
				+ "\nId: " + this.getId() 
				+ "\nValor: " + getValor() 
				+ "\nQuantidade: " + getQuantidade()
				+ "\nValidade: " + validade[0] + " / " + validade[1] + " / " + validade[2];
		
		return ret;
	}
	
}
