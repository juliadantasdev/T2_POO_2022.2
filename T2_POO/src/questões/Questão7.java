package questões;

import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		int times, jogadores, idade, menoresIdade, tot80;
		double peso, altura, mediaIdade, mediaAltura = 0, porcentagem;
		Scanner sc = new Scanner(System.in);
		times = 5;
		jogadores = 11;
		tot80 = 0;
		menoresIdade = 0;
		for(int i = 1; i <= times; i++) {
			mediaIdade = 0;
			System.out.println("------------------------ " + i + " TIME ------------------------");
			for(int j = 1; j <= jogadores; j++) {
				System.out.println("Digite a idade do " + j + "º jogador" );
				idade = sc.nextInt();
				System.out.println("Digite o peso do " + j + "º jogador" );
				peso = sc.nextDouble();
				System.out.println("Digite a altura do " + j + "º jogador" );
				altura = sc.nextDouble();
				System.out.println("-------------------------------------------------------------------------");
				if(idade < 18) {
					menoresIdade = menoresIdade + 1;
					
				}
				mediaIdade = mediaIdade + idade;
				mediaAltura = mediaAltura + altura;
				if(peso > 80) {
					tot80 = tot80 + 1;
				}
				
			}
			System.out.println("A média de idade dos jogadores do " + i + "º time é " + mediaIdade/11);
			System.out.println(" ");
			
		}
		System.out.println("A quantidade de jogadores com idade inferior a 18 anos é " + menoresIdade);
		System.out.println("A média de altura de todos os jogadores do campeonato é " + mediaAltura/55 + "cm");
		porcentagem = tot80 * 100/55;
		System.out.println("A porcentagem de jogadores com mais de 80 kg é " + porcentagem + "%.");

	}
}
	
