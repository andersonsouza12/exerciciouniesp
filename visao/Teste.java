package visao;

import java.util.Scanner;
import modelo.Retangulo;

public class Teste {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a base do retângulo: ");
		float b = sc.nextFloat();
		System.out.print("Digite a altura do retângulo: ");
		float a = sc.nextFloat();
		
		Retangulo re = new Retangulo(b, a);
		
		System.out.println("A area do retângulo é " + re.calcularArea() + "M².");
		
	
		
		sc.close();
	}
	
}
