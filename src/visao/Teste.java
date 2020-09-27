package visao;

import java.util.Scanner;

import modelo.Moldura;
import modelo.Retangulo;

public class Teste {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a base do ret�ngulo: ");
		float base = sc.nextFloat();
		System.out.print("Digite a altura do ret�ngulo: ");
		float altura = sc.nextFloat();
		
		Retangulo retanguloInterno = new Retangulo(base, altura);

		System.out.print("Digite a base do ret�ngulo: ");
		float base2 = sc.nextFloat();
		System.out.print("Digite a altura do ret�ngulo: ");
		float altura2 = sc.nextFloat();

		Retangulo retanguloExterno = new Retangulo(base2, altura2);

		Moldura moldura = new Moldura(retanguloInterno, retanguloExterno);
		
		moldura.calcularAreaMoldura();

		sc.close();
	}
	
}
