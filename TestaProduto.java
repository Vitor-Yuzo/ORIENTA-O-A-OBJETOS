package cadastro;

import java.util.Scanner;

public class TestaProduto 
{

	public static void opcao_1()
	{
		Produto prod = new Produto();
	}
	
	public static void main(String[] args) 
	{
		int opcao;
		Scanner teclado = new Scanner (System.in);
		
		do
		{
			
			System.out.println("[1]. Criar Produto");
			System.out.println("[2]. Criar Produto Perecível");
			System.out.println("[3]. Sair");
			
			opcao = teclado.nextInt();
			
			switch(opcao)
			{
			
				case 1: opcao_1();
				break;
				
				case 2: //função
				break;
				
				case 3: 
				return;
				
				
			}
			
		}while(opcao!=3);
	}

}
