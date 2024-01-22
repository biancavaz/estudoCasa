package array1;

import java.util.Scanner;

public class atividade3 {
	
public static void main( String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double temperatura [] = new double [121];
		double maiorTemp = 0, menorTemp= 0, media=0;
		
		for ( int contador = 0; contador <121; contador++ ) {
		
		System.out.println(" digite qual é a temperatura: ");
		temperatura [contador] = sc.nextDouble();
		
		if ( contador == 0 ) {
			maiorTemp = temperatura[contador];
			menorTemp = temperatura [contador]; 
		}
		
		if ( temperatura [contador]> maiorTemp ) {
			maiorTemp = temperatura [contador];
		}
		
		if ( temperatura[contador] < menorTemp ) {
			menorTemp = temperatura [contador];	
			}
		} 
		for ( int contador1 = 0 ; contador1 <121; contador1++)
		media = (temperatura[contador1] + temperatura [contador1])/121;
		
		System.out.println(" a maior temperatura resgistrada foi: "+ maiorTemp);
		System.out.println(" a menor temperatura resgistrada foi: "+ menorTemp);
		System.out.println(" a média das temperaturas é: "+ media);
	} 
}
