package matriz;

import java.util.Scanner;

public class somaDiagonalPrincipal {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
	
	int matriz [][] = new int [5][5]; 
	int matriz1 [][] = new int [5][5];
	int somaDP = 0; 
	
	System.out.println(" Digite os números da matriz ");
	for ( int linha =0; linha <5; linha++) {
		for ( int coluna=0; coluna<5; coluna++) {
			matriz[linha][coluna] = sc.nextInt(); 
			
			if ( matriz [linha][coluna] != matriz1 [linha][coluna] ) {
				 matriz1 [linha][coluna] =  matriz [linha][coluna];	
			}
			
			 if (linha == coluna) {
                 somaDP += matriz[linha][coluna];
			 }
		}
	}
	
	
	System.out.println(" a soma da diagonal principal é " + somaDP);
		for ( int linha1 = 0; linha1 < 5; linha1++) {
			for ( int coluna1 = 0; coluna1 < 5; coluna1++) {
        
            System.out.print(" " + matriz[linha1][coluna1] + " ");
        }
        
        System.out.print("\n");
            
		}
           
	}

}