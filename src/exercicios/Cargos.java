package exercicios;

import java.util.Scanner;

public class Cargos {

	public static void main(String[] args) {
		int cargo;
		float Salario,novoSalario;
		String nomeColaborador;
		
		Scanner leia  = new Scanner (System.in);
		
		System.out.println("Digite seu nome : ");
		nomeColaborador = leia.next();
		System.out.println("Digite o seu cargo de 1 a 6: ");
		cargo  = leia.nextInt();
		System.out.println("Digite o seu salario atual : ");
		Salario = leia.nextFloat();
		
		switch(cargo){
	    case 1:
	    	novoSalario = Salario + (0.10f * Salario);

	    	System.out.println("Parabéns,"+nomeColaborador+" seu atual salário é de "+ novoSalario +"\n referente ao seu cargo de Gerente");
	    	
	        break;
	    case 2:
	    	novoSalario = Salario + (0.07f * Salario);

	    	System.out.println("Parabéns,"+nomeColaborador+"\n seu atual salário é de "+novoSalario +"\n referente ao seu cargo de Vendedor:");
	       
	        break;
	    case 3:
	    	novoSalario = Salario + (0.09f * Salario);

	    	System.out.println("Parabéns,"+nomeColaborador+"\n seu atual salário é de "+novoSalario +" referente ao seu cargo de Supervisor ");
	    	
	        
	        break;
	        case 4:
	        	novoSalario = Salario + (0.06f * Salario);

		    	System.out.println("Parabéns,"+nomeColaborador+"\n seu atual salário de "+novoSalario +" referente ao seu cargo de Motorista" );
		        
	            break;
	        case 5:
	        	novoSalario = Salario + (0.05f * Salario);

		    	System.out.println("Parabéns,"+nomeColaborador+"\n seu atual salário de "+novoSalario +" referente ao seu cargo de Estoquista");
	            break;
	        case 6:
	        	novoSalario = Salario + (0.08f * Salario);

		    	System.out.println("Parabéns,"+nomeColaborador+"\n seu cargo de "+novoSalario +" referente ao seu cargo de Técnico de TI");
	            break;
	        default:	

	    	System.out.println("Parabéns pela conquista !!!" );
	    	
	           
	    }
	  
	}
		
	

	}
