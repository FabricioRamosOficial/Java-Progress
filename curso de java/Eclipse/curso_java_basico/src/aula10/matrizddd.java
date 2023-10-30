package aula10;

public class matrizddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][]matrizDdd =new int [2][2][2];
		
		matrizDdd [0][0][0]=1;
		matrizDdd [0][0][1]=2;
		matrizDdd [0][1][0]=3;
		
		matrizDdd [1][0][0]=1;
		matrizDdd [1][0][1]=2;
		matrizDdd [1][1][1]=3;
		
		for(int i=0;i<matrizDdd.length;i++) {
			for(int j=0; j<matrizDdd[i].length;j++) {
				for(int k=0; k<matrizDdd[i][j].length; k++) {
					
					
						//System.out.print(matrizDdd[i][j][k]);
						System.out.print(i+1+" "+j+1+" "+k+1+" ");
						}
						System.out.println();
					}
				}
				
			}
		
		
	}


