package lista2;

import java.util.Scanner;

public class atividade4 {
	
public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in); 
		 
		int ponto, contadorJogardor1 = 0, contadorJogador2 = 0, venceu = 0; 
		
		do {
			
		System.out.println(" digite quem ganhou o ponto: "
				+ " 1 - jogador 1 "
				+ " 2 - jogador 2 ");
		ponto = sc.nextInt();
		
		switch  ( ponto ) {
		case 1:
			contadorJogardor1++;
			break;
		case 2: 
			contadorJogador2++;
			break; 
		default: 
			System.out.println(" ponto inválido ");
		
			
		if ( contadorJogardor1 >= 21 || contadorJogador2 >=21  ){				
			if ( contadorJogardor1 > contadorJogador2 +1 ) {
				System.out.println(" O jogador 1 ganhou "); 
				venceu = 1;
			}
			
				else if (contadorJogador2 > contadorJogardor1 +1 ) {
				System.out.println(" o jogador 2 ganhou  "); 
				venceu = 1;
					}
					
			}	
		}
		
		} while ( venceu == 0 );
		
	} 

}
