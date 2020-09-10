package exercicios;

public class CalcualrDesconto {

	public static void main(String[] args) {
		
		int valorHr = 10;
		int horasMes = 100;
		
		int salario = valorHr * horasMes;
		int iprf = salario - (11 / 100);
		int inss = salario - (8 / 100);
		int sindi = salario - (5 / 100);
		int salarioLiqui = salario - (iprf + inss + sindi);
		int desconto = iprf + inss + sindi;
		System.out.println("SÁLARIO BRUTO: R$ " + salario);
		System.out.println("IPRF: R$ " + iprf);
		System.out.println("INSS: R$ " + inss);
		System.out.println("SINDICATO: R$ " + sindi);
		System.out.println("SALÁRIO LIQUIDO: R$ " + salarioLiqui);
		System.out.println("VALOR DOS DESCONTOS: R$ " + desconto);
	}

}
