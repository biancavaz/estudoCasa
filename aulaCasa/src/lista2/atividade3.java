package lista2;

import java.util.Scanner;

public class atividade3 {
	
public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		float chico = (float) 1.50, ze = (float) 1.10;
		byte ano = 0;
		
		for ( int contador = 0; contador <=50; contador++) {
		
		chico = ( float ) ( chico + 0.02 );
		ze = ( float ) ( ze + 0.03 );
		ano = (byte) contador; 
		
		 System.out.println(" altura chico: " + chico);
		 System.out.println(" altura ze: " + ze);
		 System.out.println(" ano " + ano);
		sc.close();
		} 
		
	}

}
