package lista2;

import java.util.Scanner;

public class atividade6 {

public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int canal, quantidadePessoas = 0, quantidadePessoas1 = 0, quantidadePessoas2 = 0, quantidadePessoas3 =0, quantidadePessoas4 =0;
		int porcentagem4 =0, contresp = 0, porcentagem5=0, porcentagem7=0, porcentagem12 =0, cont = 0, SomaPessoas =0; 
		
		do {
			
			System.out.println(" digite qual canal você esta assistindo; " +
					" 1 = 4 " +
					" 2 = 5 " +
					" 3 = 7 " +
					" 4 = 12 ");
			canal = sc.nextInt();
			
		System.out.println(" digite quantas pessoas estão assistindo; " );
		quantidadePessoas = sc.nextInt();
			
		
		switch ( canal ) {
		case 1: 
			cont++;
			quantidadePessoas1 = quantidadePessoas1 + quantidadePessoas; 
			break;
		case 2: 
			cont++;
			quantidadePessoas2 = quantidadePessoas2 + quantidadePessoas;
			break; 
		case 3: 
			cont++; 
			quantidadePessoas3 = quantidadePessoas3 + quantidadePessoas; 
			break;
		case 4: 
			cont++;
			quantidadePessoas4 = quantidadePessoas4 + quantidadePessoas;
			break;
		
			}
		
		
			
			} while (canal != 0);
		SomaPessoas = quantidadePessoas1 + quantidadePessoas2 + quantidadePessoas3 + quantidadePessoas4;
		porcentagem4 = ( quantidadePessoas1 *100 )/SomaPessoas;
		porcentagem5 = ( quantidadePessoas2 *100 )/SomaPessoas;
		porcentagem7 = ( quantidadePessoas3 *100 )/SomaPessoas;
		porcentagem12 =( quantidadePessoas4 *100 )/SomaPessoas;
		
		
		System.out.println(" A porcentagem de pessoas que estavam assistindo o canal 4 è: " + porcentagem4 + " % ");
		System.out.println(" A porcentagem de pessoas que estavam assistindo o canal 5 è: " + porcentagem5 + " % ");
		System.out.println(" A porcentagem de pessoas que estavam assistindo o canal 7 è: " + porcentagem7 + " % ");
		System.out.println(" A porcentagem de pessoas que estavam assistindo o canal 12 è: " + porcentagem12 + " % ");
		
		}
}
