package visao;

import java.util.Scanner;
import modelo.Retangulo;

public class Teste {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a base do ret�ngulo: ");
		float b = sc.nextFloat();
		System.out.print("Digite a altura do ret�ngulo: ");
		float a = sc.nextFloat();
		
		Retangulo re = new Retangulo(b, a);
		
		System.out.println("A area do ret�ngulo � " + re.calcularArea() + "M�.");
		
	
		
		sc.close();
	}
	
}
