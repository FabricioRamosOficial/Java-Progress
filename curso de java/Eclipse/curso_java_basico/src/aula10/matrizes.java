package aula10;

public class matrizes {

	public static void main(String[] args) {
		String[][] tabuleiro = new String[3][3];
		
		tabuleiro[0][0]="x";
		tabuleiro[0][1]="x";
		tabuleiro[0][2]="x";
		
		tabuleiro[1][0]="x";
		tabuleiro[1][1]="o";
		tabuleiro[1][2]="o";
		
		tabuleiro[2][0]="o";
		tabuleiro[2][1]="x";
		tabuleiro[2][2]="x";
		
		for(int i=0; i<tabuleiro.length; i++) {
			//System.out.print(tabuleiro[i][i]);
			for(int j=0; j<tabuleiro[i].length; j++){
			System.out.print(tabuleiro[i][j]+" ");
			}
			System.out.println();
		}
			tabuleiro[1][2]="o";
			
		
		}
	
	}


