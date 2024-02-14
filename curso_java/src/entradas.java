import java.util.Scanner;

public class entradas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digtou: " + x);
		

		
		int y;
		y = sc.nextInt();
		System.out.println("Você digtou: " + y);
		
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digtou: " + z);
		

		
		char ch;
		ch = sc.next().charAt(0);
		System.out.println("Você digtou: " + ch);
		
		
		// é possivel os inputs serem coletadps na mesma linha tbm:
		
		String nome;
		int idade;
		double nota;
		nome = sc.next();
		idade = sc.nextInt();
		nota = sc.nextDouble();
		
		System.out.println("Dados do aluno: ");
		System.out.printf("Aluno: %s%n", nome);
		System.out.printf("Idade: %d%n", idade);
		System.out.println("Idade: " + nota);
		sc.close();
		
		
	}

}
