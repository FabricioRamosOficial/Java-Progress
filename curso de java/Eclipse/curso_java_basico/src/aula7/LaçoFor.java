package aula7;

public class LaçoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1 ; i <= 5 ; i++) {
			System.out.println(i);
		}
		
		//primo e todo numero que só é divisivel por 1 e por ele mesmo
		
		 for (int num = 1; num <= 100; num++) {
	            boolean ePrimo = true;
	            if (num > 1) {
	                for (int i = 2; i < num; i++) {
	                    if (num % i == 0) {
	                        ePrimo = false;
	                        break;
	                    }
	                }
	                if (ePrimo) {
	                    System.out.println(num + " é um número primo");
	                }else {
	                	 System.out.println(num + " não é um número primo");
	                	
	                }
	            }
	        }
	    }
	
		
	}
	


	
