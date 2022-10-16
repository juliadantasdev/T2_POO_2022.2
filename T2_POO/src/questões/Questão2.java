package questões;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			System.out.print("MENU\n1- Para somar dois números.\n2- Para calcular a raiz quadrada de um número.");
			System.out.print("\nDigite 1 ou 2 para a opção que deseja: ");
			int opçao = sc.nextInt();
			if(opçao==1) {
				System.out.println("\nSoma de dois números");
				System.out.print("Digite o 1º número: ");
				double num1 = sc.nextDouble();
				System.out.print("Digite o 2º número: ");
				double num2 = sc.nextDouble();
				double soma = num1 + num2;
				System.out.println("O resultado da soma é " + soma);
				i=1;
			
			}
			else if(opçao == 2) {
				System.out.println("\nCálculo da raiz quadrada");
				System.out.print("Digite o número: ");
				double num = sc.nextDouble();
				double raiz = Math.sqrt(num);
				System.out.println("A raiz quadrada de " + num + " é " + raiz);
				i=1;
			}
			else {
				System.out.println("Erro, opção inválida! ");
				
			}
			System.out.print("\nDigite 0 se quiser continuar: ");
			i = sc.nextInt();
			System.out.println(' ');
			

		}
		while(i==0);

	}

}
	
	


