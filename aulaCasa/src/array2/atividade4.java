package array2;

import java.util.Scanner;

public class atividade4 {
	
public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		 double nota1=0, nota2=0, nota3=0, peso1 =0, peso2 = 0, peso3 =0; 
		 int contador5 = 0;
		 int contador4 = 0;
		 int mediaPonderada = 0;
		 int somaMP; 
		 int somaPesos; 
		 
		 for ( int contador = 0 ; contador < 1 ; contador++ ) {
			 System.out.println ( "Digite sua primeira nota: ");
			 nota1 = sc.nextDouble ();
		 }
		 
		for ( int contador1 = 0; contador1 < 1; contador1++ ) {
			 System.out.println ( "Digite sua segunda nota: ");
			 nota2  = sc.nextDouble ();
		 }
		
		for ( int contador2 = 0 ; contador2 < 1 ; contador2++ ) {
			System.out.println ( "Digite sua terceira nota: ");
			nota3 = sc.nextDouble ();
		}
		
		for ( int contador3 = 0 ; contador3 < 1 ; contador3++ ) {
			System.out.println ( "Digite o peso da primeira nota: ");
			peso1 = sc.nextDouble ();
		}
		
		for ( int contador41 = 0 ; contador41 < 1 ; contador41++ ) {
			 System.out.println ( "Digite o peso da segunda nota: ");
			 peso2 = sc.nextDouble ();
		}
		
		for ( int contador51 = 0 ; contador51 < 1 ; contador51++ ) {
			 System.out.println ( "Digite o peso da terceira nota: ");
			 peso3 = sc.nextDouble ();
			 
		}
		
		somaMP = (int) (nota1 * peso1 + nota2 * peso2 + nota3 * peso3); 
		somaPesos = (int) (peso1 + peso2 + peso3); 
		mediaPonderada = somaMP / somaPesos;
		
		System.out.println(" a média ponderada é: "+ mediaPonderada);
		
		
		
		
		sc.close();
	} 
}

