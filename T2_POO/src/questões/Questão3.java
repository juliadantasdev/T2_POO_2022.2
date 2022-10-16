package questões;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
		double a, b, c;
		System.out.println("O formato da equação do 2º grau é: ax² + bx + c = 0 ");
		System.out.print("Digite a: ");
		a = sc.nextDouble();
		System.out.print("Digite b: ");
		b = sc.nextDouble();
		System.out.print("Digite c: ");
		c = sc.nextDouble();
		if(a != 0) {
			double delta = (b*b)-(4*a*c);
			if(delta > 0) {
				double raizDelta = Math.sqrt(delta);
				double x1 = (-b + raizDelta)/2*a;
				double x2 = (-b - raizDelta)/2*a;
				System.out.print("O x possui dois valores: \n[1] x = " + x1 + "\n[2] x = " + x2);
			}
			else if(delta == 0) {
				double raizDelta = Math.sqrt(delta);
				double x1 = (-b + raizDelta)/2*a;
				System.out.print("O x possui somente um valor: \n[1] x = " + x1);
			}
			else {
				System.out.println("O x não possui valores reais.");
			}
		}
		else {
			System.out.println("Erro, essa não é uma equação do 2º grau.");
		}
		System.out.println(" ");
		System.out.print("\nDigite 0 se quiser continuar: ");
		i = sc.nextInt();
		System.out.println(" ");
		} while(i==0);

	
	}
	

}

