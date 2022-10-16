package questões;
import java.util.Scanner;
public class Questão5 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int n,i;
		long fat = 1;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			fat = fat * i; 
		}
		System.out.println(n + "! = " + n + "." + (n-1) + "!." + (n-2) + "!." + (n-3) + "!= " + fat);

	}

}
