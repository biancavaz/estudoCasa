package array;

import java.util.Random;

public class atividade7 {
	
	public static void main(String [] args) {	
		
		Random random = new Random (); 
		double numero [] = new double [100]; 
		double somatotalNumero = 0, media;
		
		
		for ( int contador =0; contador <100; contador++) {
			numero [contador] =  random.nextInt(1000);
			somatotalNumero += numero[contador];
		}
		
		 media = somatotalNumero/100;
		System.out.println(" a média é: " + media);
		
			
	}

}
