package aula_02;

public class Aula_02 {

	public static void main(String[] args) 
	{
		// INSTANCIANDO A CLASSE CRIADA (CRIANDO OBJETO)
		Caneta c1 = new Caneta();
		
		// ACESSANDO ATRIBUTOS
		c1.cor = "azul";
		c1.ponta = 0.5f;
		
		// ACESSANDO OS MÉTODOS
		c1.tampar();
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		// CRIANDO NOVO OBJETO
		Caneta c2 = new Caneta();
		
		c2.modelo = "HostNet";
		c2.cor = "Preta";
		
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
