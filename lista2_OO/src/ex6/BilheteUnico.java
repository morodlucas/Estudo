package ex6;

import java.util.Random;

public class BilheteUnico {

	private int id;
	private String nomeUser;
	private double saldo;
	private static double tarifaBase = 4.40;
	private double tarifa;
	private int tipoBilhete;
	
	public BilheteUnico(String nomeUser, int tipoBilhete) {
		this.nomeUser = nomeUser;
		this.tipoBilhete = tipoBilhete;
		this.saldo = geraSaldo();
		this.id = geraId();
	}
	
	
	private int geraId() {
		Random r = new Random();
		id = r.nextInt(10);
		return id;
	}
	
	private double geraSaldo() {
		Random r = new Random();
		saldo = r.nextInt(10, 1000);
		return saldo;
	}
	
	public void bilheteTarifa() {
		if(tipoBilhete == 1) {
			tarifa = tarifaBase * 0.5;
		}
		else if(tipoBilhete == 2){
			tarifa = tarifaBase * 0.5;
		}
		else if(tipoBilhete == 3) {
			tarifa = tarifaBase;
		}
		
		//switch (tipoBilhete) {
		//case 1: {
		//	tarifa = tarifaBase * 0.5;
		//}
		//case 2: {
		//	tarifa = tarifaBase * 0.5;
		//}
		//case 3: {
		//	tarifa = tarifaBase;
		//}
		//default:
		//	throw new IllegalArgumentException("Unexpected value: " + tipoBilhete);
		//}
	}
	public void getDados() {
		String aux = "";
		aux+= "ID: " + id +"\n";
		aux+= "Saldo: " + saldo + "\n";
		aux+= "Tarifa: " + tarifa + "\n";
		System.out.println(aux);
	}
	
	public void getSaldo() {
		System.out.println("R$"+saldo);
	}
	
	public void recarga(double valor) {
		saldo += valor;
	}
	
	public void debita() {
		saldo -= tarifa;
	}
	
	
	
}
