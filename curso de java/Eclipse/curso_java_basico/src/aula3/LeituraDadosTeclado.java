package aula3;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite Seu nome Completo:");
		String nomeCompleto =scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		System.out.println("sua idade é:" +idade);
		System.out.println("s");
	
		
		
	}

}
