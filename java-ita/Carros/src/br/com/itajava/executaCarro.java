package br.com.itajava;

public class executaCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro(100, 0, "UP");
//		c1.nome = "Dodge";
//		c1.potencia = 10;
//		c1.velocidade = 0;

		Carro c2 = new Carro(0, 0, null);
		c2.potencia = 10;
		c2.nome = "Caravan";
		c2.velocidade = 0;
		
		Carro c3 = new Carro(50, 0, "Corolla");
//		c3.potencia = 10;      
		c3.nome = "Dodge";     
//		c3.velocidade = 0;  
		
		Carro c4 = new Carro(20, 0, "Fusca");

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		c2.acelerar();
		
		c3.acelerar();
		
//		c1.frear();

		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
	}

}
