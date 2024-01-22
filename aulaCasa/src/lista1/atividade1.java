package lista1;

import java.util.Scanner;

public class atividade1 {
	
public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade, percentagemPrimeiraFaixa, percentagemultimaFaixa, ate15Anos = 0, de16A30Anos=0, de31A45Anos=0;
		int de46a60Anos=0, acimaDe61Anos=0;  
		
		for ( int contador = 1; contador <= 15; contador++ ) {
		
		System.out.println(" digite quantos anos voce tem: " +
		" 1 - até 15 anos " +
		" 2 - de 16 a 30 anos " +
		" 3 - de 31 a 45 anos " +
		" 4 - 46 a 60 anos " +
		" 5 - acim de 61 anos ");
		idade = sc.nextInt();
		
		switch ( idade ) {
		case 1: 
			ate15Anos++;
			break; 
		case 2: 
			de16A30Anos++;
			break;
		case 3:
			de31A45Anos++;
			break;
		case 4: 
			de46a60Anos++;
			break;
		case 5: 
			acimaDe61Anos++;
			break; 
		
			}
		}
		
		percentagemPrimeiraFaixa = ((15/ate15Anos)*100 );
		percentagemultimaFaixa = ((15/ acimaDe61Anos)*100 );
		System.out.println(" até 15 anos tem:  " + ate15Anos + " pessoas ");
		System.out.println(" de 16 á 30 anos tem:  " + de16A30Anos + " pessoas ");
		System.out.println(" de 31 á 45 anos tem:  " + de31A45Anos + " pessoas ");
		System.out.println(" de 46 á 60 anos tem:  " + de46a60Anos + " pessoas ");
		System.out.println(" acima de 61 anos tem:  " + acimaDe61Anos + " pessoas ");
		System.out.println(" a percentagem de pessoas na primeira faixa etária é:  " + percentagemPrimeiraFaixa + " % ");
		System.out.println(" a percentagem de pessoas na última faixa etária é:  " + percentagemultimaFaixa + " % ");
		
	}	

}
