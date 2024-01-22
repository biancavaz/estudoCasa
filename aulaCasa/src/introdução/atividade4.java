package introdução;

import java.util.Scanner;

public class atividade4 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pagamento; 
		double valorTotal = 0.0, valor = 0.0, compra = 0.0,  totalAvista = 0.0, totalAprazo = 0.0, parcelamento = 0.0;
		
		for (int contador = 1; contador <=5; contador++) {
			
			System.out.println(" digite o valor total da compra: ");
			compra = sc.nextDouble();
			
			System.out.println(" digite a forma d epagamento: "+
					" 1 - á vista "+
					" 2 - á prazo ");
			pagamento = sc.nextInt();
			
			switch ( pagamento ) {
			case 1: 
				totalAvista = totalAvista + compra;
				break; 
			case 2: 
				totalAprazo = totalAprazo + compra; 
				
			}
			
		}
		
		valorTotal = valorTotal + compra; 
		parcelamento = totalAprazo/3; 
		System.out.println(" O total das compras á vista é: " + totalAvista);
		System.out.println(" O total das compras á prazo é: " + totalAprazo);
		System.out.println(" O total das compras é: " + valorTotal);
		System.out.println("o valor de cada prestação é: " + parcelamento);
		sc.close();

	}
}
