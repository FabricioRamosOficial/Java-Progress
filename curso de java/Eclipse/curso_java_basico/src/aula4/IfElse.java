package aula4;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		/*System.out.print("entre com a sua idade");
		int idade = scan.nextInt();
		
		if(idade>=18) {
			System.out.println("Voce pode entrar");
		} 
		else
		System.out.println("você nao pode entrar");
	}
*/
				System.out.println("Digite o valor");
				double valor = scan.nextDouble();
				
				if(valor<=10) {
					System.out.println("Está barato Pode comprar!");
				} else if (valor > 10 && valor <15 ) {
					System.out.println("Você pode pedir um desconto");
				}else if (valor >20){
					System.out.println("Você não deve comprar");
				}
					
					
	}

	
}
	
