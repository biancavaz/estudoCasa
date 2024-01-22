package introdução;

import java.util.Scanner;

public class atividade5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opiniao= 0, mediaIdadeOtimo= 0, idade = 0, otimo= 0, bom= 0;
		int regular= 0, quantidadePessoaRegular=0, percentagem= 0, totalPessoas= 0; 
		int totalIdade= 0, idadeOtimo= 0, idadeMedia = 0;
		double idadeMediaOtimo= 0.0;
		
		for( int contador = 1 ; contador <= 5; contador++ ) {

			System.out.println(" digite sua idade: "); 
			idade = sc.nextInt();
			
			System.out.println(" digite sua opinião sobre o filme: "+
					"\n 3 = ótimo "+
					" \n 2 = bom"+
					" \n 1 = regular ");
					opiniao = sc.nextInt();
					
					switch ( opiniao ) {
					case 1:
						regular++;
						break;
					case 2: 
						bom++;
						break;
					case 3: 
						otimo++; 
						idadeMedia = idadeMedia + idade; 
						break; 
						
						
					}
					
			}
					idadeMediaOtimo = idadeMedia/ otimo;
					percentagem = (100*bom)/15;
					System.out.println(" A idade média das pessoas que votaram no ótimo é: "+ idadeMediaOtimo );
					System.out.println(" a quantidade de pessoas que respondeu regular é: "+ regular );
					System.out.println(" a percentagem das pessoas que respondeu bom é: "+ percentagem + " % ");
					sc.close();
		}

}
