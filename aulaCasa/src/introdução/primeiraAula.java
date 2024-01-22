package introdução;

import java.util.Scanner;

public class primeiraAula {
	
	public static void main(String[] args ) {
		
		
		
		// variável ultilizada para entrada de dados
			Scanner sc = new Scanner(System.in);
		
		
		
		// tipos de variáveis 
		
			// inteiro 
			byte numByte =  sc.nextByte(); // 8 bits ( -128 á 127)
			short numShort =  sc.nextShort(); // 16 bits ( -32768 á 32767 )
			int numInt =  sc.nextInt(); // 32 bits ( - 2.147.483.648 à 2.147.483.647)
			long numLong =  sc.nextLong(); // 64 bits ( -9. 223.372.036.854.775.808 à 9.223.372.036.854.775.807)
		
			// Real 
			float numFloat =  sc.nextFloat(); // 32 bits 
			double numDouble = sc.nextDouble(); // 64 bits 
		
			boolean condicao =  sc.nextBoolean(); 
		
			char caracter =  sc.next().charAt(0); // o 0 indica caracter
		
			String palavra = "palavra";
		
		
		
		
		// saída de dados para o usuário 
			System.out.println(" olá mundo ");
			System.out.print(" olá mundo "); 
			System.out.printf(" olá mundo ");
		
		
		
		
		// interação com o usuário 
		
			// saída de dados 
			System.out.println(" digite o seu nome: ");
		
			// declaração de variável com entrada de dados (.next)
			String nome= sc.next();
			
			//saída personalizada com variável 
			System.out.println(" seu nome é: "+ nome);
		
		
		
		
	
		numLong = 122 % 3; 
		condicao = numLong == 0; 
		
		//= receba 
		// != diferente
		// > maior que
		// >= maior igual 
		// < menor que
		// <= menor igual
		// equals = (=) 
		// sempre que for String precisa colocar "equals"
		// ! = não 
		// (! palavra.equals(palavra2)) -> não é igual, diferente.
		// && -> "e" >> exemplo: (numLong == 0 && numLong != 1)
		// || -> ou >> exemplo: (numLong != 1 || numLong == 0)
		
		
		
		
		// Estrutura de seleção/condição 
		
			// se, senão, senão se 
			if (numLong == 0) {	
			} 
			else if ( numLong == 1) {
			}  
		 	else {	
		 	} 
		
		 
		 
			// Escolha, caso 
			switch (numInt) {
			case 1: 
			 System.out.println(" num 1 ");
			 break;
			case 2:
			 System.out.println(" num 2 ");
			 break;
			case 3: 
			 System.out.println(" num 3 ");
			 break;
			default: 
			 System.out.println(" não esta entre 1 e 3  ");
		 } 
			 
		 
		 
		 
		 // Estrutura de repetição 
		 
		 
			// faça, enquanto 
			do {
			 
			} while (condicao); 
			
			while (condicao) {
				
			}
		 
		 
		 
			// para 
			for (int cont = 0; cont <10; cont++) {
			  
		  }
		 
		
	}

}
