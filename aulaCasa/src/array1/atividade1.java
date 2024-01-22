package array1;

import java.util.Scanner;

public class atividade1 {
	
public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		char nome [] = new char [3]; 
		int vendas [] = new int [3];
		int percentual [] = new int [3];
		int maiorVendaVendedor=0, menorVendaVendedor=0;
		
		int totalVendas= 0, maiorVenda = 0, menorVenda = 0;
		
		
		for ( int contador = 0; contador <3; contador++) {
			System.out.println(" digite o seu nome: "); 
			nome [contador] = sc.next().charAt(0); 	
		}
		
		for ( int contador2 = 0; contador2 <3; contador2++) {
			System.out.println(" digite o total de vendas: ");
			vendas[contador2] = sc.nextInt(); 		
		}
	
		for ( int contador3 = 0; contador3 <3; contador3++) {
			System.out.println(" o percentual da comissão de cada venda é: ");
			percentual [contador3] = sc.nextInt();
			percentual [contador3] = percentual[contador3]/100;
		}
		
		for ( int contador4 = 0; contador4 <3; contador4++) {
		
			if ( vendas[contador4] == 1 ) {
			maiorVenda = vendas [contador4]; 
			menorVenda = vendas [contador4]; 
		} 
		
			if ( maiorVenda > vendas [contador4]) {
			maiorVenda = vendas [contador4];
			
		}
		
			if ( menorVenda < vendas[contador4]); {
			menorVenda = vendas [contador4];
			
			
			}
		
		}
		
		for ( int contador5= 0; contador5 <3; contador5++) {
		totalVendas = ( vendas [contador5] * percentual [contador5] ) * vendas [contador5]; 
	
			
		}
		
		for ( int contador4 = 0; contador4 <=3; contador4++)  {
			System.out.println(" o seu nome é: " + nome[contador4] + "\n o valor a receber é: " + vendas[contador4]);
			System.out.println(" o total das vendas é: " + totalVendas );
			System.out.println(" o maior valor a recber é:  " + maiorVenda );
			System.out.println(" o menor valor a recber é:  " + menorVenda);
	
			}
	
		}	
		
}
