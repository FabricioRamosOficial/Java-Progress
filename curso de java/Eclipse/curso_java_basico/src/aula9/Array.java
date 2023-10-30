package aula9;

public class Array {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 38.3;
		temperaturas[1] = 35.5;
		temperaturas[2] = 37.3;
		temperaturas[3] = 39.5;
		temperaturas[4] = 37.3;
		temperaturas[5] = 40.5;
		temperaturas[6] = 40.3;
		temperaturas[7] = 42.5;
		temperaturas[8] = 41.3;
		temperaturas[9] = 43.5;
		temperaturas[10] = 44.3;
		temperaturas[11] = 45.5;
		temperaturas[12] = 46.3;
		temperaturas[13] = 47.5;
		temperaturas[14] = 48.3;
		temperaturas[15] = 35.5;
		temperaturas[16] = 28.3;
		temperaturas[17] = 25.5;
		temperaturas[18] = 49.3;
		temperaturas[19] = 51.5;
		temperaturas[20] = 56.3;
		temperaturas[21] = 50.5;
		temperaturas[22] = 31.3;
		temperaturas[23] = 32.5;
		temperaturas[24] = 31.3;
		temperaturas[25] = 32.5;
		
		/*for (int i=0 ;i<temperaturas.length ;i++) {
			System.out.println("o valor da temperatura do dia " +(i)+"é: "+ temperaturas[i]);
			
		}
		*/
		for(double temp:temperaturas) {
			System.out.println(temp);
		}
	}

}
