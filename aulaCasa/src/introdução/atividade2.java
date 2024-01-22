package introdução;

import java.util.Scanner;

public class atividade2 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do { 
			
			System.out.println(" digite um número ");
			numero = sc.nextInt();
			
			if ( numero >80 ){
				System.out.println(" O número digitado é maior que 80!!! ");
			} else if ( numero <25 ) {
				System.out.println(" O número é menor que 25..");
			} else if ( numero == 40 ){
				System.out.println(" O número digitado é igual a 40 "); 
			}
		} while ( numero >0 );
		sc.close();
	}

}
