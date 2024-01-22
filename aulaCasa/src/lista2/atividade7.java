package lista2;

import java.util.Scanner;

public class atividade7 {
	
public static void main( String [] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int valorCarro = 0, pagamento = 0, valorFinal, desconto;
		int parcela = 0;
		double acrescimo= 0;
		
		
		
		System.out.println(" digite o valor do carro: ");
			valorCarro = sc.nextInt();
		
		System.out.println(" digite a forma de pagamento: " +
		" 1 = á vista " +
		" 2 = á prazo ");
			pagamento = sc.nextInt(); 
		
	
		switch ( pagamento ) {
			case 1: 
				desconto = (int) (valorCarro * 0.2);
				valorFinal = valorCarro - desconto; 
				System.out.println(" o preço do caro á vista é: " + valorFinal); 
				break;
			case 2: 
				System.out.println(" digite em quantas parcelas vc vai pagar " +
						" 1 = em 6x " + 
						" 2 = em 12x " +
						" 3 = em 18x " +
						" 4 = em 24x " + 
						" 5 = em 30x " +
						" 6 = em 36x " +
						" 7 = em 42x " +
						parcela);
			
		
			if ( parcela == 1 ) { 
			acrescimo =	valorCarro * 0.3; 
			System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			else if ( parcela == 2 ) {
				acrescimo =	valorCarro * 0.6; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 3 ) { 
				acrescimo =	valorCarro * 0.9; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 4 ) {
				acrescimo =	valorCarro * 0.12; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 5 ) {
				acrescimo =	valorCarro * 0.15; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 6 ) {				acrescimo =	valorCarro * 0.18; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 7 ) {
				acrescimo =	valorCarro * 0.21; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			} 
			
			else if ( parcela == 8 ) {
				acrescimo =	valorCarro * 0.24; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 9 ) {
				acrescimo =	valorCarro * 0.27; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
			
			else if ( parcela == 10 ) {
				acrescimo =	valorCarro * 0.30; 
				System.out.println(" você vai pagar " + acrescimo + " com o acrescimo" );
			}
		}
		
		
	
		}

}
