package exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		int num1,num2 ,num3;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro :");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo numero inteiro: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro numero inteiro: ");
		num3 = leia.nextInt();
		
		if(num1 + num2 >= num3){

			System.out.println("\nA soma do primeiro e do segundo número é maior que o terceiro número ");
			
		} if(num1 + num2 < num3){
			
			System.out.println("\nA soma do primeiro e do segundo número é menor que o terceiro número");
			
		}else if(num1 + num2 == num3){
			
			System.out.println("\nA soma do primeiro e do segundo número é igual o terceiro número");
		}else {
			System.out.println("\nErro na soma....");
		}
		
			
		
	}

}
