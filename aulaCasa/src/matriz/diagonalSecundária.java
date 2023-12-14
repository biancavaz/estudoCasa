package matriz;

import java.util.Scanner;

public class diagonalSecundária {
	
	public static void main ( String [] args) {
		Scanner sc = new Scanner (System.in); 
		
		int matriz [][] = new int [5][5]; 
		int matriz1 [][] = new int [5][5]; 
		
		System.out.println(" Digite os números da matriz ");
		for ( int linha =0; linha <5; linha++) {
			for ( int coluna=0; coluna<5; coluna++) {
				matriz[linha][coluna] = sc.nextInt(); 
				
				if ( matriz [linha][coluna] != matriz1 [linha][coluna] ) {
					 matriz1 [linha][coluna] =  matriz [linha][coluna];	
				}
				
				if ( linha + coluna != 4 ) {
					matriz [linha][coluna] = 0; 
				}
			}
		}
		
		for ( int linha = 0; linha < 5; linha++) {
            for ( int coluna = 0; coluna < 5; coluna++) {
            
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            
            System.out.print("\n");
                
       }
               
	}

}
