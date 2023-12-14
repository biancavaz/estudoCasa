package array;

import java.util.Scanner;

public class atividade5 {
	
 public static void main(String [] args) {
		 
		 Scanner  sc = new Scanner (System.in); 
		 
		 double numero1 [] = new double [10]; 
			double numero2 [] = new double [10];
			int aux = 0;
			
			for ( int contador = 0; contador <10; contador++) {
				System.out.println(" digite os numeros do vetor 1: ");
				numero1 [contador] = sc.nextDouble(); 
				
			}
				for ( int contador2= 0; contador2 <numero1 [contador2]; contador2++) {
					for ( int contador3 = 0; contador3 <numero2 [contador2]; contador3++) {
						 if ( contador2 < contador3 ) {
							aux = contador2; 
							contador2 = contador3; 
							contador3 = aux;
					}
				}
			}
				
			for ( int contador4 = 0; contador4 <10; contador4++) {
				System.out.println(" digite os numeros do vetor2: "); 
				numero2 [contador4] = sc.nextDouble();
				
			}
				for ( int contador5= 0; contador5 <numero1 [contador5]; contador5++) {
					for ( int contador6 = 0; contador6 <numero2 [contador6]; contador6++) {
						 if ( contador5 < contador6 ) {
							aux = contador5; 
							contador5 = contador6; 
							contador6 = aux;
					}
				}
			}
			
			for ( int contador = 0; contador <10; contador++) {
				if ( numero1 [contador] == numero2 [contador] ) {
					System.out.println(" os números digitados são iguais ");
				} 
				
				else { 
					System.out.println(" os números digitados não são iguais ");
					} break;
			} sc.close();
		}
}
