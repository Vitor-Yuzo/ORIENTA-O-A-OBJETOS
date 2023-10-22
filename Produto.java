package cadastro;

import java.util.Scanner;

public class Produto 
{
	// Declarando atributos
	private String descricao;
	private int id;
	private double valor;
	private static int quantidade;
	Scanner teclado = new Scanner (System.in);
	
	
	// Método Construtor
	public Produto(String descricaoProd, double valorProd)
	{
		// Incrementando a quantidade total de produtos
		quantidade += 1;
		
		// Definindo os valores
		this.setDescricao(descricaoProd);
		this.setValor(valorProd);
		this.setId(quantidade);
	}
	
	// Metodos Getters e Setters
	public String getDescricao()
	{
		return descricao;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	public static int getQuantidade()
	{
		return quantidade;
	}
	
	public void setDescricao(String descricaoProd)
	{
		this.descricao = descricaoProd;
	}
	
	public void setId(int valor_quantidade)
	{
		this.id = valor_quantidade;
	}
	
	public void setValor(double valorProd)
	{
		this.valor = valorProd;
	}
	
	public String toString()
	{
		String ret;
		
		ret = "\n----- METODO TO STRING -----"
			+ "\nDescricao: " + this.getDescricao() 
			+ "\nId: " + this.getId() 
			+ "\nValor: " + getValor() 
			+ "\nQuantidade: " + getQuantidade();
		
		return ret;
	}

}
