package loop;

import java.util.Scanner;

public class IdadeWhile {
	
	public static void main(String[] args) {
		int idade,qtdMenor = 0,qtdMaior = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite a idade desejada(Quando quiser para só colocar um número negativo): ");
		idade = leia.nextInt();
	
		while (idade  >= 0) {
		    if (idade < 21) {
		      qtdMenor ++;
		    } else if (idade > 50) {
		        qtdMaior++;
		     }
		    System.out.print("Digite a idade desejada:");
		    
		  }
		  
		  System.out.println("Total de pessoas com idade menor que 21 anos: " + qtdMenor);
		 System.out.println("Total de pessoas com idade maior que 50 anos: " + qtdMaior);
		   System.out.print("Fim de operação...");
		}
		

		
		
		
		
		
	}

