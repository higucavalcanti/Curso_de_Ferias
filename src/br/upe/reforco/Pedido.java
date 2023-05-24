package br.upe.reforco;

public class Pedido {
		
	public double prepararBebida(double credito) {
			
			
		return 0d;
	}
	
	public static void main(String[] args) {
		
		Maquina maquina = new Maquina();
		
		//V1 V2 R
		//true && true = true
		//true && false = false
		//false && true = false
		//false && false = false
		
		if (maquina.EstaOK()) {
			System.out.println("Máquina ligada e funcionando");
			
			maquina.depositarCredito(1.0);
			
			
		} else {
			System.out.println("Máquina fora de serviço");
		}

	}

}