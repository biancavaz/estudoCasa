package array2;

import java.util.Scanner;

public class atividade2 {

public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		double numero [] = new double [10];
		int contadorPar = 0;
		int contadorImpar = 0;
		int aux = 0;
		
		for ( int contador = 0 ; contador < 6 ; contador++ ) {
			System.out.println ( " Digite um numero: ");
			 numero[contador] = sc.nextDouble ();
		
		if ( numero[contador] % 2 == 0 ) {
		contadorPar++;
			}
		
		if ( numero[contador] % 2 == 1 ) {
		contadorImpar++;
			}
		
		for ( int contador2= 0; contador2 <numero [contador2] && numero [contador] % 2 == 0; contador2++) {
			for ( int contador3 = 0; contador3 <numero [contador2]; contador3++) {
				 if ( contador2 < contador3 ) {
					aux = contador2; 
					contador2 = contador3; 
					contador3 = aux;
					
				 	}	
				}
			}
		}
			for ( int contador3 = 0; contador3 < numero [contador3]; contador3++) {
				System.out.println(numero[contador3]+ " ");
			
		}	
	}
}
