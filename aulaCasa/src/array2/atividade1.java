package array2;

import java.util.Scanner;

public class atividade1 {

public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in); 
	
		// começo do programa
		float [] nota = new float [10];
		float media= 0;
		int maiorNota= 0, quantidadeAlunos = 0;
		
		
		for ( int contador = 0; contador <10; contador++) {
			System.out.println(" digite sua nota: "); 
			nota [contador] = sc.nextFloat();
		
			if ( nota [contador] <6 ) {
				System.out.println(" abaixo da média ");
			}
			if ( nota [contador] >=6) {
				quantidadeAlunos++;
				System.out.println(" acima da média ");
			}
		}
		
		for ( int contador2 = 0; contador2 <10; contador2++) {	
			media = (nota[contador2] + nota[contador2]) / 10;
		}
		
		for ( int contador3 = 0; contador3 <10; contador3++) {
			maiorNota = (int) nota [contador3]; 
			
			if ( nota [contador3] == maiorNota) {
				maiorNota = (int) nota [contador3];
			}
			if ( nota [contador3] > maiorNota) {
				nota [contador3] = maiorNota;
			}
		}
		

		System.out.println(" A méda da turma é: " + media );
		System.out.println(" o total de alunos que estão acima da média na turma é: " + quantidadeAlunos);
		System.out.println(" A maior nota da turma é: " + maiorNota );

	}
	
}
