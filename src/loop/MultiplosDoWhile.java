package loop;

import java.util.Scanner;

public class MultiplosDoWhile {

	public static void main(String[] args) {
		int numero,quantidade = 0;
		float media,soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
	        System.out.print("Digite um número (zero para sair): ");
	        numero = leia.nextInt();
	        
	        if (numero % 3 == 0 && numero != 0) {
	            soma += numero;
	            quantidade++;
	        }
	        
	    } while (numero != 0);
	    
	    if (quantidade == 0) {
	        System.out.println("Nenhum número múltiplo de três foi digitado");
	    } else {
	       media = soma / quantidade;
	        System.out.println("A média dos números múltiplos de três digitados é: " + media);
	    }
	}
}
