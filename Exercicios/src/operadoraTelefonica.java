import java.util.Scanner;

public class operadoraTelefonica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double minutos, valorPlano, valorAdicional;
		valorPlano = 50.0;
		System.out.println("Digite os minutos gastos:");
		minutos = sc.nextDouble();
		
		if (minutos > 100.0) {
			valorAdicional = (minutos - 100.0) * 2.0;
			valorPlano += valorAdicional;
			System.out.println("O valor do seu plano ficou de: R$" +  valorPlano + " pois foi ultrapssado o limite de minutos.");
			System.out.println("Minutos ultrapassados: " + (int) (minutos - 100));
			System.out.println("Valor adicional a pagar: " + valorAdicional);
		}
		else {
			System.out.println("Valor do plano: " + valorPlano);
		}
		sc.close();
	}

}
