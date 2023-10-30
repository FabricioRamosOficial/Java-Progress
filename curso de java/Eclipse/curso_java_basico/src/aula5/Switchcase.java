package aula5;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	 System.out.println("Digite o dia Da semana entre 1-7: ");
	int diaSemana = scan.nextInt();
	
	//Condições com if, else e else if
	
	
	/*if (diaSemana ==1) {
		System.out.println("Domingo");
	}else if (diaSemana ==2) {
		System.out.println("Segunda-Feira");
		
	}else if (diaSemana ==3) {
		System.out.println("Terça-Feira");
	}else if (diaSemana ==4) {
		System.out.println("Quarta-Feira");
	}else if (diaSemana ==5) {
		System.out.println("Quinta-Feira");
	}else if (diaSemana ==6) {
		System.out.println("Sexta-Feira");
	}else if (diaSemana ==7){
		System.out.println("Sábado");
	} else {
		System.out.println("não é um dia valido seu animal do caralho");
	}
*/
	//utilizando o switch case
	
	
	
	switch(diaSemana) {
	case 1:System.out.println("Domingo");break;
	case 2:System.out.println("Segunda-feira");break;
	case 3: System.out.println("Terça-Feira");break;
	case 4:System.out.println("Quarta-feira");break;
	case 5:System.out.println("quinta-feira");break;
	case 6: System.out.println("sexta-Feira");break;
	case 7: System.out.println("Sábado");break;
	default:System.out.println("nao existe burrao");break;
	}
	
	}

}
