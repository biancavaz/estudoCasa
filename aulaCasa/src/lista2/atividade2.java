package lista2;

import java.util.Scanner;

public class atividade2 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		
		int codigoP, alimnetoNaoPerecivel= 0, alimnetoPerecivel= 0, vestuario =0, higienePessoal= 0, limpezaUT= 0;
		
			
			do {
			
			System.out.println(" digite o código do produto: "); 
			codigoP = sc.nextInt();
			
			if ( codigoP == 1 ) {
				alimnetoNaoPerecivel++;
				System.out.println (" Alimento não perecível ");
				} else if ( codigoP == 2 ) {
					alimnetoPerecivel++;
					System.out.println (" Alimento perecível ");
				} else if ( codigoP == 3 ) {
					alimnetoPerecivel++;
					System.out.println (" Alimento perecível ");
				} else if ( codigoP == 4 ) {
					alimnetoPerecivel++;
					System.out.println (" Alimento perecível ");
				} else if ( codigoP == 5 ) {
					vestuario++;
					System.out.println (" Vestuário ");
				} else if ( codigoP == 6 ) {
					vestuario++;
					System.out.println (" Vestuário ");
				} else if ( codigoP == 7 ) {
					higienePessoal++;
					System.out.println (" Higiene Pessoal ");	
				} else if ( codigoP == 8 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 9 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 10 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 11 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 12 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 13 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 14 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				} else if ( codigoP == 15 ) {
					limpezaUT++;
					System.out.println (" Limpeza e utensílios domésticos ");	
				}  else {
				System.out.println (" código inválido ");	
				}
			
					} while ( codigoP !=0 );
	
			System.out.println (" Alimento não perecível " + alimnetoNaoPerecivel );
			System.out.println (" Alimento perecível " + alimnetoPerecivel );
			System.out.println (" Vestuário " + vestuario );
			System.out.println (" Higiene Pessoal " + higienePessoal );
			System.out.println (" Limpeza e utensílios domésticos " + limpezaUT );	
		}

}
