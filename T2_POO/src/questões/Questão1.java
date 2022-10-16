package questões;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		do {
		System.out.print("Digite um número inteiro: ");
		int i = sc.nextInt();
		int resto = i%2;
		if(resto==0) {
			System.out.println("O número " + i + " é par.");
			System.out.println("----------------------------------------------------------------------------------");
		}
		else {
		System.out.println("O número " + i + " é ímpar.");	
		System.out.println("----------------------------------------------------------------------------------");
		}
		System.out.print(" ");
		System.out.print("\nDigite 0 se você quer continuar: ");
		j = sc.nextInt();
		System.out.println(" ");
		}while(j==0);
		}
		

	}


