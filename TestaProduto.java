package cadastro;

import java.util.Scanner;

public class TestaProduto 
{
	
	public static void main(String[] args) 
	{
		int opcao;
		int dia = 0;
		int mes = 0;
		int ano = 0;
		String descricaoProd;
		double valorProd = 0;
		Scanner teclado = new Scanner (System.in);
		
		do
		{
			System.out.println("\n----- MENU -----\n");
			
			System.out.println("[1]. Criar Produto");
			System.out.println("[2]. Criar Produto Perecível");
			System.out.println("[3]. Sair");
			System.out.print("\nDigite a sua opção: ");
			
			opcao = 0;
			opcao = teclado.nextInt();
			
			switch(opcao)
			{
			
				case 1:
					
					// Recebendo Descrição e Valor
					System.out.print("Digite a descrição do produto: ");
					teclado.nextLine(); // Limpando buffer de entrada
					descricaoProd = teclado.nextLine();
					
					System.out.print("Digite o valor do produto perecível: ");
					valorProd = teclado.nextDouble();
					
					// Criando Objeto do tipo Produto
					Produto prod = new Produto(descricaoProd, valorProd);
					
					// Imprimindo informações do Objeto
					System.out.println(prod.toString());
					
				break;
				
				case 2:
					
					// Recebendo Descrição, Valor e Validade
					System.out.print("Digite a descrição do produto perecível: ");
					teclado.nextLine(); // Limpando buffer de entrada
					descricaoProd = teclado.nextLine();
					
					System.out.print("Digite o valor do produto perecível: ");
					valorProd = teclado.nextDouble();
					
					System.out.println("DIGITE A DATA DE VALIDADE ");
					System.out.print("Dia: ");
					dia = teclado.nextInt();
					System.out.print("Mês: ");
					mes = teclado.nextInt();
					System.out.print("Ano: ");
					ano = teclado.nextInt();
					
					// Criando Objeto do tipo Perecivel
					Perecivel prodPere = new Perecivel(descricaoProd, valorProd, dia, mes, ano);
					
					// Imprimindo informações do Objeto
					System.out.println(prodPere.toString());
					
					// Analisando se está vencido
					prodPere.estaVencido();
					
					if(prodPere.estaVencido())
					{
						System.out.println("O produto está vencido !!");
					}
					else
					{
						System.out.println("O produto não está vencido !!");
					}
						
					
				break;
				
				case 3: 
				return;
				
				
			}
			
		}while(opcao!=3);
	}

}
