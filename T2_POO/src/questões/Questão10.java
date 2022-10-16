package questões;

public class Questão10 {

	public static void main(String[] args) {
		System.out.println("-----TABUADA DE MULTIPLICAÇÃO-----");
		for(int i = 1; i <= 10; i++) {
			System.out.println("\nTABUADA DO " +i);
			for(int j = 0; j <= 10; j++){
				int resultado = i*j;
				System.out.println( i + " * " + j +  " = " + resultado);
				
			}
		}

	}

}
