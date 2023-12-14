package array;

import java.util.Scanner;

public class atividade6 {
	
public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double pecas [] = new double [5]; 
		double preco [] = new double [5]; 
		double valorVendedores [] = new double [5];
		double numVendedor [] = new double [5]; 
		int quantidadePecas = 0;
	
		
		for ( int contador = 0; contador <5; contador++) {
			System.out.println(" digite a quantidadde de peças vendidas: ");
			pecas [contador] = sc.nextDouble(); 
			
			System.out.println("Digite o seu número de identificação: ");
			numVendedor[contador] = sc.nextInt();
	
			System.out.println(" digite o preço da peça vendida: ");
			preco [contador] = sc.nextDouble(); 
			
			quantidadePecas = (int) (quantidadePecas  + pecas [contador]);
			
			valorVendedores [contador] = pecas [contador] * preco[contador];
		}
		
		for (int contador2 = 0; contador2 < 5; contador2++) {
			System.out.println("O valor que o vendedor "+ numVendedor[contador2] + " recebeu foi de " + valorVendedores[contador2]);
		}
		
		System.out.println("\nA quantidade de peças que todos os vendedores venderam foi de " + quantidadePecas);
		sc.close(); 
	} 

}
