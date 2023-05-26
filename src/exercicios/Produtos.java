package exercicios;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args){
		int num,quantidade;
		float preco,valorTotal;
		
		
		Scanner leia  = new Scanner (System.in);
		
		System.out.println("Digite um numero de 1 a 6 : ");
		num = leia.nextInt();
		System.out.println("Digite a quantidade que deseja comprar : ");
		quantidade = leia.nextInt();
		
		switch(num){
	    case 1:
	    	valorTotal = (quantidade * 10.00f);

	    	System.out.println("O valor total da compra de Cachorro Quente é :" + valorTotal);
	    	
	        break;
	    case 2:
	    	valorTotal = (quantidade * 15.00f);

	    	System.out.println("O valor total da compra de X-Salada é :" + valorTotal);
	    	
	       
	        break;
	    case 3:
	    	valorTotal = (quantidade * 18.00f);

	    	System.out.println("O valor total da compra de X-Bacon é :" + valorTotal);
	    	
	        
	        break;
	        case 4:
	        	valorTotal = (quantidade * 12.00f);

		    	System.out.println("O valor total da compra de Bauru é :" + valorTotal);
		    	
		        
	            break;
	        case 5:
	        	valorTotal = (quantidade * 8.00f);

		    	System.out.println("O valor total da compra de refrigerante é :" + valorTotal);
		    	
	            break;
	        case 6:
	        	valorTotal = (quantidade * 13.00f);

		    	System.out.println("O valor total da compra de Suco de Laranja é :" + valorTotal);
		    	
		      
	            break;
	        default:	

	    	System.out.println("Agradecemos a Preferência !!!" );
	    	
	           
	    }
	  
	}
		
	}