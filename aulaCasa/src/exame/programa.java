package exame;

import java.util.Scanner;

public class programa {
	
public static void main ( String [] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int result, result1, result2, result3, quantidade = 0; 
		int matriz [][] = new int [quantidade][30]; 
		int totalVendas1 = 0, totalVendas2 = 0, totalVendas3 = 0; 
		
		int vendasMes; 
		
		int dia1 = 0, dia2 = 0, dia3 = 0, dia4 = 0, dia5 = 0, dia6 = 0, dia7 = 0, dia8 = 0, dia9= 0, dia10 = 0;
		int dia11 = 0, dia12 = 0, dia13 = 0, dia14 = 0, dia15 = 0, dia16 = 0, dia17 = 0, dia18 = 0, dia19 = 0, dia20 = 0;
		int dia21 = 0, dia22 = 0, dia23 = 0, dia24 = 0, dia25 = 0, dia26 = 0, dia27 = 0, dia28 = 0, dia29 = 0, dia30 = 0; 
		
		
		
		System.out.println(" Digite a quantidade de produtos que vão ser cadastrados na loja: ");
			quantidade = sc.nextInt(); 
		
				double precoVenda [] = new double [quantidade];
				String nomeProduto [] = new String [quantidade]; 
			
		
			
		for ( int cont = 0; cont <quantidade; cont++ ) {
			
				System.out.println(" Digite o nome do produto:  ");
					nomeProduto [cont] = sc.next();
				
					System.out.println(" Digite o preço de venda do produto: ");
						precoVenda [cont] = sc.nextDouble(); 
				
		}
		
		
				for ( int linha =0; linha < quantidade; linha++) {
					for ( int coluna =0; coluna <30; coluna++) {
				
				
						if ( linha == 0 && coluna == 0) {
							dia1++; 
				}
						if ( linha == 0 && coluna == 1) {
							dia2++; 
				}
						if ( linha == 0 && coluna == 2) {
							dia3++; 
				}
						if ( linha == 0 && coluna == 3) {
							dia4++; 
				}
						if ( linha == 0 && coluna == 4) {
							dia5++; 
				}
						if ( linha == 0 && coluna == 5) {
							dia6++; 
				}
						if ( linha == 0 && coluna == 6) {
							dia7++; 
				}
						if ( linha == 0 && coluna == 7) {
							dia8++; 
				}
						if ( linha == 0 && coluna == 8) {
							dia9++; 
				}
						if ( linha == 0 && coluna == 9) {
							dia10++; 
				}
						if ( linha == 0 && coluna == 10) {
							dia11++; 
				}
						if ( linha == 0 && coluna == 11) {
							dia12++; 
				}
						if ( linha == 0 && coluna == 12) {
							dia13++; 
				}
						if ( linha == 0 && coluna == 13) {
							dia14++; 
				}
						if ( linha == 0 && coluna == 14) {
							dia15++; 
				} 
						if ( linha == 0 && coluna == 15) {
							dia16++; 
				}
						if ( linha == 0 && coluna == 16) {
							dia17++; 
				}
						if ( linha == 0 && coluna == 17) {
							dia18++; 
				}
						if ( linha == 0 && coluna == 18) {
							dia19++; 
				}
						if ( linha == 0 && coluna == 19) {
							dia20++; 
				}
						if ( linha == 0 && coluna == 20) {
							dia21++; 
				}
						if ( linha == 0 && coluna == 21) {
							dia22++; 
				}
						if ( linha == 0 && coluna == 22) {
							dia23++; 
				}
						if ( linha == 0 && coluna == 23) {
							dia24++; 
				}
						if ( linha == 0 && coluna == 24) {
							dia25++; 
				}
						if ( linha == 0 && coluna == 25) {
							dia26++; 
				}
						if ( linha == 0 && coluna == 26) {
							dia27++; 
				}
						if ( linha == 0 && coluna == 27) {
							dia28++;  
				}
						if ( linha == 0 && coluna == 28) {
							dia29++; 
				}
						if ( linha == 0 && coluna == 29) {
							dia30++; 
				}
					
						
				}
					
		}
				
		result = vendasDiárias ( dia1, dia2, dia3, dia4, dia5,dia6, dia7, dia8, dia9, dia10,  dia11, dia12, dia13 ); 
			totalVendas1 = result;  
		
		result1 = vendasDiárias1 (dia14, dia15, dia16, dia17, dia18, dia19, dia20, dia21, dia22, dia23, dia24 );
			totalVendas2 = result1;
		
		result2 = vendasDiarias2 (  dia25, dia26, dia27, dia28, dia29, dia30); 
			totalVendas3 = result2;
		
		result3 = totalVendasMes (totalVendas1, totalVendas2, totalVendas3 );
			vendasMes = result3;  
					System.out.println(" a quantidade de vendas do mes foi: " + vendasMes );

			
	}
	
	public static int vendasDiárias ( int dia1, int dia2, int dia3, int dia4,int  dia5, int dia6, int dia7, int dia8, int dia9, int dia10, int dia11, int dia12, int dia13 ) {
		
		Scanner sc = new Scanner (System.in); 
		
		int totalVendas; 
		
		System.out.println(" digite a quantidade de itens vendidos no 1° dia: ");
			dia1 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 2° dia: ");
			dia2 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 3° dia: ");
			dia3 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 4° dia: ");
			dia4 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 5° dia: ");
			dia5 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 6° dia: ");
			dia6 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 7° dia: ");
			dia7 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 8° dia: ");
			dia8 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 9° dia: ");
			dia9 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 10° dia: ");
			dia10 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 11° dia: ");
			dia11 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 12° dia: ");
			dia12 = sc.nextInt(); 
			
		System.out.println(" digite a quantidade de itens vendidos no 13° dia: ");
			dia13 = sc.nextInt(); 
			
			
			totalVendas = dia1 + dia2 + dia3 + dia4 + dia5 + dia6 + dia7 + dia8 + dia9 + dia10 + dia11 + dia12 + dia13; 
				return totalVendas; 
	}
	
	public static int vendasDiárias1 (int dia14, int dia15, int dia16, int dia17, int dia18, int dia19, int dia20, int dia21, int dia22, int dia23, int dia24 ) {
		Scanner sc = new Scanner (System.in); 
		
		int totalVendas2; 
		
		System.out.println(" digite a quantidade de itens vendidos no 14° dia: ");
			dia14 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 15° dia: ");
			dia15 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 16° dia: ");
			dia16 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 17° dia: ");
			dia17 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 18° dia: ");
			dia18 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 19° dia: ");
			dia19 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 20° dia: ");
			dia20 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 21° dia: ");
			dia21 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 22° dia: ");
			dia22 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 23° dia: ");
			dia23 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 24° dia: ");
			dia24 = sc.nextInt(); 
		
		totalVendas2 = dia14 + dia15 + dia16 + dia17 + dia18 + dia19 + dia20 + dia21 + dia22 + dia23 + dia24;
			return totalVendas2; 
		
	}
	
	public static int vendasDiarias2 ( int dia25, int dia26, int dia27, int dia28, int dia29, int dia30 ) {
		Scanner sc = new Scanner (System.in);
		
		int totalVendas3; 

		System.out.println(" digite a quantidade de itens vendidos no 25° dia: ");
			dia25 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 26° dia: ");
			dia26 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 27° dia: ");
			dia27 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 28° dia: ");
			dia28 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 29° dia: ");
			dia29 = sc.nextInt(); 
		
		System.out.println(" digite a quantidade de itens vendidos no 30° dia: ");
			dia30 = sc.nextInt(); 
		
		totalVendas3 =  dia25 + dia26 + dia27 + dia28 + dia29 + dia30;   
			return totalVendas3; 
		
	}
	
	
	public static int totalVendasMes ( int totalVendas1, int totalVendas2, int totalVendas3) {
		
		int vendasMes = 0; 
		
		for ( int cont =0; cont <1; cont++) {
			vendasMes = totalVendas1 + totalVendas2 + totalVendas3; 
		}
		
		
		return vendasMes; 
	}

}
