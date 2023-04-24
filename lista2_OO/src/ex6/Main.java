package ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String nomeUser;
		int tipoBilheteM;
		
		System.out.print("Nome do usuário: ");
		nomeUser = kb.nextLine();
		
		System.out.println("Tipo do bilhete: ");
		System.out.println("1- Idoso");
		System.out.println("2- Estudante");
		System.out.println("3- Inteira");
		tipoBilheteM = kb.nextInt();
		
		BilheteUnico bilhete = new BilheteUnico(nomeUser, tipoBilheteM);
		
		bilhete.bilheteTarifa();
		
		bilhete.getDados();
		
		System.out.println();
		
		bilhete.getSaldo();
		
		bilhete.debita();
		
		bilhete.debita();
		
		bilhete.getSaldo();
		
		bilhete.recarga(200);
		
		bilhete.getSaldo();
		
		kb.close();
	}

}
