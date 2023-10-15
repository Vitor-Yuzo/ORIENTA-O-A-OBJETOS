package aula_02;

public class Aula_02 {

	public static void main(String[] args) 
	{
		// INSTANCIANDO A CLASSE CRIADA (CRIANDO OBJETO)
		Caneta c1 = new Caneta();
		c1.modelo = "bic cristal";
		c1.cor = "azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = true;
		c1.destampar();
		c1.status();
		
		c1.rabiscar();
	}

}
