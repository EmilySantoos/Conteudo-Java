package loop;

import java.util.Scanner;

public class IntervaloFor {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite um número maior que o anterior: ");
		num2 = leia.nextInt();

		if (num1 >= num2){
			System.out.println("INTERVALO INVÁLIDO... ");
		} else {
			System.out.println("Os múltiplos de 3 e 5 no intervalo entre " + num1 + " e " + num2 + " são: ");
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.print(i + " é múltiplo de 3 e 5\n");
				}
			}	
				}
	}
}
