package matriz;

import java.util.Scanner;

public class somaDiagonalSecundária {
	
	public static void main ( String [] args) {
		Scanner sc = new Scanner (System.in); 
		
		int matriz [][] = new int [5][5]; 
		int matriz1 [][] = new int [5][5]; 
		int linhaS = 0, colunaS = 0, somaDS = 0; 
		
		System.out.println(" Digite os números da matriz ");
		for ( int linha =0; linha <5; linha++) {
			for ( int coluna=0; coluna<5; coluna++) {
				matriz[linha][coluna] = sc.nextInt(); 
				
				if ( matriz [linha][coluna] != matriz1 [linha][coluna] ) {
					 matriz1 [linha][coluna] =  matriz [linha][coluna];	
				}
				
				if (linha == linhaS && coluna == colunaS) {
                    linhaS++;
                    colunaS++;
                    somaDS += matriz[linha][coluna];
                    
                }
                
			}
		}
		
		System.out.println(" a soma da diagonal secundária é: " + somaDS);
		for ( int linha = 0; linha < 5; linha++) {
            for ( int coluna = 0; coluna < 5; coluna++) {
            
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            
            System.out.print("\n");
                
       }
               
	}


}
