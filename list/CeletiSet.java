package list;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CeletiSet {
	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Integer num = Integer.valueOf(10);
		Scanner leia = new Scanner(System.in);

		for (int n = 1; n <= 10; n++) {
			System.out.print("Digite dez números inteiros :");
			num = leia.nextInt();
			numeros.add(num);
			// Adiciona os numeros
		}
		
		//Collections.sort(numeros);
		System.out.print("\n A lista do dados ficou: "+ numeros);

	}
}