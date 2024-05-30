import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
	    int parametroUm =terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		 int parametroDois =terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			void Contador.contar(parametroUm, parametroDois){
				for (parametroUm =1 ;parametroUm <= parametroDois; parametroUm++)
				System.out.println("imprimir número "+paramentroUm);
				int paramentroUm++;
			}
		
		}catch (InputMismatchException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois){
		System.out.println("paramentro um é maior que paramentro dois, reinserir por favor.");
		
	}
		int contagem = parametroDois - parametroUm;
		
	}
}