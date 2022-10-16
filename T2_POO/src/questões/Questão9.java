package questões;

import java.util.Scanner;

public class Questão9 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Quantos números você quer digitar? ");
		int quantidade = sc.nextInt();
		if(quantidade<3000) {
		int quantidadePar, quantidadeImpar;
		double soma, maior, menor, mediaPares, somaPares, porcentagem, resto;
		double [] nums = new double[quantidade];
		quantidadeImpar = 0;
		quantidadePar = 0;
		somaPares=0;
		soma = 0;
		maior = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;
		for(int i = 0;i < quantidade; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			nums[i] =sc.nextDouble();
			soma = soma + nums[i];
			resto = nums[i]%2;
			if(nums[i]> maior) {
				maior = nums[i];
			}
			if(nums[i]<menor) {
				menor = nums[i];
			}
			if(resto == 0) {
				++quantidadePar;
				somaPares= somaPares+ nums[i];
				
			}
			else {
				++quantidadeImpar;
				
			}
		}
		porcentagem = quantidadeImpar* 100/quantidade;
		mediaPares = somaPares/quantidadePar;
		System.out.println("A soma dos números digitados é " + soma);
		System.out.println("A quantidade de números digitados é " + quantidade);
		System.out.println("A média dos números digitados " + soma/quantidade);
		System.out.println("O maior número digitado é " + maior);
		System.out.println("O menor número digitado é " + menor);
		System.out.println("A média dos números pares é " + mediaPares);
		System.out.println("A porcentagem dos números ímpares é " + porcentagem);
		
		
		
		}
		else {
			System.out.println("ERRO!");
		}

			}
				}