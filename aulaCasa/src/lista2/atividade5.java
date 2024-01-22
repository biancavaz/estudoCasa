package lista2;

import java.util.Scanner;

public class atividade5 {
	
public static void main( String [] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		double paisA = (float) 90000000, paisB = (float) 140000000;
		byte ano = 0;
		
		while (paisA < paisB){
		
		paisA = paisA + ( paisA * 0.035);
		paisB = paisB + ( paisB * 0.01 );
		ano++;
		
		
		System.out.println(" habitantes pais A: " + paisA);
		System.out.println(" habitantes pais B: " + paisB);
		System.out.println(" ano " + ano);
		sc.close();
		
		
		} 
		
		System.out.println(" demorou " + ano + " anos para passar o pais B");
		 
		
	}
	

}
