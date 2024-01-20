package matriz;

import java.util.Scanner;

public class atividadeExtra {
	
	public static void main ( String [] args) {
		Scanner sc = new Scanner (System.in); 
		
		// criminal 
		
		int pergunta1, pergunta2 = 0, pergunta3 = 0, pergunta4, pergunta5 = 0;
		int cont = 0, somaPerguntas;
		
		
		
		System.out.println("Crime na cidade\n");
		
		System.out.println(" Telefonou para a vítima? \n(1 - sim, "
				+ "0 - não) ");
		pergunta1 = sc.nextInt(); 
		 
		 System.out.println(" Esteve no local do crime? \n(1 - sim, "
					+ "0 - não) ");
			pergunta2 = sc.nextInt(); 
			 
			 
			 System.out.println(" TMora perto da vítima? \n(1 - sim, "
						+ "0 - não) ");
				pergunta3 = sc.nextInt(); 
				 
				 
				 System.out.println(" devia para a vítima? \n(1 - sim, "
							+ "0 - não) ");
					pergunta4 = sc.nextInt(); 
					 
					 
					 System.out.println(" ja trabalhou com a vítima? \n(1 - sim, "
								+ "0 - não) ");
						pergunta5 = sc.nextInt(); 
						 
						 
				somaPerguntas = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5; 
		 
		if ( somaPerguntas == 5 ) {
			System.out.println(" Assassino ");
		}
		
		if ( somaPerguntas == 1) {
			System.out.println(" inocente ");
		}
		
		if (somaPerguntas == 2 ) {
			System.out.println(" suspeito ");
		}
		
		if ( somaPerguntas == 3 ) {
			System.out.println(" cúmplice ");
		}
		
		if ( somaPerguntas == 4 ) {
			System.out.println(" cúmplice ");
		}
		
	}


}
