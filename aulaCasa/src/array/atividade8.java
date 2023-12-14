package array;

import java.util.Random;
import java.util.Scanner;

public class atividade8 {
	
public static void main( String [] args) {
		
		Scanner sc = new Scanner (System.in); 
			
		Random random = new Random (60); 
		int numero = 0; 
		int numero2 = 0, numero1;
		int numero3, numero4, numero5, numero6;
		int aux = 0;
		
		for ( int contador =0; contador <6; contador++) {
			System.out.println(" digite um númeo: ");
			numero = sc.nextInt(); 
		}
			
			numero1 = random.nextInt(60);
			System.out.println(numero1);
			
			numero2 = random.nextInt(60);
			System.out.println(numero2);
		
			numero3 = random.nextInt(60);
			System.out.println(numero3);
			
			numero4 = random.nextInt(60);
			System.out.println(numero4);
			
			numero5 = random.nextInt(60);
			System.out.println(numero5);
			
			numero6 = random.nextInt(60);
			System.out.println(numero6);	
	
			 	}


}
