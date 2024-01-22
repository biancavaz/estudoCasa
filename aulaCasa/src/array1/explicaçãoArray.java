package array1;

import java.util.Scanner;

public class explicaçãoArray {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		double temperatura [] = new double [10];
		
		for ( int contador = 0; contador <10; contador++  ) {
				
		 System.out.println(" digite o valor da temperatura: ");
		 
		temperatura[ contador ]= sc.nextDouble(); 
		
	}
	
	for  ( int contador2 = 0; contador2 <10; contador2++ ) {
			System.out.println(" as temperaturas são: " + temperatura[contador2]);
			}
				sc.close(); 
		}
}
