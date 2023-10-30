package aula6;

public class LoopDoWhilhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int max =10;
		
		System.out.println("contando até " + max);
		while(i <max) {
			i++;
			System.out.println("o valor de i é: "+i);
		}
		do {
			i++;
			System.out.println("o novo valor de i é: "+ i);
	}while(i<20);
		System.out.println("o ultimo valor de i foi: "+i);

	
	}
	
}
