package questões;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		do {
		System.out.print("Digite um número inteiro maior que 1: ");
		int num = sc.nextInt();
		int primo = 0;
		
		if(num>1) { 
			for (int i = 1; i<=num; i++) {
				float j = num%i;
				if(j==0 && i <= num && i >= 1) {
					primo++;
				}
			}
			if(primo>2) {
				System.out.println("Este número não é primo.");
				System.out.println("--------------------------------------------------------------------");
				x=1;
			}
			else {
				System.out.println("Este número é primo.");
				System.out.println("--------------------------------------------------------------------");
				x=1;
			}
			
		} 
		else {
			System.out.println("Erro, troque de número.");
			x=1;
			
		}
		System.out.print(" ");
		System.out.print("\nDigite 0 se você quer continuar: ");
		x = sc.nextInt();
		System.out.println(" ");
	}
		while(x==0);
	}
}




