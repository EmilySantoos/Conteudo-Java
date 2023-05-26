package exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		float numero1,numero2, calculo;
		int opcao;
		
		Scanner  leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número : ");
		numero1 = leia.nextFloat();
		System.out.print("Digite o segundo número : ");
		numero2 = leia.nextFloat();
		System.out.print("Digite a operacao desajada sendo elas de (1+,2-,3*,4/) : ");
		opcao = leia.nextInt();
		
		switch(opcao){
	
	    case 1:
	    	calculo = (numero1 + numero2);

	    	System.out.println(" \n A soma dos dois números é: " + calculo);
	    	
	        break;
	    case 2:
	    	calculo = (numero1 - numero2);

	    	System.out.println(" \n A subtração dos dois números é: " + calculo);
	    	
	       
	        break;
	    case 3:
	    	calculo = (numero1 * numero2);

	    	System.out.println(" \n A multiplicação dos dois números é: "  + calculo);
	    	
	        
	        break;
	        case 4:
	        	calculo = ( numero1 / numero2);

		    	System.out.println(" \n A divisão dos dois números é: "+ calculo);
		    	
		        
	            break;
	        default:	

	    	System.out.println("Agradecemos a Preferência !!!" );
		
		
		
		
		
		
		
		
		
		
	}

}
}