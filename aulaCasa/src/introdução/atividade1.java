package introdução;

import java.util.Scanner;

public class atividade1 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, valor = 0; 
		
		for ( int contador = 0; contador <=5; contador++) {
			
			System.out.println (" informe 5 números: ");
			numero = sc.nextInt(); 
			
			if ( numero >=10 && numero <=150 ) {
				valor++;
			}
			
			
		}
		
		System.out.println (" \n A quantidade de números entre 10 e 150 é: : " + valor );
		sc.close();
	}

}
