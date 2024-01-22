package array2;

import java.util.Scanner;

public class atividade3 {

 public static void main(String [] args) {
		 
		 Scanner  sc = new Scanner (System.in); 
		 double  valor1 []= new double [5];
		 double valor2 [] = new double [5];
		 double deferenca= 0, soma= 0, multiplicacao= 0, totalValor1 = 0, totalValor2 = 0; 
		 
		 // valor 1 
		 for ( int contador = 0; contador <5; contador++) {
		 
			 System.out.println(" Digite um valor: ");
			 valor1 [contador] = sc.nextDouble();  
		 }
		 
		 for  ( int contador2 = 0; contador2 <5; contador2++ ) {
				System.out.println(" as temperaturas são: " + valor1[contador2]);
		 }
		 
		 for ( int contador9 = 0; contador9 < 5; contador9++) {
			 totalValor1 = valor1[contador9] + totalValor1; 
				System.out.println(" total é: " + totalValor1);
		 }
		 
		 
		 
		 // valor 2
		 for ( int contador3 = 0; contador3 <5; contador3++) {
			 
			 System.out.println(" Digite um valor: ");
			 valor2 [contador3] = sc.nextDouble();  
		 }
		 
		 for  ( int contador4 = 0; contador4 <5; contador4++ ) {
				System.out.println(" as temperaturas são: " + valor2[contador4]);
		 }
		 
		 for ( int contador12 = 0; contador12 < 5; contador12++) {
			 totalValor2 = valor2[contador12] + totalValor2; 
				System.out.println(" total é: " + totalValor2);
		 }
		 
		 
		 
		 
		 // diferença 
		 for ( int contador5 = 0; contador5 <5; contador5++) {
			 deferenca = totalValor1 - totalValor2; 
		 }
		 
		 // soma
		 for ( int contador6 = 0; contador6 <5; contador6++) {
			 soma = totalValor1 + totalValor2;
		 }
		 
		 // multiplicacao
		 for ( int contador7 = 0; contador7 <5; contador7++) {
			 multiplicacao = totalValor1 * totalValor2;
		 }
	
		 System.out.println(" a soma dos valores é: " + soma);
		 System.out.println(" a diferença dos valores é: " + deferenca);
		 System.out.println(" a multiplicação dos valores é: " + multiplicacao);
		 
 		}
	}
