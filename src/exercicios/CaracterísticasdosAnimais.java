package exercicios;

import java.util.Scanner;

public class CaracterísticasdosAnimais {

	public static void main(String[] args) {
		String caracteristicas,classificacao,descrever;
		
		Scanner leia  = new Scanner(System.in);
		
		System.out.println("Digite as características sendo ela Vertebrado/Invertebrado");
		caracteristicas = leia.next();
		System.out.println("Digite a classificacao sendo Ave,Mamífero,Inseto,Anelído");
		classificacao = leia.next();
		System.out.println("Descreva elas sendo Carnívoro,Onívoro,Herbívoro,Hematófago");
		descrever = leia.next();
		
		if(caracteristicas.equalsIgnoreCase("Vertebrados")){
			if(classificacao.equalsIgnoreCase("Ave")){
				if(descrever.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Aguia");	
				}else {
					System.out.println("pombo");
				}
			}else{
				if(classificacao.equalsIgnoreCase("onivoro")){
					System.out.println("ser humano");	
				}else {
					System.out.println("vaca");
				}
			}
				
		}if(classificacao.equalsIgnoreCase("insento")){
			if(classificacao.equalsIgnoreCase("hematofago")){
				if(){
					
				}
				
			}
			
		}
		
		
		

	}

}
