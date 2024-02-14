import java.util.Scanner;

public class Exercicios_APE {

	public static void main(String[] args) {
		// Escreva um programa para calcular a área de um triângulo, dados os valores de base e altura.
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		System.out.println("Digite a base: ");
		base = sc.nextDouble();
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		area = base * altura / 2;
		System.out.println("A área do triangulo com base: " + base + " e altura: " + altura + " é: " + area);
		sc.close();
	}

}
