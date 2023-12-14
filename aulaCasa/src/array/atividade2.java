package array;

import java.util.Scanner;

public class atividade2 {
	
public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double numero [] = new double [6];
		int contImpar = 0, contPar = 0;
		
		for ( int contador = 0; contador <6; contador++) {
		
		System.out.println(" digite um número "); 
		numero [contador] = sc.nextDouble();
		
		if ( numero[contador] % 2 == 0 ) {
			contPar++;
			System.out.println(" o numero é par ");
			System.out.println(" a quantidade de numerpos pares é: " + contPar);
			
			}
		
		if ( numero [contador] % 2 == 1) {
			contImpar++; 
			System.out.println(" o numero é impar: ");
			System.out.println(" a quantidade de numeros impares é: " + contImpar);
		}
		
		}
		
		
	}
}
	
