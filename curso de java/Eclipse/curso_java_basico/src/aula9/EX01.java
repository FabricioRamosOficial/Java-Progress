package aula9;

public class EX01 {

	public static void main(String[] args) {

		String[] frutas = new String[5];
		String[] saladaMista = new String[frutas.length];
		frutas[0]="banana";
		frutas[1]="uva";
		frutas[2]="maçã";
		frutas[3]="pera";
		frutas[4]="goiaba";
		
		for (int i=0; i<frutas.length;i++) {
			System.out.println("as frutas são: "+(i+1)+ " "+frutas[i]);
		saladaMista[i]=frutas[i];
		System.out.println("as frutas são: "+(i+1)+ " "+saladaMista[i]);
		}
	}

}
